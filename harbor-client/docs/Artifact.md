

# Artifact


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the artifact |  [optional] |
|**type** | **String** | The type of the artifact, e.g. image, chart, etc |  [optional] |
|**mediaType** | **String** | The media type of the artifact |  [optional] |
|**manifestMediaType** | **String** | The manifest media type of the artifact |  [optional] |
|**artifactType** | **String** | The artifact_type in the manifest of the artifact |  [optional] |
|**projectId** | **Long** | The ID of the project that the artifact belongs to |  [optional] |
|**repositoryId** | **Long** | The ID of the repository that the artifact belongs to |  [optional] |
|**repositoryName** | **String** | The name of the repository that the artifact belongs to |  [optional] |
|**digest** | **String** | The digest of the artifact |  [optional] |
|**size** | **Long** | The size of the artifact |  [optional] |
|**icon** | **String** | The digest of the icon |  [optional] |
|**pushTime** | **Date** | The push time of the artifact |  [optional] |
|**pullTime** | **Date** | The latest pull time of the artifact |  [optional] |
|**extraAttrs** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**annotations** | **Map&lt;String, String&gt;** |  |  [optional] |
|**references** | [**List&lt;Reference&gt;**](Reference.md) |  |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional] |
|**additionLinks** | [**Map&lt;String, AdditionLink&gt;**](AdditionLink.md) |  |  [optional] |
|**labels** | [**List&lt;Label&gt;**](Label.md) |  |  [optional] |
|**scanOverview** | [**Map&lt;String, NativeReportSummary&gt;**](NativeReportSummary.md) | The scan overview attached in the metadata of tag |  [optional] |
|**sbomOverview** | [**SBOMOverview**](SBOMOverview.md) |  |  [optional] |
|**accessories** | [**List&lt;Accessory&gt;**](Accessory.md) |  |  [optional] |



