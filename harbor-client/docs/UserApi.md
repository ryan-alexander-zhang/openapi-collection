# UserApi

All URIs are relative to *http://localhost/api/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUser**](UserApi.md#createUser) | **POST** /users | Create a local user. |
| [**deleteUser**](UserApi.md#deleteUser) | **DELETE** /users/{user_id} | Mark a registered user as be removed. |
| [**getCurrentUserInfo**](UserApi.md#getCurrentUserInfo) | **GET** /users/current | Get current user info. |
| [**getCurrentUserPermissions**](UserApi.md#getCurrentUserPermissions) | **GET** /users/current/permissions | Get current user permissions. |
| [**getUser**](UserApi.md#getUser) | **GET** /users/{user_id} | Get a user&#39;s profile. |
| [**listUsers**](UserApi.md#listUsers) | **GET** /users | List users |
| [**searchUsers**](UserApi.md#searchUsers) | **GET** /users/search | Search users by username |
| [**setCliSecret**](UserApi.md#setCliSecret) | **PUT** /users/{user_id}/cli_secret | Set CLI secret for a user. |
| [**setUserSysAdmin**](UserApi.md#setUserSysAdmin) | **PUT** /users/{user_id}/sysadmin | Update a registered user to change to be an administrator of Harbor. |
| [**updateUserPassword**](UserApi.md#updateUserPassword) | **PUT** /users/{user_id}/password | Change the password on a user that already exists. |
| [**updateUserProfile**](UserApi.md#updateUserProfile) | **PUT** /users/{user_id} | Update user&#39;s profile. |



## createUser

> createUser(userReq, xRequestId)

Create a local user.

This API can be used only when the authentication mode is for local DB.  When self registration is disabled.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        UserApi apiInstance = new UserApi(defaultClient);
        UserCreationReq userReq = new UserCreationReq(); // UserCreationReq | The new user
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.createUser(userReq, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#createUser");
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
| **userReq** | [**UserCreationReq**](UserCreationReq.md)| The new user | |
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
| **403** | When the  self registration is disabled, non-admin does not have permission to create user.  When self registration is enabled, this API can only be called from UI portal, calling it via script will get a 403 error. |  -  |
| **409** | Conflict |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## deleteUser

> deleteUser(userId, xRequestId)

Mark a registered user as be removed.

This endpoint let administrator of Harbor mark a registered user as removed.It actually won&#39;t be deleted from DB. 

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer userId = 56; // Integer | User ID for marking as to be removed.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.deleteUser(userId, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#deleteUser");
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
| **userId** | **Integer**| User ID for marking as to be removed. | |
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


## getCurrentUserInfo

> UserResp getCurrentUserInfo(xRequestId)

Get current user info.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        UserApi apiInstance = new UserApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            UserResp result = apiInstance.getCurrentUserInfo(xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getCurrentUserInfo");
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

[**UserResp**](UserResp.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get current user information successfully. |  -  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## getCurrentUserPermissions

> List&lt;Permission&gt; getCurrentUserPermissions(xRequestId, scope, relative)

Get current user permissions.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        UserApi apiInstance = new UserApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        String scope = "scope_example"; // String | The scope for the permission
        Boolean relative = true; // Boolean | If true, the resources in the response are relative to the scope, eg for resource '/project/1/repository' if relative is 'true' then the resource in response will be 'repository'. 
        try {
            List<Permission> result = apiInstance.getCurrentUserPermissions(xRequestId, scope, relative);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getCurrentUserPermissions");
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
| **scope** | **String**| The scope for the permission | [optional] |
| **relative** | **Boolean**| If true, the resources in the response are relative to the scope, eg for resource &#39;/project/1/repository&#39; if relative is &#39;true&#39; then the resource in response will be &#39;repository&#39;.  | [optional] |

### Return type

[**List&lt;Permission&gt;**](Permission.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get current user permission successfully. |  -  |
| **401** | User need to log in first. |  -  |
| **500** | Internal errors. |  -  |


## getUser

> UserResp getUser(userId, xRequestId)

Get a user&#39;s profile.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer userId = 56; // Integer | 
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            UserResp result = apiInstance.getUser(userId, xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getUser");
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
| **userId** | **Integer**|  | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |

### Return type

[**UserResp**](UserResp.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get user&#39;s info successfully. |  -  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## listUsers

> List&lt;UserResp&gt; listUsers(xRequestId, q, sort, page, pageSize)

List users

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        UserApi apiInstance = new UserApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        String q = "q_example"; // String | Query string to query resources. Supported query patterns are \"exact match(k=v)\", \"fuzzy match(k=~v)\", \"range(k=[min~max])\", \"list with union releationship(k={v1 v2 v3})\" and \"list with intersetion relationship(k=(v1 v2 v3))\". The value of range and list can be string(enclosed by \" or '), integer or time(in format \"2020-04-09 02:36:00\"). All of these query patterns should be put in the query string \"q=xxx\" and splitted by \",\". e.g. q=k1=v1,k2=~v2,k3=[min~max]
        String sort = "sort_example"; // String | Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \"sort=field1,-field2\"
        Long page = 1L; // Long | The page number
        Long pageSize = 10L; // Long | The size of per page
        try {
            List<UserResp> result = apiInstance.listUsers(xRequestId, q, sort, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#listUsers");
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

[**List&lt;UserResp&gt;**](UserResp.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | return the list of users. |  * X-Total-Count - The total count of vulnerabilities <br>  * Link - Link refers to the previous page and next page <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## searchUsers

> List&lt;UserSearchRespItem&gt; searchUsers(username, xRequestId, page, pageSize)

Search users by username

This endpoint is to search the users by username.  It&#39;s open for all authenticated requests. 

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        UserApi apiInstance = new UserApi(defaultClient);
        String username = "username_example"; // String | Username for filtering results.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        Long page = 1L; // Long | The page number
        Long pageSize = 10L; // Long | The size of per page
        try {
            List<UserSearchRespItem> result = apiInstance.searchUsers(username, xRequestId, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#searchUsers");
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
| **username** | **String**| Username for filtering results. | |
| **xRequestId** | **String**| An unique ID for the request | [optional] |
| **page** | **Long**| The page number | [optional] [default to 1] |
| **pageSize** | **Long**| The size of per page | [optional] [default to 10] |

### Return type

[**List&lt;UserSearchRespItem&gt;**](UserSearchRespItem.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Search users by username successfully. |  * X-Total-Count - The total count of vulnerabilities <br>  * Link - Link refers to the previous page and next page <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## setCliSecret

> setCliSecret(userId, secret, xRequestId)

Set CLI secret for a user.

This endpoint let user generate a new CLI secret for himself.  This API only works when auth mode is set to &#39;OIDC&#39;. Once this API returns with successful status, the old secret will be invalid, as there will be only one CLI secret for a user.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer userId = 56; // Integer | User ID
        OIDCCliSecretReq secret = new OIDCCliSecretReq(); // OIDCCliSecretReq | 
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.setCliSecret(userId, secret, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#setCliSecret");
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
| **userId** | **Integer**| User ID | |
| **secret** | [**OIDCCliSecretReq**](OIDCCliSecretReq.md)|  | |
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
| **200** | The secret is successfully updated |  -  |
| **400** | Invalid user ID.  Or user is not onboarded via OIDC authentication. Or the secret does not meet the standard. |  -  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **412** | The auth mode of the system is not \&quot;oidc_auth\&quot;, or the user is not onboarded via OIDC AuthN. |  -  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## setUserSysAdmin

> setUserSysAdmin(userId, sysadminFlag, xRequestId)

Update a registered user to change to be an administrator of Harbor.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer userId = 56; // Integer | 
        UserSysAdminFlag sysadminFlag = new UserSysAdminFlag(); // UserSysAdminFlag | Toggle a user to admin or not.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.setUserSysAdmin(userId, sysadminFlag, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#setUserSysAdmin");
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
| **userId** | **Integer**|  | |
| **sysadminFlag** | [**UserSysAdminFlag**](UserSysAdminFlag.md)| Toggle a user to admin or not. | |
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
| **200** | Success |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Unexpected internal errors. |  -  |


## updateUserPassword

> updateUserPassword(userId, password, xRequestId)

Change the password on a user that already exists.

This endpoint is for user to update password. Users with the admin role can change any user&#39;s password. Regular users can change only their own password. 

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer userId = 56; // Integer | 
        PasswordReq password = new PasswordReq(); // PasswordReq | Password to be updated, the attribute 'old_password' is optional when the API is called by the system administrator.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.updateUserPassword(userId, password, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#updateUserPassword");
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
| **userId** | **Integer**|  | |
| **password** | [**PasswordReq**](PasswordReq.md)| Password to be updated, the attribute &#39;old_password&#39; is optional when the API is called by the system administrator. | |
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
| **200** | Success |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **400** | Invalid user ID; Password does not meet requirement |  -  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | The caller does not have permission to update the password of the user with given ID, or the old password in request body is not correct. |  -  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## updateUserProfile

> updateUserProfile(userId, profile, xRequestId)

Update user&#39;s profile.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        UserApi apiInstance = new UserApi(defaultClient);
        Integer userId = 56; // Integer | Registered user ID
        UserProfile profile = new UserProfile(); // UserProfile | Only email, realname and comment can be modified.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.updateUserProfile(userId, profile, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#updateUserProfile");
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
| **userId** | **Integer**| Registered user ID | |
| **profile** | [**UserProfile**](UserProfile.md)| Only email, realname and comment can be modified. | |
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
| **200** | Success |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |

