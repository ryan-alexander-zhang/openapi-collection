

# RobotCreate

The request for robot account creation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the robot |  [optional] |
|**description** | **String** | The description of the robot |  [optional] |
|**secret** | **String** | The secret of the robot |  [optional] |
|**level** | **String** | The level of the robot, project or system |  [optional] |
|**disable** | **Boolean** | The disable status of the robot |  [optional] |
|**duration** | **Long** | The duration of the robot in days, duration must be either -1(Never) or a positive integer |  [optional] |
|**permissions** | [**List&lt;RobotPermission&gt;**](RobotPermission.md) |  |  [optional] |



