package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.OperateRetentionExecutionRequest;
import com.ryan.openapi.harbor.client.model.RetentionExecution;
import com.ryan.openapi.harbor.client.model.RetentionExecutionTask;
import com.ryan.openapi.harbor.client.model.RetentionMetadata;
import com.ryan.openapi.harbor.client.model.RetentionPolicy;
import com.ryan.openapi.harbor.client.model.TriggerRetentionExecutionRequest;

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
public class RetentionApi {
    private ApiClient apiClient;

    public RetentionApi() {
        this(new ApiClient());
    }

    public RetentionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create Retention Policy
     * Create Retention Policy, you can reference metadatas API for the policy model. You can check project metadatas to find whether a retention policy is already binded. This method should only be called when no retention policy binded to project yet.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param policy Create Retention Policy successfully.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createRetentionRequestCreation(@jakarta.annotation.Nonnull RetentionPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = policy;
        // verify the required parameter 'policy' is set
        if (policy == null) {
            throw new RestClientResponseException("Missing the required parameter 'policy' when calling createRetention", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

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
        return apiClient.invokeAPI("/retentions", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Retention Policy
     * Create Retention Policy, you can reference metadatas API for the policy model. You can check project metadatas to find whether a retention policy is already binded. This method should only be called when no retention policy binded to project yet.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param policy Create Retention Policy successfully.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void createRetention(@jakarta.annotation.Nonnull RetentionPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        createRetentionRequestCreation(policy, xRequestId).body(localVarReturnType);
    }

    /**
     * Create Retention Policy
     * Create Retention Policy, you can reference metadatas API for the policy model. You can check project metadatas to find whether a retention policy is already binded. This method should only be called when no retention policy binded to project yet.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param policy Create Retention Policy successfully.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createRetentionWithHttpInfo(@jakarta.annotation.Nonnull RetentionPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createRetentionRequestCreation(policy, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Create Retention Policy
     * Create Retention Policy, you can reference metadatas API for the policy model. You can check project metadatas to find whether a retention policy is already binded. This method should only be called when no retention policy binded to project yet.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param policy Create Retention Policy successfully.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createRetentionWithResponseSpec(@jakarta.annotation.Nonnull RetentionPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return createRetentionRequestCreation(policy, xRequestId);
    }

    /**
     * Delete Retention Policy
     * Delete Retention Policy, you can reference metadatas API for the policy model. You can check project metadatas to find whether a retention policy is already binded. This method should only be called when retention policy has already binded to project.
     * <p><b>200</b> - Update Retention Policy successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteRetentionRequestCreation(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling deleteRetention", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("id", id);

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
        return apiClient.invokeAPI("/retentions/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete Retention Policy
     * Delete Retention Policy, you can reference metadatas API for the policy model. You can check project metadatas to find whether a retention policy is already binded. This method should only be called when retention policy has already binded to project.
     * <p><b>200</b> - Update Retention Policy successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteRetention(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteRetentionRequestCreation(id, xRequestId).body(localVarReturnType);
    }

    /**
     * Delete Retention Policy
     * Delete Retention Policy, you can reference metadatas API for the policy model. You can check project metadatas to find whether a retention policy is already binded. This method should only be called when retention policy has already binded to project.
     * <p><b>200</b> - Update Retention Policy successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteRetentionWithHttpInfo(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteRetentionRequestCreation(id, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Delete Retention Policy
     * Delete Retention Policy, you can reference metadatas API for the policy model. You can check project metadatas to find whether a retention policy is already binded. This method should only be called when retention policy has already binded to project.
     * <p><b>200</b> - Update Retention Policy successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteRetentionWithResponseSpec(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return deleteRetentionRequestCreation(id, xRequestId);
    }

    /**
     * Get Retention Metadatas
     * Get Retention Metadatas.
     * <p><b>200</b> - Get Retention Metadatas successfully.
     * @param xRequestId An unique ID for the request
     * @return RetentionMetadata
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRentenitionMetadataRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

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

        ParameterizedTypeReference<RetentionMetadata> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/retentions/metadatas", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Retention Metadatas
     * Get Retention Metadatas.
     * <p><b>200</b> - Get Retention Metadatas successfully.
     * @param xRequestId An unique ID for the request
     * @return RetentionMetadata
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public RetentionMetadata getRentenitionMetadata(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<RetentionMetadata> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRentenitionMetadataRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Get Retention Metadatas
     * Get Retention Metadatas.
     * <p><b>200</b> - Get Retention Metadatas successfully.
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;RetentionMetadata&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RetentionMetadata> getRentenitionMetadataWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<RetentionMetadata> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRentenitionMetadataRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get Retention Metadatas
     * Get Retention Metadatas.
     * <p><b>200</b> - Get Retention Metadatas successfully.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRentenitionMetadataWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getRentenitionMetadataRequestCreation(xRequestId);
    }

    /**
     * Get Retention Policy
     * Get Retention Policy.
     * <p><b>200</b> - Get Retention Policy successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param xRequestId An unique ID for the request
     * @return RetentionPolicy
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRetentionRequestCreation(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling getRetention", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("id", id);

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

        ParameterizedTypeReference<RetentionPolicy> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/retentions/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Retention Policy
     * Get Retention Policy.
     * <p><b>200</b> - Get Retention Policy successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param xRequestId An unique ID for the request
     * @return RetentionPolicy
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public RetentionPolicy getRetention(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<RetentionPolicy> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRetentionRequestCreation(id, xRequestId).body(localVarReturnType);
    }

    /**
     * Get Retention Policy
     * Get Retention Policy.
     * <p><b>200</b> - Get Retention Policy successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;RetentionPolicy&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RetentionPolicy> getRetentionWithHttpInfo(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<RetentionPolicy> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRetentionRequestCreation(id, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get Retention Policy
     * Get Retention Policy.
     * <p><b>200</b> - Get Retention Policy successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRetentionWithResponseSpec(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getRetentionRequestCreation(id, xRequestId);
    }

    /**
     * Get Retention job task log
     * Get Retention job task log, tags ratain or deletion detail will be shown in a table.
     * <p><b>200</b> - Get Retention job task log successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param eid Retention execution ID.
     * @param tid Retention execution ID.
     * @param xRequestId An unique ID for the request
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRetentionTaskLogRequestCreation(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull Long eid, @jakarta.annotation.Nonnull Long tid, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling getRetentionTaskLog", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'eid' is set
        if (eid == null) {
            throw new RestClientResponseException("Missing the required parameter 'eid' when calling getRetentionTaskLog", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'tid' is set
        if (tid == null) {
            throw new RestClientResponseException("Missing the required parameter 'tid' when calling getRetentionTaskLog", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("id", id);
        pathParams.put("eid", eid);
        pathParams.put("tid", tid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "text/plain"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/retentions/{id}/executions/{eid}/tasks/{tid}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Retention job task log
     * Get Retention job task log, tags ratain or deletion detail will be shown in a table.
     * <p><b>200</b> - Get Retention job task log successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param eid Retention execution ID.
     * @param tid Retention execution ID.
     * @param xRequestId An unique ID for the request
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public String getRetentionTaskLog(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull Long eid, @jakarta.annotation.Nonnull Long tid, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRetentionTaskLogRequestCreation(id, eid, tid, xRequestId).body(localVarReturnType);
    }

    /**
     * Get Retention job task log
     * Get Retention job task log, tags ratain or deletion detail will be shown in a table.
     * <p><b>200</b> - Get Retention job task log successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param eid Retention execution ID.
     * @param tid Retention execution ID.
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> getRetentionTaskLogWithHttpInfo(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull Long eid, @jakarta.annotation.Nonnull Long tid, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRetentionTaskLogRequestCreation(id, eid, tid, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get Retention job task log
     * Get Retention job task log, tags ratain or deletion detail will be shown in a table.
     * <p><b>200</b> - Get Retention job task log successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param eid Retention execution ID.
     * @param tid Retention execution ID.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRetentionTaskLogWithResponseSpec(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull Long eid, @jakarta.annotation.Nonnull Long tid, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getRetentionTaskLogRequestCreation(id, eid, tid, xRequestId);
    }

    /**
     * Get Retention executions
     * Get Retention executions, execution status may be delayed before job service schedule it up.
     * <p><b>200</b> - Get a Retention execution successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param xRequestId An unique ID for the request
     * @param page The page number.
     * @param pageSize The size of per page.
     * @return List&lt;RetentionExecution&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listRetentionExecutionsRequestCreation(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling listRetentionExecutions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

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

        ParameterizedTypeReference<List<RetentionExecution>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/retentions/{id}/executions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Retention executions
     * Get Retention executions, execution status may be delayed before job service schedule it up.
     * <p><b>200</b> - Get a Retention execution successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param xRequestId An unique ID for the request
     * @param page The page number.
     * @param pageSize The size of per page.
     * @return List&lt;RetentionExecution&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<RetentionExecution> listRetentionExecutions(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<RetentionExecution>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listRetentionExecutionsRequestCreation(id, xRequestId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get Retention executions
     * Get Retention executions, execution status may be delayed before job service schedule it up.
     * <p><b>200</b> - Get a Retention execution successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param xRequestId An unique ID for the request
     * @param page The page number.
     * @param pageSize The size of per page.
     * @return ResponseEntity&lt;List&lt;RetentionExecution&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<RetentionExecution>> listRetentionExecutionsWithHttpInfo(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<RetentionExecution>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listRetentionExecutionsRequestCreation(id, xRequestId, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get Retention executions
     * Get Retention executions, execution status may be delayed before job service schedule it up.
     * <p><b>200</b> - Get a Retention execution successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param xRequestId An unique ID for the request
     * @param page The page number.
     * @param pageSize The size of per page.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listRetentionExecutionsWithResponseSpec(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        return listRetentionExecutionsRequestCreation(id, xRequestId, page, pageSize);
    }

    /**
     * Get Retention tasks
     * Get Retention tasks, each repository as a task.
     * <p><b>200</b> - Get Retention job tasks successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param eid Retention execution ID.
     * @param xRequestId An unique ID for the request
     * @param page The page number.
     * @param pageSize The size of per page.
     * @return List&lt;RetentionExecutionTask&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listRetentionTasksRequestCreation(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull Long eid, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling listRetentionTasks", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'eid' is set
        if (eid == null) {
            throw new RestClientResponseException("Missing the required parameter 'eid' when calling listRetentionTasks", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("id", id);
        pathParams.put("eid", eid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

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

        ParameterizedTypeReference<List<RetentionExecutionTask>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/retentions/{id}/executions/{eid}/tasks", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Retention tasks
     * Get Retention tasks, each repository as a task.
     * <p><b>200</b> - Get Retention job tasks successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param eid Retention execution ID.
     * @param xRequestId An unique ID for the request
     * @param page The page number.
     * @param pageSize The size of per page.
     * @return List&lt;RetentionExecutionTask&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<RetentionExecutionTask> listRetentionTasks(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull Long eid, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<RetentionExecutionTask>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listRetentionTasksRequestCreation(id, eid, xRequestId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get Retention tasks
     * Get Retention tasks, each repository as a task.
     * <p><b>200</b> - Get Retention job tasks successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param eid Retention execution ID.
     * @param xRequestId An unique ID for the request
     * @param page The page number.
     * @param pageSize The size of per page.
     * @return ResponseEntity&lt;List&lt;RetentionExecutionTask&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<RetentionExecutionTask>> listRetentionTasksWithHttpInfo(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull Long eid, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<RetentionExecutionTask>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listRetentionTasksRequestCreation(id, eid, xRequestId, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get Retention tasks
     * Get Retention tasks, each repository as a task.
     * <p><b>200</b> - Get Retention job tasks successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param eid Retention execution ID.
     * @param xRequestId An unique ID for the request
     * @param page The page number.
     * @param pageSize The size of per page.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listRetentionTasksWithResponseSpec(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull Long eid, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        return listRetentionTasksRequestCreation(id, eid, xRequestId, page, pageSize);
    }

    /**
     * Stop a Retention execution
     * Stop a Retention execution, only support \&quot;stop\&quot; action now.
     * <p><b>200</b> - Stop a Retention job successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param eid Retention execution ID.
     * @param body The action, only support \&quot;stop\&quot; now.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec operateRetentionExecutionRequestCreation(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull Long eid, @jakarta.annotation.Nonnull OperateRetentionExecutionRequest body, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling operateRetentionExecution", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'eid' is set
        if (eid == null) {
            throw new RestClientResponseException("Missing the required parameter 'eid' when calling operateRetentionExecution", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling operateRetentionExecution", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("id", id);
        pathParams.put("eid", eid);

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
        return apiClient.invokeAPI("/retentions/{id}/executions/{eid}", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Stop a Retention execution
     * Stop a Retention execution, only support \&quot;stop\&quot; action now.
     * <p><b>200</b> - Stop a Retention job successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param eid Retention execution ID.
     * @param body The action, only support \&quot;stop\&quot; now.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void operateRetentionExecution(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull Long eid, @jakarta.annotation.Nonnull OperateRetentionExecutionRequest body, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        operateRetentionExecutionRequestCreation(id, eid, body, xRequestId).body(localVarReturnType);
    }

    /**
     * Stop a Retention execution
     * Stop a Retention execution, only support \&quot;stop\&quot; action now.
     * <p><b>200</b> - Stop a Retention job successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param eid Retention execution ID.
     * @param body The action, only support \&quot;stop\&quot; now.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> operateRetentionExecutionWithHttpInfo(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull Long eid, @jakarta.annotation.Nonnull OperateRetentionExecutionRequest body, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return operateRetentionExecutionRequestCreation(id, eid, body, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Stop a Retention execution
     * Stop a Retention execution, only support \&quot;stop\&quot; action now.
     * <p><b>200</b> - Stop a Retention job successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param eid Retention execution ID.
     * @param body The action, only support \&quot;stop\&quot; now.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec operateRetentionExecutionWithResponseSpec(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull Long eid, @jakarta.annotation.Nonnull OperateRetentionExecutionRequest body, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return operateRetentionExecutionRequestCreation(id, eid, body, xRequestId);
    }

    /**
     * Trigger a Retention Execution
     * Trigger a Retention Execution, if dry_run is True, nothing would be deleted actually.
     * <p><b>200</b> - Trigger a Retention job successfully.
     * <p><b>201</b> - Created
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param body The body parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec triggerRetentionExecutionRequestCreation(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TriggerRetentionExecutionRequest body, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling triggerRetentionExecution", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling triggerRetentionExecution", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "text/plain"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/retentions/{id}/executions", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Trigger a Retention Execution
     * Trigger a Retention Execution, if dry_run is True, nothing would be deleted actually.
     * <p><b>200</b> - Trigger a Retention job successfully.
     * <p><b>201</b> - Created
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param body The body parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void triggerRetentionExecution(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TriggerRetentionExecutionRequest body, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        triggerRetentionExecutionRequestCreation(id, body, xRequestId).body(localVarReturnType);
    }

    /**
     * Trigger a Retention Execution
     * Trigger a Retention Execution, if dry_run is True, nothing would be deleted actually.
     * <p><b>200</b> - Trigger a Retention job successfully.
     * <p><b>201</b> - Created
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param body The body parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> triggerRetentionExecutionWithHttpInfo(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TriggerRetentionExecutionRequest body, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return triggerRetentionExecutionRequestCreation(id, body, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Trigger a Retention Execution
     * Trigger a Retention Execution, if dry_run is True, nothing would be deleted actually.
     * <p><b>200</b> - Trigger a Retention job successfully.
     * <p><b>201</b> - Created
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param body The body parameter
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec triggerRetentionExecutionWithResponseSpec(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TriggerRetentionExecutionRequest body, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return triggerRetentionExecutionRequestCreation(id, body, xRequestId);
    }

    /**
     * Update Retention Policy
     * Update Retention Policy, you can reference metadatas API for the policy model. You can check project metadatas to find whether a retention policy is already binded. This method should only be called when retention policy has already binded to project.
     * <p><b>200</b> - Update Retention Policy successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param policy The policy parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateRetentionRequestCreation(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull RetentionPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = policy;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling updateRetention", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'policy' is set
        if (policy == null) {
            throw new RestClientResponseException("Missing the required parameter 'policy' when calling updateRetention", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("id", id);

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
        return apiClient.invokeAPI("/retentions/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Retention Policy
     * Update Retention Policy, you can reference metadatas API for the policy model. You can check project metadatas to find whether a retention policy is already binded. This method should only be called when retention policy has already binded to project.
     * <p><b>200</b> - Update Retention Policy successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param policy The policy parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateRetention(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull RetentionPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateRetentionRequestCreation(id, policy, xRequestId).body(localVarReturnType);
    }

    /**
     * Update Retention Policy
     * Update Retention Policy, you can reference metadatas API for the policy model. You can check project metadatas to find whether a retention policy is already binded. This method should only be called when retention policy has already binded to project.
     * <p><b>200</b> - Update Retention Policy successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param policy The policy parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateRetentionWithHttpInfo(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull RetentionPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateRetentionRequestCreation(id, policy, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Update Retention Policy
     * Update Retention Policy, you can reference metadatas API for the policy model. You can check project metadatas to find whether a retention policy is already binded. This method should only be called when retention policy has already binded to project.
     * <p><b>200</b> - Update Retention Policy successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param id Retention ID.
     * @param policy The policy parameter
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateRetentionWithResponseSpec(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull RetentionPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return updateRetentionRequestCreation(id, policy, xRequestId);
    }
}
