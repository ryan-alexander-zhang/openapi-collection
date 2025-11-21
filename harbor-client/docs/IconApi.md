# IconApi

All URIs are relative to *http://localhost/api/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getIcon**](IconApi.md#getIcon) | **GET** /icons/{digest} | Get artifact icon |



## getIcon

> Icon getIcon(digest, xRequestId)

Get artifact icon

Get the artifact icon with the specified digest. As the original icon image is resized and encoded before returning, the parameter \&quot;digest\&quot; in the path doesn&#39;t match the hash of the returned content

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.IconApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        IconApi apiInstance = new IconApi(defaultClient);
        String digest = "digest_example"; // String | The digest of the resource
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            Icon result = apiInstance.getIcon(digest, xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IconApi#getIcon");
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
| **digest** | **String**| The digest of the resource | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |

### Return type

[**Icon**](Icon.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |

