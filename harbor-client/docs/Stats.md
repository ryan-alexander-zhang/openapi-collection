

# Stats

Stats provides the overall progress of the scan all process.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**total** | **Integer** | The total number of scan processes triggered by the scan all action |  [optional] |
|**completed** | **Integer** | The number of the finished scan processes triggered by the scan all action |  [optional] |
|**metrics** | **Map&lt;String, Integer&gt;** | The metrics data for the each status |  [optional] |
|**ongoing** | **Boolean** | A flag indicating job status of scan all. |  [optional] |
|**trigger** | [**TriggerEnum**](#TriggerEnum) | The trigger of the scan all job. |  [optional] |



## Enum: TriggerEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;Manual&quot; |
| SCHEDULE | &quot;Schedule&quot; |
| EVENT | &quot;Event&quot; |



