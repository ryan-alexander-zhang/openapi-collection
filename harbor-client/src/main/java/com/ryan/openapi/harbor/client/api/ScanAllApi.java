package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.Schedule;
import com.ryan.openapi.harbor.client.model.Stats;

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
@Component("com.ryan.openapi.harbor.client.api.ScanAllApi")
public class ScanAllApi {
    private ApiClient apiClient;

    public ScanAllApi() {
        this(new ApiClient());
    }

    @Autowired
    public ScanAllApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a schedule or a manual trigger for the scan all job.
     * This endpoint is for creating a schedule or a manual trigger for the scan all job, which scans all of images in Harbor.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param schedule Create a schedule or a manual trigger for the scan all job.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createScanAllScheduleRequestCreation(@jakarta.annotation.Nonnull Schedule schedule, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = schedule;
        // verify the required parameter 'schedule' is set
        if (schedule == null) {
            throw new RestClientResponseException("Missing the required parameter 'schedule' when calling createScanAllSchedule", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/system/scanAll/schedule", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a schedule or a manual trigger for the scan all job.
     * This endpoint is for creating a schedule or a manual trigger for the scan all job, which scans all of images in Harbor.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param schedule Create a schedule or a manual trigger for the scan all job.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void createScanAllSchedule(@jakarta.annotation.Nonnull Schedule schedule, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        createScanAllScheduleRequestCreation(schedule, xRequestId).body(localVarReturnType);
    }

    /**
     * Create a schedule or a manual trigger for the scan all job.
     * This endpoint is for creating a schedule or a manual trigger for the scan all job, which scans all of images in Harbor.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param schedule Create a schedule or a manual trigger for the scan all job.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createScanAllScheduleWithHttpInfo(@jakarta.annotation.Nonnull Schedule schedule, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createScanAllScheduleRequestCreation(schedule, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Create a schedule or a manual trigger for the scan all job.
     * This endpoint is for creating a schedule or a manual trigger for the scan all job, which scans all of images in Harbor.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param schedule Create a schedule or a manual trigger for the scan all job.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createScanAllScheduleWithResponseSpec(@jakarta.annotation.Nonnull Schedule schedule, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return createScanAllScheduleRequestCreation(schedule, xRequestId);
    }

    /**
     * Get the metrics of the latest scan all process
     * Get the metrics of the latest scan all process
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return Stats
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getLatestScanAllMetricsRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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

        ParameterizedTypeReference<Stats> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/scans/all/metrics", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the metrics of the latest scan all process
     * Get the metrics of the latest scan all process
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return Stats
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Stats getLatestScanAllMetrics(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Stats> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getLatestScanAllMetricsRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Get the metrics of the latest scan all process
     * Get the metrics of the latest scan all process
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;Stats&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Stats> getLatestScanAllMetricsWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Stats> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getLatestScanAllMetricsRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get the metrics of the latest scan all process
     * Get the metrics of the latest scan all process
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getLatestScanAllMetricsWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getLatestScanAllMetricsRequestCreation(xRequestId);
    }

    /**
     * Get the metrics of the latest scheduled scan all process
     * Get the metrics of the latest scheduled scan all process
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return Stats
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    private ResponseSpec getLatestScheduledScanAllMetricsRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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

        ParameterizedTypeReference<Stats> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/scans/schedule/metrics", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the metrics of the latest scheduled scan all process
     * Get the metrics of the latest scheduled scan all process
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return Stats
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Stats getLatestScheduledScanAllMetrics(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Stats> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getLatestScheduledScanAllMetricsRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Get the metrics of the latest scheduled scan all process
     * Get the metrics of the latest scheduled scan all process
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;Stats&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Stats> getLatestScheduledScanAllMetricsWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Stats> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getLatestScheduledScanAllMetricsRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get the metrics of the latest scheduled scan all process
     * Get the metrics of the latest scheduled scan all process
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getLatestScheduledScanAllMetricsWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getLatestScheduledScanAllMetricsRequestCreation(xRequestId);
    }

    /**
     * Get scan all&#39;s schedule.
     * This endpoint is for getting a schedule for the scan all job, which scans all of images in Harbor.
     * <p><b>200</b> - Get a schedule for the scan all job, which scans all of images in Harbor.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return Schedule
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getScanAllScheduleRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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

        ParameterizedTypeReference<Schedule> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/system/scanAll/schedule", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get scan all&#39;s schedule.
     * This endpoint is for getting a schedule for the scan all job, which scans all of images in Harbor.
     * <p><b>200</b> - Get a schedule for the scan all job, which scans all of images in Harbor.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return Schedule
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Schedule getScanAllSchedule(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Schedule> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getScanAllScheduleRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Get scan all&#39;s schedule.
     * This endpoint is for getting a schedule for the scan all job, which scans all of images in Harbor.
     * <p><b>200</b> - Get a schedule for the scan all job, which scans all of images in Harbor.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;Schedule&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Schedule> getScanAllScheduleWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Schedule> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getScanAllScheduleRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get scan all&#39;s schedule.
     * This endpoint is for getting a schedule for the scan all job, which scans all of images in Harbor.
     * <p><b>200</b> - Get a schedule for the scan all job, which scans all of images in Harbor.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getScanAllScheduleWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getScanAllScheduleRequestCreation(xRequestId);
    }

    /**
     * Stop scanAll job execution
     * Stop scanAll job execution
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec stopScanAllRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/system/scanAll/stop", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Stop scanAll job execution
     * Stop scanAll job execution
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void stopScanAll(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        stopScanAllRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Stop scanAll job execution
     * Stop scanAll job execution
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> stopScanAllWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return stopScanAllRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Stop scanAll job execution
     * Stop scanAll job execution
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec stopScanAllWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return stopScanAllRequestCreation(xRequestId);
    }

    /**
     * Update scan all&#39;s schedule.
     * This endpoint is for updating the schedule of scan all job, which scans all of images in Harbor.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param schedule Updates the schedule of scan all job, which scans all of images in Harbor.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateScanAllScheduleRequestCreation(@jakarta.annotation.Nonnull Schedule schedule, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = schedule;
        // verify the required parameter 'schedule' is set
        if (schedule == null) {
            throw new RestClientResponseException("Missing the required parameter 'schedule' when calling updateScanAllSchedule", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/system/scanAll/schedule", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update scan all&#39;s schedule.
     * This endpoint is for updating the schedule of scan all job, which scans all of images in Harbor.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param schedule Updates the schedule of scan all job, which scans all of images in Harbor.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateScanAllSchedule(@jakarta.annotation.Nonnull Schedule schedule, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateScanAllScheduleRequestCreation(schedule, xRequestId).body(localVarReturnType);
    }

    /**
     * Update scan all&#39;s schedule.
     * This endpoint is for updating the schedule of scan all job, which scans all of images in Harbor.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param schedule Updates the schedule of scan all job, which scans all of images in Harbor.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateScanAllScheduleWithHttpInfo(@jakarta.annotation.Nonnull Schedule schedule, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateScanAllScheduleRequestCreation(schedule, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Update scan all&#39;s schedule.
     * This endpoint is for updating the schedule of scan all job, which scans all of images in Harbor.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>412</b> - Precondition failed
     * <p><b>500</b> - Internal server error
     * @param schedule Updates the schedule of scan all job, which scans all of images in Harbor.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateScanAllScheduleWithResponseSpec(@jakarta.annotation.Nonnull Schedule schedule, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return updateScanAllScheduleRequestCreation(schedule, xRequestId);
    }
}
