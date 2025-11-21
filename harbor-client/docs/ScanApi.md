# ScanApi

All URIs are relative to *http://localhost/api/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getReportLog**](ScanApi.md#getReportLog) | **GET** /projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/scan/{report_id}/log | Get the log of the scan report |
| [**scanArtifact**](ScanApi.md#scanArtifact) | **POST** /projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/scan | Scan the artifact |
| [**stopScanArtifact**](ScanApi.md#stopScanArtifact) | **POST** /projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/scan/stop | Cancelling a scan job for a particular artifact |



## getReportLog

> String getReportLog(projectName, repositoryName, reference, reportId, xRequestId)

Get the log of the scan report

Get the log of the scan report

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ScanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ScanApi apiInstance = new ScanApi(defaultClient);
        String projectName = "projectName_example"; // String | The name of the project
        String repositoryName = "repositoryName_example"; // String | The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -> a%2Fb -> a%252Fb
        String reference = "reference_example"; // String | The reference of the artifact, can be digest or tag
        String reportId = "reportId_example"; // String | The report id to get the log
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            String result = apiInstance.getReportLog(projectName, repositoryName, reference, reportId, xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScanApi#getReportLog");
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
| **projectName** | **String**| The name of the project | |
| **repositoryName** | **String**| The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb | |
| **reference** | **String**| The reference of the artifact, can be digest or tag | |
| **reportId** | **String**| The report id to get the log | |
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
| **200** | Successfully get scan log file |  -  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## scanArtifact

> scanArtifact(projectName, repositoryName, reference, xRequestId, scanType)

Scan the artifact

Scan the specified artifact

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ScanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ScanApi apiInstance = new ScanApi(defaultClient);
        String projectName = "projectName_example"; // String | The name of the project
        String repositoryName = "repositoryName_example"; // String | The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -> a%2Fb -> a%252Fb
        String reference = "reference_example"; // String | The reference of the artifact, can be digest or tag
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        ScanType scanType = new ScanType(); // ScanType | 
        try {
            apiInstance.scanArtifact(projectName, repositoryName, reference, xRequestId, scanType);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScanApi#scanArtifact");
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
| **projectName** | **String**| The name of the project | |
| **repositoryName** | **String**| The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb | |
| **reference** | **String**| The reference of the artifact, can be digest or tag | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |
| **scanType** | [**ScanType**](ScanType.md)|  | [optional] |

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
| **202** | Accepted |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **422** | Unsupported Type |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## stopScanArtifact

> stopScanArtifact(projectName, repositoryName, reference, scanType, xRequestId)

Cancelling a scan job for a particular artifact

Cancelling a scan job for a particular artifact

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ScanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ScanApi apiInstance = new ScanApi(defaultClient);
        String projectName = "projectName_example"; // String | The name of the project
        String repositoryName = "repositoryName_example"; // String | The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -> a%2Fb -> a%252Fb
        String reference = "reference_example"; // String | The reference of the artifact, can be digest or tag
        ScanType scanType = new ScanType(); // ScanType | The scan type: Vulnerabilities, SBOM
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.stopScanArtifact(projectName, repositoryName, reference, scanType, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScanApi#stopScanArtifact");
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
| **projectName** | **String**| The name of the project | |
| **repositoryName** | **String**| The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb | |
| **reference** | **String**| The reference of the artifact, can be digest or tag | |
| **scanType** | [**ScanType**](ScanType.md)| The scan type: Vulnerabilities, SBOM | |
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
| **202** | Accepted |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **422** | Unsupported Type |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |

