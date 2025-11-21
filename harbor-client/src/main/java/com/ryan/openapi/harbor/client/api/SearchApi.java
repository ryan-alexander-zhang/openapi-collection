package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.Search;

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
public class SearchApi {
    private ApiClient apiClient;

    public SearchApi() {
        this(new ApiClient());
    }

    public SearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Search for projects and repositories
     * The Search endpoint returns information about the projects and repositories offered at public status or related to the current logged in user. The response includes the project and repository list in a proper display order.
     * <p><b>200</b> - An array of search results
     * <p><b>500</b> - Internal server error
     * @param q Search parameter for project and repository name.
     * @param xRequestId An unique ID for the request
     * @return Search
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec searchRequestCreation(@jakarta.annotation.Nonnull String q, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new RestClientResponseException("Missing the required parameter 'q' when calling search", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<Search> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/search", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search for projects and repositories
     * The Search endpoint returns information about the projects and repositories offered at public status or related to the current logged in user. The response includes the project and repository list in a proper display order.
     * <p><b>200</b> - An array of search results
     * <p><b>500</b> - Internal server error
     * @param q Search parameter for project and repository name.
     * @param xRequestId An unique ID for the request
     * @return Search
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Search search(@jakarta.annotation.Nonnull String q, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Search> localVarReturnType = new ParameterizedTypeReference<>() {};
        return searchRequestCreation(q, xRequestId).body(localVarReturnType);
    }

    /**
     * Search for projects and repositories
     * The Search endpoint returns information about the projects and repositories offered at public status or related to the current logged in user. The response includes the project and repository list in a proper display order.
     * <p><b>200</b> - An array of search results
     * <p><b>500</b> - Internal server error
     * @param q Search parameter for project and repository name.
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;Search&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Search> searchWithHttpInfo(@jakarta.annotation.Nonnull String q, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Search> localVarReturnType = new ParameterizedTypeReference<>() {};
        return searchRequestCreation(q, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Search for projects and repositories
     * The Search endpoint returns information about the projects and repositories offered at public status or related to the current logged in user. The response includes the project and repository list in a proper display order.
     * <p><b>200</b> - An array of search results
     * <p><b>500</b> - Internal server error
     * @param q Search parameter for project and repository name.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec searchWithResponseSpec(@jakarta.annotation.Nonnull String q, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return searchRequestCreation(q, xRequestId);
    }
}
