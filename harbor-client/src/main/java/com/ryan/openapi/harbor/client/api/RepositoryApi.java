package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient.ResponseSpec;
import org.springframework.web.client.RestClientResponseException;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.17.0")
public class RepositoryApi {
    private ApiClient apiClient;

    public RepositoryApi() {
        this(new ApiClient());
    }

    public RepositoryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete repository
     * Delete the repository specified by name
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteRepositoryRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling deleteRepository", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling deleteRepository", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete repository
     * Delete the repository specified by name
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteRepository(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteRepositoryRequestCreation(projectName, repositoryName, xRequestId).body(localVarReturnType);
    }

    /**
     * Delete repository
     * Delete the repository specified by name
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteRepositoryWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteRepositoryRequestCreation(projectName, repositoryName, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Delete repository
     * Delete the repository specified by name
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteRepositoryWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return deleteRepositoryRequestCreation(projectName, repositoryName, xRequestId);
    }

    /**
     * Get repository
     * Get the repository specified by name
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param xRequestId An unique ID for the request
     * @return Repository
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRepositoryRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling getRepository", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling getRepository", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<Repository> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get repository
     * Get the repository specified by name
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param xRequestId An unique ID for the request
     * @return Repository
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Repository getRepository(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Repository> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRepositoryRequestCreation(projectName, repositoryName, xRequestId).body(localVarReturnType);
    }

    /**
     * Get repository
     * Get the repository specified by name
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;Repository&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Repository> getRepositoryWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Repository> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRepositoryRequestCreation(projectName, repositoryName, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get repository
     * Get the repository specified by name
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRepositoryWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getRepositoryRequestCreation(projectName, repositoryName, xRequestId);
    }

    /**
     * List all authorized repositories
     * List all authorized repositories
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;Repository&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listAllRepositoriesRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<Repository>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/repositories", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List all authorized repositories
     * List all authorized repositories
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;Repository&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Repository> listAllRepositories(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<Repository>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listAllRepositoriesRequestCreation(xRequestId, q, sort, page, pageSize).body(localVarReturnType);
    }

    /**
     * List all authorized repositories
     * List all authorized repositories
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseEntity&lt;List&lt;Repository&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Repository>> listAllRepositoriesWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<Repository>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listAllRepositoriesRequestCreation(xRequestId, q, sort, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * List all authorized repositories
     * List all authorized repositories
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listAllRepositoriesWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        return listAllRepositoriesRequestCreation(xRequestId, q, sort, page, pageSize);
    }

    /**
     * List repositories
     * List repositories of the specified project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;Repository&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listRepositoriesRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling listRepositories", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<Repository>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/repositories", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List repositories
     * List repositories of the specified project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;Repository&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Repository> listRepositories(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<Repository>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listRepositoriesRequestCreation(projectName, xRequestId, q, sort, page, pageSize).body(localVarReturnType);
    }

    /**
     * List repositories
     * List repositories of the specified project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseEntity&lt;List&lt;Repository&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Repository>> listRepositoriesWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<Repository>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listRepositoriesRequestCreation(projectName, xRequestId, q, sort, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * List repositories
     * List repositories of the specified project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listRepositoriesWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        return listRepositoriesRequestCreation(projectName, xRequestId, q, sort, page, pageSize);
    }

    /**
     * Update repository
     * Update the repository specified by name
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param repository The JSON object of repository.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateRepositoryRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull Repository repository, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = repository;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling updateRepository", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling updateRepository", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repository' is set
        if (repository == null) {
            throw new RestClientResponseException("Missing the required parameter 'repository' when calling updateRepository", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update repository
     * Update the repository specified by name
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param repository The JSON object of repository.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateRepository(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull Repository repository, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateRepositoryRequestCreation(projectName, repositoryName, repository, xRequestId).body(localVarReturnType);
    }

    /**
     * Update repository
     * Update the repository specified by name
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param repository The JSON object of repository.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateRepositoryWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull Repository repository, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateRepositoryRequestCreation(projectName, repositoryName, repository, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Update repository
     * Update the repository specified by name
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param repository The JSON object of repository.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateRepositoryWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull Repository repository, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return updateRepositoryRequestCreation(projectName, repositoryName, repository, xRequestId);
    }
}
