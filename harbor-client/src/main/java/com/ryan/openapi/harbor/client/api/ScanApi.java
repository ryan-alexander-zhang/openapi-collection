package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.ScanType;

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
public class ScanApi {
    private ApiClient apiClient;

    public ScanApi() {
        this(new ApiClient());
    }

    public ScanApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get the log of the scan report
     * Get the log of the scan report
     * <p><b>200</b> - Successfully get scan log file
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param reportId The report id to get the log
     * @param xRequestId An unique ID for the request
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getReportLogRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull String reportId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling getReportLog", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling getReportLog", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reference' is set
        if (reference == null) {
            throw new RestClientResponseException("Missing the required parameter 'reference' when calling getReportLog", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new RestClientResponseException("Missing the required parameter 'reportId' when calling getReportLog", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);
        pathParams.put("reference", reference);
        pathParams.put("report_id", reportId);

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
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/scan/{report_id}/log", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the log of the scan report
     * Get the log of the scan report
     * <p><b>200</b> - Successfully get scan log file
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param reportId The report id to get the log
     * @param xRequestId An unique ID for the request
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public String getReportLog(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull String reportId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getReportLogRequestCreation(projectName, repositoryName, reference, reportId, xRequestId).body(localVarReturnType);
    }

    /**
     * Get the log of the scan report
     * Get the log of the scan report
     * <p><b>200</b> - Successfully get scan log file
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param reportId The report id to get the log
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> getReportLogWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull String reportId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getReportLogRequestCreation(projectName, repositoryName, reference, reportId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get the log of the scan report
     * Get the log of the scan report
     * <p><b>200</b> - Successfully get scan log file
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param reportId The report id to get the log
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getReportLogWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull String reportId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getReportLogRequestCreation(projectName, repositoryName, reference, reportId, xRequestId);
    }

    /**
     * Scan the artifact
     * Scan the specified artifact
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>422</b> - Unsupported Type
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param scanType The scanType parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec scanArtifactRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable ScanType scanType) throws RestClientResponseException {
        Object postBody = scanType;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling scanArtifact", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling scanArtifact", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reference' is set
        if (reference == null) {
            throw new RestClientResponseException("Missing the required parameter 'reference' when calling scanArtifact", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);
        pathParams.put("reference", reference);

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
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/scan", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Scan the artifact
     * Scan the specified artifact
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>422</b> - Unsupported Type
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param scanType The scanType parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void scanArtifact(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable ScanType scanType) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        scanArtifactRequestCreation(projectName, repositoryName, reference, xRequestId, scanType).body(localVarReturnType);
    }

    /**
     * Scan the artifact
     * Scan the specified artifact
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>422</b> - Unsupported Type
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param scanType The scanType parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> scanArtifactWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable ScanType scanType) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return scanArtifactRequestCreation(projectName, repositoryName, reference, xRequestId, scanType).toEntity(localVarReturnType);
    }

    /**
     * Scan the artifact
     * Scan the specified artifact
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>422</b> - Unsupported Type
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param scanType The scanType parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec scanArtifactWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable ScanType scanType) throws RestClientResponseException {
        return scanArtifactRequestCreation(projectName, repositoryName, reference, xRequestId, scanType);
    }

    /**
     * Cancelling a scan job for a particular artifact
     * Cancelling a scan job for a particular artifact
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>422</b> - Unsupported Type
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param scanType The scan type: Vulnerabilities, SBOM
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec stopScanArtifactRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull ScanType scanType, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = scanType;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling stopScanArtifact", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling stopScanArtifact", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reference' is set
        if (reference == null) {
            throw new RestClientResponseException("Missing the required parameter 'reference' when calling stopScanArtifact", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'scanType' is set
        if (scanType == null) {
            throw new RestClientResponseException("Missing the required parameter 'scanType' when calling stopScanArtifact", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);
        pathParams.put("reference", reference);

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
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/scan/stop", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Cancelling a scan job for a particular artifact
     * Cancelling a scan job for a particular artifact
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>422</b> - Unsupported Type
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param scanType The scan type: Vulnerabilities, SBOM
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void stopScanArtifact(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull ScanType scanType, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        stopScanArtifactRequestCreation(projectName, repositoryName, reference, scanType, xRequestId).body(localVarReturnType);
    }

    /**
     * Cancelling a scan job for a particular artifact
     * Cancelling a scan job for a particular artifact
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>422</b> - Unsupported Type
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param scanType The scan type: Vulnerabilities, SBOM
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> stopScanArtifactWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull ScanType scanType, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return stopScanArtifactRequestCreation(projectName, repositoryName, reference, scanType, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Cancelling a scan job for a particular artifact
     * Cancelling a scan job for a particular artifact
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>422</b> - Unsupported Type
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param scanType The scan type: Vulnerabilities, SBOM
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec stopScanArtifactWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull ScanType scanType, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return stopScanArtifactRequestCreation(projectName, repositoryName, reference, scanType, xRequestId);
    }
}
