# JobserviceApi

All URIs are relative to *http://localhost/api/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**actionGetJobLog**](JobserviceApi.md#actionGetJobLog) | **GET** /jobservice/jobs/{job_id}/log | Get job log by job id |
| [**actionPendingJobs**](JobserviceApi.md#actionPendingJobs) | **PUT** /jobservice/queues/{job_type} | stop and clean, pause, resume pending jobs in the queue |
| [**getWorkerPools**](JobserviceApi.md#getWorkerPools) | **GET** /jobservice/pools | Get worker pools |
| [**getWorkers**](JobserviceApi.md#getWorkers) | **GET** /jobservice/pools/{pool_id}/workers | Get workers |
| [**listJobQueues**](JobserviceApi.md#listJobQueues) | **GET** /jobservice/queues | list job queues |
| [**stopRunningJob**](JobserviceApi.md#stopRunningJob) | **PUT** /jobservice/jobs/{job_id} | Stop running job |



## actionGetJobLog

> String actionGetJobLog(jobId, xRequestId)

Get job log by job id

Get job log by job id, it is only used by administrator

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.JobserviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        JobserviceApi apiInstance = new JobserviceApi(defaultClient);
        String jobId = "jobId_example"; // String | The id of the job.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            String result = apiInstance.actionGetJobLog(jobId, xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobserviceApi#actionGetJobLog");
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
| **jobId** | **String**| The id of the job. | |
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
| **200** | Get job log successfully. |  * Content-Type - The content type of response body <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## actionPendingJobs

> actionPendingJobs(jobType, actionRequest, xRequestId)

stop and clean, pause, resume pending jobs in the queue

stop and clean, pause, resume pending jobs in the queue

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.JobserviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        JobserviceApi apiInstance = new JobserviceApi(defaultClient);
        String jobType = "jobType_example"; // String | The type of the job. 'all' stands for all job types
        ActionRequest actionRequest = new ActionRequest(); // ActionRequest | 
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.actionPendingJobs(jobType, actionRequest, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobserviceApi#actionPendingJobs");
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
| **jobType** | **String**| The type of the job. &#39;all&#39; stands for all job types | |
| **actionRequest** | [**ActionRequest**](ActionRequest.md)|  | |
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
| **200** | take action to the jobs in the queue successfully. |  -  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **422** | Unsupported Type |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## getWorkerPools

> List&lt;WorkerPool&gt; getWorkerPools(xRequestId)

Get worker pools

Get worker pools

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.JobserviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        JobserviceApi apiInstance = new JobserviceApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            List<WorkerPool> result = apiInstance.getWorkerPools(xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobserviceApi#getWorkerPools");
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

[**List&lt;WorkerPool&gt;**](WorkerPool.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get worker pools successfully. |  -  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## getWorkers

> List&lt;Worker&gt; getWorkers(poolId, xRequestId)

Get workers

Get workers in current pool

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.JobserviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        JobserviceApi apiInstance = new JobserviceApi(defaultClient);
        String poolId = "poolId_example"; // String | The name of the pool. 'all' stands for all pools
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            List<Worker> result = apiInstance.getWorkers(poolId, xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobserviceApi#getWorkers");
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
| **poolId** | **String**| The name of the pool. &#39;all&#39; stands for all pools | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |

### Return type

[**List&lt;Worker&gt;**](Worker.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get workers successfully. |  -  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## listJobQueues

> List&lt;JobQueue&gt; listJobQueues(xRequestId)

list job queues

list job queue

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.JobserviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        JobserviceApi apiInstance = new JobserviceApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            List<JobQueue> result = apiInstance.listJobQueues(xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobserviceApi#listJobQueues");
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

[**List&lt;JobQueue&gt;**](JobQueue.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List job queue successfully. |  -  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## stopRunningJob

> stopRunningJob(jobId, xRequestId)

Stop running job

Stop running job

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.JobserviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        JobserviceApi apiInstance = new JobserviceApi(defaultClient);
        String jobId = "jobId_example"; // String | The id of the job.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.stopRunningJob(jobId, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobserviceApi#stopRunningJob");
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
| **jobId** | **String**| The id of the job. | |
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
| **200** | Stop worker successfully. |  -  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |

