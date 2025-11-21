# MemberApi

All URIs are relative to *http://localhost/api/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProjectMember**](MemberApi.md#createProjectMember) | **POST** /projects/{project_name_or_id}/members | Create project member |
| [**deleteProjectMember**](MemberApi.md#deleteProjectMember) | **DELETE** /projects/{project_name_or_id}/members/{mid} | Delete project member |
| [**getProjectMember**](MemberApi.md#getProjectMember) | **GET** /projects/{project_name_or_id}/members/{mid} | Get the project member information |
| [**listProjectMembers**](MemberApi.md#listProjectMembers) | **GET** /projects/{project_name_or_id}/members | Get all project member information |
| [**updateProjectMember**](MemberApi.md#updateProjectMember) | **PUT** /projects/{project_name_or_id}/members/{mid} | Update project member |



## createProjectMember

> createProjectMember(projectNameOrId, xRequestId, xIsResourceName, projectMember)

Create project member

Create project member relationship, the member can be one of the user_member and group_member,  The user_member need to specify user_id or username. If the user already exist in harbor DB, specify the user_id,  If does not exist in harbor DB, it will SearchAndOnBoard the user. The group_member need to specify id or ldap_group_dn. If the group already exist in harbor DB. specify the user group&#39;s id,  If does not exist, it will SearchAndOnBoard the group. 

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.MemberApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        MemberApi apiInstance = new MemberApi(defaultClient);
        String projectNameOrId = "projectNameOrId_example"; // String | The name or id of the project
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        Boolean xIsResourceName = false; // Boolean | The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
        ProjectMember projectMember = new ProjectMember(); // ProjectMember | 
        try {
            apiInstance.createProjectMember(projectNameOrId, xRequestId, xIsResourceName, projectMember);
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberApi#createProjectMember");
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
| **projectMember** | [**ProjectMember**](ProjectMember.md)|  | [optional] |

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
| **201** | Project member created successfully. |  * Location - The URL of the created resource <br>  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **409** | Conflict |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## deleteProjectMember

> deleteProjectMember(projectNameOrId, mid, xRequestId, xIsResourceName)

Delete project member

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.MemberApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        MemberApi apiInstance = new MemberApi(defaultClient);
        String projectNameOrId = "projectNameOrId_example"; // String | The name or id of the project
        Long mid = 56L; // Long | Member ID.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        Boolean xIsResourceName = false; // Boolean | The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
        try {
            apiInstance.deleteProjectMember(projectNameOrId, mid, xRequestId, xIsResourceName);
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberApi#deleteProjectMember");
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
| **mid** | **Long**| Member ID. | |
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


## getProjectMember

> ProjectMemberEntity getProjectMember(projectNameOrId, mid, xRequestId, xIsResourceName)

Get the project member information

Get the project member information

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.MemberApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        MemberApi apiInstance = new MemberApi(defaultClient);
        String projectNameOrId = "projectNameOrId_example"; // String | The name or id of the project
        Long mid = 56L; // Long | The member ID
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        Boolean xIsResourceName = false; // Boolean | The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
        try {
            ProjectMemberEntity result = apiInstance.getProjectMember(projectNameOrId, mid, xRequestId, xIsResourceName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberApi#getProjectMember");
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
| **mid** | **Long**| The member ID | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |
| **xIsResourceName** | **Boolean**| The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name. | [optional] [default to false] |

### Return type

[**ProjectMemberEntity**](ProjectMemberEntity.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project member retrieved successfully. |  -  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## listProjectMembers

> List&lt;ProjectMemberEntity&gt; listProjectMembers(projectNameOrId, xRequestId, xIsResourceName, page, pageSize, entityname)

Get all project member information

Get all project member information

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.MemberApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        MemberApi apiInstance = new MemberApi(defaultClient);
        String projectNameOrId = "projectNameOrId_example"; // String | The name or id of the project
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        Boolean xIsResourceName = false; // Boolean | The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
        Long page = 1L; // Long | The page number
        Long pageSize = 10L; // Long | The size of per page
        String entityname = "entityname_example"; // String | The entity name to search.
        try {
            List<ProjectMemberEntity> result = apiInstance.listProjectMembers(projectNameOrId, xRequestId, xIsResourceName, page, pageSize, entityname);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberApi#listProjectMembers");
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
| **entityname** | **String**| The entity name to search. | [optional] |

### Return type

[**List&lt;ProjectMemberEntity&gt;**](ProjectMemberEntity.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get project members successfully. |  * X-Total-Count - The total count of vulnerabilities <br>  * Link - Link refers to the previous page and next page <br>  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## updateProjectMember

> updateProjectMember(projectNameOrId, mid, xRequestId, xIsResourceName, role)

Update project member

Update project member relationship

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.MemberApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        MemberApi apiInstance = new MemberApi(defaultClient);
        String projectNameOrId = "projectNameOrId_example"; // String | The name or id of the project
        Long mid = 56L; // Long | Member ID.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        Boolean xIsResourceName = false; // Boolean | The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
        RoleRequest role = new RoleRequest(); // RoleRequest | 
        try {
            apiInstance.updateProjectMember(projectNameOrId, mid, xRequestId, xIsResourceName, role);
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberApi#updateProjectMember");
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
| **mid** | **Long**| Member ID. | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |
| **xIsResourceName** | **Boolean**| The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name. | [optional] [default to false] |
| **role** | [**RoleRequest**](RoleRequest.md)|  | [optional] |

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
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |

