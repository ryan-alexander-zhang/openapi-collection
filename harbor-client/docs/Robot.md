

# Robot


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the robot |  [optional] |
|**name** | **String** | The name of the robot |  [optional] |
|**description** | **String** | The description of the robot |  [optional] |
|**secret** | **String** | The secret of the robot |  [optional] |
|**level** | **String** | The level of the robot, project or system |  [optional] |
|**duration** | **Long** | The duration of the robot in days, duration must be either -1(Never) or a positive integer |  [optional] |
|**editable** | **Boolean** | The editable status of the robot |  [optional] |
|**disable** | **Boolean** | The disable status of the robot |  [optional] |
|**expiresAt** | **Long** | The expiration date of the robot |  [optional] |
|**permissions** | [**List&lt;RobotPermission&gt;**](RobotPermission.md) |  |  [optional] |
|**creatorType** | **String** | The type of the robot creator, like local(harbor_user) or robot. |  [optional] |
|**creatorRef** | **Integer** | The reference of the robot creator, like the id of harbor user. |  [optional] |
|**creationTime** | **Date** | The creation time of the robot. |  [optional] |
|**updateTime** | **Date** | The update time of the robot. |  [optional] |



