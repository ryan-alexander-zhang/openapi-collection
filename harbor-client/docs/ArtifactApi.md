# ArtifactApi

All URIs are relative to *http://localhost/api/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addLabel**](ArtifactApi.md#addLabel) | **POST** /projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/labels | Add label to artifact |
| [**copyArtifact**](ArtifactApi.md#copyArtifact) | **POST** /projects/{project_name}/repositories/{repository_name}/artifacts | Copy artifact |
| [**createTag**](ArtifactApi.md#createTag) | **POST** /projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/tags | Create tag |
| [**deleteArtifact**](ArtifactApi.md#deleteArtifact) | **DELETE** /projects/{project_name}/repositories/{repository_name}/artifacts/{reference} | Delete the specific artifact |
| [**deleteTag**](ArtifactApi.md#deleteTag) | **DELETE** /projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/tags/{tag_name} | Delete tag |
| [**getAddition**](ArtifactApi.md#getAddition) | **GET** /projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/additions/{addition} | Get the addition of the specific artifact |
| [**getArtifact**](ArtifactApi.md#getArtifact) | **GET** /projects/{project_name}/repositories/{repository_name}/artifacts/{reference} | Get the specific artifact |
| [**getVulnerabilitiesAddition**](ArtifactApi.md#getVulnerabilitiesAddition) | **GET** /projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/additions/vulnerabilities | Get the vulnerabilities addition of the specific artifact |
| [**listAccessories**](ArtifactApi.md#listAccessories) | **GET** /projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/accessories | List accessories |
| [**listArtifacts**](ArtifactApi.md#listArtifacts) | **GET** /projects/{project_name}/repositories/{repository_name}/artifacts | List artifacts |
| [**listTags**](ArtifactApi.md#listTags) | **GET** /projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/tags | List tags |
| [**removeLabel**](ArtifactApi.md#removeLabel) | **DELETE** /projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/labels/{label_id} | Remove label from artifact |



## addLabel

> addLabel(projectName, repositoryName, reference, label, xRequestId)

Add label to artifact

Add label to the specified artiact.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ArtifactApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ArtifactApi apiInstance = new ArtifactApi(defaultClient);
        String projectName = "projectName_example"; // String | The name of the project
        String repositoryName = "repositoryName_example"; // String | The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -> a%2Fb -> a%252Fb
        String reference = "reference_example"; // String | The reference of the artifact, can be digest or tag
        Label label = new Label(); // Label | The label that added to the artifact. Only the ID property is needed.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.addLabel(projectName, repositoryName, reference, label, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArtifactApi#addLabel");
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
| **label** | [**Label**](Label.md)| The label that added to the artifact. Only the ID property is needed. | |
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
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **409** | Conflict |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## copyArtifact

> copyArtifact(projectName, repositoryName, from, xRequestId)

Copy artifact

Copy the artifact specified in the \&quot;from\&quot; parameter to the repository.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ArtifactApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ArtifactApi apiInstance = new ArtifactApi(defaultClient);
        String projectName = "projectName_example"; // String | The name of the project
        String repositoryName = "repositoryName_example"; // String | The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -> a%2Fb -> a%252Fb
        String from = "from_example"; // String | The artifact from which the new artifact is copied from, the format should be \"project/repository:tag\" or \"project/repository@digest\".
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.copyArtifact(projectName, repositoryName, from, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArtifactApi#copyArtifact");
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
| **from** | **String**| The artifact from which the new artifact is copied from, the format should be \&quot;project/repository:tag\&quot; or \&quot;project/repository@digest\&quot;. | |
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
| **201** | Created |  * X-Request-Id - The ID of the corresponding request for the response <br>  * Location - The URL of the created resource <br>  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **405** | Method not allowed |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## createTag

> createTag(projectName, repositoryName, reference, tag, xRequestId)

Create tag

Create a tag for the specified artifact

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ArtifactApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ArtifactApi apiInstance = new ArtifactApi(defaultClient);
        String projectName = "projectName_example"; // String | The name of the project
        String repositoryName = "repositoryName_example"; // String | The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -> a%2Fb -> a%252Fb
        String reference = "reference_example"; // String | The reference of the artifact, can be digest or tag
        Tag tag = new Tag(); // Tag | The JSON object of tag.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.createTag(projectName, repositoryName, reference, tag, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArtifactApi#createTag");
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
| **tag** | [**Tag**](Tag.md)| The JSON object of tag. | |
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
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **405** | Method not allowed |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **409** | Conflict |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## deleteArtifact

> deleteArtifact(projectName, repositoryName, reference, xRequestId)

Delete the specific artifact

Delete the artifact specified by the reference under the project and repository. The reference can be digest or tag

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ArtifactApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ArtifactApi apiInstance = new ArtifactApi(defaultClient);
        String projectName = "projectName_example"; // String | The name of the project
        String repositoryName = "repositoryName_example"; // String | The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -> a%2Fb -> a%252Fb
        String reference = "reference_example"; // String | The reference of the artifact, can be digest or tag
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.deleteArtifact(projectName, repositoryName, reference, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArtifactApi#deleteArtifact");
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


## deleteTag

> deleteTag(projectName, repositoryName, reference, tagName, xRequestId)

Delete tag

Delete the tag of the specified artifact

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ArtifactApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ArtifactApi apiInstance = new ArtifactApi(defaultClient);
        String projectName = "projectName_example"; // String | The name of the project
        String repositoryName = "repositoryName_example"; // String | The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -> a%2Fb -> a%252Fb
        String reference = "reference_example"; // String | The reference of the artifact, can be digest or tag
        String tagName = "tagName_example"; // String | The name of the tag
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.deleteTag(projectName, repositoryName, reference, tagName, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArtifactApi#deleteTag");
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
| **tagName** | **String**| The name of the tag | |
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


## getAddition

> String getAddition(projectName, repositoryName, reference, addition, xRequestId)

Get the addition of the specific artifact

Get the addition of the artifact specified by the reference under the project and repository.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ArtifactApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ArtifactApi apiInstance = new ArtifactApi(defaultClient);
        String projectName = "projectName_example"; // String | The name of the project
        String repositoryName = "repositoryName_example"; // String | The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -> a%2Fb -> a%252Fb
        String reference = "reference_example"; // String | The reference of the artifact, can be digest or tag
        String addition = "build_history"; // String | The type of addition.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            String result = apiInstance.getAddition(projectName, repositoryName, reference, addition, xRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArtifactApi#getAddition");
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
| **addition** | **String**| The type of addition. | [enum: build_history, values.yaml, readme.md, dependencies, sbom, license, files] |
| **xRequestId** | **String**| An unique ID for the request | [optional] |

### Return type

**String**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Content-Type - The content type of response body <br>  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **422** | Unsupported Type |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## getArtifact

> Artifact getArtifact(projectName, repositoryName, reference, xRequestId, page, pageSize, xAcceptVulnerabilities, withTag, withLabel, withScanOverview, withSbomOverview, withAccessory, withSignature, withImmutableStatus)

Get the specific artifact

Get the artifact specified by the reference under the project and repository. The reference can be digest or tag.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ArtifactApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ArtifactApi apiInstance = new ArtifactApi(defaultClient);
        String projectName = "projectName_example"; // String | The name of the project
        String repositoryName = "repositoryName_example"; // String | The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -> a%2Fb -> a%252Fb
        String reference = "reference_example"; // String | The reference of the artifact, can be digest or tag
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        Long page = 1L; // Long | The page number
        Long pageSize = 10L; // Long | The size of per page
        String xAcceptVulnerabilities = "application/vnd.security.vulnerability.report; version=1.1, application/vnd.scanner.adapter.vuln.report.harbor+json; version=1.0"; // String | A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports 'application/vnd.scanner.adapter.vuln.report.harbor+json; version=1.0' and 'application/vnd.security.vulnerability.report; version=1.1'
        Boolean withTag = true; // Boolean | Specify whether the tags are inclued inside the returning artifacts
        Boolean withLabel = false; // Boolean | Specify whether the labels are inclued inside the returning artifacts
        Boolean withScanOverview = false; // Boolean | Specify whether the scan overview is inclued inside the returning artifacts
        Boolean withSbomOverview = false; // Boolean | Specify whether the SBOM overview is included in returning artifact, when this option is true, the SBOM overview will be included in the response
        Boolean withAccessory = false; // Boolean | Specify whether the accessories are included of the returning artifacts.
        Boolean withSignature = false; // Boolean | Specify whether the signature is inclued inside the returning artifacts
        Boolean withImmutableStatus = false; // Boolean | Specify whether the immutable status is inclued inside the tags of the returning artifacts.
        try {
            Artifact result = apiInstance.getArtifact(projectName, repositoryName, reference, xRequestId, page, pageSize, xAcceptVulnerabilities, withTag, withLabel, withScanOverview, withSbomOverview, withAccessory, withSignature, withImmutableStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArtifactApi#getArtifact");
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
| **page** | **Long**| The page number | [optional] [default to 1] |
| **pageSize** | **Long**| The size of per page | [optional] [default to 10] |
| **xAcceptVulnerabilities** | **String**| A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39; | [optional] [default to application/vnd.security.vulnerability.report; version&#x3D;1.1, application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0] |
| **withTag** | **Boolean**| Specify whether the tags are inclued inside the returning artifacts | [optional] [default to true] |
| **withLabel** | **Boolean**| Specify whether the labels are inclued inside the returning artifacts | [optional] [default to false] |
| **withScanOverview** | **Boolean**| Specify whether the scan overview is inclued inside the returning artifacts | [optional] [default to false] |
| **withSbomOverview** | **Boolean**| Specify whether the SBOM overview is included in returning artifact, when this option is true, the SBOM overview will be included in the response | [optional] [default to false] |
| **withAccessory** | **Boolean**| Specify whether the accessories are included of the returning artifacts. | [optional] [default to false] |
| **withSignature** | **Boolean**| Specify whether the signature is inclued inside the returning artifacts | [optional] [default to false] |
| **withImmutableStatus** | **Boolean**| Specify whether the immutable status is inclued inside the tags of the returning artifacts. | [optional] [default to false] |

### Return type

[**Artifact**](Artifact.md)

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
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## getVulnerabilitiesAddition

> String getVulnerabilitiesAddition(projectName, repositoryName, reference, xRequestId, xAcceptVulnerabilities)

Get the vulnerabilities addition of the specific artifact

Get the vulnerabilities addition of the artifact specified by the reference under the project and repository.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ArtifactApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ArtifactApi apiInstance = new ArtifactApi(defaultClient);
        String projectName = "projectName_example"; // String | The name of the project
        String repositoryName = "repositoryName_example"; // String | The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -> a%2Fb -> a%252Fb
        String reference = "reference_example"; // String | The reference of the artifact, can be digest or tag
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        String xAcceptVulnerabilities = "application/vnd.security.vulnerability.report; version=1.1, application/vnd.scanner.adapter.vuln.report.harbor+json; version=1.0"; // String | A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports 'application/vnd.scanner.adapter.vuln.report.harbor+json; version=1.0' and 'application/vnd.security.vulnerability.report; version=1.1'
        try {
            String result = apiInstance.getVulnerabilitiesAddition(projectName, repositoryName, reference, xRequestId, xAcceptVulnerabilities);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArtifactApi#getVulnerabilitiesAddition");
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
| **xAcceptVulnerabilities** | **String**| A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39; | [optional] [default to application/vnd.security.vulnerability.report; version&#x3D;1.1, application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0] |

### Return type

**String**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Content-Type - The content type of response body <br>  |
| **400** | Bad request |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **401** | Unauthorized |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **403** | Forbidden |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## listAccessories

> List&lt;Accessory&gt; listAccessories(projectName, repositoryName, reference, xRequestId, q, sort, page, pageSize)

List accessories

List accessories of the specific artifact

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ArtifactApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ArtifactApi apiInstance = new ArtifactApi(defaultClient);
        String projectName = "projectName_example"; // String | The name of the project
        String repositoryName = "repositoryName_example"; // String | The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -> a%2Fb -> a%252Fb
        String reference = "reference_example"; // String | The reference of the artifact, can be digest or tag
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        String q = "q_example"; // String | Query string to query resources. Supported query patterns are \"exact match(k=v)\", \"fuzzy match(k=~v)\", \"range(k=[min~max])\", \"list with union releationship(k={v1 v2 v3})\" and \"list with intersetion relationship(k=(v1 v2 v3))\". The value of range and list can be string(enclosed by \" or '), integer or time(in format \"2020-04-09 02:36:00\"). All of these query patterns should be put in the query string \"q=xxx\" and splitted by \",\". e.g. q=k1=v1,k2=~v2,k3=[min~max]
        String sort = "sort_example"; // String | Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \"sort=field1,-field2\"
        Long page = 1L; // Long | The page number
        Long pageSize = 10L; // Long | The size of per page
        try {
            List<Accessory> result = apiInstance.listAccessories(projectName, repositoryName, reference, xRequestId, q, sort, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArtifactApi#listAccessories");
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
| **q** | **String**| Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max] | [optional] |
| **sort** | **String**| Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot; | [optional] |
| **page** | **Long**| The page number | [optional] [default to 1] |
| **pageSize** | **Long**| The size of per page | [optional] [default to 10] |

### Return type

[**List&lt;Accessory&gt;**](Accessory.md)

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
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## listArtifacts

> List&lt;Artifact&gt; listArtifacts(projectName, repositoryName, xRequestId, q, sort, page, pageSize, xAcceptVulnerabilities, withTag, withLabel, withScanOverview, withSbomOverview, withImmutableStatus, withAccessory)

List artifacts

List artifacts under the specific project and repository. Except the basic properties, the other supported queries in \&quot;q\&quot; includes \&quot;tags&#x3D;*\&quot; to list only tagged artifacts, \&quot;tags&#x3D;nil\&quot; to list only untagged artifacts, \&quot;tags&#x3D;~v\&quot; to list artifacts whose tag fuzzy matches \&quot;v\&quot;, \&quot;tags&#x3D;v\&quot; to list artifact whose tag exactly matches \&quot;v\&quot;, \&quot;labels&#x3D;(id1, id2)\&quot; to list artifacts that both labels with id1 and id2 are added to

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ArtifactApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ArtifactApi apiInstance = new ArtifactApi(defaultClient);
        String projectName = "projectName_example"; // String | The name of the project
        String repositoryName = "repositoryName_example"; // String | The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -> a%2Fb -> a%252Fb
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        String q = "q_example"; // String | Query string to query resources. Supported query patterns are \"exact match(k=v)\", \"fuzzy match(k=~v)\", \"range(k=[min~max])\", \"list with union releationship(k={v1 v2 v3})\" and \"list with intersetion relationship(k=(v1 v2 v3))\". The value of range and list can be string(enclosed by \" or '), integer or time(in format \"2020-04-09 02:36:00\"). All of these query patterns should be put in the query string \"q=xxx\" and splitted by \",\". e.g. q=k1=v1,k2=~v2,k3=[min~max]
        String sort = "sort_example"; // String | Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \"sort=field1,-field2\"
        Long page = 1L; // Long | The page number
        Long pageSize = 10L; // Long | The size of per page
        String xAcceptVulnerabilities = "application/vnd.security.vulnerability.report; version=1.1, application/vnd.scanner.adapter.vuln.report.harbor+json; version=1.0"; // String | A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports 'application/vnd.scanner.adapter.vuln.report.harbor+json; version=1.0' and 'application/vnd.security.vulnerability.report; version=1.1'
        Boolean withTag = true; // Boolean | Specify whether the tags are included inside the returning artifacts
        Boolean withLabel = false; // Boolean | Specify whether the labels are included inside the returning artifacts
        Boolean withScanOverview = false; // Boolean | Specify whether the scan overview is included inside the returning artifacts
        Boolean withSbomOverview = false; // Boolean | Specify whether the SBOM overview is included in returning artifacts, when this option is true, the SBOM overview will be included in the response
        Boolean withImmutableStatus = false; // Boolean | Specify whether the immutable status is included inside the tags of the returning artifacts. Only works when setting \"with_immutable_status=true\"
        Boolean withAccessory = false; // Boolean | Specify whether the accessories are included of the returning artifacts. Only works when setting \"with_accessory=true\"
        try {
            List<Artifact> result = apiInstance.listArtifacts(projectName, repositoryName, xRequestId, q, sort, page, pageSize, xAcceptVulnerabilities, withTag, withLabel, withScanOverview, withSbomOverview, withImmutableStatus, withAccessory);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArtifactApi#listArtifacts");
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
| **xRequestId** | **String**| An unique ID for the request | [optional] |
| **q** | **String**| Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max] | [optional] |
| **sort** | **String**| Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot; | [optional] |
| **page** | **Long**| The page number | [optional] [default to 1] |
| **pageSize** | **Long**| The size of per page | [optional] [default to 10] |
| **xAcceptVulnerabilities** | **String**| A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39; | [optional] [default to application/vnd.security.vulnerability.report; version&#x3D;1.1, application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0] |
| **withTag** | **Boolean**| Specify whether the tags are included inside the returning artifacts | [optional] [default to true] |
| **withLabel** | **Boolean**| Specify whether the labels are included inside the returning artifacts | [optional] [default to false] |
| **withScanOverview** | **Boolean**| Specify whether the scan overview is included inside the returning artifacts | [optional] [default to false] |
| **withSbomOverview** | **Boolean**| Specify whether the SBOM overview is included in returning artifacts, when this option is true, the SBOM overview will be included in the response | [optional] [default to false] |
| **withImmutableStatus** | **Boolean**| Specify whether the immutable status is included inside the tags of the returning artifacts. Only works when setting \&quot;with_immutable_status&#x3D;true\&quot; | [optional] [default to false] |
| **withAccessory** | **Boolean**| Specify whether the accessories are included of the returning artifacts. Only works when setting \&quot;with_accessory&#x3D;true\&quot; | [optional] [default to false] |

### Return type

[**List&lt;Artifact&gt;**](Artifact.md)

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
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## listTags

> List&lt;Tag&gt; listTags(projectName, repositoryName, reference, xRequestId, q, sort, page, pageSize, withImmutableStatus)

List tags

List tags of the specific artifact

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ArtifactApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ArtifactApi apiInstance = new ArtifactApi(defaultClient);
        String projectName = "projectName_example"; // String | The name of the project
        String repositoryName = "repositoryName_example"; // String | The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -> a%2Fb -> a%252Fb
        String reference = "reference_example"; // String | The reference of the artifact, can be digest or tag
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        String q = "q_example"; // String | Query string to query resources. Supported query patterns are \"exact match(k=v)\", \"fuzzy match(k=~v)\", \"range(k=[min~max])\", \"list with union releationship(k={v1 v2 v3})\" and \"list with intersetion relationship(k=(v1 v2 v3))\". The value of range and list can be string(enclosed by \" or '), integer or time(in format \"2020-04-09 02:36:00\"). All of these query patterns should be put in the query string \"q=xxx\" and splitted by \",\". e.g. q=k1=v1,k2=~v2,k3=[min~max]
        String sort = "sort_example"; // String | Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \"sort=field1,-field2\"
        Long page = 1L; // Long | The page number
        Long pageSize = 10L; // Long | The size of per page
        Boolean withImmutableStatus = false; // Boolean | Specify whether the immutable status is included inside the returning tags
        try {
            List<Tag> result = apiInstance.listTags(projectName, repositoryName, reference, xRequestId, q, sort, page, pageSize, withImmutableStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArtifactApi#listTags");
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
| **q** | **String**| Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max] | [optional] |
| **sort** | **String**| Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot; | [optional] |
| **page** | **Long**| The page number | [optional] [default to 1] |
| **pageSize** | **Long**| The size of per page | [optional] [default to 10] |
| **withImmutableStatus** | **Boolean**| Specify whether the immutable status is included inside the returning tags | [optional] [default to false] |

### Return type

[**List&lt;Tag&gt;**](Tag.md)

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
| **404** | Not found |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |


## removeLabel

> removeLabel(projectName, repositoryName, reference, labelId, xRequestId)

Remove label from artifact

Remove the label from the specified artiact.

### Example

```java
// Import classes:
import com.ryan.openapi.harbor.client.invoker.ApiClient;
import com.ryan.openapi.harbor.client.invoker.ApiException;
import com.ryan.openapi.harbor.client.invoker.Configuration;
import com.ryan.openapi.harbor.client.invoker.auth.*;
import com.ryan.openapi.harbor.client.invoker.models.*;
import com.ryan.openapi.harbor.client.api.ArtifactApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v2.0");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ArtifactApi apiInstance = new ArtifactApi(defaultClient);
        String projectName = "projectName_example"; // String | The name of the project
        String repositoryName = "repositoryName_example"; // String | The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -> a%2Fb -> a%252Fb
        String reference = "reference_example"; // String | The reference of the artifact, can be digest or tag
        Long labelId = 56L; // Long | The ID of the label that removed from the artifact.
        String xRequestId = "xRequestId_example"; // String | An unique ID for the request
        try {
            apiInstance.removeLabel(projectName, repositoryName, reference, labelId, xRequestId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArtifactApi#removeLabel");
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
| **labelId** | **Long**| The ID of the label that removed from the artifact. | |
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
| **409** | Conflict |  * X-Request-Id - The ID of the corresponding request for the response <br>  |
| **500** | Internal server error |  * X-Request-Id - The ID of the corresponding request for the response <br>  |

