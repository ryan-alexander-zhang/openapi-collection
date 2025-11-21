# StatisticApi

All URIs are relative to *http://localhost/api/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getStatistic**](StatisticApi.md#getStatistic) | **GET** /statistics | Get the statistic information about the projects and repositories |



## getStatistic

> Statistic getStatistic(xRequestId)

Get the statistic information about the projects and repositories

Get the statistic information about the projects and repositories

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.StatisticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        StatisticApi apiInstance = new StatisticApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            Statistic result = apiInstance.getStatistic(xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatisticApi#getStatistic");
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

[**Statistic**](Statistic.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The statistic information |  -  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |

