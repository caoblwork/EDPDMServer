SELECT Num,unLookup FROM(

    SELECT Count(*) As Num , (
            SELECT COUNT(*) FROM ErrorMessage WHERE ErrorType=0 AND LookFlag IS NULL
    ) AS unLookup
    FROM ErrorMessage INNER JOIN Device ON ErrorMessage.DeviceID=Device.DeviceID
    where ErrorMessage.ErrorType=0

    UNION ALL

    SELECT Count(*) As Num , (
            SELECT COUNT(*) FROM ErrorMessage WHERE ErrorType=1 AND LookFlag IS NULL
    ) AS unLookup
    FROM ErrorMessage INNER JOIN Device ON ErrorMessage.DeviceID=Device.DeviceID
    where ErrorMessage.ErrorType=1

    UNION ALL

    SELECT Count(*) As Num,(
            SELECT COUNT(*) FROM ErrorMessage WHERE ErrorType=2 AND LookFlag IS NULL
    ) AS unLookup
    FROM ErrorMessage INNER JOIN Device ON ErrorMessage.DeviceID=Device.DeviceID
    where ErrorMessage.ErrorType=2

    UNION ALL

    SELECT Count(*) As Num,(
            SELECT COUNT(*) FROM ErrorMessage WHERE ErrorType=5 AND LookFlag IS NULL
    ) AS unLookup
    FROM ErrorMessage INNER JOIN Device ON ErrorMessage.DeviceID=Device.DeviceID
    where ErrorMessage.ErrorType=5

    UNION ALL

    SELECT Count(*) As Num,(
            SELECT COUNT(*) FROM ErrorMessage WHERE ErrorType=8 AND LookFlag IS NULL
    ) AS unLookup
    FROM ErrorMessage INNER JOIN Device ON ErrorMessage.DeviceID=Device.DeviceID
    where ErrorMessage.ErrorType=8

    UNION ALL

    SELECT Count(*) As Num ,(
            SELECT COUNT(*) FROM ErrorMessage WHERE ErrorMsg like '%阻断%' AND LookFlag IS NULL
    ) AS unLookup
    FROM ErrorMessage INNER JOIN Device ON ErrorMessage.DeviceID=Device.DeviceID
    where ErrorMsg like '%阻断%'
) v

--本地设备注册统计
SELECT
    (SELECT COUNT(DeviceID) FROM Device) as totalCount,
    (
        SELECT COUNT(DeviceID)
        FROM Device
        WHERE (Reserved3&1)<>1 AND (Registered=1 or (Protect<>1 AND Locked<>1 AND Forceout<>1 AND LEN(IsNull(MacAddress,''))>0  AND MacAddress<>'000000000000' AND (RunStatus=1 OR (LastTime is Null) OR (DateAdd(Day,150,LastTime)>=GetDate())) AND IsNull(TotalTime,0)>1440))
    ) as shouldregistedCount,
    (SELECT COUNT(DeviceID) FROM Device WHERE registered = 1) as registedCount,
    (SELECT COUNT(DeviceID) FROM Device WHERE RunStatus = 1) as registedCount,
    (select COUNT(DeviceID) FROM Device WHERE (RunLevel=2 or RunLevel=4) and Registered=1 and (Reserved3&1)<>1) as kvsCount,
    (select COUNT(DeviceID) FROM Device WHERE (RunLevel=2 or RunLevel=4) and Registered=1 and (Reserved3&1)<>1 and RunStatus=1) as onlineInstallKvs
FROM Class
--设备类型统计相关sql备份
Select count(DeviceID) As DeviceCount From Device Where (Device.Reserved3&1)<>1 and ClassID in(1)

Select count(DeviceID) As LogCount From Device Where isnull(Reserved2,0)>0 and  (Device.Reserved3&1)<>1


Select DevFirstType,(
    Select Count(DeviceID) As TypeNum From Device Where (Device.Reserved3&1)<>1 and Reserved2 in (
        Select DevTypeCode From DeviceTypeList Where DevFirstType = dt.DevFirstType
    )
)
From DeviceTypeList dt
where DevTypeUsed=1
Group By DevFirstType
Order By DevFirstType Desc
--
SELECT COUNT(deviceID) as totalCount,(SUM(val)/COUNT(deviceID))*100 as kvsPersent,((COUNT(deviceID)-SUM(val))/COUNT(deviceID))*100 as unKvsPersent
FROM(
    SELECT v1.deviceID,(v1.KvsCmpVal | v1.KvsVersionVal) as val
    FROM(
        SELECT deviceID ,(
            CASE  KvsCompany WHEN  NULL THEN 1 ELSE 0 END
        ) as KvsCmpVal,(
            CASE  KvsVersion WHEN  NULL THEN 1 ELSE 0 END
        ) as KvsVersionVal
        FROM Device
    ) v1
) v2
--
