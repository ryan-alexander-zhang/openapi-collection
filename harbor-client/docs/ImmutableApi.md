# ImmutableApi

All URIs are relative to *http://localhost/api/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createImmuRule**](ImmutableApi.md#createImmuRule) | **POST** /projects/{project_name_or_id}/immutabletagrules | Add an immutable tag rule to current project |
| [**deleteImmuRule**](ImmutableApi.md#deleteImmuRule) | **DELETE** /projects/{project_name_or_id}/immutabletagrules/{immutable_rule_id} | Delete the immutable tag rule. |
| [**listImmuRules**](ImmutableApi.md#listImmuRules) | **GET** /projects/{project_name_or_id}/immutabletagrules | List all immutable tag rules of current project |
| [**updateImmuRule**](ImmutableApi.md#updateImmuRule) | **PUT** /projects/{project_name_or_id}/immutabletagrules/{immutable_rule_id} | Update the immutable tag rule or enable or disable the rule |



## createImmuRule

> createImmuRule(projectNameOrId, immutableRule, xRequestId, xIsResourceName)

Add an immutable tag rule to current project

This endpoint add an immutable tag rule to the project 

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ImmutableApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImmutableApi apiInstance = new ImmutableApi(defaultClient);
        String projectNameOrId = "projectNameOrId_example"; // String | The name or id of the project
        ImmutableRule immutableRule = new ImmutableRule(); // ImmutableRule | 
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        Boolean xIsResourceName = false; // Boolean | The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
        try {
            apiInstance.createImmuRule(projectNameOrId, immutableRule, xRequestId, xIsResourceName);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImmutableApi#createImmuRule");
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
| **projectNameOrId** | **String**| The name or id of the project | |
| **immutableRule** | [**ImmutableRule**](ImmutableRule.md)|  | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |
| **xIsResourceName** | **Boolean**| The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name. | [optional] [default to false] |

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
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## deleteImmuRule

> deleteImmuRule(projectNameOrId, immutableRuleId, xRequestId, xIsResourceName)

Delete the immutable tag rule.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ImmutableApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImmutableApi apiInstance = new ImmutableApi(defaultClient);
        String projectNameOrId = "projectNameOrId_example"; // String | The name or id of the project
        Long immutableRuleId = 56L; // Long | The ID of the immutable rule
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        Boolean xIsResourceName = false; // Boolean | The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
        try {
            apiInstance.deleteImmuRule(projectNameOrId, immutableRuleId, xRequestId, xIsResourceName);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImmutableApi#deleteImmuRule");
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
| **projectNameOrId** | **String**| The name or id of the project | |
| **immutableRuleId** | **Long**| The ID of the immutable rule | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |
| **xIsResourceName** | **Boolean**| The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name. | [optional] [default to false] |

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
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## listImmuRules

> List&lt;ImmutableRule&gt; listImmuRules(projectNameOrId, xRequestId, xIsResourceName, page, pageSize, q, sort)

List all immutable tag rules of current project

This endpoint returns the immutable tag rules of a project 

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ImmutableApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImmutableApi apiInstance = new ImmutableApi(defaultClient);
        String projectNameOrId = "projectNameOrId_example"; // String | The name or id of the project
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        Boolean xIsResourceName = false; // Boolean | The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
        Long page = 1L; // Long | The page number
        Long pageSize = 10L; // Long | The size of per page
        String q = "q_example"; // String | Query string to query resources. Supported query patterns are \"exact match(k=v)\", \"fuzzy match(k=~v)\", \"range(k=[min~max])\", \"list with union releationship(k={v1 v2 v3})\" and \"list with intersetion relationship(k=(v1 v2 v3))\". The value of range and list can be string(enclosed by \" or '), integer or time(in format \"2020-04-09 02:36:00\"). All of these query patterns should be put in the query string \"q=xxx\" and splitted by \",\". e.g. q=k1=v1,k2=~v2,k3=[min~max]
        String sort = "sort_example"; // String | Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \"sort=field1,-field2\"
        try {
            List<ImmutableRule> result = apiInstance.listImmuRules(projectNameOrId, xRequestId, xIsResourceName, page, pageSize, q, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImmutableApi#listImmuRules");
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
| **projectNameOrId** | **String**| The name or id of the project | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |
| **xIsResourceName** | **Boolean**| The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name. | [optional] [default to false] |
| **page** | **Long**| The page number | [optional] [default to 1] |
| **pageSize** | **Long**| The size of per page | [optional] [default to 10] |
| **q** | **String**| Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max] | [optional] |
| **sort** | **String**| Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot; | [optional] |

### Return type

[**List&lt;ImmutableRule&gt;**](ImmutableRule.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * X-Total-Count - The total count of vulnerabilities <br>  * Link - Link refers to the previous page and next page <br>  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## updateImmuRule

> updateImmuRule(projectNameOrId, immutableRuleId, immutableRule, xRequestId, xIsResourceName)

Update the immutable tag rule or enable or disable the rule

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ImmutableApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImmutableApi apiInstance = new ImmutableApi(defaultClient);
        String projectNameOrId = "projectNameOrId_example"; // String | The name or id of the project
        Long immutableRuleId = 56L; // Long | The ID of the immutable rule
        ImmutableRule immutableRule = new ImmutableRule(); // ImmutableRule | 
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        Boolean xIsResourceName = false; // Boolean | The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
        try {
            apiInstance.updateImmuRule(projectNameOrId, immutableRuleId, immutableRule, xRequestId, xIsResourceName);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImmutableApi#updateImmuRule");
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
| **projectNameOrId** | **String**| The name or id of the project | |
| **immutableRuleId** | **Long**| The ID of the immutable rule | |
| **immutableRule** | [**ImmutableRule**](ImmutableRule.md)|  | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |
| **xIsResourceName** | **Boolean**| The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name. | [optional] [default to false] |

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
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |

