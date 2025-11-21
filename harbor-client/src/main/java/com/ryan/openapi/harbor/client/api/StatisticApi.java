package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.Statistic;

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
@Component("com.ryan.openapi.harbor.client.api.StatisticApi")
public class StatisticApi {
    private ApiClient apiClient;

    public StatisticApi() {
        this(new ApiClient());
    }

    @Autowired
    public StatisticApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get the statistic information about the projects and repositories
     * Get the statistic information about the projects and repositories
     * <p><b>200</b> - The statistic information
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return Statistic
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getStatisticRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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

        ParameterizedTypeReference<Statistic> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/statistics", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the statistic information about the projects and repositories
     * Get the statistic information about the projects and repositories
     * <p><b>200</b> - The statistic information
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return Statistic
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Statistic getStatistic(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Statistic> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getStatisticRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Get the statistic information about the projects and repositories
     * Get the statistic information about the projects and repositories
     * <p><b>200</b> - The statistic information
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;Statistic&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Statistic> getStatisticWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Statistic> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getStatisticRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get the statistic information about the projects and repositories
     * Get the statistic information about the projects and repositories
     * <p><b>200</b> - The statistic information
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getStatisticWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getStatisticRequestCreation(xRequestId);
    }
}
