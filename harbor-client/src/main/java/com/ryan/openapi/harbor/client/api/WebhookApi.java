package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.Execution;
import com.ryan.openapi.harbor.client.model.SupportedWebhookEventTypes;
import com.ryan.openapi.harbor.client.model.Task;
import com.ryan.openapi.harbor.client.model.WebhookLastTrigger;
import com.ryan.openapi.harbor.client.model.WebhookPolicy;

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
public class WebhookApi {
    private ApiClient apiClient;

    public WebhookApi() {
        this(new ApiClient());
    }

    public WebhookApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create project webhook policy.
     * This endpoint create a webhook policy if the project does not have one. 
     * <p><b>201</b> - Project webhook policy create successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param policy Properties \&quot;targets\&quot; and \&quot;event_types\&quot; needed.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createWebhookPolicyOfProjectRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull WebhookPolicy policy, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = policy;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling createWebhookPolicyOfProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'policy' is set
        if (policy == null) {
            throw new RestClientResponseException("Missing the required parameter 'policy' when calling createWebhookPolicyOfProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/projects/{project_name_or_id}/webhook/policies", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create project webhook policy.
     * This endpoint create a webhook policy if the project does not have one. 
     * <p><b>201</b> - Project webhook policy create successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param policy Properties \&quot;targets\&quot; and \&quot;event_types\&quot; needed.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void createWebhookPolicyOfProject(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull WebhookPolicy policy, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        createWebhookPolicyOfProjectRequestCreation(projectNameOrId, policy, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Create project webhook policy.
     * This endpoint create a webhook policy if the project does not have one. 
     * <p><b>201</b> - Project webhook policy create successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param policy Properties \&quot;targets\&quot; and \&quot;event_types\&quot; needed.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createWebhookPolicyOfProjectWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull WebhookPolicy policy, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createWebhookPolicyOfProjectRequestCreation(projectNameOrId, policy, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Create project webhook policy.
     * This endpoint create a webhook policy if the project does not have one. 
     * <p><b>201</b> - Project webhook policy create successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param policy Properties \&quot;targets\&quot; and \&quot;event_types\&quot; needed.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createWebhookPolicyOfProjectWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull WebhookPolicy policy, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return createWebhookPolicyOfProjectRequestCreation(projectNameOrId, policy, xRequestId, xIsResourceName);
    }

    /**
     * Delete webhook policy of a project
     * This endpoint is aimed to delete webhookpolicy of a project. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteWebhookPolicyOfProjectRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling deleteWebhookPolicyOfProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'webhookPolicyId' is set
        if (webhookPolicyId == null) {
            throw new RestClientResponseException("Missing the required parameter 'webhookPolicyId' when calling deleteWebhookPolicyOfProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);
        pathParams.put("webhook_policy_id", webhookPolicyId);

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
        return apiClient.invokeAPI("/projects/{project_name_or_id}/webhook/policies/{webhook_policy_id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete webhook policy of a project
     * This endpoint is aimed to delete webhookpolicy of a project. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteWebhookPolicyOfProject(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteWebhookPolicyOfProjectRequestCreation(projectNameOrId, webhookPolicyId, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Delete webhook policy of a project
     * This endpoint is aimed to delete webhookpolicy of a project. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteWebhookPolicyOfProjectWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteWebhookPolicyOfProjectRequestCreation(projectNameOrId, webhookPolicyId, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Delete webhook policy of a project
     * This endpoint is aimed to delete webhookpolicy of a project. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteWebhookPolicyOfProjectWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return deleteWebhookPolicyOfProjectRequestCreation(projectNameOrId, webhookPolicyId, xRequestId, xIsResourceName);
    }

    /**
     * Get logs for a specific webhook task
     * This endpoint returns the logs of a specific webhook task. 
     * <p><b>200</b> - Get log success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param executionId Execution ID
     * @param taskId Task ID
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getLogsOfWebhookTaskRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nonnull Integer taskId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling getLogsOfWebhookTask", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'webhookPolicyId' is set
        if (webhookPolicyId == null) {
            throw new RestClientResponseException("Missing the required parameter 'webhookPolicyId' when calling getLogsOfWebhookTask", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'executionId' is set
        if (executionId == null) {
            throw new RestClientResponseException("Missing the required parameter 'executionId' when calling getLogsOfWebhookTask", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new RestClientResponseException("Missing the required parameter 'taskId' when calling getLogsOfWebhookTask", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);
        pathParams.put("webhook_policy_id", webhookPolicyId);
        pathParams.put("execution_id", executionId);
        pathParams.put("task_id", taskId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xIsResourceName != null)
        headerParams.add("X-Is-Resource-Name", apiClient.parameterToString(xIsResourceName));
        final String[] localVarAccepts = { 
            "text/plain"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/webhook/policies/{webhook_policy_id}/executions/{execution_id}/tasks/{task_id}/log", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get logs for a specific webhook task
     * This endpoint returns the logs of a specific webhook task. 
     * <p><b>200</b> - Get log success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param executionId Execution ID
     * @param taskId Task ID
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public String getLogsOfWebhookTask(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nonnull Integer taskId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getLogsOfWebhookTaskRequestCreation(projectNameOrId, webhookPolicyId, executionId, taskId, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Get logs for a specific webhook task
     * This endpoint returns the logs of a specific webhook task. 
     * <p><b>200</b> - Get log success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param executionId Execution ID
     * @param taskId Task ID
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> getLogsOfWebhookTaskWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nonnull Integer taskId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getLogsOfWebhookTaskRequestCreation(projectNameOrId, webhookPolicyId, executionId, taskId, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Get logs for a specific webhook task
     * This endpoint returns the logs of a specific webhook task. 
     * <p><b>200</b> - Get log success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param executionId Execution ID
     * @param taskId Task ID
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getLogsOfWebhookTaskWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nonnull Integer taskId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return getLogsOfWebhookTaskRequestCreation(projectNameOrId, webhookPolicyId, executionId, taskId, xRequestId, xIsResourceName);
    }

    /**
     * Get supported event types and notify types.
     * Get supported event types and notify types.
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return SupportedWebhookEventTypes
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSupportedEventTypesRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling getSupportedEventTypes", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SupportedWebhookEventTypes> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/webhook/events", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get supported event types and notify types.
     * Get supported event types and notify types.
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return SupportedWebhookEventTypes
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public SupportedWebhookEventTypes getSupportedEventTypes(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<SupportedWebhookEventTypes> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSupportedEventTypesRequestCreation(projectNameOrId, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Get supported event types and notify types.
     * Get supported event types and notify types.
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseEntity&lt;SupportedWebhookEventTypes&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SupportedWebhookEventTypes> getSupportedEventTypesWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<SupportedWebhookEventTypes> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSupportedEventTypesRequestCreation(projectNameOrId, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Get supported event types and notify types.
     * Get supported event types and notify types.
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSupportedEventTypesWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return getSupportedEventTypesRequestCreation(projectNameOrId, xRequestId, xIsResourceName);
    }

    /**
     * Get project webhook policy
     * This endpoint returns specified webhook policy of a project. 
     * <p><b>200</b> - Get webhook policy successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return WebhookPolicy
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getWebhookPolicyOfProjectRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling getWebhookPolicyOfProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'webhookPolicyId' is set
        if (webhookPolicyId == null) {
            throw new RestClientResponseException("Missing the required parameter 'webhookPolicyId' when calling getWebhookPolicyOfProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);
        pathParams.put("webhook_policy_id", webhookPolicyId);

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

        ParameterizedTypeReference<WebhookPolicy> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/webhook/policies/{webhook_policy_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get project webhook policy
     * This endpoint returns specified webhook policy of a project. 
     * <p><b>200</b> - Get webhook policy successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return WebhookPolicy
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public WebhookPolicy getWebhookPolicyOfProject(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<WebhookPolicy> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getWebhookPolicyOfProjectRequestCreation(projectNameOrId, webhookPolicyId, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Get project webhook policy
     * This endpoint returns specified webhook policy of a project. 
     * <p><b>200</b> - Get webhook policy successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseEntity&lt;WebhookPolicy&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<WebhookPolicy> getWebhookPolicyOfProjectWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<WebhookPolicy> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getWebhookPolicyOfProjectRequestCreation(projectNameOrId, webhookPolicyId, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Get project webhook policy
     * This endpoint returns specified webhook policy of a project. 
     * <p><b>200</b> - Get webhook policy successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getWebhookPolicyOfProjectWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return getWebhookPolicyOfProjectRequestCreation(projectNameOrId, webhookPolicyId, xRequestId, xIsResourceName);
    }

    /**
     * Get project webhook policy last trigger info
     * This endpoint returns last trigger information of project webhook policy. 
     * <p><b>200</b> - Test webhook connection successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return List&lt;WebhookLastTrigger&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    private ResponseSpec lastTriggerRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling lastTrigger", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<List<WebhookLastTrigger>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/webhook/lasttrigger", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get project webhook policy last trigger info
     * This endpoint returns last trigger information of project webhook policy. 
     * <p><b>200</b> - Test webhook connection successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return List&lt;WebhookLastTrigger&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<WebhookLastTrigger> lastTrigger(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<List<WebhookLastTrigger>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return lastTriggerRequestCreation(projectNameOrId, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Get project webhook policy last trigger info
     * This endpoint returns last trigger information of project webhook policy. 
     * <p><b>200</b> - Test webhook connection successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseEntity&lt;List&lt;WebhookLastTrigger&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<WebhookLastTrigger>> lastTriggerWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<List<WebhookLastTrigger>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return lastTriggerRequestCreation(projectNameOrId, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Get project webhook policy last trigger info
     * This endpoint returns last trigger information of project webhook policy. 
     * <p><b>200</b> - Test webhook connection successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec lastTriggerWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return lastTriggerRequestCreation(projectNameOrId, xRequestId, xIsResourceName);
    }

    /**
     * List executions for a specific webhook policy
     * This endpoint returns the executions of a specific webhook policy. 
     * <p><b>200</b> - List webhook executions success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return List&lt;Execution&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listExecutionsOfWebhookPolicyRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling listExecutionsOfWebhookPolicy", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'webhookPolicyId' is set
        if (webhookPolicyId == null) {
            throw new RestClientResponseException("Missing the required parameter 'webhookPolicyId' when calling listExecutionsOfWebhookPolicy", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);
        pathParams.put("webhook_policy_id", webhookPolicyId);

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
        if (xIsResourceName != null)
        headerParams.add("X-Is-Resource-Name", apiClient.parameterToString(xIsResourceName));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<Execution>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/webhook/policies/{webhook_policy_id}/executions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List executions for a specific webhook policy
     * This endpoint returns the executions of a specific webhook policy. 
     * <p><b>200</b> - List webhook executions success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return List&lt;Execution&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Execution> listExecutionsOfWebhookPolicy(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        ParameterizedTypeReference<List<Execution>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listExecutionsOfWebhookPolicyRequestCreation(projectNameOrId, webhookPolicyId, xRequestId, xIsResourceName, page, pageSize, q, sort).body(localVarReturnType);
    }

    /**
     * List executions for a specific webhook policy
     * This endpoint returns the executions of a specific webhook policy. 
     * <p><b>200</b> - List webhook executions success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return ResponseEntity&lt;List&lt;Execution&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Execution>> listExecutionsOfWebhookPolicyWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        ParameterizedTypeReference<List<Execution>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listExecutionsOfWebhookPolicyRequestCreation(projectNameOrId, webhookPolicyId, xRequestId, xIsResourceName, page, pageSize, q, sort).toEntity(localVarReturnType);
    }

    /**
     * List executions for a specific webhook policy
     * This endpoint returns the executions of a specific webhook policy. 
     * <p><b>200</b> - List webhook executions success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listExecutionsOfWebhookPolicyWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        return listExecutionsOfWebhookPolicyRequestCreation(projectNameOrId, webhookPolicyId, xRequestId, xIsResourceName, page, pageSize, q, sort);
    }

    /**
     * List tasks for a specific webhook execution
     * This endpoint returns the tasks of a specific webhook execution. 
     * <p><b>200</b> - List tasks of webhook executions success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return List&lt;Task&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listTasksOfWebhookExecutionRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling listTasksOfWebhookExecution", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'webhookPolicyId' is set
        if (webhookPolicyId == null) {
            throw new RestClientResponseException("Missing the required parameter 'webhookPolicyId' when calling listTasksOfWebhookExecution", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'executionId' is set
        if (executionId == null) {
            throw new RestClientResponseException("Missing the required parameter 'executionId' when calling listTasksOfWebhookExecution", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);
        pathParams.put("webhook_policy_id", webhookPolicyId);
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
        if (xIsResourceName != null)
        headerParams.add("X-Is-Resource-Name", apiClient.parameterToString(xIsResourceName));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<Task>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/webhook/policies/{webhook_policy_id}/executions/{execution_id}/tasks", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List tasks for a specific webhook execution
     * This endpoint returns the tasks of a specific webhook execution. 
     * <p><b>200</b> - List tasks of webhook executions success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return List&lt;Task&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Task> listTasksOfWebhookExecution(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        ParameterizedTypeReference<List<Task>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listTasksOfWebhookExecutionRequestCreation(projectNameOrId, webhookPolicyId, executionId, xRequestId, xIsResourceName, page, pageSize, q, sort).body(localVarReturnType);
    }

    /**
     * List tasks for a specific webhook execution
     * This endpoint returns the tasks of a specific webhook execution. 
     * <p><b>200</b> - List tasks of webhook executions success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return ResponseEntity&lt;List&lt;Task&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Task>> listTasksOfWebhookExecutionWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        ParameterizedTypeReference<List<Task>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listTasksOfWebhookExecutionRequestCreation(projectNameOrId, webhookPolicyId, executionId, xRequestId, xIsResourceName, page, pageSize, q, sort).toEntity(localVarReturnType);
    }

    /**
     * List tasks for a specific webhook execution
     * This endpoint returns the tasks of a specific webhook execution. 
     * <p><b>200</b> - List tasks of webhook executions success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param page The page number
     * @param pageSize The size of per page
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listTasksOfWebhookExecutionWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        return listTasksOfWebhookExecutionRequestCreation(projectNameOrId, webhookPolicyId, executionId, xRequestId, xIsResourceName, page, pageSize, q, sort);
    }

    /**
     * List project webhook policies.
     * This endpoint returns webhook policies of a project. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;WebhookPolicy&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listWebhookPoliciesOfProjectRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling listWebhookPoliciesOfProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
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

        ParameterizedTypeReference<List<WebhookPolicy>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/webhook/policies", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List project webhook policies.
     * This endpoint returns webhook policies of a project. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;WebhookPolicy&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<WebhookPolicy> listWebhookPoliciesOfProject(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<WebhookPolicy>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listWebhookPoliciesOfProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName, sort, q, page, pageSize).body(localVarReturnType);
    }

    /**
     * List project webhook policies.
     * This endpoint returns webhook policies of a project. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseEntity&lt;List&lt;WebhookPolicy&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<WebhookPolicy>> listWebhookPoliciesOfProjectWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<WebhookPolicy>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listWebhookPoliciesOfProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName, sort, q, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * List project webhook policies.
     * This endpoint returns webhook policies of a project. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listWebhookPoliciesOfProjectWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        return listWebhookPoliciesOfProjectRequestCreation(projectNameOrId, xRequestId, xIsResourceName, sort, q, page, pageSize);
    }

    /**
     * Update webhook policy of a project.
     * This endpoint is aimed to update the webhook policy of a project. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param policy All properties needed except \&quot;id\&quot;, \&quot;project_id\&quot;, \&quot;creation_time\&quot;, \&quot;update_time\&quot;.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateWebhookPolicyOfProjectRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nonnull WebhookPolicy policy, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = policy;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling updateWebhookPolicyOfProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'webhookPolicyId' is set
        if (webhookPolicyId == null) {
            throw new RestClientResponseException("Missing the required parameter 'webhookPolicyId' when calling updateWebhookPolicyOfProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'policy' is set
        if (policy == null) {
            throw new RestClientResponseException("Missing the required parameter 'policy' when calling updateWebhookPolicyOfProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);
        pathParams.put("webhook_policy_id", webhookPolicyId);

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
        return apiClient.invokeAPI("/projects/{project_name_or_id}/webhook/policies/{webhook_policy_id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update webhook policy of a project.
     * This endpoint is aimed to update the webhook policy of a project. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param policy All properties needed except \&quot;id\&quot;, \&quot;project_id\&quot;, \&quot;creation_time\&quot;, \&quot;update_time\&quot;.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateWebhookPolicyOfProject(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nonnull WebhookPolicy policy, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateWebhookPolicyOfProjectRequestCreation(projectNameOrId, webhookPolicyId, policy, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Update webhook policy of a project.
     * This endpoint is aimed to update the webhook policy of a project. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param policy All properties needed except \&quot;id\&quot;, \&quot;project_id\&quot;, \&quot;creation_time\&quot;, \&quot;update_time\&quot;.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateWebhookPolicyOfProjectWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nonnull WebhookPolicy policy, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateWebhookPolicyOfProjectRequestCreation(projectNameOrId, webhookPolicyId, policy, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Update webhook policy of a project.
     * This endpoint is aimed to update the webhook policy of a project. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param webhookPolicyId The ID of the webhook policy
     * @param policy All properties needed except \&quot;id\&quot;, \&quot;project_id\&quot;, \&quot;creation_time\&quot;, \&quot;update_time\&quot;.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateWebhookPolicyOfProjectWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long webhookPolicyId, @jakarta.annotation.Nonnull WebhookPolicy policy, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return updateWebhookPolicyOfProjectRequestCreation(projectNameOrId, webhookPolicyId, policy, xRequestId, xIsResourceName);
    }
}
