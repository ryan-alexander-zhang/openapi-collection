package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Configurations;
import com.ryan.openapi.harbor.client.model.ConfigurationsResponse;
import com.ryan.openapi.harbor.client.model.InternalConfigurationValue;

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
public class ConfigureApi {
    private ApiClient apiClient;

    public ConfigureApi() {
        this(new ApiClient());
    }

    public ConfigureApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get system configurations.
     * This endpoint is for retrieving system configurations that only provides for admin user. 
     * <p><b>200</b> - Get system configurations successfully. The response body is a map.
     * <p><b>401</b> - User need to log in first.
     * <p><b>403</b> - User does not have permission of admin role.
     * <p><b>500</b> - Unexpected internal errors.
     * @param xRequestId An unique ID for the request
     * @return ConfigurationsResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getConfigurationsRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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

        ParameterizedTypeReference<ConfigurationsResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/configurations", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get system configurations.
     * This endpoint is for retrieving system configurations that only provides for admin user. 
     * <p><b>200</b> - Get system configurations successfully. The response body is a map.
     * <p><b>401</b> - User need to log in first.
     * <p><b>403</b> - User does not have permission of admin role.
     * <p><b>500</b> - Unexpected internal errors.
     * @param xRequestId An unique ID for the request
     * @return ConfigurationsResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ConfigurationsResponse getConfigurations(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ConfigurationsResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getConfigurationsRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Get system configurations.
     * This endpoint is for retrieving system configurations that only provides for admin user. 
     * <p><b>200</b> - Get system configurations successfully. The response body is a map.
     * <p><b>401</b> - User need to log in first.
     * <p><b>403</b> - User does not have permission of admin role.
     * <p><b>500</b> - Unexpected internal errors.
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;ConfigurationsResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConfigurationsResponse> getConfigurationsWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ConfigurationsResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getConfigurationsRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get system configurations.
     * This endpoint is for retrieving system configurations that only provides for admin user. 
     * <p><b>200</b> - Get system configurations successfully. The response body is a map.
     * <p><b>401</b> - User need to log in first.
     * <p><b>403</b> - User does not have permission of admin role.
     * <p><b>500</b> - Unexpected internal errors.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getConfigurationsWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getConfigurationsRequestCreation(xRequestId);
    }

    /**
     * Get internal configurations.
     * This endpoint is for retrieving system configurations that only provides for internal api call. 
     * <p><b>200</b> - Get system configurations successfully. The response body is a map.
     * <p><b>401</b> - User need to log in first.
     * <p><b>403</b> - User does not have permission of admin role.
     * <p><b>500</b> - Unexpected internal errors.
     * @param xRequestId An unique ID for the request
     * @return Map&lt;String, InternalConfigurationValue&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getInternalconfigRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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

        ParameterizedTypeReference<Map<String, InternalConfigurationValue>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/internalconfig", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get internal configurations.
     * This endpoint is for retrieving system configurations that only provides for internal api call. 
     * <p><b>200</b> - Get system configurations successfully. The response body is a map.
     * <p><b>401</b> - User need to log in first.
     * <p><b>403</b> - User does not have permission of admin role.
     * <p><b>500</b> - Unexpected internal errors.
     * @param xRequestId An unique ID for the request
     * @return Map&lt;String, InternalConfigurationValue&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Map<String, InternalConfigurationValue> getInternalconfig(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Map<String, InternalConfigurationValue>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getInternalconfigRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Get internal configurations.
     * This endpoint is for retrieving system configurations that only provides for internal api call. 
     * <p><b>200</b> - Get system configurations successfully. The response body is a map.
     * <p><b>401</b> - User need to log in first.
     * <p><b>403</b> - User does not have permission of admin role.
     * <p><b>500</b> - Unexpected internal errors.
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;Map&lt;String, InternalConfigurationValue&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Map<String, InternalConfigurationValue>> getInternalconfigWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Map<String, InternalConfigurationValue>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getInternalconfigRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get internal configurations.
     * This endpoint is for retrieving system configurations that only provides for internal api call. 
     * <p><b>200</b> - Get system configurations successfully. The response body is a map.
     * <p><b>401</b> - User need to log in first.
     * <p><b>403</b> - User does not have permission of admin role.
     * <p><b>500</b> - Unexpected internal errors.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getInternalconfigWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getInternalconfigRequestCreation(xRequestId);
    }

    /**
     * Modify system configurations.
     * This endpoint is for modifying system configurations that only provides for admin user. 
     * <p><b>200</b> - Modify system configurations successfully.
     * <p><b>401</b> - User need to log in first.
     * <p><b>403</b> - User does not have permission of admin role.
     * <p><b>500</b> - Unexpected internal errors.
     * @param configurations The configuration map can contain a subset of the attributes of the schema, which are to be updated.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateConfigurationsRequestCreation(@jakarta.annotation.Nonnull Configurations configurations, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = configurations;
        // verify the required parameter 'configurations' is set
        if (configurations == null) {
            throw new RestClientResponseException("Missing the required parameter 'configurations' when calling updateConfigurations", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/configurations", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Modify system configurations.
     * This endpoint is for modifying system configurations that only provides for admin user. 
     * <p><b>200</b> - Modify system configurations successfully.
     * <p><b>401</b> - User need to log in first.
     * <p><b>403</b> - User does not have permission of admin role.
     * <p><b>500</b> - Unexpected internal errors.
     * @param configurations The configuration map can contain a subset of the attributes of the schema, which are to be updated.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateConfigurations(@jakarta.annotation.Nonnull Configurations configurations, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateConfigurationsRequestCreation(configurations, xRequestId).body(localVarReturnType);
    }

    /**
     * Modify system configurations.
     * This endpoint is for modifying system configurations that only provides for admin user. 
     * <p><b>200</b> - Modify system configurations successfully.
     * <p><b>401</b> - User need to log in first.
     * <p><b>403</b> - User does not have permission of admin role.
     * <p><b>500</b> - Unexpected internal errors.
     * @param configurations The configuration map can contain a subset of the attributes of the schema, which are to be updated.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateConfigurationsWithHttpInfo(@jakarta.annotation.Nonnull Configurations configurations, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateConfigurationsRequestCreation(configurations, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Modify system configurations.
     * This endpoint is for modifying system configurations that only provides for admin user. 
     * <p><b>200</b> - Modify system configurations successfully.
     * <p><b>401</b> - User need to log in first.
     * <p><b>403</b> - User does not have permission of admin role.
     * <p><b>500</b> - Unexpected internal errors.
     * @param configurations The configuration map can contain a subset of the attributes of the schema, which are to be updated.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateConfigurationsWithResponseSpec(@jakarta.annotation.Nonnull Configurations configurations, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return updateConfigurationsRequestCreation(configurations, xRequestId);
    }
}
