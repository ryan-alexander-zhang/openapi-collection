# PurgeApi

All URIs are relative to *http://localhost/api/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPurgeSchedule**](PurgeApi.md#createPurgeSchedule) | **POST** /system/purgeaudit/schedule | Create a purge job schedule. |
| [**getPurgeHistory**](PurgeApi.md#getPurgeHistory) | **GET** /system/purgeaudit | Get purge job results. |
| [**getPurgeJob**](PurgeApi.md#getPurgeJob) | **GET** /system/purgeaudit/{purge_id} | Get purge job status. |
| [**getPurgeJobLog**](PurgeApi.md#getPurgeJobLog) | **GET** /system/purgeaudit/{purge_id}/log | Get purge job log. |
| [**getPurgeSchedule**](PurgeApi.md#getPurgeSchedule) | **GET** /system/purgeaudit/schedule | Get purge&#39;s schedule. |
| [**stopPurge**](PurgeApi.md#stopPurge) | **PUT** /system/purgeaudit/{purge_id} | Stop the specific purge audit log execution |
| [**updatePurgeSchedule**](PurgeApi.md#updatePurgeSchedule) | **PUT** /system/purgeaudit/schedule | Update purge job&#39;s schedule. |



## createPurgeSchedule

> createPurgeSchedule(schedule, xRequestId)

Create a purge job schedule.

This endpoint is for update purge job schedule. 

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.PurgeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        PurgeApi apiInstance = new PurgeApi(defaultClient);
        Schedule schedule = new Schedule(); // Schedule | The purge job's schedule, it is a json object. | The sample format is | {\"parameters\":{\"audit_retention_hour\":168,\"dry_run\":true,\"include_event_types\":\"create_artifact,delete_artifact,pull_artifact\"},\"schedule\":{\"type\":\"Hourly\",\"cron\":\"0 0 * * * *\"}} | the include_operation should be a comma separated string, e.g. create,delete,pull, if it is empty, no operation will be purged. 
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.createPurgeSchedule(schedule, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling PurgeApi#createPurgeSchedule");
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
| **schedule** | [**Schedule**](Schedule.md)| The purge job&#39;s schedule, it is a json object. | The sample format is | {\&quot;parameters\&quot;:{\&quot;audit_retention_hour\&quot;:168,\&quot;dry_run\&quot;:true,\&quot;include_event_types\&quot;:\&quot;create_artifact,delete_artifact,pull_artifact\&quot;},\&quot;schedule\&quot;:{\&quot;type\&quot;:\&quot;Hourly\&quot;,\&quot;cron\&quot;:\&quot;0 0 * * * *\&quot;}} | the include_operation should be a comma separated string, e.g. create,delete,pull, if it is empty, no operation will be purged.  | |
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


## getPurgeHistory

> List&lt;ExecHistory&gt; getPurgeHistory(xRequestId, q, sort, page, pageSize)

Get purge job results.

get purge job execution history.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.PurgeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        PurgeApi apiInstance = new PurgeApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        String q = "q_example"; // String | Query string to query resources. Supported query patterns are \"exact match(k=v)\", \"fuzzy match(k=~v)\", \"range(k=[min~max])\", \"list with union releationship(k={v1 v2 v3})\" and \"list with intersetion relationship(k=(v1 v2 v3))\". The value of range and list can be string(enclosed by \" or '), integer or time(in format \"2020-04-09 02:36:00\"). All of these query patterns should be put in the query string \"q=xxx\" and splitted by \",\". e.g. q=k1=v1,k2=~v2,k3=[min~max]
        String sort = "sort_example"; // String | Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \"sort=field1,-field2\"
        Long page = 1L; // Long | The page number
        Long pageSize = 10L; // Long | The size of per page
        try {
            List<ExecHistory> result = apiInstance.getPurgeHistory(xRequestId, q, sort, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PurgeApi#getPurgeHistory");
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

### Return type

[**List&lt;ExecHistory&gt;**](ExecHistory.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get purge job results successfully. |  * X-Total-Count - The total count of vulnerabilities <br>  * Link - Link refers to the previous page and next page <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## getPurgeJob

> ExecHistory getPurgeJob(purgeId, xRequestId)

Get purge job status.

This endpoint let user get purge job status filtered by specific ID.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.PurgeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        PurgeApi apiInstance = new PurgeApi(defaultClient);
        Long purgeId = 56L; // Long | The ID of the purge log
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            ExecHistory result = apiInstance.getPurgeJob(purgeId, xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PurgeApi#getPurgeJob");
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
| **purgeId** | **Long**| The ID of the purge log | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |

### Return type

[**ExecHistory**](ExecHistory.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get purge job results successfully. |  -  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## getPurgeJobLog

> String getPurgeJobLog(purgeId, xRequestId)

Get purge job log.

This endpoint let user get purge job logs filtered by specific ID.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.PurgeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        PurgeApi apiInstance = new PurgeApi(defaultClient);
        Long purgeId = 56L; // Long | The ID of the purge log
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            String result = apiInstance.getPurgeJobLog(purgeId, xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PurgeApi#getPurgeJobLog");
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
| **purgeId** | **Long**| The ID of the purge log | |
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
| **200** | Get successfully. |  -  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## getPurgeSchedule

> ExecHistory getPurgeSchedule(xRequestId)

Get purge&#39;s schedule.

This endpoint is for get schedule of purge job.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.PurgeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        PurgeApi apiInstance = new PurgeApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            ExecHistory result = apiInstance.getPurgeSchedule(xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PurgeApi#getPurgeSchedule");
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

### Return type

[**ExecHistory**](ExecHistory.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get purge job&#39;s schedule. |  -  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## stopPurge

> stopPurge(purgeId, xRequestId)

Stop the specific purge audit log execution

Stop the purge audit log execution specified by ID

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.PurgeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        PurgeApi apiInstance = new PurgeApi(defaultClient);
        Long purgeId = 56L; // Long | The ID of the purge log
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.stopPurge(purgeId, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling PurgeApi#stopPurge");
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
| **purgeId** | **Long**| The ID of the purge log | |
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


## updatePurgeSchedule

> updatePurgeSchedule(schedule, xRequestId)

Update purge job&#39;s schedule.

This endpoint is for update purge job schedule. 

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.PurgeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        PurgeApi apiInstance = new PurgeApi(defaultClient);
        Schedule schedule = new Schedule(); // Schedule | The purge job's schedule, it is a json object. | The sample format is | {\"parameters\":{\"audit_retention_hour\":168,\"dry_run\":true,\"include_event_types\":\"create_artifact,delete_artifact,pull_artifact\"},\"schedule\":{\"type\":\"Hourly\",\"cron\":\"0 0 * * * *\"}} | the include_operation should be a comma separated string, e.g. create,delete,pull, if it is empty, no operation will be purged. 
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.updatePurgeSchedule(schedule, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling PurgeApi#updatePurgeSchedule");
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
| **schedule** | [**Schedule**](Schedule.md)| The purge job&#39;s schedule, it is a json object. | The sample format is | {\&quot;parameters\&quot;:{\&quot;audit_retention_hour\&quot;:168,\&quot;dry_run\&quot;:true,\&quot;include_event_types\&quot;:\&quot;create_artifact,delete_artifact,pull_artifact\&quot;},\&quot;schedule\&quot;:{\&quot;type\&quot;:\&quot;Hourly\&quot;,\&quot;cron\&quot;:\&quot;0 0 * * * *\&quot;}} | the include_operation should be a comma separated string, e.g. create,delete,pull, if it is empty, no operation will be purged.  | |
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
| **200** | Updated purge&#39;s schedule successfully. |  -  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |

