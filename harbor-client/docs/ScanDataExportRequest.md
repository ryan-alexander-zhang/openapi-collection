

# ScanDataExportRequest

The criteria to select the scan data to export.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobName** | **String** | Name of the scan data export job |  [optional] |
|**projects** | **List&lt;Long&gt;** | A list of one or more projects for which to export the scan data, currently only one project is supported due to performance concerns, but define as array for extension in the future. |  [optional] |
|**labels** | **List&lt;Long&gt;** | A list of one or more labels for which to export the scan data, defaults to all if empty |  [optional] |
|**repositories** | **String** | A list of repositories for which to export the scan data, defaults to all if empty |  [optional] |
|**cveIds** | **String** | CVE-IDs for which to export data. Multiple CVE-IDs can be specified by separating using &#39;,&#39; and enclosed between &#39;{}&#39;. Defaults to all if empty |  [optional] |
|**tags** | **String** | A list of tags enclosed within &#39;{}&#39;. Defaults to all if empty |  [optional] |



