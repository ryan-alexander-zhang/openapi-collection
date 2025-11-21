package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.Label;

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
@Component("com.ryan.openapi.harbor.client.api.LabelApi")
public class LabelApi {
    private ApiClient apiClient;

    public LabelApi() {
        this(new ApiClient());
    }

    @Autowired
    public LabelApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Post creates a label
     * This endpoint let user creates a label. 
     * <p><b>201</b> - Create successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported MediaType
     * <p><b>500</b> - Internal server error
     * @param label The json object of label.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createLabelRequestCreation(@jakarta.annotation.Nonnull Label label, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = label;
        // verify the required parameter 'label' is set
        if (label == null) {
            throw new RestClientResponseException("Missing the required parameter 'label' when calling createLabel", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/labels", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Post creates a label
     * This endpoint let user creates a label. 
     * <p><b>201</b> - Create successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported MediaType
     * <p><b>500</b> - Internal server error
     * @param label The json object of label.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void createLabel(@jakarta.annotation.Nonnull Label label, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        createLabelRequestCreation(label, xRequestId).body(localVarReturnType);
    }

    /**
     * Post creates a label
     * This endpoint let user creates a label. 
     * <p><b>201</b> - Create successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported MediaType
     * <p><b>500</b> - Internal server error
     * @param label The json object of label.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createLabelWithHttpInfo(@jakarta.annotation.Nonnull Label label, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createLabelRequestCreation(label, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Post creates a label
     * This endpoint let user creates a label. 
     * <p><b>201</b> - Create successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported MediaType
     * <p><b>500</b> - Internal server error
     * @param label The json object of label.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createLabelWithResponseSpec(@jakarta.annotation.Nonnull Label label, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return createLabelRequestCreation(label, xRequestId);
    }

    /**
     * Delete the label specified by ID.
     * Delete the label specified by ID. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param labelId Label ID
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteLabelRequestCreation(@jakarta.annotation.Nonnull Long labelId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'labelId' is set
        if (labelId == null) {
            throw new RestClientResponseException("Missing the required parameter 'labelId' when calling deleteLabel", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("label_id", labelId);

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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/labels/{label_id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete the label specified by ID.
     * Delete the label specified by ID. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param labelId Label ID
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteLabel(@jakarta.annotation.Nonnull Long labelId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteLabelRequestCreation(labelId, xRequestId).body(localVarReturnType);
    }

    /**
     * Delete the label specified by ID.
     * Delete the label specified by ID. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param labelId Label ID
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteLabelWithHttpInfo(@jakarta.annotation.Nonnull Long labelId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteLabelRequestCreation(labelId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Delete the label specified by ID.
     * Delete the label specified by ID. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param labelId Label ID
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteLabelWithResponseSpec(@jakarta.annotation.Nonnull Long labelId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return deleteLabelRequestCreation(labelId, xRequestId);
    }

    /**
     * Get the label specified by ID.
     * This endpoint let user get the label by specific ID. 
     * <p><b>200</b> - Get successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param labelId Label ID
     * @param xRequestId An unique ID for the request
     * @return Label
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getLabelByIDRequestCreation(@jakarta.annotation.Nonnull Long labelId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'labelId' is set
        if (labelId == null) {
            throw new RestClientResponseException("Missing the required parameter 'labelId' when calling getLabelByID", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("label_id", labelId);

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

        ParameterizedTypeReference<Label> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/labels/{label_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the label specified by ID.
     * This endpoint let user get the label by specific ID. 
     * <p><b>200</b> - Get successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param labelId Label ID
     * @param xRequestId An unique ID for the request
     * @return Label
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Label getLabelByID(@jakarta.annotation.Nonnull Long labelId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Label> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getLabelByIDRequestCreation(labelId, xRequestId).body(localVarReturnType);
    }

    /**
     * Get the label specified by ID.
     * This endpoint let user get the label by specific ID. 
     * <p><b>200</b> - Get successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param labelId Label ID
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;Label&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Label> getLabelByIDWithHttpInfo(@jakarta.annotation.Nonnull Long labelId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Label> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getLabelByIDRequestCreation(labelId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get the label specified by ID.
     * This endpoint let user get the label by specific ID. 
     * <p><b>200</b> - Get successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param labelId Label ID
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getLabelByIDWithResponseSpec(@jakarta.annotation.Nonnull Long labelId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getLabelByIDRequestCreation(labelId, xRequestId);
    }

    /**
     * List labels according to the query strings.
     * This endpoint let user list labels by name, scope and project_id 
     * <p><b>200</b> - Get successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param name The label name.
     * @param scope The label scope. Valid values are g and p. g for global labels and p for project labels.
     * @param projectId Relevant project ID, required when scope is p.
     * @return List&lt;Label&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listLabelsRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String name, @jakarta.annotation.Nullable String scope, @jakarta.annotation.Nullable Long projectId) throws RestClientResponseException {
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
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "scope", scope));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "project_id", projectId));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<Label>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/labels", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List labels according to the query strings.
     * This endpoint let user list labels by name, scope and project_id 
     * <p><b>200</b> - Get successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param name The label name.
     * @param scope The label scope. Valid values are g and p. g for global labels and p for project labels.
     * @param projectId Relevant project ID, required when scope is p.
     * @return List&lt;Label&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Label> listLabels(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String name, @jakarta.annotation.Nullable String scope, @jakarta.annotation.Nullable Long projectId) throws RestClientResponseException {
        ParameterizedTypeReference<List<Label>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listLabelsRequestCreation(xRequestId, q, sort, page, pageSize, name, scope, projectId).body(localVarReturnType);
    }

    /**
     * List labels according to the query strings.
     * This endpoint let user list labels by name, scope and project_id 
     * <p><b>200</b> - Get successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param name The label name.
     * @param scope The label scope. Valid values are g and p. g for global labels and p for project labels.
     * @param projectId Relevant project ID, required when scope is p.
     * @return ResponseEntity&lt;List&lt;Label&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Label>> listLabelsWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String name, @jakarta.annotation.Nullable String scope, @jakarta.annotation.Nullable Long projectId) throws RestClientResponseException {
        ParameterizedTypeReference<List<Label>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listLabelsRequestCreation(xRequestId, q, sort, page, pageSize, name, scope, projectId).toEntity(localVarReturnType);
    }

    /**
     * List labels according to the query strings.
     * This endpoint let user list labels by name, scope and project_id 
     * <p><b>200</b> - Get successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param name The label name.
     * @param scope The label scope. Valid values are g and p. g for global labels and p for project labels.
     * @param projectId Relevant project ID, required when scope is p.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listLabelsWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String name, @jakarta.annotation.Nullable String scope, @jakarta.annotation.Nullable Long projectId) throws RestClientResponseException {
        return listLabelsRequestCreation(xRequestId, q, sort, page, pageSize, name, scope, projectId);
    }

    /**
     * Update the label properties.
     * This endpoint let user update label properties. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param labelId Label ID
     * @param label The updated label json object.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateLabelRequestCreation(@jakarta.annotation.Nonnull Long labelId, @jakarta.annotation.Nonnull Label label, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = label;
        // verify the required parameter 'labelId' is set
        if (labelId == null) {
            throw new RestClientResponseException("Missing the required parameter 'labelId' when calling updateLabel", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'label' is set
        if (label == null) {
            throw new RestClientResponseException("Missing the required parameter 'label' when calling updateLabel", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("label_id", labelId);

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
        return apiClient.invokeAPI("/labels/{label_id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update the label properties.
     * This endpoint let user update label properties. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param labelId Label ID
     * @param label The updated label json object.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateLabel(@jakarta.annotation.Nonnull Long labelId, @jakarta.annotation.Nonnull Label label, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateLabelRequestCreation(labelId, label, xRequestId).body(localVarReturnType);
    }

    /**
     * Update the label properties.
     * This endpoint let user update label properties. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param labelId Label ID
     * @param label The updated label json object.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateLabelWithHttpInfo(@jakarta.annotation.Nonnull Long labelId, @jakarta.annotation.Nonnull Label label, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateLabelRequestCreation(labelId, label, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Update the label properties.
     * This endpoint let user update label properties. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param labelId Label ID
     * @param label The updated label json object.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateLabelWithResponseSpec(@jakarta.annotation.Nonnull Long labelId, @jakarta.annotation.Nonnull Label label, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return updateLabelRequestCreation(labelId, label, xRequestId);
    }
}
