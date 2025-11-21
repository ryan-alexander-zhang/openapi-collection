package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.CVEAllowlist;
import com.ryan.openapi.harbor.client.model.Errors;

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
public class SystemCveAllowlistApi {
    private ApiClient apiClient;

    public SystemCveAllowlistApi() {
        this(new ApiClient());
    }

    public SystemCveAllowlistApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get the system level allowlist of CVE.
     * Get the system level allowlist of CVE.  This API can be called by all authenticated users.
     * <p><b>200</b> - Successfully retrieved the CVE allowlist.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return CVEAllowlist
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSystemCVEAllowlistRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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

        ParameterizedTypeReference<CVEAllowlist> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/system/CVEAllowlist", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the system level allowlist of CVE.
     * Get the system level allowlist of CVE.  This API can be called by all authenticated users.
     * <p><b>200</b> - Successfully retrieved the CVE allowlist.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return CVEAllowlist
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public CVEAllowlist getSystemCVEAllowlist(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<CVEAllowlist> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSystemCVEAllowlistRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Get the system level allowlist of CVE.
     * Get the system level allowlist of CVE.  This API can be called by all authenticated users.
     * <p><b>200</b> - Successfully retrieved the CVE allowlist.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;CVEAllowlist&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CVEAllowlist> getSystemCVEAllowlistWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<CVEAllowlist> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSystemCVEAllowlistRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get the system level allowlist of CVE.
     * Get the system level allowlist of CVE.  This API can be called by all authenticated users.
     * <p><b>200</b> - Successfully retrieved the CVE allowlist.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSystemCVEAllowlistWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getSystemCVEAllowlistRequestCreation(xRequestId);
    }

    /**
     * Update the system level allowlist of CVE.
     * This API overwrites the system level allowlist of CVE with the list in request body.  Only system Admin has permission to call this API.
     * <p><b>200</b> - Successfully updated the CVE allowlist.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param allowlist The allowlist with new content
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putSystemCVEAllowlistRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable CVEAllowlist allowlist) throws RestClientResponseException {
        Object postBody = allowlist;
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
        return apiClient.invokeAPI("/system/CVEAllowlist", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update the system level allowlist of CVE.
     * This API overwrites the system level allowlist of CVE with the list in request body.  Only system Admin has permission to call this API.
     * <p><b>200</b> - Successfully updated the CVE allowlist.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param allowlist The allowlist with new content
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void putSystemCVEAllowlist(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable CVEAllowlist allowlist) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        putSystemCVEAllowlistRequestCreation(xRequestId, allowlist).body(localVarReturnType);
    }

    /**
     * Update the system level allowlist of CVE.
     * This API overwrites the system level allowlist of CVE with the list in request body.  Only system Admin has permission to call this API.
     * <p><b>200</b> - Successfully updated the CVE allowlist.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param allowlist The allowlist with new content
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putSystemCVEAllowlistWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable CVEAllowlist allowlist) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return putSystemCVEAllowlistRequestCreation(xRequestId, allowlist).toEntity(localVarReturnType);
    }

    /**
     * Update the system level allowlist of CVE.
     * This API overwrites the system level allowlist of CVE with the list in request body.  Only system Admin has permission to call this API.
     * <p><b>200</b> - Successfully updated the CVE allowlist.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param allowlist The allowlist with new content
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putSystemCVEAllowlistWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable CVEAllowlist allowlist) throws RestClientResponseException {
        return putSystemCVEAllowlistRequestCreation(xRequestId, allowlist);
    }
}
