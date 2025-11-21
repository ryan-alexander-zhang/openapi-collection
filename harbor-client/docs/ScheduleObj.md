

# ScheduleObj


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The schedule type. The valid values are &#39;Hourly&#39;, &#39;Daily&#39;, &#39;Weekly&#39;, &#39;Custom&#39;, &#39;Manual&#39;, &#39;None&#39; and &#39;Schedule&#39;. &#39;Manual&#39; means to trigger it right away, &#39;Schedule&#39; means to trigger it by a specified cron schedule and &#39;None&#39; means to cancel the schedule.  |  [optional] |
|**cron** | **String** | A cron expression, a time-based job scheduler. |  [optional] |
|**nextScheduledTime** | **Date** | The next time to schedule to run the job. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| HOURLY | &quot;Hourly&quot; |
| DAILY | &quot;Daily&quot; |
| WEEKLY | &quot;Weekly&quot; |
| CUSTOM | &quot;Custom&quot; |
| MANUAL | &quot;Manual&quot; |
| NONE | &quot;None&quot; |
| SCHEDULE | &quot;Schedule&quot; |



