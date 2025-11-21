package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import java.io.File;
import com.ryan.openapi.harbor.client.model.ScanDataExportExecution;
import com.ryan.openapi.harbor.client.model.ScanDataExportExecutionList;
import com.ryan.openapi.harbor.client.model.ScanDataExportJob;
import com.ryan.openapi.harbor.client.model.ScanDataExportRequest;

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
public class ScanDataExportApi {
    private ApiClient apiClient;

    public ScanDataExportApi() {
        this(new ApiClient());
    }

    public ScanDataExportApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Download the scan data export file
     * Download the scan data report. Default format is CSV
     * <p><b>200</b> - Data file containing the export data
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @param format The format of the data to be exported. e.g. CSV or PDF
     * @return File
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec downloadScanDataRequestCreation(@jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String format) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'executionId' is set
        if (executionId == null) {
            throw new RestClientResponseException("Missing the required parameter 'executionId' when calling downloadScanData", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("execution_id", executionId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "format", format));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "text/csv"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/export/cve/download/{execution_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Download the scan data export file
     * Download the scan data report. Default format is CSV
     * <p><b>200</b> - Data file containing the export data
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @param format The format of the data to be exported. e.g. CSV or PDF
     * @return File
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public File downloadScanData(@jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String format) throws RestClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<>() {};
        return downloadScanDataRequestCreation(executionId, xRequestId, format).body(localVarReturnType);
    }

    /**
     * Download the scan data export file
     * Download the scan data report. Default format is CSV
     * <p><b>200</b> - Data file containing the export data
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @param format The format of the data to be exported. e.g. CSV or PDF
     * @return ResponseEntity&lt;File&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<File> downloadScanDataWithHttpInfo(@jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String format) throws RestClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<>() {};
        return downloadScanDataRequestCreation(executionId, xRequestId, format).toEntity(localVarReturnType);
    }

    /**
     * Download the scan data export file
     * Download the scan data report. Default format is CSV
     * <p><b>200</b> - Data file containing the export data
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @param format The format of the data to be exported. e.g. CSV or PDF
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec downloadScanDataWithResponseSpec(@jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String format) throws RestClientResponseException {
        return downloadScanDataRequestCreation(executionId, xRequestId, format);
    }

    /**
     * Export scan data for selected projects
     * Export scan data for selected projects
     * <p><b>200</b> - Success.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>405</b> - Method not allowed
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param xScanDataType The type of scan data to export
     * @param criteria The criteria for the export
     * @param xRequestId An unique ID for the request
     * @return ScanDataExportJob
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec exportScanDataRequestCreation(@jakarta.annotation.Nonnull String xScanDataType, @jakarta.annotation.Nonnull ScanDataExportRequest criteria, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = criteria;
        // verify the required parameter 'xScanDataType' is set
        if (xScanDataType == null) {
            throw new RestClientResponseException("Missing the required parameter 'xScanDataType' when calling exportScanData", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'criteria' is set
        if (criteria == null) {
            throw new RestClientResponseException("Missing the required parameter 'criteria' when calling exportScanData", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xScanDataType != null)
        headerParams.add("X-Scan-Data-Type", apiClient.parameterToString(xScanDataType));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<ScanDataExportJob> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/export/cve", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Export scan data for selected projects
     * Export scan data for selected projects
     * <p><b>200</b> - Success.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>405</b> - Method not allowed
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param xScanDataType The type of scan data to export
     * @param criteria The criteria for the export
     * @param xRequestId An unique ID for the request
     * @return ScanDataExportJob
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ScanDataExportJob exportScanData(@jakarta.annotation.Nonnull String xScanDataType, @jakarta.annotation.Nonnull ScanDataExportRequest criteria, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ScanDataExportJob> localVarReturnType = new ParameterizedTypeReference<>() {};
        return exportScanDataRequestCreation(xScanDataType, criteria, xRequestId).body(localVarReturnType);
    }

    /**
     * Export scan data for selected projects
     * Export scan data for selected projects
     * <p><b>200</b> - Success.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>405</b> - Method not allowed
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param xScanDataType The type of scan data to export
     * @param criteria The criteria for the export
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;ScanDataExportJob&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ScanDataExportJob> exportScanDataWithHttpInfo(@jakarta.annotation.Nonnull String xScanDataType, @jakarta.annotation.Nonnull ScanDataExportRequest criteria, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ScanDataExportJob> localVarReturnType = new ParameterizedTypeReference<>() {};
        return exportScanDataRequestCreation(xScanDataType, criteria, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Export scan data for selected projects
     * Export scan data for selected projects
     * <p><b>200</b> - Success.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>405</b> - Method not allowed
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param xScanDataType The type of scan data to export
     * @param criteria The criteria for the export
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec exportScanDataWithResponseSpec(@jakarta.annotation.Nonnull String xScanDataType, @jakarta.annotation.Nonnull ScanDataExportRequest criteria, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return exportScanDataRequestCreation(xScanDataType, criteria, xRequestId);
    }

    /**
     * Get the specific scan data export execution
     * Get the scan data export execution specified by ID
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @return ScanDataExportExecution
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getScanDataExportExecutionRequestCreation(@jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'executionId' is set
        if (executionId == null) {
            throw new RestClientResponseException("Missing the required parameter 'executionId' when calling getScanDataExportExecution", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

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

        ParameterizedTypeReference<ScanDataExportExecution> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/export/cve/execution/{execution_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the specific scan data export execution
     * Get the scan data export execution specified by ID
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @return ScanDataExportExecution
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ScanDataExportExecution getScanDataExportExecution(@jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ScanDataExportExecution> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getScanDataExportExecutionRequestCreation(executionId, xRequestId).body(localVarReturnType);
    }

    /**
     * Get the specific scan data export execution
     * Get the scan data export execution specified by ID
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;ScanDataExportExecution&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ScanDataExportExecution> getScanDataExportExecutionWithHttpInfo(@jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ScanDataExportExecution> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getScanDataExportExecutionRequestCreation(executionId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get the specific scan data export execution
     * Get the scan data export execution specified by ID
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param executionId Execution ID
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getScanDataExportExecutionWithResponseSpec(@jakarta.annotation.Nonnull Integer executionId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getScanDataExportExecutionRequestCreation(executionId, xRequestId);
    }

    /**
     * Get a list of specific scan data export execution jobs for a specified user
     * Get a list of specific scan data export execution jobs for a specified user
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ScanDataExportExecutionList
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getScanDataExportExecutionListRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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

        ParameterizedTypeReference<ScanDataExportExecutionList> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/export/cve/executions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a list of specific scan data export execution jobs for a specified user
     * Get a list of specific scan data export execution jobs for a specified user
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ScanDataExportExecutionList
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ScanDataExportExecutionList getScanDataExportExecutionList(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ScanDataExportExecutionList> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getScanDataExportExecutionListRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Get a list of specific scan data export execution jobs for a specified user
     * Get a list of specific scan data export execution jobs for a specified user
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;ScanDataExportExecutionList&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ScanDataExportExecutionList> getScanDataExportExecutionListWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ScanDataExportExecutionList> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getScanDataExportExecutionListRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get a list of specific scan data export execution jobs for a specified user
     * Get a list of specific scan data export execution jobs for a specified user
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getScanDataExportExecutionListWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getScanDataExportExecutionListRequestCreation(xRequestId);
    }
}
