

# ReplicationPolicy


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The policy ID. |  [optional] |
|**name** | **String** | The policy name. |  [optional] |
|**description** | **String** | The description of the policy. |  [optional] |
|**srcRegistry** | [**Registry**](Registry.md) |  |  [optional] |
|**destRegistry** | [**Registry**](Registry.md) |  |  [optional] |
|**destNamespace** | **String** | The destination namespace. |  [optional] |
|**destNamespaceReplaceCount** | **Integer** | Specify how many path components will be replaced by the provided destination namespace. The default value is -1 in which case the legacy mode will be applied. |  [optional] |
|**trigger** | [**ReplicationTrigger**](ReplicationTrigger.md) |  |  [optional] |
|**filters** | [**List&lt;ReplicationFilter&gt;**](ReplicationFilter.md) | The replication policy filter array. |  [optional] |
|**replicateDeletion** | **Boolean** | Whether to replicate the deletion operation. |  [optional] |
|**deletion** | **Boolean** | Deprecated, use \&quot;replicate_deletion\&quot; instead. Whether to replicate the deletion operation. |  [optional] |
|**override** | **Boolean** | Whether to override the resources on the destination registry. |  [optional] |
|**enabled** | **Boolean** | Whether the policy is enabled or not. |  [optional] |
|**creationTime** | **Date** | The create time of the policy. |  [optional] |
|**updateTime** | **Date** | The update time of the policy. |  [optional] |
|**speed** | **Integer** | speed limit for each task |  [optional] |
|**copyByChunk** | **Boolean** | Whether to enable copy by chunk. |  [optional] |
|**singleActiveReplication** | **Boolean** | Whether to skip execution until the previous active execution finishes, avoiding the execution of the same replication rules multiple times in parallel. |  [optional] |



