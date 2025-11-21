package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.IsDefault;
import com.ryan.openapi.harbor.client.model.ScannerAdapterMetadata;
import com.ryan.openapi.harbor.client.model.ScannerRegistration;
import com.ryan.openapi.harbor.client.model.ScannerRegistrationReq;
import com.ryan.openapi.harbor.client.model.ScannerRegistrationSettings;

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
public class ScannerApi {
    private ApiClient apiClient;

    public ScannerApi() {
        this(new ApiClient());
    }

    public ScannerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a scanner registration
     * Creats a new scanner registration with the given data. 
     * <p><b>201</b> - Created successfully
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param registration A scanner registration to be created.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createScannerRequestCreation(@jakarta.annotation.Nonnull ScannerRegistrationReq registration, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = registration;
        // verify the required parameter 'registration' is set
        if (registration == null) {
            throw new RestClientResponseException("Missing the required parameter 'registration' when calling createScanner", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/scanners", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a scanner registration
     * Creats a new scanner registration with the given data. 
     * <p><b>201</b> - Created successfully
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param registration A scanner registration to be created.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void createScanner(@jakarta.annotation.Nonnull ScannerRegistrationReq registration, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        createScannerRequestCreation(registration, xRequestId).body(localVarReturnType);
    }

    /**
     * Create a scanner registration
     * Creats a new scanner registration with the given data. 
     * <p><b>201</b> - Created successfully
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param registration A scanner registration to be created.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createScannerWithHttpInfo(@jakarta.annotation.Nonnull ScannerRegistrationReq registration, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createScannerRequestCreation(registration, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Create a scanner registration
     * Creats a new scanner registration with the given data. 
     * <p><b>201</b> - Created successfully
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param registration A scanner registration to be created.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createScannerWithResponseSpec(@jakarta.annotation.Nonnull ScannerRegistrationReq registration, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return createScannerRequestCreation(registration, xRequestId);
    }

    /**
     * Delete a scanner registration
     * Deletes the specified scanner registration. 
     * <p><b>200</b> - Deleted successfully and return the deleted registration
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifier.
     * @param xRequestId An unique ID for the request
     * @return ScannerRegistration
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteScannerRequestCreation(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'registrationId' is set
        if (registrationId == null) {
            throw new RestClientResponseException("Missing the required parameter 'registrationId' when calling deleteScanner", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("registration_id", registrationId);

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

        ParameterizedTypeReference<ScannerRegistration> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/scanners/{registration_id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a scanner registration
     * Deletes the specified scanner registration. 
     * <p><b>200</b> - Deleted successfully and return the deleted registration
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifier.
     * @param xRequestId An unique ID for the request
     * @return ScannerRegistration
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ScannerRegistration deleteScanner(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ScannerRegistration> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteScannerRequestCreation(registrationId, xRequestId).body(localVarReturnType);
    }

    /**
     * Delete a scanner registration
     * Deletes the specified scanner registration. 
     * <p><b>200</b> - Deleted successfully and return the deleted registration
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifier.
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;ScannerRegistration&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ScannerRegistration> deleteScannerWithHttpInfo(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ScannerRegistration> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteScannerRequestCreation(registrationId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Delete a scanner registration
     * Deletes the specified scanner registration. 
     * <p><b>200</b> - Deleted successfully and return the deleted registration
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifier.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteScannerWithResponseSpec(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return deleteScannerRequestCreation(registrationId, xRequestId);
    }

    /**
     * Get a scanner registration details
     * Retruns the details of the specified scanner registration. 
     * <p><b>200</b> - The details of the scanner registration.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifer.
     * @param xRequestId An unique ID for the request
     * @return ScannerRegistration
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getScannerRequestCreation(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'registrationId' is set
        if (registrationId == null) {
            throw new RestClientResponseException("Missing the required parameter 'registrationId' when calling getScanner", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("registration_id", registrationId);

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

        ParameterizedTypeReference<ScannerRegistration> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/scanners/{registration_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a scanner registration details
     * Retruns the details of the specified scanner registration. 
     * <p><b>200</b> - The details of the scanner registration.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifer.
     * @param xRequestId An unique ID for the request
     * @return ScannerRegistration
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ScannerRegistration getScanner(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ScannerRegistration> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getScannerRequestCreation(registrationId, xRequestId).body(localVarReturnType);
    }

    /**
     * Get a scanner registration details
     * Retruns the details of the specified scanner registration. 
     * <p><b>200</b> - The details of the scanner registration.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifer.
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;ScannerRegistration&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ScannerRegistration> getScannerWithHttpInfo(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ScannerRegistration> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getScannerRequestCreation(registrationId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get a scanner registration details
     * Retruns the details of the specified scanner registration. 
     * <p><b>200</b> - The details of the scanner registration.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifer.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getScannerWithResponseSpec(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getScannerRequestCreation(registrationId, xRequestId);
    }

    /**
     * Get the metadata of the specified scanner registration
     * Get the metadata of the specified scanner registration, including the capabilities and customized properties. 
     * <p><b>200</b> - The metadata of the specified scanner adapter
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifier.
     * @param xRequestId An unique ID for the request
     * @return ScannerAdapterMetadata
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getScannerMetadataRequestCreation(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'registrationId' is set
        if (registrationId == null) {
            throw new RestClientResponseException("Missing the required parameter 'registrationId' when calling getScannerMetadata", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("registration_id", registrationId);

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

        ParameterizedTypeReference<ScannerAdapterMetadata> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/scanners/{registration_id}/metadata", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the metadata of the specified scanner registration
     * Get the metadata of the specified scanner registration, including the capabilities and customized properties. 
     * <p><b>200</b> - The metadata of the specified scanner adapter
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifier.
     * @param xRequestId An unique ID for the request
     * @return ScannerAdapterMetadata
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ScannerAdapterMetadata getScannerMetadata(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ScannerAdapterMetadata> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getScannerMetadataRequestCreation(registrationId, xRequestId).body(localVarReturnType);
    }

    /**
     * Get the metadata of the specified scanner registration
     * Get the metadata of the specified scanner registration, including the capabilities and customized properties. 
     * <p><b>200</b> - The metadata of the specified scanner adapter
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifier.
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;ScannerAdapterMetadata&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ScannerAdapterMetadata> getScannerMetadataWithHttpInfo(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<ScannerAdapterMetadata> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getScannerMetadataRequestCreation(registrationId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get the metadata of the specified scanner registration
     * Get the metadata of the specified scanner registration, including the capabilities and customized properties. 
     * <p><b>200</b> - The metadata of the specified scanner adapter
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifier.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getScannerMetadataWithResponseSpec(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getScannerMetadataRequestCreation(registrationId, xRequestId);
    }

    /**
     * List scanner registrations
     * Returns a list of currently configured scanner registrations. 
     * <p><b>200</b> - A list of scanner registrations.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;ScannerRegistration&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listScannersRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<ScannerRegistration>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/scanners", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List scanner registrations
     * Returns a list of currently configured scanner registrations. 
     * <p><b>200</b> - A list of scanner registrations.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;ScannerRegistration&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<ScannerRegistration> listScanners(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<ScannerRegistration>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listScannersRequestCreation(xRequestId, q, sort, page, pageSize).body(localVarReturnType);
    }

    /**
     * List scanner registrations
     * Returns a list of currently configured scanner registrations. 
     * <p><b>200</b> - A list of scanner registrations.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseEntity&lt;List&lt;ScannerRegistration&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ScannerRegistration>> listScannersWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<ScannerRegistration>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listScannersRequestCreation(xRequestId, q, sort, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * List scanner registrations
     * Returns a list of currently configured scanner registrations. 
     * <p><b>200</b> - A list of scanner registrations.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listScannersWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        return listScannersRequestCreation(xRequestId, q, sort, page, pageSize);
    }

    /**
     * Tests scanner registration settings
     * Pings scanner adapter to test endpoint URL and authorization settings. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param settings A scanner registration settings to be tested.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec pingScannerRequestCreation(@jakarta.annotation.Nonnull ScannerRegistrationSettings settings, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = settings;
        // verify the required parameter 'settings' is set
        if (settings == null) {
            throw new RestClientResponseException("Missing the required parameter 'settings' when calling pingScanner", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/scanners/ping", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Tests scanner registration settings
     * Pings scanner adapter to test endpoint URL and authorization settings. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param settings A scanner registration settings to be tested.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void pingScanner(@jakarta.annotation.Nonnull ScannerRegistrationSettings settings, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        pingScannerRequestCreation(settings, xRequestId).body(localVarReturnType);
    }

    /**
     * Tests scanner registration settings
     * Pings scanner adapter to test endpoint URL and authorization settings. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param settings A scanner registration settings to be tested.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> pingScannerWithHttpInfo(@jakarta.annotation.Nonnull ScannerRegistrationSettings settings, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return pingScannerRequestCreation(settings, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Tests scanner registration settings
     * Pings scanner adapter to test endpoint URL and authorization settings. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param settings A scanner registration settings to be tested.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec pingScannerWithResponseSpec(@jakarta.annotation.Nonnull ScannerRegistrationSettings settings, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return pingScannerRequestCreation(settings, xRequestId);
    }

    /**
     * Set system default scanner registration
     * Set the specified scanner registration as the system default one. 
     * <p><b>200</b> - Successfully set the specified scanner registration as system default
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifier.
     * @param payload The payload parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec setScannerAsDefaultRequestCreation(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nonnull IsDefault payload, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = payload;
        // verify the required parameter 'registrationId' is set
        if (registrationId == null) {
            throw new RestClientResponseException("Missing the required parameter 'registrationId' when calling setScannerAsDefault", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'payload' is set
        if (payload == null) {
            throw new RestClientResponseException("Missing the required parameter 'payload' when calling setScannerAsDefault", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("registration_id", registrationId);

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
        return apiClient.invokeAPI("/scanners/{registration_id}", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Set system default scanner registration
     * Set the specified scanner registration as the system default one. 
     * <p><b>200</b> - Successfully set the specified scanner registration as system default
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifier.
     * @param payload The payload parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void setScannerAsDefault(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nonnull IsDefault payload, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        setScannerAsDefaultRequestCreation(registrationId, payload, xRequestId).body(localVarReturnType);
    }

    /**
     * Set system default scanner registration
     * Set the specified scanner registration as the system default one. 
     * <p><b>200</b> - Successfully set the specified scanner registration as system default
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifier.
     * @param payload The payload parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> setScannerAsDefaultWithHttpInfo(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nonnull IsDefault payload, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return setScannerAsDefaultRequestCreation(registrationId, payload, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Set system default scanner registration
     * Set the specified scanner registration as the system default one. 
     * <p><b>200</b> - Successfully set the specified scanner registration as system default
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifier.
     * @param payload The payload parameter
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec setScannerAsDefaultWithResponseSpec(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nonnull IsDefault payload, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return setScannerAsDefaultRequestCreation(registrationId, payload, xRequestId);
    }

    /**
     * Update a scanner registration
     * Updates the specified scanner registration. 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifier.
     * @param registration A scanner registraiton to be updated.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateScannerRequestCreation(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nonnull ScannerRegistrationReq registration, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = registration;
        // verify the required parameter 'registrationId' is set
        if (registrationId == null) {
            throw new RestClientResponseException("Missing the required parameter 'registrationId' when calling updateScanner", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'registration' is set
        if (registration == null) {
            throw new RestClientResponseException("Missing the required parameter 'registration' when calling updateScanner", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("registration_id", registrationId);

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
        return apiClient.invokeAPI("/scanners/{registration_id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a scanner registration
     * Updates the specified scanner registration. 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifier.
     * @param registration A scanner registraiton to be updated.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateScanner(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nonnull ScannerRegistrationReq registration, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateScannerRequestCreation(registrationId, registration, xRequestId).body(localVarReturnType);
    }

    /**
     * Update a scanner registration
     * Updates the specified scanner registration. 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifier.
     * @param registration A scanner registraiton to be updated.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateScannerWithHttpInfo(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nonnull ScannerRegistrationReq registration, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateScannerRequestCreation(registrationId, registration, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Update a scanner registration
     * Updates the specified scanner registration. 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param registrationId The scanner registration identifier.
     * @param registration A scanner registraiton to be updated.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateScannerWithResponseSpec(@jakarta.annotation.Nonnull String registrationId, @jakarta.annotation.Nonnull ScannerRegistrationReq registration, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return updateScannerRequestCreation(registrationId, registration, xRequestId);
    }
}
