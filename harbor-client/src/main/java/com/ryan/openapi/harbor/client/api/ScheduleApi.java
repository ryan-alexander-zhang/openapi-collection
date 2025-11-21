package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.ScheduleTask;
import com.ryan.openapi.harbor.client.model.SchedulerStatus;

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
@Component("com.ryan.openapi.harbor.client.api.ScheduleApi")
public class ScheduleApi {
    private ApiClient apiClient;

    public ScheduleApi() {
        this(new ApiClient());
    }

    @Autowired
    public ScheduleApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Get scheduler paused status
     * <p><b>200</b> - Get scheduler status successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param jobType The type of the job. &#39;all&#39; stands for all job types, current only support query with all
     * @param xRequestId An unique ID for the request
     * @return SchedulerStatus
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSchedulePausedRequestCreation(@jakarta.annotation.Nonnull String jobType, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'jobType' is set
        if (jobType == null) {
            throw new RestClientResponseException("Missing the required parameter 'jobType' when calling getSchedulePaused", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("job_type", jobType);

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

        ParameterizedTypeReference<SchedulerStatus> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/schedules/{job_type}/paused", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Get scheduler paused status
     * <p><b>200</b> - Get scheduler status successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param jobType The type of the job. &#39;all&#39; stands for all job types, current only support query with all
     * @param xRequestId An unique ID for the request
     * @return SchedulerStatus
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public SchedulerStatus getSchedulePaused(@jakarta.annotation.Nonnull String jobType, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<SchedulerStatus> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSchedulePausedRequestCreation(jobType, xRequestId).body(localVarReturnType);
    }

    /**
     * 
     * Get scheduler paused status
     * <p><b>200</b> - Get scheduler status successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param jobType The type of the job. &#39;all&#39; stands for all job types, current only support query with all
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;SchedulerStatus&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SchedulerStatus> getSchedulePausedWithHttpInfo(@jakarta.annotation.Nonnull String jobType, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<SchedulerStatus> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSchedulePausedRequestCreation(jobType, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * 
     * Get scheduler paused status
     * <p><b>200</b> - Get scheduler status successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param jobType The type of the job. &#39;all&#39; stands for all job types, current only support query with all
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSchedulePausedWithResponseSpec(@jakarta.annotation.Nonnull String jobType, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getSchedulePausedRequestCreation(jobType, xRequestId);
    }

    /**
     * 
     * List schedules
     * <p><b>200</b> - list schedule successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;ScheduleTask&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listSchedulesRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

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

        ParameterizedTypeReference<List<ScheduleTask>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/schedules", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * List schedules
     * <p><b>200</b> - list schedule successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;ScheduleTask&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<ScheduleTask> listSchedules(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<ScheduleTask>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listSchedulesRequestCreation(xRequestId, page, pageSize).body(localVarReturnType);
    }

    /**
     * 
     * List schedules
     * <p><b>200</b> - list schedule successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseEntity&lt;List&lt;ScheduleTask&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ScheduleTask>> listSchedulesWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<ScheduleTask>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listSchedulesRequestCreation(xRequestId, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * 
     * List schedules
     * <p><b>200</b> - list schedule successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listSchedulesWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        return listSchedulesRequestCreation(xRequestId, page, pageSize);
    }
}
