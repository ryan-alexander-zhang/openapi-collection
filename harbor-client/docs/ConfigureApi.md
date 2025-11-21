# ConfigureApi

All URIs are relative to *http://localhost/api/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getConfigurations**](ConfigureApi.md#getConfigurations) | **GET** /configurations | Get system configurations. |
| [**getInternalconfig**](ConfigureApi.md#getInternalconfig) | **GET** /internalconfig | Get internal configurations. |
| [**updateConfigurations**](ConfigureApi.md#updateConfigurations) | **PUT** /configurations | Modify system configurations. |



## getConfigurations

> ConfigurationsResponse getConfigurations(xRequestId)

Get system configurations.

This endpoint is for retrieving system configurations that only provides for admin user. 

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ConfigureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ConfigureApi apiInstance = new ConfigureApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            ConfigurationsResponse result = apiInstance.getConfigurations(xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigureApi#getConfigurations");
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

[**ConfigurationsResponse**](ConfigurationsResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get system configurations successfully. The response body is a map. |  -  |
| **401** | User need to log in first. |  -  |
| **403** | User does not have permission of admin role. |  -  |
| **500** | Unexpected internal errors. |  -  |


## getInternalconfig

> Map&lt;String, InternalConfigurationValue&gt; getInternalconfig(xRequestId)

Get internal configurations.

This endpoint is for retrieving system configurations that only provides for internal api call. 

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ConfigureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ConfigureApi apiInstance = new ConfigureApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            Map<String, InternalConfigurationValue> result = apiInstance.getInternalconfig(xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigureApi#getInternalconfig");
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

[**Map&lt;String, InternalConfigurationValue&gt;**](InternalConfigurationValue.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get system configurations successfully. The response body is a map. |  -  |
| **401** | User need to log in first. |  -  |
| **403** | User does not have permission of admin role. |  -  |
| **500** | Unexpected internal errors. |  -  |


## updateConfigurations

> updateConfigurations(configurations, xRequestId)

Modify system configurations.

This endpoint is for modifying system configurations that only provides for admin user. 

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ConfigureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ConfigureApi apiInstance = new ConfigureApi(defaultClient);
        Configurations configurations = new Configurations(); // Configurations | The configuration map can contain a subset of the attributes of the schema, which are to be updated.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.updateConfigurations(configurations, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigureApi#updateConfigurations");
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
| **configurations** | [**Configurations**](Configurations.md)| The configuration map can contain a subset of the attributes of the schema, which are to be updated. | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Modify system configurations successfully. |  -  |
| **401** | User need to log in first. |  -  |
| **403** | User does not have permission of admin role. |  -  |
| **500** | Unexpected internal errors. |  -  |

