package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import java.io.File;
import com.ryan.openapi.harbor.client.model.GeneralInfo;
import com.ryan.openapi.harbor.client.model.SystemInfo;

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
public class SysteminfoApi {
    private ApiClient apiClient;

    public SysteminfoApi() {
        this(new ApiClient());
    }

    public SysteminfoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get default root certificate.
     * This endpoint is for downloading a default root certificate. 
     * <p><b>200</b> - Get default root certificate successfully.
     * <p><b>404</b> - Not found the default root certificate.
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return File
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCertRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/systeminfo/getcert", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get default root certificate.
     * This endpoint is for downloading a default root certificate. 
     * <p><b>200</b> - Get default root certificate successfully.
     * <p><b>404</b> - Not found the default root certificate.
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return File
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public File getCert(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getCertRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Get default root certificate.
     * This endpoint is for downloading a default root certificate. 
     * <p><b>200</b> - Get default root certificate successfully.
     * <p><b>404</b> - Not found the default root certificate.
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;File&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<File> getCertWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getCertRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get default root certificate.
     * This endpoint is for downloading a default root certificate. 
     * <p><b>200</b> - Get default root certificate successfully.
     * <p><b>404</b> - Not found the default root certificate.
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCertWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getCertRequestCreation(xRequestId);
    }

    /**
     * Get general system info
     * This API is for retrieving general system info, this can be called by anonymous request.  Some attributes will be omitted in the response when this API is called by anonymous request. 
     * <p><b>200</b> - Get general info successfully.
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return GeneralInfo
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSystemInfoRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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

        ParameterizedTypeReference<GeneralInfo> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/systeminfo", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get general system info
     * This API is for retrieving general system info, this can be called by anonymous request.  Some attributes will be omitted in the response when this API is called by anonymous request. 
     * <p><b>200</b> - Get general info successfully.
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return GeneralInfo
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public GeneralInfo getSystemInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<GeneralInfo> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSystemInfoRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Get general system info
     * This API is for retrieving general system info, this can be called by anonymous request.  Some attributes will be omitted in the response when this API is called by anonymous request. 
     * <p><b>200</b> - Get general info successfully.
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;GeneralInfo&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GeneralInfo> getSystemInfoWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<GeneralInfo> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSystemInfoRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get general system info
     * This API is for retrieving general system info, this can be called by anonymous request.  Some attributes will be omitted in the response when this API is called by anonymous request. 
     * <p><b>200</b> - Get general info successfully.
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSystemInfoWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getSystemInfoRequestCreation(xRequestId);
    }

    /**
     * Get system volume info (total/free size).
     * This endpoint is for retrieving system volume info that only provides for admin user.  Note that the response only reflects the storage status of local disk. 
     * <p><b>200</b> - Get system volumes successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return SystemInfo
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVolumesRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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

        ParameterizedTypeReference<SystemInfo> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/systeminfo/volumes", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get system volume info (total/free size).
     * This endpoint is for retrieving system volume info that only provides for admin user.  Note that the response only reflects the storage status of local disk. 
     * <p><b>200</b> - Get system volumes successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return SystemInfo
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public SystemInfo getVolumes(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<SystemInfo> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVolumesRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Get system volume info (total/free size).
     * This endpoint is for retrieving system volume info that only provides for admin user.  Note that the response only reflects the storage status of local disk. 
     * <p><b>200</b> - Get system volumes successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;SystemInfo&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SystemInfo> getVolumesWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<SystemInfo> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVolumesRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get system volume info (total/free size).
     * This endpoint is for retrieving system volume info that only provides for admin user.  Note that the response only reflects the storage status of local disk. 
     * <p><b>200</b> - Get system volumes successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVolumesWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getVolumesRequestCreation(xRequestId);
    }
}
