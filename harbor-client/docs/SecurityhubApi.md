# SecurityhubApi

All URIs are relative to *http://localhost/api/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSecuritySummary**](SecurityhubApi.md#getSecuritySummary) | **GET** /security/summary | Get vulnerability system summary |
| [**listVulnerabilities**](SecurityhubApi.md#listVulnerabilities) | **GET** /security/vul | Get the vulnerability list. |



## getSecuritySummary

> SecuritySummary getSecuritySummary(xRequestId, withDangerousCve, withDangerousArtifact)

Get vulnerability system summary

Retrieve the vulnerability summary of the system

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.SecurityhubApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        SecurityhubApi apiInstance = new SecurityhubApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        Boolean withDangerousCve = false; // Boolean | Specify whether the dangerous CVEs are included inside summary information
        Boolean withDangerousArtifact = false; // Boolean | Specify whether the dangerous Artifact are included inside summary information
        try {
            SecuritySummary result = apiInstance.getSecuritySummary(xRequestId, withDangerousCve, withDangerousArtifact);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityhubApi#getSecuritySummary");
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
| **withDangerousCve** | **Boolean**| Specify whether the dangerous CVEs are included inside summary information | [optional] [default to false] |
| **withDangerousArtifact** | **Boolean**| Specify whether the dangerous Artifact are included inside summary information | [optional] [default to false] |

### Return type

[**SecuritySummary**](SecuritySummary.md)

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


## listVulnerabilities

> List&lt;VulnerabilityItem&gt; listVulnerabilities(xRequestId, q, page, pageSize, tuneCount, withTag)

Get the vulnerability list.

Get the vulnerability list. use q to pass the query condition, supported conditions: cve_id(exact match) cvss_score_v3(range condition) severity(exact match) status(exact match) repository_name(exact match) project_id(exact match) package(exact match) tag(exact match) digest(exact match) 

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.SecurityhubApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        SecurityhubApi apiInstance = new SecurityhubApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        String q = "q_example"; // String | Query string to query resources. Supported query patterns are \"exact match(k=v)\", \"fuzzy match(k=~v)\", \"range(k=[min~max])\", \"list with union releationship(k={v1 v2 v3})\" and \"list with intersetion relationship(k=(v1 v2 v3))\". The value of range and list can be string(enclosed by \" or '), integer or time(in format \"2020-04-09 02:36:00\"). All of these query patterns should be put in the query string \"q=xxx\" and splitted by \",\". e.g. q=k1=v1,k2=~v2,k3=[min~max]
        Long page = 1L; // Long | The page number
        Long pageSize = 10L; // Long | The size of per page
        Boolean tuneCount = false; // Boolean | Enable to ignore X-Total-Count when the total count > 1000, if the total count is less than 1000, the real total count is returned, else -1.
        Boolean withTag = false; // Boolean | Specify whether the tag information is included inside vulnerability information
        try {
            List<VulnerabilityItem> result = apiInstance.listVulnerabilities(xRequestId, q, page, pageSize, tuneCount, withTag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityhubApi#listVulnerabilities");
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
| **page** | **Long**| The page number | [optional] [default to 1] |
| **pageSize** | **Long**| The size of per page | [optional] [default to 10] |
| **tuneCount** | **Boolean**| Enable to ignore X-Total-Count when the total count &gt; 1000, if the total count is less than 1000, the real total count is returned, else -1. | [optional] [default to false] |
| **withTag** | **Boolean**| Specify whether the tag information is included inside vulnerability information | [optional] [default to false] |

### Return type

[**List&lt;VulnerabilityItem&gt;**](VulnerabilityItem.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The vulnerability list. |  * X-Total-Count - The total count of vulnerabilities <br>  * Link - Link refers to the previous page and next page <br>  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |

