

# NativeReportSummary

The summary for the native report

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reportId** | **String** | id of the native scan report |  [optional] |
|**scanStatus** | **String** | The status of the report generating process |  [optional] |
|**severity** | **String** | The overall severity |  [optional] |
|**duration** | **Long** | The seconds spent for generating the report |  [optional] |
|**summary** | [**VulnerabilitySummary**](VulnerabilitySummary.md) |  |  [optional] |
|**startTime** | **Date** | The start time of the scan process that generating report |  [optional] |
|**endTime** | **Date** | The end time of the scan process that generating report |  [optional] |
|**completePercent** | **Integer** | The complete percent of the scanning which value is between 0 and 100 |  [optional] |
|**scanner** | [**Scanner**](Scanner.md) |  |  [optional] |



