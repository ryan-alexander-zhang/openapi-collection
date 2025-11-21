# ReplicationApi

All URIs are relative to *http://localhost/api/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReplicationPolicy**](ReplicationApi.md#createReplicationPolicy) | **POST** /replication/policies | Create a replication policy |
| [**deleteReplicationPolicy**](ReplicationApi.md#deleteReplicationPolicy) | **DELETE** /replication/policies/{id} | Delete the specific replication policy |
| [**getReplicationExecution**](ReplicationApi.md#getReplicationExecution) | **GET** /replication/executions/{id} | Get the specific replication execution |
| [**getReplicationLog**](ReplicationApi.md#getReplicationLog) | **GET** /replication/executions/{id}/tasks/{task_id}/log | Get the log of the specific replication task |
| [**getReplicationPolicy**](ReplicationApi.md#getReplicationPolicy) | **GET** /replication/policies/{id} | Get the specific replication policy |
| [**listReplicationExecutions**](ReplicationApi.md#listReplicationExecutions) | **GET** /replication/executions | List replication executions |
| [**listReplicationPolicies**](ReplicationApi.md#listReplicationPolicies) | **GET** /replication/policies | List replication policies |
| [**listReplicationTasks**](ReplicationApi.md#listReplicationTasks) | **GET** /replication/executions/{id}/tasks | List replication tasks for a specific execution |
| [**startReplication**](ReplicationApi.md#startReplication) | **POST** /replication/executions | Start one replication execution |
| [**stopReplication**](ReplicationApi.md#stopReplication) | **PUT** /replication/executions/{id} | Stop the specific replication execution |
| [**updateReplicationPolicy**](ReplicationApi.md#updateReplicationPolicy) | **PUT** /replication/policies/{id} | Update the replication policy |



## createReplicationPolicy

> createReplicationPolicy(policy, xRequestId)

Create a replication policy

Create a replication policy

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ReplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ReplicationApi apiInstance = new ReplicationApi(defaultClient);
        ReplicationPolicy policy = new ReplicationPolicy(); // ReplicationPolicy | The replication policy
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.createReplicationPolicy(policy, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplicationApi#createReplicationPolicy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policy** | [**ReplicationPolicy**](ReplicationPolicy.md)| The replication policy | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * X-Request-Id - The ID of the corresponding request for the response <br>  * Location - The URL of the created resource <br>  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **409** | Conflict |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## deleteReplicationPolicy

> deleteReplicationPolicy(id, xRequestId)

Delete the specific replication policy

Delete the specific replication policy

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ReplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ReplicationApi apiInstance = new ReplicationApi(defaultClient);
        Long id = 56L; // Long | Replication policy ID
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.deleteReplicationPolicy(id, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplicationApi#deleteReplicationPolicy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| Replication policy ID | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **412** | Precondition failed |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## getReplicationExecution

> ReplicationExecution getReplicationExecution(id, xRequestId)

Get the specific replication execution

Get the replication execution specified by ID

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ReplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ReplicationApi apiInstance = new ReplicationApi(defaultClient);
        Long id = 56L; // Long | The ID of the execution.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            ReplicationExecution result = apiInstance.getReplicationExecution(id, xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplicationApi#getReplicationExecution");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| The ID of the execution. | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |

### Return type

[**ReplicationExecution**](ReplicationExecution.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## getReplicationLog

> String getReplicationLog(id, taskId, xRequestId)

Get the log of the specific replication task

Get the log of the specific replication task

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ReplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ReplicationApi apiInstance = new ReplicationApi(defaultClient);
        Long id = 56L; // Long | The ID of the execution that the tasks belongs to.
        Long taskId = 56L; // Long | The ID of the task.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            String result = apiInstance.getReplicationLog(id, taskId, xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplicationApi#getReplicationLog");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| The ID of the execution that the tasks belongs to. | |
| **taskId** | **Long**| The ID of the task. | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |

### Return type

**String**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Content-Type - The content type of response body <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## getReplicationPolicy

> ReplicationPolicy getReplicationPolicy(id, xRequestId)

Get the specific replication policy

Get the specific replication policy

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ReplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ReplicationApi apiInstance = new ReplicationApi(defaultClient);
        Long id = 56L; // Long | Policy ID
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            ReplicationPolicy result = apiInstance.getReplicationPolicy(id, xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplicationApi#getReplicationPolicy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| Policy ID | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |

### Return type

[**ReplicationPolicy**](ReplicationPolicy.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## listReplicationExecutions

> List&lt;ReplicationExecution&gt; listReplicationExecutions(xRequestId, sort, page, pageSize, policyId, status, trigger)

List replication executions

List replication executions

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ReplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ReplicationApi apiInstance = new ReplicationApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        String sort = "sort_example"; // String | Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \"sort=field1,-field2\"
        Long page = 1L; // Long | The page number
        Long pageSize = 10L; // Long | The size of per page
        Integer policyId = 56; // Integer | The ID of the policy that the executions belong to.
        String status = "status_example"; // String | The execution status.
        String trigger = "trigger_example"; // String | The trigger mode.
        try {
            List<ReplicationExecution> result = apiInstance.listReplicationExecutions(xRequestId, sort, page, pageSize, policyId, status, trigger);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplicationApi#listReplicationExecutions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xRequestId** | **String**| An unique ID for the request | [optional] |
| **sort** | **String**| Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot; | [optional] |
| **page** | **Long**| The page number | [optional] [default to 1] |
| **pageSize** | **Long**| The size of per page | [optional] [default to 10] |
| **policyId** | **Integer**| The ID of the policy that the executions belong to. | [optional] |
| **status** | **String**| The execution status. | [optional] |
| **trigger** | **String**| The trigger mode. | [optional] |

### Return type

[**List&lt;ReplicationExecution&gt;**](ReplicationExecution.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * X-Total-Count - The total count of vulnerabilities <br>  * Link - Link refers to the previous page and next page <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## listReplicationPolicies

> List&lt;ReplicationPolicy&gt; listReplicationPolicies(xRequestId, q, sort, page, pageSize, name)

List replication policies

List replication policies

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ReplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ReplicationApi apiInstance = new ReplicationApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        String q = "q_example"; // String | Query string to query resources. Supported query patterns are \"exact match(k=v)\", \"fuzzy match(k=~v)\", \"range(k=[min~max])\", \"list with union releationship(k={v1 v2 v3})\" and \"list with intersetion relationship(k=(v1 v2 v3))\". The value of range and list can be string(enclosed by \" or '), integer or time(in format \"2020-04-09 02:36:00\"). All of these query patterns should be put in the query string \"q=xxx\" and splitted by \",\". e.g. q=k1=v1,k2=~v2,k3=[min~max]
        String sort = "sort_example"; // String | Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \"sort=field1,-field2\"
        Long page = 1L; // Long | The page number
        Long pageSize = 10L; // Long | The size of per page
        String name = "name_example"; // String | Deprecated, use \"query\" instead. The policy name.
        try {
            List<ReplicationPolicy> result = apiInstance.listReplicationPolicies(xRequestId, q, sort, page, pageSize, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplicationApi#listReplicationPolicies");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xRequestId** | **String**| An unique ID for the request | [optional] |
| **q** | **String**| Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max] | [optional] |
| **sort** | **String**| Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot; | [optional] |
| **page** | **Long**| The page number | [optional] [default to 1] |
| **pageSize** | **Long**| The size of per page | [optional] [default to 10] |
| **name** | **String**| Deprecated, use \&quot;query\&quot; instead. The policy name. | [optional] |

### Return type

[**List&lt;ReplicationPolicy&gt;**](ReplicationPolicy.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * X-Total-Count - The total count of vulnerabilities <br>  * Link - Link refers to the previous page and next page <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## listReplicationTasks

> List&lt;ReplicationTask&gt; listReplicationTasks(id, xRequestId, sort, page, pageSize, status, resourceType)

List replication tasks for a specific execution

List replication tasks for a specific execution

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ReplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ReplicationApi apiInstance = new ReplicationApi(defaultClient);
        Long id = 56L; // Long | The ID of the execution that the tasks belongs to.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        String sort = "sort_example"; // String | Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \"sort=field1,-field2\"
        Long page = 1L; // Long | The page number
        Long pageSize = 10L; // Long | The size of per page
        String status = "status_example"; // String | The task status.
        String resourceType = "resourceType_example"; // String | The resource type.
        try {
            List<ReplicationTask> result = apiInstance.listReplicationTasks(id, xRequestId, sort, page, pageSize, status, resourceType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplicationApi#listReplicationTasks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| The ID of the execution that the tasks belongs to. | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |
| **sort** | **String**| Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot; | [optional] |
| **page** | **Long**| The page number | [optional] [default to 1] |
| **pageSize** | **Long**| The size of per page | [optional] [default to 10] |
| **status** | **String**| The task status. | [optional] |
| **resourceType** | **String**| The resource type. | [optional] |

### Return type

[**List&lt;ReplicationTask&gt;**](ReplicationTask.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * X-Total-Count - The total count of vulnerabilities <br>  * Link - Link refers to the previous page and next page <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## startReplication

> startReplication(execution, xRequestId)

Start one replication execution

Start one replication execution according to the policy

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ReplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ReplicationApi apiInstance = new ReplicationApi(defaultClient);
        StartReplicationExecution execution = new StartReplicationExecution(); // StartReplicationExecution | The ID of policy that the execution belongs to
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.startReplication(execution, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplicationApi#startReplication");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **execution** | [**StartReplicationExecution**](StartReplicationExecution.md)| The ID of policy that the execution belongs to | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * X-Request-Id - The ID of the corresponding request for the response <br>  * Location - The URL of the created resource <br>  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## stopReplication

> stopReplication(id, xRequestId)

Stop the specific replication execution

Stop the replication execution specified by ID

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ReplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ReplicationApi apiInstance = new ReplicationApi(defaultClient);
        Long id = 56L; // Long | The ID of the execution.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.stopReplication(id, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplicationApi#stopReplication");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| The ID of the execution. | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## updateReplicationPolicy

> updateReplicationPolicy(id, policy, xRequestId)

Update the replication policy

Update the replication policy

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ReplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ReplicationApi apiInstance = new ReplicationApi(defaultClient);
        Long id = 56L; // Long | The policy ID
        ReplicationPolicy policy = new ReplicationPolicy(); // ReplicationPolicy | The replication policy
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.updateReplicationPolicy(id, policy, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplicationApi#updateReplicationPolicy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| The policy ID | |
| **policy** | [**ReplicationPolicy**](ReplicationPolicy.md)| The replication policy | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **409** | Conflict |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |

