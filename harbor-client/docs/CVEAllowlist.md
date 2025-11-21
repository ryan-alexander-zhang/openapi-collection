

# CVEAllowlist

The CVE Allowlist for system or project

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | ID of the allowlist |  [optional] |
|**projectId** | **Integer** | ID of the project which the allowlist belongs to.  For system level allowlist this attribute is zero. |  [optional] |
|**expiresAt** | **Integer** | the time for expiration of the allowlist, in the form of seconds since epoch.  This is an optional attribute, if it&#39;s not set the CVE allowlist does not expire. |  [optional] |
|**items** | [**List&lt;CVEAllowlistItem&gt;**](CVEAllowlistItem.md) |  |  [optional] |
|**creationTime** | **Date** | The creation time of the allowlist. |  [optional] |
|**updateTime** | **Date** | The update time of the allowlist. |  [optional] |



