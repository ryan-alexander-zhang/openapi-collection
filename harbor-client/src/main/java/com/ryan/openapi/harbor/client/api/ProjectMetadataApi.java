package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient.ResponseSpec;
import org.springframework.web.client.RestClientResponseException;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.17.0")
@Component("com.ryan.openapi.harbor.client.api.ProjectMetadataApi")
public class ProjectMetadataApi {
    private ApiClient apiClient;

    public ProjectMetadataApi() {
        this(new ApiClient());
    }

    @Autowired
    public ProjectMetadataApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add metadata for the specific project
     * Add metadata for the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param metadata The metadata parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addProjectMetadatasRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Map<String, String> metadata) throws RestClientResponseException {
        Object postBody = metadata;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling addProjectMetadatas", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/projects/{project_name_or_id}/metadatas/", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add metadata for the specific project
     * Add metadata for the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param metadata The metadata parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void addProjectMetadatas(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Map<String, String> metadata) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        addProjectMetadatasRequestCreation(projectNameOrId, xRequestId, xIsResourceName, metadata).body(localVarReturnType);
    }

    /**
     * Add metadata for the specific project
     * Add metadata for the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param metadata The metadata parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> addProjectMetadatasWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Map<String, String> metadata) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return addProjectMetadatasRequestCreation(projectNameOrId, xRequestId, xIsResourceName, metadata).toEntity(localVarReturnType);
    }

    /**
     * Add metadata for the specific project
     * Add metadata for the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param metadata The metadata parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec addProjectMetadatasWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Map<String, String> metadata) throws RestClientResponseException {
        return addProjectMetadatasRequestCreation(projectNameOrId, xRequestId, xIsResourceName, metadata);
    }

    /**
     * Delete the specific metadata for the specific project
     * Delete the specific metadata for the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param metaName The name of metadata.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteProjectMetadataRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull String metaName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling deleteProjectMetadata", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'metaName' is set
        if (metaName == null) {
            throw new RestClientResponseException("Missing the required parameter 'metaName' when calling deleteProjectMetadata", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);
        pathParams.put("meta_name", metaName);

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
        return apiClient.invokeAPI("/projects/{project_name_or_id}/metadatas/{meta_name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete the specific metadata for the specific project
     * Delete the specific metadata for the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param metaName The name of metadata.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteProjectMetadata(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull String metaName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteProjectMetadataRequestCreation(projectNameOrId, metaName, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Delete the specific metadata for the specific project
     * Delete the specific metadata for the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param metaName The name of metadata.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteProjectMetadataWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull String metaName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteProjectMetadataRequestCreation(projectNameOrId, metaName, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Delete the specific metadata for the specific project
     * Delete the specific metadata for the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param metaName The name of metadata.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteProjectMetadataWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull String metaName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return deleteProjectMetadataRequestCreation(projectNameOrId, metaName, xRequestId, xIsResourceName);
    }

    /**
     * Get the specific metadata of the specific project
     * Get the specific metadata of the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param metaName The name of metadata.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return Map&lt;String, String&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getProjectMetadataRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull String metaName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling getProjectMetadata", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'metaName' is set
        if (metaName == null) {
            throw new RestClientResponseException("Missing the required parameter 'metaName' when calling getProjectMetadata", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);
        pathParams.put("meta_name", metaName);

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

        ParameterizedTypeReference<Map<String, String>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/metadatas/{meta_name}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the specific metadata of the specific project
     * Get the specific metadata of the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param metaName The name of metadata.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return Map&lt;String, String&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Map<String, String> getProjectMetadata(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull String metaName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Map<String, String>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProjectMetadataRequestCreation(projectNameOrId, metaName, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Get the specific metadata of the specific project
     * Get the specific metadata of the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param metaName The name of metadata.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseEntity&lt;Map&lt;String, String&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Map<String, String>> getProjectMetadataWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull String metaName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Map<String, String>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProjectMetadataRequestCreation(projectNameOrId, metaName, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Get the specific metadata of the specific project
     * Get the specific metadata of the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param metaName The name of metadata.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getProjectMetadataWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull String metaName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return getProjectMetadataRequestCreation(projectNameOrId, metaName, xRequestId, xIsResourceName);
    }

    /**
     * Get the metadata of the specific project
     * Get the metadata of the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return Map&lt;String, String&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listProjectMetadatasRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling listProjectMetadatas", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Map<String, String>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/metadatas/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the metadata of the specific project
     * Get the metadata of the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return Map&lt;String, String&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Map<String, String> listProjectMetadatas(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Map<String, String>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listProjectMetadatasRequestCreation(projectNameOrId, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Get the metadata of the specific project
     * Get the metadata of the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseEntity&lt;Map&lt;String, String&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Map<String, String>> listProjectMetadatasWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Map<String, String>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listProjectMetadatasRequestCreation(projectNameOrId, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Get the metadata of the specific project
     * Get the metadata of the specific project
     * <p><b>200</b> - Success
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
    public ResponseSpec listProjectMetadatasWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return listProjectMetadatasRequestCreation(projectNameOrId, xRequestId, xIsResourceName);
    }

    /**
     * Update the specific metadata for the specific project
     * Update the specific metadata for the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param metaName The name of metadata.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param metadata The metadata parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateProjectMetadataRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull String metaName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Map<String, String> metadata) throws RestClientResponseException {
        Object postBody = metadata;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling updateProjectMetadata", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'metaName' is set
        if (metaName == null) {
            throw new RestClientResponseException("Missing the required parameter 'metaName' when calling updateProjectMetadata", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);
        pathParams.put("meta_name", metaName);

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
        return apiClient.invokeAPI("/projects/{project_name_or_id}/metadatas/{meta_name}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update the specific metadata for the specific project
     * Update the specific metadata for the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param metaName The name of metadata.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param metadata The metadata parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateProjectMetadata(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull String metaName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Map<String, String> metadata) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateProjectMetadataRequestCreation(projectNameOrId, metaName, xRequestId, xIsResourceName, metadata).body(localVarReturnType);
    }

    /**
     * Update the specific metadata for the specific project
     * Update the specific metadata for the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param metaName The name of metadata.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param metadata The metadata parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateProjectMetadataWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull String metaName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Map<String, String> metadata) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateProjectMetadataRequestCreation(projectNameOrId, metaName, xRequestId, xIsResourceName, metadata).toEntity(localVarReturnType);
    }

    /**
     * Update the specific metadata for the specific project
     * Update the specific metadata for the specific project
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param metaName The name of metadata.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param metadata The metadata parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateProjectMetadataWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull String metaName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Map<String, String> metadata) throws RestClientResponseException {
        return updateProjectMetadataRequestCreation(projectNameOrId, metaName, xRequestId, xIsResourceName, metadata);
    }
}
