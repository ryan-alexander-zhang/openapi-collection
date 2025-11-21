package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.ActionRequest;
import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.JobQueue;
import com.ryan.openapi.harbor.client.model.Worker;
import com.ryan.openapi.harbor.client.model.WorkerPool;

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
@Component("com.ryan.openapi.harbor.client.api.JobserviceApi")
public class JobserviceApi {
    private ApiClient apiClient;

    public JobserviceApi() {
        this(new ApiClient());
    }

    @Autowired
    public JobserviceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get job log by job id
     * Get job log by job id, it is only used by administrator
     * <p><b>200</b> - Get job log successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param jobId The id of the job.
     * @param xRequestId An unique ID for the request
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec actionGetJobLogRequestCreation(@jakarta.annotation.Nonnull String jobId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new RestClientResponseException("Missing the required parameter 'jobId' when calling actionGetJobLog", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("job_id", jobId);

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
        return apiClient.invokeAPI("/jobservice/jobs/{job_id}/log", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get job log by job id
     * Get job log by job id, it is only used by administrator
     * <p><b>200</b> - Get job log successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param jobId The id of the job.
     * @param xRequestId An unique ID for the request
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public String actionGetJobLog(@jakarta.annotation.Nonnull String jobId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return actionGetJobLogRequestCreation(jobId, xRequestId).body(localVarReturnType);
    }

    /**
     * Get job log by job id
     * Get job log by job id, it is only used by administrator
     * <p><b>200</b> - Get job log successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param jobId The id of the job.
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> actionGetJobLogWithHttpInfo(@jakarta.annotation.Nonnull String jobId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return actionGetJobLogRequestCreation(jobId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get job log by job id
     * Get job log by job id, it is only used by administrator
     * <p><b>200</b> - Get job log successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param jobId The id of the job.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec actionGetJobLogWithResponseSpec(@jakarta.annotation.Nonnull String jobId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return actionGetJobLogRequestCreation(jobId, xRequestId);
    }

    /**
     * stop and clean, pause, resume pending jobs in the queue
     * stop and clean, pause, resume pending jobs in the queue
     * <p><b>200</b> - take action to the jobs in the queue successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>422</b> - Unsupported Type
     * <p><b>500</b> - Internal server error
     * @param jobType The type of the job. &#39;all&#39; stands for all job types
     * @param actionRequest The actionRequest parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec actionPendingJobsRequestCreation(@jakarta.annotation.Nonnull String jobType, @jakarta.annotation.Nonnull ActionRequest actionRequest, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = actionRequest;
        // verify the required parameter 'jobType' is set
        if (jobType == null) {
            throw new RestClientResponseException("Missing the required parameter 'jobType' when calling actionPendingJobs", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'actionRequest' is set
        if (actionRequest == null) {
            throw new RestClientResponseException("Missing the required parameter 'actionRequest' when calling actionPendingJobs", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/jobservice/queues/{job_type}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * stop and clean, pause, resume pending jobs in the queue
     * stop and clean, pause, resume pending jobs in the queue
     * <p><b>200</b> - take action to the jobs in the queue successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>422</b> - Unsupported Type
     * <p><b>500</b> - Internal server error
     * @param jobType The type of the job. &#39;all&#39; stands for all job types
     * @param actionRequest The actionRequest parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void actionPendingJobs(@jakarta.annotation.Nonnull String jobType, @jakarta.annotation.Nonnull ActionRequest actionRequest, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        actionPendingJobsRequestCreation(jobType, actionRequest, xRequestId).body(localVarReturnType);
    }

    /**
     * stop and clean, pause, resume pending jobs in the queue
     * stop and clean, pause, resume pending jobs in the queue
     * <p><b>200</b> - take action to the jobs in the queue successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>422</b> - Unsupported Type
     * <p><b>500</b> - Internal server error
     * @param jobType The type of the job. &#39;all&#39; stands for all job types
     * @param actionRequest The actionRequest parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> actionPendingJobsWithHttpInfo(@jakarta.annotation.Nonnull String jobType, @jakarta.annotation.Nonnull ActionRequest actionRequest, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return actionPendingJobsRequestCreation(jobType, actionRequest, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * stop and clean, pause, resume pending jobs in the queue
     * stop and clean, pause, resume pending jobs in the queue
     * <p><b>200</b> - take action to the jobs in the queue successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>422</b> - Unsupported Type
     * <p><b>500</b> - Internal server error
     * @param jobType The type of the job. &#39;all&#39; stands for all job types
     * @param actionRequest The actionRequest parameter
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec actionPendingJobsWithResponseSpec(@jakarta.annotation.Nonnull String jobType, @jakarta.annotation.Nonnull ActionRequest actionRequest, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return actionPendingJobsRequestCreation(jobType, actionRequest, xRequestId);
    }

    /**
     * Get worker pools
     * Get worker pools
     * <p><b>200</b> - Get worker pools successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return List&lt;WorkerPool&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getWorkerPoolsRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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

        ParameterizedTypeReference<List<WorkerPool>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/jobservice/pools", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get worker pools
     * Get worker pools
     * <p><b>200</b> - Get worker pools successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return List&lt;WorkerPool&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<WorkerPool> getWorkerPools(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<List<WorkerPool>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getWorkerPoolsRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Get worker pools
     * Get worker pools
     * <p><b>200</b> - Get worker pools successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;List&lt;WorkerPool&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<WorkerPool>> getWorkerPoolsWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<List<WorkerPool>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getWorkerPoolsRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get worker pools
     * Get worker pools
     * <p><b>200</b> - Get worker pools successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getWorkerPoolsWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getWorkerPoolsRequestCreation(xRequestId);
    }

    /**
     * Get workers
     * Get workers in current pool
     * <p><b>200</b> - Get workers successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param poolId The name of the pool. &#39;all&#39; stands for all pools
     * @param xRequestId An unique ID for the request
     * @return List&lt;Worker&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getWorkersRequestCreation(@jakarta.annotation.Nonnull String poolId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'poolId' is set
        if (poolId == null) {
            throw new RestClientResponseException("Missing the required parameter 'poolId' when calling getWorkers", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("pool_id", poolId);

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

        ParameterizedTypeReference<List<Worker>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/jobservice/pools/{pool_id}/workers", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get workers
     * Get workers in current pool
     * <p><b>200</b> - Get workers successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param poolId The name of the pool. &#39;all&#39; stands for all pools
     * @param xRequestId An unique ID for the request
     * @return List&lt;Worker&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Worker> getWorkers(@jakarta.annotation.Nonnull String poolId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<List<Worker>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getWorkersRequestCreation(poolId, xRequestId).body(localVarReturnType);
    }

    /**
     * Get workers
     * Get workers in current pool
     * <p><b>200</b> - Get workers successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param poolId The name of the pool. &#39;all&#39; stands for all pools
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;List&lt;Worker&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Worker>> getWorkersWithHttpInfo(@jakarta.annotation.Nonnull String poolId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<List<Worker>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getWorkersRequestCreation(poolId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get workers
     * Get workers in current pool
     * <p><b>200</b> - Get workers successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param poolId The name of the pool. &#39;all&#39; stands for all pools
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getWorkersWithResponseSpec(@jakarta.annotation.Nonnull String poolId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getWorkersRequestCreation(poolId, xRequestId);
    }

    /**
     * list job queues
     * list job queue
     * <p><b>200</b> - List job queue successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return List&lt;JobQueue&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listJobQueuesRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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

        ParameterizedTypeReference<List<JobQueue>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/jobservice/queues", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * list job queues
     * list job queue
     * <p><b>200</b> - List job queue successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return List&lt;JobQueue&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<JobQueue> listJobQueues(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<List<JobQueue>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listJobQueuesRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * list job queues
     * list job queue
     * <p><b>200</b> - List job queue successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;List&lt;JobQueue&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<JobQueue>> listJobQueuesWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<List<JobQueue>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listJobQueuesRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * list job queues
     * list job queue
     * <p><b>200</b> - List job queue successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listJobQueuesWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return listJobQueuesRequestCreation(xRequestId);
    }

    /**
     * Stop running job
     * Stop running job
     * <p><b>200</b> - Stop worker successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param jobId The id of the job.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec stopRunningJobRequestCreation(@jakarta.annotation.Nonnull String jobId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new RestClientResponseException("Missing the required parameter 'jobId' when calling stopRunningJob", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("job_id", jobId);

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
        return apiClient.invokeAPI("/jobservice/jobs/{job_id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Stop running job
     * Stop running job
     * <p><b>200</b> - Stop worker successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param jobId The id of the job.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void stopRunningJob(@jakarta.annotation.Nonnull String jobId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        stopRunningJobRequestCreation(jobId, xRequestId).body(localVarReturnType);
    }

    /**
     * Stop running job
     * Stop running job
     * <p><b>200</b> - Stop worker successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param jobId The id of the job.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> stopRunningJobWithHttpInfo(@jakarta.annotation.Nonnull String jobId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return stopRunningJobRequestCreation(jobId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Stop running job
     * Stop running job
     * <p><b>200</b> - Stop worker successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param jobId The id of the job.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec stopRunningJobWithResponseSpec(@jakarta.annotation.Nonnull String jobId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return stopRunningJobRequestCreation(jobId, xRequestId);
    }
}
