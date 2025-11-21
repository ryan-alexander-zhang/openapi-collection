package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.Quota;
import com.ryan.openapi.harbor.client.model.QuotaUpdateReq;

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
public class QuotaApi {
    private ApiClient apiClient;

    public QuotaApi() {
        this(new ApiClient());
    }

    public QuotaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get the specified quota
     * Get the specified quota
     * <p><b>200</b> - Successfully retrieved the quota.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param id Quota ID
     * @param xRequestId An unique ID for the request
     * @return Quota
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getQuotaRequestCreation(@jakarta.annotation.Nonnull Integer id, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling getQuota", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("id", id);

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

        ParameterizedTypeReference<Quota> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/quotas/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the specified quota
     * Get the specified quota
     * <p><b>200</b> - Successfully retrieved the quota.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param id Quota ID
     * @param xRequestId An unique ID for the request
     * @return Quota
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Quota getQuota(@jakarta.annotation.Nonnull Integer id, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Quota> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getQuotaRequestCreation(id, xRequestId).body(localVarReturnType);
    }

    /**
     * Get the specified quota
     * Get the specified quota
     * <p><b>200</b> - Successfully retrieved the quota.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param id Quota ID
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;Quota&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Quota> getQuotaWithHttpInfo(@jakarta.annotation.Nonnull Integer id, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Quota> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getQuotaRequestCreation(id, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get the specified quota
     * Get the specified quota
     * <p><b>200</b> - Successfully retrieved the quota.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param id Quota ID
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getQuotaWithResponseSpec(@jakarta.annotation.Nonnull Integer id, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getQuotaRequestCreation(id, xRequestId);
    }

    /**
     * List quotas
     * List quotas
     * <p><b>200</b> - Successfully retrieved the quotas.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param reference The reference type of quota.
     * @param referenceId The reference id of quota.
     * @param sort Sort method, valid values include: &#39;hard.resource_name&#39;, &#39;-hard.resource_name&#39;, &#39;used.resource_name&#39;, &#39;-used.resource_name&#39;. Here &#39;-&#39; stands for descending order, resource_name should be the real resource name of the quota. 
     * @return List&lt;Quota&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listQuotasRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String reference, @jakarta.annotation.Nullable String referenceId, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "reference", reference));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "reference_id", referenceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<Quota>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/quotas", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List quotas
     * List quotas
     * <p><b>200</b> - Successfully retrieved the quotas.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param reference The reference type of quota.
     * @param referenceId The reference id of quota.
     * @param sort Sort method, valid values include: &#39;hard.resource_name&#39;, &#39;-hard.resource_name&#39;, &#39;used.resource_name&#39;, &#39;-used.resource_name&#39;. Here &#39;-&#39; stands for descending order, resource_name should be the real resource name of the quota. 
     * @return List&lt;Quota&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Quota> listQuotas(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String reference, @jakarta.annotation.Nullable String referenceId, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        ParameterizedTypeReference<List<Quota>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listQuotasRequestCreation(xRequestId, page, pageSize, reference, referenceId, sort).body(localVarReturnType);
    }

    /**
     * List quotas
     * List quotas
     * <p><b>200</b> - Successfully retrieved the quotas.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param reference The reference type of quota.
     * @param referenceId The reference id of quota.
     * @param sort Sort method, valid values include: &#39;hard.resource_name&#39;, &#39;-hard.resource_name&#39;, &#39;used.resource_name&#39;, &#39;-used.resource_name&#39;. Here &#39;-&#39; stands for descending order, resource_name should be the real resource name of the quota. 
     * @return ResponseEntity&lt;List&lt;Quota&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Quota>> listQuotasWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String reference, @jakarta.annotation.Nullable String referenceId, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        ParameterizedTypeReference<List<Quota>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listQuotasRequestCreation(xRequestId, page, pageSize, reference, referenceId, sort).toEntity(localVarReturnType);
    }

    /**
     * List quotas
     * List quotas
     * <p><b>200</b> - Successfully retrieved the quotas.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param reference The reference type of quota.
     * @param referenceId The reference id of quota.
     * @param sort Sort method, valid values include: &#39;hard.resource_name&#39;, &#39;-hard.resource_name&#39;, &#39;used.resource_name&#39;, &#39;-used.resource_name&#39;. Here &#39;-&#39; stands for descending order, resource_name should be the real resource name of the quota. 
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listQuotasWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String reference, @jakarta.annotation.Nullable String referenceId, @jakarta.annotation.Nullable String sort) throws RestClientResponseException {
        return listQuotasRequestCreation(xRequestId, page, pageSize, reference, referenceId, sort);
    }

    /**
     * Update the specified quota
     * Update hard limits of the specified quota
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param id Quota ID
     * @param hard The new hard limits for the quota
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateQuotaRequestCreation(@jakarta.annotation.Nonnull Integer id, @jakarta.annotation.Nonnull QuotaUpdateReq hard, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = hard;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling updateQuota", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'hard' is set
        if (hard == null) {
            throw new RestClientResponseException("Missing the required parameter 'hard' when calling updateQuota", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("id", id);

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
        return apiClient.invokeAPI("/quotas/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update the specified quota
     * Update hard limits of the specified quota
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param id Quota ID
     * @param hard The new hard limits for the quota
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateQuota(@jakarta.annotation.Nonnull Integer id, @jakarta.annotation.Nonnull QuotaUpdateReq hard, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateQuotaRequestCreation(id, hard, xRequestId).body(localVarReturnType);
    }

    /**
     * Update the specified quota
     * Update hard limits of the specified quota
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param id Quota ID
     * @param hard The new hard limits for the quota
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateQuotaWithHttpInfo(@jakarta.annotation.Nonnull Integer id, @jakarta.annotation.Nonnull QuotaUpdateReq hard, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateQuotaRequestCreation(id, hard, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Update the specified quota
     * Update hard limits of the specified quota
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param id Quota ID
     * @param hard The new hard limits for the quota
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateQuotaWithResponseSpec(@jakarta.annotation.Nonnull Integer id, @jakarta.annotation.Nonnull QuotaUpdateReq hard, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return updateQuotaRequestCreation(id, hard, xRequestId);
    }
}
