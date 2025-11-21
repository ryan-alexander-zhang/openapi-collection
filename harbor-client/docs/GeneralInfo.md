

# GeneralInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bannerMessage** | **String** | The banner message for the UI. It is the stringified result of the banner message object. |  [optional] |
|**currentTime** | **Date** | The current time of the server. |  [optional] |
|**registryUrl** | **String** | The url of registry against which the docker command should be issued. |  [optional] |
|**externalUrl** | **String** | The external URL of Harbor, with protocol. |  [optional] |
|**authMode** | **String** | The auth mode of current Harbor instance. |  [optional] |
|**primaryAuthMode** | **Boolean** | The flag to indicate whether the current auth mode should consider as a primary one. |  [optional] |
|**projectCreationRestriction** | **String** | Indicate who can create projects, it could be &#39;adminonly&#39; or &#39;everyone&#39;. |  [optional] |
|**selfRegistration** | **Boolean** | Indicate whether the Harbor instance enable user to register himself. |  [optional] |
|**hasCaRoot** | **Boolean** | Indicate whether there is a ca root cert file ready for download in the file system. |  [optional] |
|**harborVersion** | **String** | The build version of Harbor. |  [optional] |
|**registryStorageProviderName** | **String** | The storage provider&#39;s name of Harbor registry |  [optional] |
|**readOnly** | **Boolean** | The flag to indicate whether Harbor is in readonly mode. |  [optional] |
|**notificationEnable** | **Boolean** | The flag to indicate whether notification mechanism is enabled on Harbor instance. |  [optional] |
|**authproxySettings** | [**AuthproxySetting**](AuthproxySetting.md) |  |  [optional] |
|**oidcProviderName** | **String** | The OIDC provider name, empty if current auth is not OIDC_auth or OIDC provider is not configured. |  [optional] |



