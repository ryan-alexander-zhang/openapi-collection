package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.OverallHealthStatus;

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
@Component("com.ryan.openapi.harbor.client.api.HealthApi")
public class HealthApi {
    private ApiClient apiClient;

    public HealthApi() {
        this(new ApiClient());
    }

    @Autowired
    public HealthApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Check the status of Harbor components
     * Check the status of Harbor components. This path does not require authentication.
     * <p><b>200</b> - The health status of Harbor components
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return OverallHealthStatus
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getHealthRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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

        ParameterizedTypeReference<OverallHealthStatus> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/health", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check the status of Harbor components
     * Check the status of Harbor components. This path does not require authentication.
     * <p><b>200</b> - The health status of Harbor components
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return OverallHealthStatus
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public OverallHealthStatus getHealth(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<OverallHealthStatus> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getHealthRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Check the status of Harbor components
     * Check the status of Harbor components. This path does not require authentication.
     * <p><b>200</b> - The health status of Harbor components
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;OverallHealthStatus&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OverallHealthStatus> getHealthWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<OverallHealthStatus> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getHealthRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Check the status of Harbor components
     * Check the status of Harbor components. This path does not require authentication.
     * <p><b>200</b> - The health status of Harbor components
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getHealthWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getHealthRequestCreation(xRequestId);
    }
}
