package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.Execution;
import com.ryan.openapi.harbor.client.model.Instance;
import com.ryan.openapi.harbor.client.model.Metadata;
import com.ryan.openapi.harbor.client.model.PreheatPolicy;
import com.ryan.openapi.harbor.client.model.ProviderUnderProject;
import com.ryan.openapi.harbor.client.model.Task;

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
@Component("com.ryan.openapi.harbor.client.api.PreheatApi")
public class PreheatApi {
    private ApiClient apiClient;

    public PreheatApi() {
        this(new ApiClient());
    }

    @Autowired
    public PreheatApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create p2p provider instances
     * Create p2p provider instances
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param instance The JSON object of instance.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createInstanceRequestCreation(@jakarta.annotation.Nonnull Instance instance, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = instance;
        // verify the required parameter 'instance' is set
        if (instance == null) {
            throw new RestClientResponseException("Missing the required parameter 'instance' when calling createInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/p2p/preheat/instances", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create p2p provider instances
     * Create p2p provider instances
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param instance The JSON object of instance.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void createInstance(@jakarta.annotation.Nonnull Instance instance, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        createInstanceRequestCreation(instance, xRequestId).body(localVarReturnType);
    }

    /**
     * Create p2p provider instances
     * Create p2p provider instances
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param instance The JSON object of instance.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createInstanceWithHttpInfo(@jakarta.annotation.Nonnull Instance instance, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createInstanceRequestCreation(instance, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Create p2p provider instances
     * Create p2p provider instances
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param instance The JSON object of instance.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createInstanceWithResponseSpec(@jakarta.annotation.Nonnull Instance instance, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return createInstanceRequestCreation(instance, xRequestId);
    }

    /**
     * Create a preheat policy under a project
     * Create a preheat policy under a project
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param policy The policy schema info
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createPolicyRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull PreheatPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = policy;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling createPolicy", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'policy' is set
        if (policy == null) {
            throw new RestClientResponseException("Missing the required parameter 'policy' when calling createPolicy", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);

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
        return apiClient.invokeAPI("/projects/{project_name}/preheat/policies", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a preheat policy under a project
     * Create a preheat policy under a project
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param policy The policy schema info
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void createPolicy(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull PreheatPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        createPolicyRequestCreation(projectName, policy, xRequestId).body(localVarReturnType);
    }

    /**
     * Create a preheat policy under a project
     * Create a preheat policy under a project
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param policy The policy schema info
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createPolicyWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull PreheatPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createPolicyRequestCreation(projectName, policy, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Create a preheat policy under a project
     * Create a preheat policy under a project
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param policy The policy schema info
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createPolicyWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull PreheatPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return createPolicyRequestCreation(projectName, policy, xRequestId);
    }

    /**
     * Delete the specified P2P provider instance
     * Delete the specified P2P provider instance
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param preheatInstanceName Instance Name
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteInstanceRequestCreation(@jakarta.annotation.Nonnull String preheatInstanceName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'preheatInstanceName' is set
        if (preheatInstanceName == null) {
            throw new RestClientResponseException("Missing the required parameter 'preheatInstanceName' when calling deleteInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("preheat_instance_name", preheatInstanceName);

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
        return apiClient.invokeAPI("/p2p/preheat/instances/{preheat_instance_name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete the specified P2P provider instance
     * Delete the specified P2P provider instance
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param preheatInstanceName Instance Name
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteInstance(@jakarta.annotation.Nonnull String preheatInstanceName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteInstanceRequestCreation(preheatInstanceName, xRequestId).body(localVarReturnType);
    }

    /**
     * Delete the specified P2P provider instance
     * Delete the specified P2P provider instance
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param preheatInstanceName Instance Name
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteInstanceWithHttpInfo(@jakarta.annotation.Nonnull String preheatInstanceName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteInstanceRequestCreation(preheatInstanceName, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Delete the specified P2P provider instance
     * Delete the specified P2P provider instance
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param preheatInstanceName Instance Name
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteInstanceWithResponseSpec(@jakarta.annotation.Nonnull String preheatInstanceName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return deleteInstanceRequestCreation(preheatInstanceName, xRequestId);
    }

    /**
     * Delete a preheat policy
     * Delete a preheat policy
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deletePolicyRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling deletePolicy", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'preheatPolicyName' is set
        if (preheatPolicyName == null) {
            throw new RestClientResponseException("Missing the required parameter 'preheatPolicyName' when calling deletePolicy", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("preheat_policy_name", preheatPolicyName);

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
        return apiClient.invokeAPI("/projects/{project_name}/preheat/policies/{preheat_policy_name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a preheat policy
     * Delete a preheat policy
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deletePolicy(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deletePolicyRequestCreation(projectName, preheatPolicyName, xRequestId).body(localVarReturnType);
    }

    /**
     * Delete a preheat policy
     * Delete a preheat policy
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deletePolicyWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deletePolicyRequestCreation(projectName, preheatPolicyName, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Delete a preheat policy
     * Delete a preheat policy
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deletePolicyWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return deletePolicyRequestCreation(projectName, preheatPolicyName, xRequestId);
    }

    /**
     * Get a execution detail by id
     * Get a execution detail by id
     * <p><b>200</b> - Get execution success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @return Execution
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getExecutionRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling getExecution", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'preheatPolicyName' is set
        if (preheatPolicyName == null) {
            throw new RestClientResponseException("Missing the required parameter 'preheatPolicyName' when calling getExecution", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'executionId' is set
        if (executionId == null) {
            throw new RestClientResponseException("Missing the required parameter 'executionId' when calling getExecution", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("preheat_policy_name", preheatPolicyName);
        pathParams.put("execution_id", executionId);

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

        ParameterizedTypeReference<Execution> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/preheat/policies/{preheat_policy_name}/executions/{execution_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a execution detail by id
     * Get a execution detail by id
     * <p><b>200</b> - Get execution success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @return Execution
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Execution getExecution(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Execution> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getExecutionRequestCreation(projectName, preheatPolicyName, executionId, xRequestId).body(localVarReturnType);
    }

    /**
     * Get a execution detail by id
     * Get a execution detail by id
     * <p><b>200</b> - Get execution success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;Execution&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Execution> getExecutionWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Execution> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getExecutionRequestCreation(projectName, preheatPolicyName, executionId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get a execution detail by id
     * Get a execution detail by id
     * <p><b>200</b> - Get execution success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getExecutionWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getExecutionRequestCreation(projectName, preheatPolicyName, executionId, xRequestId);
    }

    /**
     * Get a P2P provider instance
     * Get a P2P provider instance
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param preheatInstanceName Instance Name
     * @param xRequestId An unique ID for the request
     * @return Instance
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getInstanceRequestCreation(@jakarta.annotation.Nonnull String preheatInstanceName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'preheatInstanceName' is set
        if (preheatInstanceName == null) {
            throw new RestClientResponseException("Missing the required parameter 'preheatInstanceName' when calling getInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("preheat_instance_name", preheatInstanceName);

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

        ParameterizedTypeReference<Instance> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/p2p/preheat/instances/{preheat_instance_name}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a P2P provider instance
     * Get a P2P provider instance
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param preheatInstanceName Instance Name
     * @param xRequestId An unique ID for the request
     * @return Instance
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Instance getInstance(@jakarta.annotation.Nonnull String preheatInstanceName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Instance> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getInstanceRequestCreation(preheatInstanceName, xRequestId).body(localVarReturnType);
    }

    /**
     * Get a P2P provider instance
     * Get a P2P provider instance
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param preheatInstanceName Instance Name
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;Instance&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Instance> getInstanceWithHttpInfo(@jakarta.annotation.Nonnull String preheatInstanceName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Instance> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getInstanceRequestCreation(preheatInstanceName, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get a P2P provider instance
     * Get a P2P provider instance
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param preheatInstanceName Instance Name
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getInstanceWithResponseSpec(@jakarta.annotation.Nonnull String preheatInstanceName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getInstanceRequestCreation(preheatInstanceName, xRequestId);
    }

    /**
     * Get a preheat policy
     * Get a preheat policy
     * <p><b>200</b> - Get a preheat policy success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param xRequestId An unique ID for the request
     * @return PreheatPolicy
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPolicyRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling getPolicy", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'preheatPolicyName' is set
        if (preheatPolicyName == null) {
            throw new RestClientResponseException("Missing the required parameter 'preheatPolicyName' when calling getPolicy", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("preheat_policy_name", preheatPolicyName);

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

        ParameterizedTypeReference<PreheatPolicy> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/preheat/policies/{preheat_policy_name}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a preheat policy
     * Get a preheat policy
     * <p><b>200</b> - Get a preheat policy success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param xRequestId An unique ID for the request
     * @return PreheatPolicy
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public PreheatPolicy getPolicy(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<PreheatPolicy> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getPolicyRequestCreation(projectName, preheatPolicyName, xRequestId).body(localVarReturnType);
    }

    /**
     * Get a preheat policy
     * Get a preheat policy
     * <p><b>200</b> - Get a preheat policy success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;PreheatPolicy&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PreheatPolicy> getPolicyWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<PreheatPolicy> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getPolicyRequestCreation(projectName, preheatPolicyName, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get a preheat policy
     * Get a preheat policy
     * <p><b>200</b> - Get a preheat policy success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPolicyWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getPolicyRequestCreation(projectName, preheatPolicyName, xRequestId);
    }

    /**
     * Get the log text stream of the specified task for the given execution
     * Get the log text stream of the specified task for the given execution
     * <p><b>200</b> - Get log success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param executionId Execution ID
     * @param taskId Task ID
     * @param xRequestId An unique ID for the request
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPreheatLogRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nonnull Integer taskId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling getPreheatLog", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'preheatPolicyName' is set
        if (preheatPolicyName == null) {
            throw new RestClientResponseException("Missing the required parameter 'preheatPolicyName' when calling getPreheatLog", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'executionId' is set
        if (executionId == null) {
            throw new RestClientResponseException("Missing the required parameter 'executionId' when calling getPreheatLog", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new RestClientResponseException("Missing the required parameter 'taskId' when calling getPreheatLog", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("preheat_policy_name", preheatPolicyName);
        pathParams.put("execution_id", executionId);
        pathParams.put("task_id", taskId);

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
        return apiClient.invokeAPI("/projects/{project_name}/preheat/policies/{preheat_policy_name}/executions/{execution_id}/tasks/{task_id}/logs", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the log text stream of the specified task for the given execution
     * Get the log text stream of the specified task for the given execution
     * <p><b>200</b> - Get log success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param executionId Execution ID
     * @param taskId Task ID
     * @param xRequestId An unique ID for the request
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public String getPreheatLog(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nonnull Integer taskId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getPreheatLogRequestCreation(projectName, preheatPolicyName, executionId, taskId, xRequestId).body(localVarReturnType);
    }

    /**
     * Get the log text stream of the specified task for the given execution
     * Get the log text stream of the specified task for the given execution
     * <p><b>200</b> - Get log success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param executionId Execution ID
     * @param taskId Task ID
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> getPreheatLogWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nonnull Integer taskId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getPreheatLogRequestCreation(projectName, preheatPolicyName, executionId, taskId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get the log text stream of the specified task for the given execution
     * Get the log text stream of the specified task for the given execution
     * <p><b>200</b> - Get log success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param executionId Execution ID
     * @param taskId Task ID
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPreheatLogWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nonnull Integer taskId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getPreheatLogRequestCreation(projectName, preheatPolicyName, executionId, taskId, xRequestId);
    }

    /**
     * List executions for the given policy
     * List executions for the given policy
     * <p><b>200</b> - List executions success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return List&lt;Execution&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listExecutionsRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling listExecutions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'preheatPolicyName' is set
        if (preheatPolicyName == null) {
            throw new RestClientResponseException("Missing the required parameter 'preheatPolicyName' when calling listExecutions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("preheat_policy_name", preheatPolicyName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<Execution>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/preheat/policies/{preheat_policy_name}/executions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List executions for the given policy
     * List executions for the given policy
     * <p><b>200</b> - List executions success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return List&lt;Execution&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Execution> listExecutions(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        ParameterizedTypeReference<List<Execution>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listExecutionsRequestCreation(projectName, preheatPolicyName, xRequestId, page, pageSize, q, sort).body(localVarReturnType);
    }

    /**
     * List executions for the given policy
     * List executions for the given policy
     * <p><b>200</b> - List executions success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return ResponseEntity&lt;List&lt;Execution&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Execution>> listExecutionsWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        ParameterizedTypeReference<List<Execution>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listExecutionsRequestCreation(projectName, preheatPolicyName, xRequestId, page, pageSize, q, sort).toEntity(localVarReturnType);
    }

    /**
     * List executions for the given policy
     * List executions for the given policy
     * <p><b>200</b> - List executions success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listExecutionsWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        return listExecutionsRequestCreation(projectName, preheatPolicyName, xRequestId, page, pageSize, q, sort);
    }

    /**
     * List P2P provider instances
     * List P2P provider instances
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return List&lt;Instance&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listInstancesRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<Instance>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/p2p/preheat/instances", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List P2P provider instances
     * List P2P provider instances
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return List&lt;Instance&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Instance> listInstances(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        ParameterizedTypeReference<List<Instance>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listInstancesRequestCreation(xRequestId, page, pageSize, q, sort).body(localVarReturnType);
    }

    /**
     * List P2P provider instances
     * List P2P provider instances
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return ResponseEntity&lt;List&lt;Instance&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Instance>> listInstancesWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        ParameterizedTypeReference<List<Instance>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listInstancesRequestCreation(xRequestId, page, pageSize, q, sort).toEntity(localVarReturnType);
    }

    /**
     * List P2P provider instances
     * List P2P provider instances
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listInstancesWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        return listInstancesRequestCreation(xRequestId, page, pageSize, q, sort);
    }

    /**
     * List preheat policies
     * List preheat policies
     * <p><b>200</b> - List preheat policies success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return List&lt;PreheatPolicy&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listPoliciesRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling listPolicies", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<PreheatPolicy>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/preheat/policies", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List preheat policies
     * List preheat policies
     * <p><b>200</b> - List preheat policies success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return List&lt;PreheatPolicy&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<PreheatPolicy> listPolicies(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        ParameterizedTypeReference<List<PreheatPolicy>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listPoliciesRequestCreation(projectName, xRequestId, page, pageSize, q, sort).body(localVarReturnType);
    }

    /**
     * List preheat policies
     * List preheat policies
     * <p><b>200</b> - List preheat policies success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return ResponseEntity&lt;List&lt;PreheatPolicy&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PreheatPolicy>> listPoliciesWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        ParameterizedTypeReference<List<PreheatPolicy>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listPoliciesRequestCreation(projectName, xRequestId, page, pageSize, q, sort).toEntity(localVarReturnType);
    }

    /**
     * List preheat policies
     * List preheat policies
     * <p><b>200</b> - List preheat policies success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listPoliciesWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        return listPoliciesRequestCreation(projectName, xRequestId, page, pageSize, q, sort);
    }

    /**
     * List P2P providers
     * List P2P providers
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return List&lt;Metadata&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listProvidersRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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

        ParameterizedTypeReference<List<Metadata>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/p2p/preheat/providers", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List P2P providers
     * List P2P providers
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return List&lt;Metadata&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Metadata> listProviders(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<List<Metadata>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listProvidersRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * List P2P providers
     * List P2P providers
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;List&lt;Metadata&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Metadata>> listProvidersWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<List<Metadata>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listProvidersRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * List P2P providers
     * List P2P providers
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listProvidersWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return listProvidersRequestCreation(xRequestId);
    }

    /**
     * Get all providers at project level
     * Get all providers at project level
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @return List&lt;ProviderUnderProject&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listProvidersUnderProjectRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling listProvidersUnderProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);

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

        ParameterizedTypeReference<List<ProviderUnderProject>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/preheat/providers", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all providers at project level
     * Get all providers at project level
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @return List&lt;ProviderUnderProject&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<ProviderUnderProject> listProvidersUnderProject(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<List<ProviderUnderProject>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listProvidersUnderProjectRequestCreation(projectName, xRequestId).body(localVarReturnType);
    }

    /**
     * Get all providers at project level
     * Get all providers at project level
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;List&lt;ProviderUnderProject&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ProviderUnderProject>> listProvidersUnderProjectWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<List<ProviderUnderProject>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listProvidersUnderProjectRequestCreation(projectName, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get all providers at project level
     * Get all providers at project level
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listProvidersUnderProjectWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return listProvidersUnderProjectRequestCreation(projectName, xRequestId);
    }

    /**
     * List all the related tasks for the given execution
     * List all the related tasks for the given execution
     * <p><b>200</b> - List tasks success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return List&lt;Task&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listTasksRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling listTasks", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'preheatPolicyName' is set
        if (preheatPolicyName == null) {
            throw new RestClientResponseException("Missing the required parameter 'preheatPolicyName' when calling listTasks", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'executionId' is set
        if (executionId == null) {
            throw new RestClientResponseException("Missing the required parameter 'executionId' when calling listTasks", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("preheat_policy_name", preheatPolicyName);
        pathParams.put("execution_id", executionId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<Task>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/preheat/policies/{preheat_policy_name}/executions/{execution_id}/tasks", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List all the related tasks for the given execution
     * List all the related tasks for the given execution
     * <p><b>200</b> - List tasks success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return List&lt;Task&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Task> listTasks(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        ParameterizedTypeReference<List<Task>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listTasksRequestCreation(projectName, preheatPolicyName, executionId, xRequestId, page, pageSize, q, sort).body(localVarReturnType);
    }

    /**
     * List all the related tasks for the given execution
     * List all the related tasks for the given execution
     * <p><b>200</b> - List tasks success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return ResponseEntity&lt;List&lt;Task&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Task>> listTasksWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        ParameterizedTypeReference<List<Task>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listTasksRequestCreation(projectName, preheatPolicyName, executionId, xRequestId, page, pageSize, q, sort).toEntity(localVarReturnType);
    }

    /**
     * List all the related tasks for the given execution
     * List all the related tasks for the given execution
     * <p><b>200</b> - List tasks success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listTasksWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        return listTasksRequestCreation(projectName, preheatPolicyName, executionId, xRequestId, page, pageSize, q, sort);
    }

    /**
     * Manual preheat
     * Manual preheat
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param policy The policy schema info
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec manualPreheatRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull PreheatPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = policy;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling manualPreheat", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'preheatPolicyName' is set
        if (preheatPolicyName == null) {
            throw new RestClientResponseException("Missing the required parameter 'preheatPolicyName' when calling manualPreheat", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'policy' is set
        if (policy == null) {
            throw new RestClientResponseException("Missing the required parameter 'policy' when calling manualPreheat", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("preheat_policy_name", preheatPolicyName);

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
        return apiClient.invokeAPI("/projects/{project_name}/preheat/policies/{preheat_policy_name}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Manual preheat
     * Manual preheat
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param policy The policy schema info
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void manualPreheat(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull PreheatPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        manualPreheatRequestCreation(projectName, preheatPolicyName, policy, xRequestId).body(localVarReturnType);
    }

    /**
     * Manual preheat
     * Manual preheat
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param policy The policy schema info
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> manualPreheatWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull PreheatPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return manualPreheatRequestCreation(projectName, preheatPolicyName, policy, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Manual preheat
     * Manual preheat
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param policy The policy schema info
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec manualPreheatWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull PreheatPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return manualPreheatRequestCreation(projectName, preheatPolicyName, policy, xRequestId);
    }

    /**
     * Ping status of a instance.
     * This endpoint checks status of a instance, the instance can be given by ID or Endpoint URL (together with credential) 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Instance not found (when instance is provided by ID).
     * <p><b>500</b> - Internal server error
     * @param instance The JSON object of instance.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec pingInstancesRequestCreation(@jakarta.annotation.Nonnull Instance instance, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = instance;
        // verify the required parameter 'instance' is set
        if (instance == null) {
            throw new RestClientResponseException("Missing the required parameter 'instance' when calling pingInstances", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/p2p/preheat/instances/ping", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Ping status of a instance.
     * This endpoint checks status of a instance, the instance can be given by ID or Endpoint URL (together with credential) 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Instance not found (when instance is provided by ID).
     * <p><b>500</b> - Internal server error
     * @param instance The JSON object of instance.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void pingInstances(@jakarta.annotation.Nonnull Instance instance, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        pingInstancesRequestCreation(instance, xRequestId).body(localVarReturnType);
    }

    /**
     * Ping status of a instance.
     * This endpoint checks status of a instance, the instance can be given by ID or Endpoint URL (together with credential) 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Instance not found (when instance is provided by ID).
     * <p><b>500</b> - Internal server error
     * @param instance The JSON object of instance.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> pingInstancesWithHttpInfo(@jakarta.annotation.Nonnull Instance instance, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return pingInstancesRequestCreation(instance, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Ping status of a instance.
     * This endpoint checks status of a instance, the instance can be given by ID or Endpoint URL (together with credential) 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Instance not found (when instance is provided by ID).
     * <p><b>500</b> - Internal server error
     * @param instance The JSON object of instance.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec pingInstancesWithResponseSpec(@jakarta.annotation.Nonnull Instance instance, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return pingInstancesRequestCreation(instance, xRequestId);
    }

    /**
     * Stop a execution
     * Stop a execution
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param executionId Execution ID
     * @param execution The data of execution
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec stopExecutionRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nonnull Execution execution, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = execution;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling stopExecution", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'preheatPolicyName' is set
        if (preheatPolicyName == null) {
            throw new RestClientResponseException("Missing the required parameter 'preheatPolicyName' when calling stopExecution", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'executionId' is set
        if (executionId == null) {
            throw new RestClientResponseException("Missing the required parameter 'executionId' when calling stopExecution", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'execution' is set
        if (execution == null) {
            throw new RestClientResponseException("Missing the required parameter 'execution' when calling stopExecution", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("preheat_policy_name", preheatPolicyName);
        pathParams.put("execution_id", executionId);

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
        return apiClient.invokeAPI("/projects/{project_name}/preheat/policies/{preheat_policy_name}/executions/{execution_id}", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Stop a execution
     * Stop a execution
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param executionId Execution ID
     * @param execution The data of execution
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void stopExecution(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nonnull Execution execution, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        stopExecutionRequestCreation(projectName, preheatPolicyName, executionId, execution, xRequestId).body(localVarReturnType);
    }

    /**
     * Stop a execution
     * Stop a execution
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param executionId Execution ID
     * @param execution The data of execution
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> stopExecutionWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nonnull Execution execution, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return stopExecutionRequestCreation(projectName, preheatPolicyName, executionId, execution, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Stop a execution
     * Stop a execution
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param executionId Execution ID
     * @param execution The data of execution
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec stopExecutionWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nonnull Execution execution, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return stopExecutionRequestCreation(projectName, preheatPolicyName, executionId, execution, xRequestId);
    }

    /**
     * Update the specified P2P provider instance
     * Update the specified P2P provider instance
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param preheatInstanceName Instance Name
     * @param instance The instance to update
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateInstanceRequestCreation(@jakarta.annotation.Nonnull String preheatInstanceName, @jakarta.annotation.Nonnull Instance instance, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = instance;
        // verify the required parameter 'preheatInstanceName' is set
        if (preheatInstanceName == null) {
            throw new RestClientResponseException("Missing the required parameter 'preheatInstanceName' when calling updateInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'instance' is set
        if (instance == null) {
            throw new RestClientResponseException("Missing the required parameter 'instance' when calling updateInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("preheat_instance_name", preheatInstanceName);

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
        return apiClient.invokeAPI("/p2p/preheat/instances/{preheat_instance_name}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update the specified P2P provider instance
     * Update the specified P2P provider instance
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param preheatInstanceName Instance Name
     * @param instance The instance to update
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateInstance(@jakarta.annotation.Nonnull String preheatInstanceName, @jakarta.annotation.Nonnull Instance instance, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateInstanceRequestCreation(preheatInstanceName, instance, xRequestId).body(localVarReturnType);
    }

    /**
     * Update the specified P2P provider instance
     * Update the specified P2P provider instance
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param preheatInstanceName Instance Name
     * @param instance The instance to update
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateInstanceWithHttpInfo(@jakarta.annotation.Nonnull String preheatInstanceName, @jakarta.annotation.Nonnull Instance instance, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateInstanceRequestCreation(preheatInstanceName, instance, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Update the specified P2P provider instance
     * Update the specified P2P provider instance
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param preheatInstanceName Instance Name
     * @param instance The instance to update
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateInstanceWithResponseSpec(@jakarta.annotation.Nonnull String preheatInstanceName, @jakarta.annotation.Nonnull Instance instance, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return updateInstanceRequestCreation(preheatInstanceName, instance, xRequestId);
    }

    /**
     * Update preheat policy
     * Update preheat policy
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param policy The policy schema info
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updatePolicyRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull PreheatPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = policy;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling updatePolicy", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'preheatPolicyName' is set
        if (preheatPolicyName == null) {
            throw new RestClientResponseException("Missing the required parameter 'preheatPolicyName' when calling updatePolicy", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'policy' is set
        if (policy == null) {
            throw new RestClientResponseException("Missing the required parameter 'policy' when calling updatePolicy", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("preheat_policy_name", preheatPolicyName);

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
        return apiClient.invokeAPI("/projects/{project_name}/preheat/policies/{preheat_policy_name}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update preheat policy
     * Update preheat policy
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param policy The policy schema info
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updatePolicy(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull PreheatPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updatePolicyRequestCreation(projectName, preheatPolicyName, policy, xRequestId).body(localVarReturnType);
    }

    /**
     * Update preheat policy
     * Update preheat policy
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param policy The policy schema info
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updatePolicyWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull PreheatPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updatePolicyRequestCreation(projectName, preheatPolicyName, policy, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Update preheat policy
     * Update preheat policy
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param preheatPolicyName Preheat Policy Name
     * @param policy The policy schema info
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updatePolicyWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String preheatPolicyName, @jakarta.annotation.Nonnull PreheatPolicy policy, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return updatePolicyRequestCreation(projectName, preheatPolicyName, policy, xRequestId);
    }
}
