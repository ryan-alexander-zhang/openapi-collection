package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.PingOIDCRequest;

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
public class OidcApi {
    private ApiClient apiClient;

    public OidcApi() {
        this(new ApiClient());
    }

    public OidcApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Test the OIDC endpoint.
     * Test the OIDC endpoint, the setting of the endpoint is provided in the request.  This API can only be called by system admin. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @param endpoint Request body for OIDC endpoint to be tested.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec pingOIDCRequestCreation(@jakarta.annotation.Nonnull PingOIDCRequest endpoint, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = endpoint;
        // verify the required parameter 'endpoint' is set
        if (endpoint == null) {
            throw new RestClientResponseException("Missing the required parameter 'endpoint' when calling pingOIDC", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/system/oidc/ping", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Test the OIDC endpoint.
     * Test the OIDC endpoint, the setting of the endpoint is provided in the request.  This API can only be called by system admin. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @param endpoint Request body for OIDC endpoint to be tested.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void pingOIDC(@jakarta.annotation.Nonnull PingOIDCRequest endpoint, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        pingOIDCRequestCreation(endpoint, xRequestId).body(localVarReturnType);
    }

    /**
     * Test the OIDC endpoint.
     * Test the OIDC endpoint, the setting of the endpoint is provided in the request.  This API can only be called by system admin. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @param endpoint Request body for OIDC endpoint to be tested.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> pingOIDCWithHttpInfo(@jakarta.annotation.Nonnull PingOIDCRequest endpoint, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return pingOIDCRequestCreation(endpoint, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Test the OIDC endpoint.
     * Test the OIDC endpoint, the setting of the endpoint is provided in the request.  This API can only be called by system admin. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @param endpoint Request body for OIDC endpoint to be tested.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec pingOIDCWithResponseSpec(@jakarta.annotation.Nonnull PingOIDCRequest endpoint, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return pingOIDCRequestCreation(endpoint, xRequestId);
    }
}
