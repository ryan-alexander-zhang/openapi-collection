package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.Icon;

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
public class IconApi {
    private ApiClient apiClient;

    public IconApi() {
        this(new ApiClient());
    }

    public IconApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get artifact icon
     * Get the artifact icon with the specified digest. As the original icon image is resized and encoded before returning, the parameter \&quot;digest\&quot; in the path doesn&#39;t match the hash of the returned content
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param digest The digest of the resource
     * @param xRequestId An unique ID for the request
     * @return Icon
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getIconRequestCreation(@jakarta.annotation.Nonnull String digest, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'digest' is set
        if (digest == null) {
            throw new RestClientResponseException("Missing the required parameter 'digest' when calling getIcon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("digest", digest);

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

        ParameterizedTypeReference<Icon> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/icons/{digest}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get artifact icon
     * Get the artifact icon with the specified digest. As the original icon image is resized and encoded before returning, the parameter \&quot;digest\&quot; in the path doesn&#39;t match the hash of the returned content
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param digest The digest of the resource
     * @param xRequestId An unique ID for the request
     * @return Icon
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Icon getIcon(@jakarta.annotation.Nonnull String digest, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Icon> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getIconRequestCreation(digest, xRequestId).body(localVarReturnType);
    }

    /**
     * Get artifact icon
     * Get the artifact icon with the specified digest. As the original icon image is resized and encoded before returning, the parameter \&quot;digest\&quot; in the path doesn&#39;t match the hash of the returned content
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param digest The digest of the resource
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;Icon&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Icon> getIconWithHttpInfo(@jakarta.annotation.Nonnull String digest, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Icon> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getIconRequestCreation(digest, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get artifact icon
     * Get the artifact icon with the specified digest. As the original icon image is resized and encoded before returning, the parameter \&quot;digest\&quot; in the path doesn&#39;t match the hash of the returned content
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param digest The digest of the resource
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getIconWithResponseSpec(@jakarta.annotation.Nonnull String digest, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getIconRequestCreation(digest, xRequestId);
    }
}
