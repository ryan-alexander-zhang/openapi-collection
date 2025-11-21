package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Artifact;
import com.ryan.openapi.harbor.client.model.AuditLog;
import com.ryan.openapi.harbor.client.model.AuditLogExt;
import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.Project;
import com.ryan.openapi.harbor.client.model.ProjectDeletable;
import com.ryan.openapi.harbor.client.model.ProjectReq;
import com.ryan.openapi.harbor.client.model.ProjectScanner;
import com.ryan.openapi.harbor.client.model.ProjectSummary;
import com.ryan.openapi.harbor.client.model.ScannerRegistration;

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
public class ProjectApi {
    private ApiClient apiClient;

    public ProjectApi() {
        this(new ApiClient());
    }

    public ProjectApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new project.
     * This endpoint is for user to create a new project.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param project New created project.
     * @param xRequestId An unique ID for the request
     * @param xResourceNameInLocation The flag to indicate whether to return the name of the resource in Location. When X-Resource-Name-In-Location is true, the Location will return the name of the resource.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createProjectRequestCreation(@jakarta.annotation.Nonnull ProjectReq project, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xResourceNameInLocation) throws RestClientResponseException {
        Object postBody = project;
        // verify the required parameter 'project' is set
        if (project == null) {
            throw new RestClientResponseException("Missing the required parameter 'project' when calling createProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xResourceNameInLocation != null)
        headerParams.add("X-Resource-Name-In-Location", apiClient.parameterToString(xResourceNameInLocation));
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
        return apiClient.invokeAPI("/projects", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a new project.
     * This endpoint is for user to create a new project.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param project New created project.
     * @param xRequestId An unique ID for the request
     * @param xResourceNameInLocation The flag to indicate whether to return the name of the resource in Location. When X-Resource-Name-In-Location is true, the Location will return the name of the resource.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void createProject(@jakarta.annotation.Nonnull ProjectReq project, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xResourceNameInLocation) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        createProjectRequestCreation(project, xRequestId, xResourceNameInLocation).body(localVarReturnType);
    }

    /**
     * Create a new project.
     * This endpoint is for user to create a new project.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param project New created project.
     * @param xRequestId An unique ID for the request
     * @param xResourceNameInLocation The flag to indicate whether to return the name of the resource in Location. When X-Resource-Name-In-Location is true, the Location will return the name of the resource.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createProjectWithHttpInfo(@jakarta.annotation.Nonnull ProjectReq project, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xResourceNameInLocation) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createProjectRequestCreation(project, xRequestId, xResourceNameInLocation).toEntity(localVarReturnType);
    }

    /**
     * Create a new project.
     * This endpoint is for user to create a new project.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param project New created project.
     * @param xRequestId An unique ID for the request
     * @param xResourceNameInLocation The flag to indicate whether to return the name of the resource in Location. When X-Resource-Name-In-Location is true, the Location will return the name of the resource.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createProjectWithResponseSpec(@jakarta.annotation.Nonnull ProjectReq project, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xResourceNameInLocation) throws RestClientResponseException {
        return createProjectRequestCreation(project, xRequestId, xResourceNameInLocation);
    }

    /**
     * Delete project by projectID
     * This endpoint is aimed to delete project by project ID.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteProjectRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling deleteProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xIsResourceName != null)
        headerParams.add("X-Is-Resource-Name", apiClient.parameterToString(xIsResourceName));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete project by projectID
     * This endpoint is aimed to delete project by project ID.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteProject(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Delete project by projectID
     * This endpoint is aimed to delete project by project ID.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteProjectWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Delete project by projectID
     * This endpoint is aimed to delete project by project ID.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteProjectWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return deleteProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName);
    }

    /**
     * Get recent logs of the projects
     * Get recent logs of the projects
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;AuditLogExt&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getLogExtsRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling getLogExts", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<List<AuditLogExt>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/auditlog-exts", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get recent logs of the projects
     * Get recent logs of the projects
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;AuditLogExt&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<AuditLogExt> getLogExts(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<AuditLogExt>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getLogExtsRequestCreation(projectName, xRequestId, q, sort, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get recent logs of the projects
     * Get recent logs of the projects
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseEntity&lt;List&lt;AuditLogExt&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AuditLogExt>> getLogExtsWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<AuditLogExt>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getLogExtsRequestCreation(projectName, xRequestId, q, sort, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get recent logs of the projects
     * Get recent logs of the projects
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
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
    public ResponseSpec getLogExtsWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        return getLogExtsRequestCreation(projectName, xRequestId, q, sort, page, pageSize);
    }

    /**
     * Get recent logs of the projects (deprecated)
     * Get recent logs of the projects, it only query the previous version&#39;s audit log
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;AuditLog&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getLogsRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling getLogs", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<List<AuditLog>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/logs", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get recent logs of the projects (deprecated)
     * Get recent logs of the projects, it only query the previous version&#39;s audit log
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;AuditLog&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<AuditLog> getLogs(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<AuditLog>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getLogsRequestCreation(projectName, xRequestId, q, sort, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get recent logs of the projects (deprecated)
     * Get recent logs of the projects, it only query the previous version&#39;s audit log
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseEntity&lt;List&lt;AuditLog&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AuditLog>> getLogsWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<AuditLog>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getLogsRequestCreation(projectName, xRequestId, q, sort, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get recent logs of the projects (deprecated)
     * Get recent logs of the projects, it only query the previous version&#39;s audit log
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
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
    public ResponseSpec getLogsWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        return getLogsRequestCreation(projectName, xRequestId, q, sort, page, pageSize);
    }

    /**
     * Return specific project detail information
     * This endpoint returns specific project information by project ID.
     * <p><b>200</b> - Return matched project information.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return Project
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getProjectRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling getProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xIsResourceName != null)
        headerParams.add("X-Is-Resource-Name", apiClient.parameterToString(xIsResourceName));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<Project> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Return specific project detail information
     * This endpoint returns specific project information by project ID.
     * <p><b>200</b> - Return matched project information.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return Project
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Project getProject(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Project> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Return specific project detail information
     * This endpoint returns specific project information by project ID.
     * <p><b>200</b> - Return matched project information.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseEntity&lt;Project&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Project> getProjectWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Project> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Return specific project detail information
     * This endpoint returns specific project information by project ID.
     * <p><b>200</b> - Return matched project information.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getProjectWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return getProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName);
    }

    /**
     * Get the deletable status of the project
     * Get the deletable status of the project
     * <p><b>200</b> - Return deletable status of the project.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ProjectDeletable
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getProjectDeletableRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling getProjectDeletable", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xIsResourceName != null)
        headerParams.add("X-Is-Resource-Name", apiClient.parameterToString(xIsResourceName));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<ProjectDeletable> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/_deletable", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the deletable status of the project
     * Get the deletable status of the project
     * <p><b>200</b> - Return deletable status of the project.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ProjectDeletable
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ProjectDeletable getProjectDeletable(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<ProjectDeletable> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProjectDeletableRequestCreation(projectNameOrId, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Get the deletable status of the project
     * Get the deletable status of the project
     * <p><b>200</b> - Return deletable status of the project.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseEntity&lt;ProjectDeletable&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectDeletable> getProjectDeletableWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<ProjectDeletable> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProjectDeletableRequestCreation(projectNameOrId, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Get the deletable status of the project
     * Get the deletable status of the project
     * <p><b>200</b> - Return deletable status of the project.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getProjectDeletableWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return getProjectDeletableRequestCreation(projectNameOrId, xRequestId, xIsResourceName);
    }

    /**
     * Get summary of the project.
     * Get summary of the project.
     * <p><b>200</b> - Get summary of the project successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ProjectSummary
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getProjectSummaryRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling getProjectSummary", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xIsResourceName != null)
        headerParams.add("X-Is-Resource-Name", apiClient.parameterToString(xIsResourceName));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<ProjectSummary> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/summary", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get summary of the project.
     * Get summary of the project.
     * <p><b>200</b> - Get summary of the project successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ProjectSummary
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ProjectSummary getProjectSummary(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<ProjectSummary> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProjectSummaryRequestCreation(projectNameOrId, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Get summary of the project.
     * Get summary of the project.
     * <p><b>200</b> - Get summary of the project successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseEntity&lt;ProjectSummary&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectSummary> getProjectSummaryWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<ProjectSummary> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProjectSummaryRequestCreation(projectNameOrId, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Get summary of the project.
     * Get summary of the project.
     * <p><b>200</b> - Get summary of the project successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getProjectSummaryWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return getProjectSummaryRequestCreation(projectNameOrId, xRequestId, xIsResourceName);
    }

    /**
     * Get project level scanner
     * Get the scanner registration of the specified project. If no scanner registration is configured for the specified project, the system default scanner registration will be returned.
     * <p><b>200</b> - The details of the scanner registration.
     * <p><b>400</b> - Bad project ID
     * <p><b>401</b> - Unauthorized request
     * <p><b>403</b> - Request is not allowed
     * <p><b>404</b> - The requested object is not found
     * <p><b>500</b> - Internal server error happened
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ScannerRegistration
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getScannerOfProjectRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling getScannerOfProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xIsResourceName != null)
        headerParams.add("X-Is-Resource-Name", apiClient.parameterToString(xIsResourceName));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<ScannerRegistration> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/scanner", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get project level scanner
     * Get the scanner registration of the specified project. If no scanner registration is configured for the specified project, the system default scanner registration will be returned.
     * <p><b>200</b> - The details of the scanner registration.
     * <p><b>400</b> - Bad project ID
     * <p><b>401</b> - Unauthorized request
     * <p><b>403</b> - Request is not allowed
     * <p><b>404</b> - The requested object is not found
     * <p><b>500</b> - Internal server error happened
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ScannerRegistration
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ScannerRegistration getScannerOfProject(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<ScannerRegistration> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getScannerOfProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Get project level scanner
     * Get the scanner registration of the specified project. If no scanner registration is configured for the specified project, the system default scanner registration will be returned.
     * <p><b>200</b> - The details of the scanner registration.
     * <p><b>400</b> - Bad project ID
     * <p><b>401</b> - Unauthorized request
     * <p><b>403</b> - Request is not allowed
     * <p><b>404</b> - The requested object is not found
     * <p><b>500</b> - Internal server error happened
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseEntity&lt;ScannerRegistration&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ScannerRegistration> getScannerOfProjectWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<ScannerRegistration> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getScannerOfProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Get project level scanner
     * Get the scanner registration of the specified project. If no scanner registration is configured for the specified project, the system default scanner registration will be returned.
     * <p><b>200</b> - The details of the scanner registration.
     * <p><b>400</b> - Bad project ID
     * <p><b>401</b> - Unauthorized request
     * <p><b>403</b> - Request is not allowed
     * <p><b>404</b> - The requested object is not found
     * <p><b>500</b> - Internal server error happened
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getScannerOfProjectWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return getScannerOfProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName);
    }

    /**
     * Check if the project name user provided already exists.
     * This endpoint is used to check if the project name provided already exist.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName Project name for checking exists.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec headProjectRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling headProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "project_name", projectName));

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
        return apiClient.invokeAPI("/projects", HttpMethod.HEAD, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check if the project name user provided already exists.
     * This endpoint is used to check if the project name provided already exist.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName Project name for checking exists.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void headProject(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        headProjectRequestCreation(projectName, xRequestId).body(localVarReturnType);
    }

    /**
     * Check if the project name user provided already exists.
     * This endpoint is used to check if the project name provided already exist.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName Project name for checking exists.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> headProjectWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return headProjectRequestCreation(projectName, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Check if the project name user provided already exists.
     * This endpoint is used to check if the project name provided already exist.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName Project name for checking exists.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec headProjectWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return headProjectRequestCreation(projectName, xRequestId);
    }

    /**
     * List artifacts
     * List artifacts of the specified project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param xAcceptVulnerabilities A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39;
     * @param withTag Specify whether the tags are included inside the returning artifacts
     * @param withLabel Specify whether the labels are included inside the returning artifacts
     * @param withScanOverview Specify whether the scan overview is included inside the returning artifacts
     * @param withSbomOverview Specify whether the SBOM overview is included in returning artifacts, when this option is true, the SBOM overview will be included in the response
     * @param withImmutableStatus Specify whether the immutable status is included inside the tags of the returning artifacts. Only works when setting \&quot;with_immutable_status&#x3D;true\&quot;
     * @param withAccessory Specify whether the accessories are included of the returning artifacts. Only works when setting \&quot;with_accessory&#x3D;true\&quot;
     * @param latestInRepository Specify whether only the latest pushed artifact of each repository is included inside the returning artifacts. Only works when either artifact_type or media_type is included in the query.
     * @return List&lt;Artifact&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listArtifactsOfProjectRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String xAcceptVulnerabilities, @jakarta.annotation.Nullable Boolean withTag, @jakarta.annotation.Nullable Boolean withLabel, @jakarta.annotation.Nullable Boolean withScanOverview, @jakarta.annotation.Nullable Boolean withSbomOverview, @jakarta.annotation.Nullable Boolean withImmutableStatus, @jakarta.annotation.Nullable Boolean withAccessory, @jakarta.annotation.Nullable Boolean latestInRepository) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling listArtifactsOfProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_tag", withTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_label", withLabel));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_scan_overview", withScanOverview));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_sbom_overview", withSbomOverview));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_immutable_status", withImmutableStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_accessory", withAccessory));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "latest_in_repository", latestInRepository));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xIsResourceName != null)
        headerParams.add("X-Is-Resource-Name", apiClient.parameterToString(xIsResourceName));
        if (xAcceptVulnerabilities != null)
        headerParams.add("X-Accept-Vulnerabilities", apiClient.parameterToString(xAcceptVulnerabilities));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<Artifact>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/artifacts", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List artifacts
     * List artifacts of the specified project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param xAcceptVulnerabilities A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39;
     * @param withTag Specify whether the tags are included inside the returning artifacts
     * @param withLabel Specify whether the labels are included inside the returning artifacts
     * @param withScanOverview Specify whether the scan overview is included inside the returning artifacts
     * @param withSbomOverview Specify whether the SBOM overview is included in returning artifacts, when this option is true, the SBOM overview will be included in the response
     * @param withImmutableStatus Specify whether the immutable status is included inside the tags of the returning artifacts. Only works when setting \&quot;with_immutable_status&#x3D;true\&quot;
     * @param withAccessory Specify whether the accessories are included of the returning artifacts. Only works when setting \&quot;with_accessory&#x3D;true\&quot;
     * @param latestInRepository Specify whether only the latest pushed artifact of each repository is included inside the returning artifacts. Only works when either artifact_type or media_type is included in the query.
     * @return List&lt;Artifact&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Artifact> listArtifactsOfProject(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String xAcceptVulnerabilities, @jakarta.annotation.Nullable Boolean withTag, @jakarta.annotation.Nullable Boolean withLabel, @jakarta.annotation.Nullable Boolean withScanOverview, @jakarta.annotation.Nullable Boolean withSbomOverview, @jakarta.annotation.Nullable Boolean withImmutableStatus, @jakarta.annotation.Nullable Boolean withAccessory, @jakarta.annotation.Nullable Boolean latestInRepository) throws RestClientResponseException {
        ParameterizedTypeReference<List<Artifact>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listArtifactsOfProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName, q, sort, page, pageSize, xAcceptVulnerabilities, withTag, withLabel, withScanOverview, withSbomOverview, withImmutableStatus, withAccessory, latestInRepository).body(localVarReturnType);
    }

    /**
     * List artifacts
     * List artifacts of the specified project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param xAcceptVulnerabilities A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39;
     * @param withTag Specify whether the tags are included inside the returning artifacts
     * @param withLabel Specify whether the labels are included inside the returning artifacts
     * @param withScanOverview Specify whether the scan overview is included inside the returning artifacts
     * @param withSbomOverview Specify whether the SBOM overview is included in returning artifacts, when this option is true, the SBOM overview will be included in the response
     * @param withImmutableStatus Specify whether the immutable status is included inside the tags of the returning artifacts. Only works when setting \&quot;with_immutable_status&#x3D;true\&quot;
     * @param withAccessory Specify whether the accessories are included of the returning artifacts. Only works when setting \&quot;with_accessory&#x3D;true\&quot;
     * @param latestInRepository Specify whether only the latest pushed artifact of each repository is included inside the returning artifacts. Only works when either artifact_type or media_type is included in the query.
     * @return ResponseEntity&lt;List&lt;Artifact&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Artifact>> listArtifactsOfProjectWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String xAcceptVulnerabilities, @jakarta.annotation.Nullable Boolean withTag, @jakarta.annotation.Nullable Boolean withLabel, @jakarta.annotation.Nullable Boolean withScanOverview, @jakarta.annotation.Nullable Boolean withSbomOverview, @jakarta.annotation.Nullable Boolean withImmutableStatus, @jakarta.annotation.Nullable Boolean withAccessory, @jakarta.annotation.Nullable Boolean latestInRepository) throws RestClientResponseException {
        ParameterizedTypeReference<List<Artifact>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listArtifactsOfProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName, q, sort, page, pageSize, xAcceptVulnerabilities, withTag, withLabel, withScanOverview, withSbomOverview, withImmutableStatus, withAccessory, latestInRepository).toEntity(localVarReturnType);
    }

    /**
     * List artifacts
     * List artifacts of the specified project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param xAcceptVulnerabilities A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39;
     * @param withTag Specify whether the tags are included inside the returning artifacts
     * @param withLabel Specify whether the labels are included inside the returning artifacts
     * @param withScanOverview Specify whether the scan overview is included inside the returning artifacts
     * @param withSbomOverview Specify whether the SBOM overview is included in returning artifacts, when this option is true, the SBOM overview will be included in the response
     * @param withImmutableStatus Specify whether the immutable status is included inside the tags of the returning artifacts. Only works when setting \&quot;with_immutable_status&#x3D;true\&quot;
     * @param withAccessory Specify whether the accessories are included of the returning artifacts. Only works when setting \&quot;with_accessory&#x3D;true\&quot;
     * @param latestInRepository Specify whether only the latest pushed artifact of each repository is included inside the returning artifacts. Only works when either artifact_type or media_type is included in the query.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listArtifactsOfProjectWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String xAcceptVulnerabilities, @jakarta.annotation.Nullable Boolean withTag, @jakarta.annotation.Nullable Boolean withLabel, @jakarta.annotation.Nullable Boolean withScanOverview, @jakarta.annotation.Nullable Boolean withSbomOverview, @jakarta.annotation.Nullable Boolean withImmutableStatus, @jakarta.annotation.Nullable Boolean withAccessory, @jakarta.annotation.Nullable Boolean latestInRepository) throws RestClientResponseException {
        return listArtifactsOfProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName, q, sort, page, pageSize, xAcceptVulnerabilities, withTag, withLabel, withScanOverview, withSbomOverview, withImmutableStatus, withAccessory, latestInRepository);
    }

    /**
     * List projects
     * This endpoint returns projects created by Harbor.
     * <p><b>200</b> - Return all matched projects.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param page The page number
     * @param pageSize The size of per page
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param name The name of project.
     * @param _public The project is public or private.
     * @param owner The name of project owner.
     * @param withDetail Bool value indicating whether return detailed information of the project
     * @return List&lt;Project&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listProjectsRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable String name, @jakarta.annotation.Nullable Boolean _public, @jakarta.annotation.Nullable String owner, @jakarta.annotation.Nullable Boolean withDetail) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "public", _public));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "owner", owner));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_detail", withDetail));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<Project>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List projects
     * This endpoint returns projects created by Harbor.
     * <p><b>200</b> - Return all matched projects.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param page The page number
     * @param pageSize The size of per page
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param name The name of project.
     * @param _public The project is public or private.
     * @param owner The name of project owner.
     * @param withDetail Bool value indicating whether return detailed information of the project
     * @return List&lt;Project&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Project> listProjects(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable String name, @jakarta.annotation.Nullable Boolean _public, @jakarta.annotation.Nullable String owner, @jakarta.annotation.Nullable Boolean withDetail) throws RestClientResponseException {
        ParameterizedTypeReference<List<Project>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listProjectsRequestCreation(xRequestId, q, page, pageSize, sort, name, _public, owner, withDetail).body(localVarReturnType);
    }

    /**
     * List projects
     * This endpoint returns projects created by Harbor.
     * <p><b>200</b> - Return all matched projects.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param page The page number
     * @param pageSize The size of per page
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param name The name of project.
     * @param _public The project is public or private.
     * @param owner The name of project owner.
     * @param withDetail Bool value indicating whether return detailed information of the project
     * @return ResponseEntity&lt;List&lt;Project&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Project>> listProjectsWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable String name, @jakarta.annotation.Nullable Boolean _public, @jakarta.annotation.Nullable String owner, @jakarta.annotation.Nullable Boolean withDetail) throws RestClientResponseException {
        ParameterizedTypeReference<List<Project>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listProjectsRequestCreation(xRequestId, q, page, pageSize, sort, name, _public, owner, withDetail).toEntity(localVarReturnType);
    }

    /**
     * List projects
     * This endpoint returns projects created by Harbor.
     * <p><b>200</b> - Return all matched projects.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param page The page number
     * @param pageSize The size of per page
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param name The name of project.
     * @param _public The project is public or private.
     * @param owner The name of project owner.
     * @param withDetail Bool value indicating whether return detailed information of the project
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listProjectsWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable String name, @jakarta.annotation.Nullable Boolean _public, @jakarta.annotation.Nullable String owner, @jakarta.annotation.Nullable Boolean withDetail) throws RestClientResponseException {
        return listProjectsRequestCreation(xRequestId, q, page, pageSize, sort, name, _public, owner, withDetail);
    }

    /**
     * Get scanner registration candidates for configurating project level scanner
     * Retrieve the system configured scanner registrations as candidates of setting project level scanner.
     * <p><b>200</b> - A list of scanner registrations.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;ScannerRegistration&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listScannerCandidatesOfProjectRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling listScannerCandidatesOfProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);

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
        if (xIsResourceName != null)
        headerParams.add("X-Is-Resource-Name", apiClient.parameterToString(xIsResourceName));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<ScannerRegistration>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/scanner/candidates", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get scanner registration candidates for configurating project level scanner
     * Retrieve the system configured scanner registrations as candidates of setting project level scanner.
     * <p><b>200</b> - A list of scanner registrations.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;ScannerRegistration&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<ScannerRegistration> listScannerCandidatesOfProject(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<ScannerRegistration>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listScannerCandidatesOfProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName, q, sort, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get scanner registration candidates for configurating project level scanner
     * Retrieve the system configured scanner registrations as candidates of setting project level scanner.
     * <p><b>200</b> - A list of scanner registrations.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseEntity&lt;List&lt;ScannerRegistration&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ScannerRegistration>> listScannerCandidatesOfProjectWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<ScannerRegistration>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listScannerCandidatesOfProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName, q, sort, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get scanner registration candidates for configurating project level scanner
     * Retrieve the system configured scanner registrations as candidates of setting project level scanner.
     * <p><b>200</b> - A list of scanner registrations.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listScannerCandidatesOfProjectWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        return listScannerCandidatesOfProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName, q, sort, page, pageSize);
    }

    /**
     * Configure scanner for the specified project
     * Set one of the system configured scanner registration as the indepndent scanner of the specified project.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param payload The payload parameter
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec setScannerOfProjectRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull ProjectScanner payload, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = payload;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling setScannerOfProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'payload' is set
        if (payload == null) {
            throw new RestClientResponseException("Missing the required parameter 'payload' when calling setScannerOfProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xIsResourceName != null)
        headerParams.add("X-Is-Resource-Name", apiClient.parameterToString(xIsResourceName));
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
        return apiClient.invokeAPI("/projects/{project_name_or_id}/scanner", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Configure scanner for the specified project
     * Set one of the system configured scanner registration as the indepndent scanner of the specified project.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param payload The payload parameter
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void setScannerOfProject(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull ProjectScanner payload, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        setScannerOfProjectRequestCreation(projectNameOrId, payload, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Configure scanner for the specified project
     * Set one of the system configured scanner registration as the indepndent scanner of the specified project.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param payload The payload parameter
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> setScannerOfProjectWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull ProjectScanner payload, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return setScannerOfProjectRequestCreation(projectNameOrId, payload, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Configure scanner for the specified project
     * Set one of the system configured scanner registration as the indepndent scanner of the specified project.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param payload The payload parameter
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec setScannerOfProjectWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull ProjectScanner payload, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return setScannerOfProjectRequestCreation(projectNameOrId, payload, xRequestId, xIsResourceName);
    }

    /**
     * Update properties for a selected project.
     * This endpoint is aimed to update the properties of a project.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param project Updates of project.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateProjectRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull ProjectReq project, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = project;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling updateProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'project' is set
        if (project == null) {
            throw new RestClientResponseException("Missing the required parameter 'project' when calling updateProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xIsResourceName != null)
        headerParams.add("X-Is-Resource-Name", apiClient.parameterToString(xIsResourceName));
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
        return apiClient.invokeAPI("/projects/{project_name_or_id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update properties for a selected project.
     * This endpoint is aimed to update the properties of a project.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param project Updates of project.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateProject(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull ProjectReq project, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateProjectRequestCreation(projectNameOrId, project, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Update properties for a selected project.
     * This endpoint is aimed to update the properties of a project.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param project Updates of project.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateProjectWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull ProjectReq project, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateProjectRequestCreation(projectNameOrId, project, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Update properties for a selected project.
     * This endpoint is aimed to update the properties of a project.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param project Updates of project.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateProjectWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull ProjectReq project, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return updateProjectRequestCreation(projectNameOrId, project, xRequestId, xIsResourceName);
    }
}
