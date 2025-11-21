package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.ExecHistory;
import com.ryan.openapi.harbor.client.model.Schedule;

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
@Component("com.ryan.openapi.harbor.client.api.PurgeApi")
public class PurgeApi {
    private ApiClient apiClient;

    public PurgeApi() {
        this(new ApiClient());
    }

    @Autowired
    public PurgeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a purge job schedule.
     * This endpoint is for update purge job schedule. 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param schedule The purge job&#39;s schedule, it is a json object. | The sample format is | {\&quot;parameters\&quot;:{\&quot;audit_retention_hour\&quot;:168,\&quot;dry_run\&quot;:true,\&quot;include_event_types\&quot;:\&quot;create_artifact,delete_artifact,pull_artifact\&quot;},\&quot;schedule\&quot;:{\&quot;type\&quot;:\&quot;Hourly\&quot;,\&quot;cron\&quot;:\&quot;0 0 * * * *\&quot;}} | the include_operation should be a comma separated string, e.g. create,delete,pull, if it is empty, no operation will be purged. 
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createPurgeScheduleRequestCreation(@jakarta.annotation.Nonnull Schedule schedule, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = schedule;
        // verify the required parameter 'schedule' is set
        if (schedule == null) {
            throw new RestClientResponseException("Missing the required parameter 'schedule' when calling createPurgeSchedule", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/system/purgeaudit/schedule", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a purge job schedule.
     * This endpoint is for update purge job schedule. 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param schedule The purge job&#39;s schedule, it is a json object. | The sample format is | {\&quot;parameters\&quot;:{\&quot;audit_retention_hour\&quot;:168,\&quot;dry_run\&quot;:true,\&quot;include_event_types\&quot;:\&quot;create_artifact,delete_artifact,pull_artifact\&quot;},\&quot;schedule\&quot;:{\&quot;type\&quot;:\&quot;Hourly\&quot;,\&quot;cron\&quot;:\&quot;0 0 * * * *\&quot;}} | the include_operation should be a comma separated string, e.g. create,delete,pull, if it is empty, no operation will be purged. 
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void createPurgeSchedule(@jakarta.annotation.Nonnull Schedule schedule, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        createPurgeScheduleRequestCreation(schedule, xRequestId).body(localVarReturnType);
    }

    /**
     * Create a purge job schedule.
     * This endpoint is for update purge job schedule. 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param schedule The purge job&#39;s schedule, it is a json object. | The sample format is | {\&quot;parameters\&quot;:{\&quot;audit_retention_hour\&quot;:168,\&quot;dry_run\&quot;:true,\&quot;include_event_types\&quot;:\&quot;create_artifact,delete_artifact,pull_artifact\&quot;},\&quot;schedule\&quot;:{\&quot;type\&quot;:\&quot;Hourly\&quot;,\&quot;cron\&quot;:\&quot;0 0 * * * *\&quot;}} | the include_operation should be a comma separated string, e.g. create,delete,pull, if it is empty, no operation will be purged. 
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createPurgeScheduleWithHttpInfo(@jakarta.annotation.Nonnull Schedule schedule, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createPurgeScheduleRequestCreation(schedule, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Create a purge job schedule.
     * This endpoint is for update purge job schedule. 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param schedule The purge job&#39;s schedule, it is a json object. | The sample format is | {\&quot;parameters\&quot;:{\&quot;audit_retention_hour\&quot;:168,\&quot;dry_run\&quot;:true,\&quot;include_event_types\&quot;:\&quot;create_artifact,delete_artifact,pull_artifact\&quot;},\&quot;schedule\&quot;:{\&quot;type\&quot;:\&quot;Hourly\&quot;,\&quot;cron\&quot;:\&quot;0 0 * * * *\&quot;}} | the include_operation should be a comma separated string, e.g. create,delete,pull, if it is empty, no operation will be purged. 
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createPurgeScheduleWithResponseSpec(@jakarta.annotation.Nonnull Schedule schedule, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return createPurgeScheduleRequestCreation(schedule, xRequestId);
    }

    /**
     * Get purge job results.
     * get purge job execution history.
     * <p><b>200</b> - Get purge job results successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;ExecHistory&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPurgeHistoryRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
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

        ParameterizedTypeReference<List<ExecHistory>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/system/purgeaudit", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get purge job results.
     * get purge job execution history.
     * <p><b>200</b> - Get purge job results successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;ExecHistory&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<ExecHistory> getPurgeHistory(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<ExecHistory>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getPurgeHistoryRequestCreation(xRequestId, q, sort, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get purge job results.
     * get purge job execution history.
     * <p><b>200</b> - Get purge job results successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseEntity&lt;List&lt;ExecHistory&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ExecHistory>> getPurgeHistoryWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<ExecHistory>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getPurgeHistoryRequestCreation(xRequestId, q, sort, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get purge job results.
     * get purge job execution history.
     * <p><b>200</b> - Get purge job results successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPurgeHistoryWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        return getPurgeHistoryRequestCreation(xRequestId, q, sort, page, pageSize);
    }

    /**
     * Get purge job status.
     * This endpoint let user get purge job status filtered by specific ID.
     * <p><b>200</b> - Get purge job results successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param purgeId The ID of the purge log
     * @param xRequestId An unique ID for the request
     * @return ExecHistory
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPurgeJobRequestCreation(@jakarta.annotation.Nonnull Long purgeId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'purgeId' is set
        if (purgeId == null) {
            throw new RestClientResponseException("Missing the required parameter 'purgeId' when calling getPurgeJob", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("purge_id", purgeId);

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

        ParameterizedTypeReference<ExecHistory> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/system/purgeaudit/{purge_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get purge job status.
     * This endpoint let user get purge job status filtered by specific ID.
     * <p><b>200</b> - Get purge job results successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param purgeId The ID of the purge log
     * @param xRequestId An unique ID for the request
     * @return ExecHistory
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ExecHistory getPurgeJob(@jakarta.annotation.Nonnull Long purgeId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ExecHistory> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getPurgeJobRequestCreation(purgeId, xRequestId).body(localVarReturnType);
    }

    /**
     * Get purge job status.
     * This endpoint let user get purge job status filtered by specific ID.
     * <p><b>200</b> - Get purge job results successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param purgeId The ID of the purge log
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;ExecHistory&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExecHistory> getPurgeJobWithHttpInfo(@jakarta.annotation.Nonnull Long purgeId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ExecHistory> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getPurgeJobRequestCreation(purgeId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get purge job status.
     * This endpoint let user get purge job status filtered by specific ID.
     * <p><b>200</b> - Get purge job results successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param purgeId The ID of the purge log
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPurgeJobWithResponseSpec(@jakarta.annotation.Nonnull Long purgeId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getPurgeJobRequestCreation(purgeId, xRequestId);
    }

    /**
     * Get purge job log.
     * This endpoint let user get purge job logs filtered by specific ID.
     * <p><b>200</b> - Get successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param purgeId The ID of the purge log
     * @param xRequestId An unique ID for the request
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPurgeJobLogRequestCreation(@jakarta.annotation.Nonnull Long purgeId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'purgeId' is set
        if (purgeId == null) {
            throw new RestClientResponseException("Missing the required parameter 'purgeId' when calling getPurgeJobLog", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("purge_id", purgeId);

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
        return apiClient.invokeAPI("/system/purgeaudit/{purge_id}/log", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get purge job log.
     * This endpoint let user get purge job logs filtered by specific ID.
     * <p><b>200</b> - Get successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param purgeId The ID of the purge log
     * @param xRequestId An unique ID for the request
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public String getPurgeJobLog(@jakarta.annotation.Nonnull Long purgeId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getPurgeJobLogRequestCreation(purgeId, xRequestId).body(localVarReturnType);
    }

    /**
     * Get purge job log.
     * This endpoint let user get purge job logs filtered by specific ID.
     * <p><b>200</b> - Get successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param purgeId The ID of the purge log
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> getPurgeJobLogWithHttpInfo(@jakarta.annotation.Nonnull Long purgeId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getPurgeJobLogRequestCreation(purgeId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get purge job log.
     * This endpoint let user get purge job logs filtered by specific ID.
     * <p><b>200</b> - Get successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param purgeId The ID of the purge log
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPurgeJobLogWithResponseSpec(@jakarta.annotation.Nonnull Long purgeId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getPurgeJobLogRequestCreation(purgeId, xRequestId);
    }

    /**
     * Get purge&#39;s schedule.
     * This endpoint is for get schedule of purge job.
     * <p><b>200</b> - Get purge job&#39;s schedule.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ExecHistory
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPurgeScheduleRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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

        ParameterizedTypeReference<ExecHistory> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/system/purgeaudit/schedule", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get purge&#39;s schedule.
     * This endpoint is for get schedule of purge job.
     * <p><b>200</b> - Get purge job&#39;s schedule.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ExecHistory
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ExecHistory getPurgeSchedule(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ExecHistory> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getPurgeScheduleRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Get purge&#39;s schedule.
     * This endpoint is for get schedule of purge job.
     * <p><b>200</b> - Get purge job&#39;s schedule.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;ExecHistory&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExecHistory> getPurgeScheduleWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ExecHistory> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getPurgeScheduleRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get purge&#39;s schedule.
     * This endpoint is for get schedule of purge job.
     * <p><b>200</b> - Get purge job&#39;s schedule.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPurgeScheduleWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getPurgeScheduleRequestCreation(xRequestId);
    }

    /**
     * Stop the specific purge audit log execution
     * Stop the purge audit log execution specified by ID
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param purgeId The ID of the purge log
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec stopPurgeRequestCreation(@jakarta.annotation.Nonnull Long purgeId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'purgeId' is set
        if (purgeId == null) {
            throw new RestClientResponseException("Missing the required parameter 'purgeId' when calling stopPurge", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("purge_id", purgeId);

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
        return apiClient.invokeAPI("/system/purgeaudit/{purge_id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Stop the specific purge audit log execution
     * Stop the purge audit log execution specified by ID
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param purgeId The ID of the purge log
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void stopPurge(@jakarta.annotation.Nonnull Long purgeId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        stopPurgeRequestCreation(purgeId, xRequestId).body(localVarReturnType);
    }

    /**
     * Stop the specific purge audit log execution
     * Stop the purge audit log execution specified by ID
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param purgeId The ID of the purge log
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> stopPurgeWithHttpInfo(@jakarta.annotation.Nonnull Long purgeId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return stopPurgeRequestCreation(purgeId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Stop the specific purge audit log execution
     * Stop the purge audit log execution specified by ID
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param purgeId The ID of the purge log
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec stopPurgeWithResponseSpec(@jakarta.annotation.Nonnull Long purgeId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return stopPurgeRequestCreation(purgeId, xRequestId);
    }

    /**
     * Update purge job&#39;s schedule.
     * This endpoint is for update purge job schedule. 
     * <p><b>200</b> - Updated purge&#39;s schedule successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param schedule The purge job&#39;s schedule, it is a json object. | The sample format is | {\&quot;parameters\&quot;:{\&quot;audit_retention_hour\&quot;:168,\&quot;dry_run\&quot;:true,\&quot;include_event_types\&quot;:\&quot;create_artifact,delete_artifact,pull_artifact\&quot;},\&quot;schedule\&quot;:{\&quot;type\&quot;:\&quot;Hourly\&quot;,\&quot;cron\&quot;:\&quot;0 0 * * * *\&quot;}} | the include_operation should be a comma separated string, e.g. create,delete,pull, if it is empty, no operation will be purged. 
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updatePurgeScheduleRequestCreation(@jakarta.annotation.Nonnull Schedule schedule, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = schedule;
        // verify the required parameter 'schedule' is set
        if (schedule == null) {
            throw new RestClientResponseException("Missing the required parameter 'schedule' when calling updatePurgeSchedule", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/system/purgeaudit/schedule", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update purge job&#39;s schedule.
     * This endpoint is for update purge job schedule. 
     * <p><b>200</b> - Updated purge&#39;s schedule successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param schedule The purge job&#39;s schedule, it is a json object. | The sample format is | {\&quot;parameters\&quot;:{\&quot;audit_retention_hour\&quot;:168,\&quot;dry_run\&quot;:true,\&quot;include_event_types\&quot;:\&quot;create_artifact,delete_artifact,pull_artifact\&quot;},\&quot;schedule\&quot;:{\&quot;type\&quot;:\&quot;Hourly\&quot;,\&quot;cron\&quot;:\&quot;0 0 * * * *\&quot;}} | the include_operation should be a comma separated string, e.g. create,delete,pull, if it is empty, no operation will be purged. 
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updatePurgeSchedule(@jakarta.annotation.Nonnull Schedule schedule, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updatePurgeScheduleRequestCreation(schedule, xRequestId).body(localVarReturnType);
    }

    /**
     * Update purge job&#39;s schedule.
     * This endpoint is for update purge job schedule. 
     * <p><b>200</b> - Updated purge&#39;s schedule successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param schedule The purge job&#39;s schedule, it is a json object. | The sample format is | {\&quot;parameters\&quot;:{\&quot;audit_retention_hour\&quot;:168,\&quot;dry_run\&quot;:true,\&quot;include_event_types\&quot;:\&quot;create_artifact,delete_artifact,pull_artifact\&quot;},\&quot;schedule\&quot;:{\&quot;type\&quot;:\&quot;Hourly\&quot;,\&quot;cron\&quot;:\&quot;0 0 * * * *\&quot;}} | the include_operation should be a comma separated string, e.g. create,delete,pull, if it is empty, no operation will be purged. 
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updatePurgeScheduleWithHttpInfo(@jakarta.annotation.Nonnull Schedule schedule, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updatePurgeScheduleRequestCreation(schedule, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Update purge job&#39;s schedule.
     * This endpoint is for update purge job schedule. 
     * <p><b>200</b> - Updated purge&#39;s schedule successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param schedule The purge job&#39;s schedule, it is a json object. | The sample format is | {\&quot;parameters\&quot;:{\&quot;audit_retention_hour\&quot;:168,\&quot;dry_run\&quot;:true,\&quot;include_event_types\&quot;:\&quot;create_artifact,delete_artifact,pull_artifact\&quot;},\&quot;schedule\&quot;:{\&quot;type\&quot;:\&quot;Hourly\&quot;,\&quot;cron\&quot;:\&quot;0 0 * * * *\&quot;}} | the include_operation should be a comma separated string, e.g. create,delete,pull, if it is empty, no operation will be purged. 
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updatePurgeScheduleWithResponseSpec(@jakarta.annotation.Nonnull Schedule schedule, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return updatePurgeScheduleRequestCreation(schedule, xRequestId);
    }
}
