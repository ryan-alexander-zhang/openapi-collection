# LdapApi

All URIs are relative to *http://localhost/api/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**importLdapUser**](LdapApi.md#importLdapUser) | **POST** /ldap/users/import | Import selected available ldap users. |
| [**pingLdap**](LdapApi.md#pingLdap) | **POST** /ldap/ping | Ping available ldap service. |
| [**searchLdapGroup**](LdapApi.md#searchLdapGroup) | **GET** /ldap/groups/search | Search available ldap groups. |
| [**searchLdapUser**](LdapApi.md#searchLdapUser) | **GET** /ldap/users/search | Search available ldap users. |



## importLdapUser

> importLdapUser(uidList, xRequestId)

Import selected available ldap users.

This endpoint adds the selected available ldap users to harbor based on related configuration parameters from the system. System will try to guess the user email address and realname, add to harbor user information. If have errors when import user, will return the list of importing failed uid and the failed reason. 

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.LdapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LdapApi apiInstance = new LdapApi(defaultClient);
        LdapImportUsers uidList = new LdapImportUsers(); // LdapImportUsers | The uid listed for importing. This list will check users validity of ldap service based on configuration from the system.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.importLdapUser(uidList, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling LdapApi#importLdapUser");
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
| **uidList** | [**LdapImportUsers**](LdapImportUsers.md)| The uid listed for importing. This list will check users validity of ldap service based on configuration from the system. | |
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
| **200** | Add ldap users successfully. |  -  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Failed import some users. |  -  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## pingLdap

> LdapPingResult pingLdap(xRequestId, ldapconf)

Ping available ldap service.

This endpoint ping the available ldap service for test related configuration parameters. 

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.LdapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LdapApi apiInstance = new LdapApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        LdapConf ldapconf = new LdapConf(); // LdapConf | ldap configuration. support input ldap service configuration. If it is a empty request, will load current configuration from the system.
        try {
            LdapPingResult result = apiInstance.pingLdap(xRequestId, ldapconf);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LdapApi#pingLdap");
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
| **ldapconf** | [**LdapConf**](LdapConf.md)| ldap configuration. support input ldap service configuration. If it is a empty request, will load current configuration from the system. | [optional] |

### Return type

[**LdapPingResult**](LdapPingResult.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ping ldap service successfully. |  -  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## searchLdapGroup

> List&lt;UserGroup&gt; searchLdapGroup(xRequestId, groupname, groupdn)

Search available ldap groups.

This endpoint searches the available ldap groups based on related configuration parameters. support to search by groupname or groupdn. 

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.LdapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LdapApi apiInstance = new LdapApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        String groupname = "groupname_example"; // String | Ldap group name
        String groupdn = "groupdn_example"; // String | The LDAP group DN
        try {
            List<UserGroup> result = apiInstance.searchLdapGroup(xRequestId, groupname, groupdn);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LdapApi#searchLdapGroup");
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
| **groupname** | **String**| Ldap group name | [optional] |
| **groupdn** | **String**| The LDAP group DN | [optional] |

### Return type

[**List&lt;UserGroup&gt;**](UserGroup.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Search ldap group successfully. |  -  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## searchLdapUser

> List&lt;LdapUser&gt; searchLdapUser(xRequestId, username)

Search available ldap users.

This endpoint searches the available ldap users based on related configuration parameters. Support searched by input ldap configuration, load configuration from the system and specific filter. 

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.LdapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LdapApi apiInstance = new LdapApi(defaultClient);
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        String username = "username_example"; // String | Registered user ID
        try {
            List<LdapUser> result = apiInstance.searchLdapUser(xRequestId, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LdapApi#searchLdapUser");
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
| **username** | **String**| Registered user ID | [optional] |

### Return type

[**List&lt;LdapUser&gt;**](LdapUser.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Search ldap users successfully. |  -  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |

