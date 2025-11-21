# ScanDataExportApi

All URIs are relative to *http://localhost/api/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadScanData**](ScanDataExportApi.md#downloadScanData) | **GET** /export/cve/download/{execution_id} | Download the scan data export file |
| [**exportScanData**](ScanDataExportApi.md#exportScanData) | **POST** /export/cve | Export scan data for selected projects |
| [**getScanDataExportExecution**](ScanDataExportApi.md#getScanDataExportExecution) | **GET** /export/cve/execution/{execution_id} | Get the specific scan data export execution |
| [**getScanDataExportExecutionList**](ScanDataExportApi.md#getScanDataExportExecutionList) | **GET** /export/cve/executions | Get a list of specific scan data export execution jobs for a specified user |



## downloadScanData

> File downloadScanData(executionId, xRequestId, format)

Download the scan data export file

Download the scan data report. Default format is CSV

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ScanDataExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ScanDataExportApi apiInstance = new ScanDataExportApi(defaultClient);
        Integer executionId = 56; // Integer | Execution ID
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        String format = "format_example"; // String | The format of the data to be exported. e.g. CSV or PDF
        try {
            File result = apiInstance.downloadScanData(executionId, xRequestId, format);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScanDataExportApi#downloadScanData");
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
| **executionId** | **Integer**| Execution ID | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |
| **format** | **String**| The format of the data to be exported. e.g. CSV or PDF | [optional] |

### Return type

[**File**](File.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/csv


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Data file containing the export data |  * Content-Disposition - Value is a CSV formatted file; filename&#x3D;export.csv <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## exportScanData

> ScanDataExportJob exportScanData(xScanDataType, criteria, xRequestId)

Export scan data for selected projects

Export scan data for selected projects

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ScanDataExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ScanDataExportApi apiInstance = new ScanDataExportApi(defaultClient);
        String xScanDataType = "xScanDataType_example"; // String | The type of scan data to export
        ScanDataExportRequest criteria = new ScanDataExportRequest(); // ScanDataExportRequest | The criteria for the export
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            ScanDataExportJob result = apiInstance.exportScanData(xScanDataType, criteria, xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScanDataExportApi#exportScanData");
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
| **xScanDataType** | **String**| The type of scan data to export | |
| **criteria** | [**ScanDataExportRequest**](ScanDataExportRequest.md)| The criteria for the export | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |

### Return type

[**ScanDataExportJob**](ScanDataExportJob.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **405** | Method not allowed |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **409** | Conflict |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## getScanDataExportExecution

> ScanDataExportExecution getScanDataExportExecution(executionId, xRequestId)

Get the specific scan data export execution

Get the scan data export execution specified by ID

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ScanDataExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ScanDataExportApi apiInstance = new ScanDataExportApi(defaultClient);
        Integer executionId = 56; // Integer | Execution ID
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            ScanDataExportExecution result = apiInstance.getScanDataExportExecution(executionId, xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScanDataExportApi#getScanDataExportExecution");
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
| **executionId** | **Integer**| Execution ID | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |

### Return type

[**ScanDataExportExecution**](ScanDataExportExecution.md)

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


## getScanDataExportExecutionList

> ScanDataExportExecutionList getScanDataExportExecutionList(xRequestId)

Get a list of specific scan data export execution jobs for a specified user

Get a list of specific scan data export execution jobs for a specified user

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ScanDataExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ScanDataExportApi apiInstance = new ScanDataExportApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            ScanDataExportExecutionList result = apiInstance.getScanDataExportExecutionList(xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScanDataExportApi#getScanDataExportExecutionList");
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

[**ScanDataExportExecutionList**](ScanDataExportExecutionList.md)

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

