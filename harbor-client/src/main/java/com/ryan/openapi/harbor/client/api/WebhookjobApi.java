package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.WebhookJob;

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
public class WebhookjobApi {
    private ApiClient apiClient;

    public WebhookjobApi() {
        this(new ApiClient());
    }

    public WebhookjobApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List project webhook jobs
     * This endpoint returns webhook jobs of a project. 
     * <p><b>200</b> - List project webhook jobs successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param policyId The policy ID.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param status The status of webhook job.
     * @return List&lt;WebhookJob&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    private ResponseSpec listWebhookJobsRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long policyId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable List<String> status) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling listWebhookJobs", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'policyId' is set
        if (policyId == null) {
            throw new RestClientResponseException("Missing the required parameter 'policyId' when calling listWebhookJobs", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "policy_id", policyId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "status", status));

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

        ParameterizedTypeReference<List<WebhookJob>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/webhook/jobs", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List project webhook jobs
     * This endpoint returns webhook jobs of a project. 
     * <p><b>200</b> - List project webhook jobs successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param policyId The policy ID.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param status The status of webhook job.
     * @return List&lt;WebhookJob&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<WebhookJob> listWebhookJobs(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long policyId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable List<String> status) throws RestClientResponseException {
        ParameterizedTypeReference<List<WebhookJob>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listWebhookJobsRequestCreation(projectNameOrId, policyId, xRequestId, xIsResourceName, q, sort, page, pageSize, status).body(localVarReturnType);
    }

    /**
     * List project webhook jobs
     * This endpoint returns webhook jobs of a project. 
     * <p><b>200</b> - List project webhook jobs successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param policyId The policy ID.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param status The status of webhook job.
     * @return ResponseEntity&lt;List&lt;WebhookJob&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<WebhookJob>> listWebhookJobsWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long policyId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable List<String> status) throws RestClientResponseException {
        ParameterizedTypeReference<List<WebhookJob>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listWebhookJobsRequestCreation(projectNameOrId, policyId, xRequestId, xIsResourceName, q, sort, page, pageSize, status).toEntity(localVarReturnType);
    }

    /**
     * List project webhook jobs
     * This endpoint returns webhook jobs of a project. 
     * <p><b>200</b> - List project webhook jobs successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param policyId The policy ID.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param status The status of webhook job.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listWebhookJobsWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long policyId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable List<String> status) throws RestClientResponseException {
        return listWebhookJobsRequestCreation(projectNameOrId, policyId, xRequestId, xIsResourceName, q, sort, page, pageSize, status);
    }
}
