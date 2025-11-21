package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;


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
public class PingApi {
    private ApiClient apiClient;

    public PingApi() {
        this(new ApiClient());
    }

    public PingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Ping Harbor to check if the API server is alive.
     * This API simply replies a pong to indicate the process to handle API is up, disregarding the health status of dependent components. This path does not require any authentication.
     * <p><b>200</b> - The API server is alive
     * @param xRequestId An unique ID for the request
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPingRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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
            "text/plain"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/ping", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Ping Harbor to check if the API server is alive.
     * This API simply replies a pong to indicate the process to handle API is up, disregarding the health status of dependent components. This path does not require any authentication.
     * <p><b>200</b> - The API server is alive
     * @param xRequestId An unique ID for the request
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public String getPing(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getPingRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Ping Harbor to check if the API server is alive.
     * This API simply replies a pong to indicate the process to handle API is up, disregarding the health status of dependent components. This path does not require any authentication.
     * <p><b>200</b> - The API server is alive
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> getPingWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getPingRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Ping Harbor to check if the API server is alive.
     * This API simply replies a pong to indicate the process to handle API is up, disregarding the health status of dependent components. This path does not require any authentication.
     * <p><b>200</b> - The API server is alive
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPingWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getPingRequestCreation(xRequestId);
    }
}
