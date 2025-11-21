package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Accessory;
import com.ryan.openapi.harbor.client.model.Artifact;
import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.Label;
import com.ryan.openapi.harbor.client.model.Tag;

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
public class ArtifactApi {
    private ApiClient apiClient;

    public ArtifactApi() {
        this(new ApiClient());
    }

    public ArtifactApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add label to artifact
     * Add label to the specified artiact.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param label The label that added to the artifact. Only the ID property is needed.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addLabelRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull Label label, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = label;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling addLabel", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling addLabel", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reference' is set
        if (reference == null) {
            throw new RestClientResponseException("Missing the required parameter 'reference' when calling addLabel", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'label' is set
        if (label == null) {
            throw new RestClientResponseException("Missing the required parameter 'label' when calling addLabel", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);
        pathParams.put("reference", reference);

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
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/labels", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add label to artifact
     * Add label to the specified artiact.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param label The label that added to the artifact. Only the ID property is needed.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void addLabel(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull Label label, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        addLabelRequestCreation(projectName, repositoryName, reference, label, xRequestId).body(localVarReturnType);
    }

    /**
     * Add label to artifact
     * Add label to the specified artiact.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param label The label that added to the artifact. Only the ID property is needed.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> addLabelWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull Label label, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return addLabelRequestCreation(projectName, repositoryName, reference, label, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Add label to artifact
     * Add label to the specified artiact.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param label The label that added to the artifact. Only the ID property is needed.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec addLabelWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull Label label, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return addLabelRequestCreation(projectName, repositoryName, reference, label, xRequestId);
    }

    /**
     * Copy artifact
     * Copy the artifact specified in the \&quot;from\&quot; parameter to the repository.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>405</b> - Method not allowed
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param from The artifact from which the new artifact is copied from, the format should be \&quot;project/repository:tag\&quot; or \&quot;project/repository@digest\&quot;.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec copyArtifactRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String from, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling copyArtifact", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling copyArtifact", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new RestClientResponseException("Missing the required parameter 'from' when calling copyArtifact", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));

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
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}/artifacts", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Copy artifact
     * Copy the artifact specified in the \&quot;from\&quot; parameter to the repository.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>405</b> - Method not allowed
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param from The artifact from which the new artifact is copied from, the format should be \&quot;project/repository:tag\&quot; or \&quot;project/repository@digest\&quot;.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void copyArtifact(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String from, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        copyArtifactRequestCreation(projectName, repositoryName, from, xRequestId).body(localVarReturnType);
    }

    /**
     * Copy artifact
     * Copy the artifact specified in the \&quot;from\&quot; parameter to the repository.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>405</b> - Method not allowed
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param from The artifact from which the new artifact is copied from, the format should be \&quot;project/repository:tag\&quot; or \&quot;project/repository@digest\&quot;.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> copyArtifactWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String from, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return copyArtifactRequestCreation(projectName, repositoryName, from, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Copy artifact
     * Copy the artifact specified in the \&quot;from\&quot; parameter to the repository.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>405</b> - Method not allowed
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param from The artifact from which the new artifact is copied from, the format should be \&quot;project/repository:tag\&quot; or \&quot;project/repository@digest\&quot;.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec copyArtifactWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String from, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return copyArtifactRequestCreation(projectName, repositoryName, from, xRequestId);
    }

    /**
     * Create tag
     * Create a tag for the specified artifact
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>405</b> - Method not allowed
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param tag The JSON object of tag.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createTagRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull Tag tag, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = tag;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling createTag", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling createTag", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reference' is set
        if (reference == null) {
            throw new RestClientResponseException("Missing the required parameter 'reference' when calling createTag", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new RestClientResponseException("Missing the required parameter 'tag' when calling createTag", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);
        pathParams.put("reference", reference);

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
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/tags", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create tag
     * Create a tag for the specified artifact
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>405</b> - Method not allowed
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param tag The JSON object of tag.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void createTag(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull Tag tag, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        createTagRequestCreation(projectName, repositoryName, reference, tag, xRequestId).body(localVarReturnType);
    }

    /**
     * Create tag
     * Create a tag for the specified artifact
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>405</b> - Method not allowed
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param tag The JSON object of tag.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createTagWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull Tag tag, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createTagRequestCreation(projectName, repositoryName, reference, tag, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Create tag
     * Create a tag for the specified artifact
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>405</b> - Method not allowed
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param tag The JSON object of tag.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createTagWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull Tag tag, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return createTagRequestCreation(projectName, repositoryName, reference, tag, xRequestId);
    }

    /**
     * Delete the specific artifact
     * Delete the artifact specified by the reference under the project and repository. The reference can be digest or tag
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteArtifactRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling deleteArtifact", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling deleteArtifact", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reference' is set
        if (reference == null) {
            throw new RestClientResponseException("Missing the required parameter 'reference' when calling deleteArtifact", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);
        pathParams.put("reference", reference);

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
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}/artifacts/{reference}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete the specific artifact
     * Delete the artifact specified by the reference under the project and repository. The reference can be digest or tag
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteArtifact(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteArtifactRequestCreation(projectName, repositoryName, reference, xRequestId).body(localVarReturnType);
    }

    /**
     * Delete the specific artifact
     * Delete the artifact specified by the reference under the project and repository. The reference can be digest or tag
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteArtifactWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteArtifactRequestCreation(projectName, repositoryName, reference, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Delete the specific artifact
     * Delete the artifact specified by the reference under the project and repository. The reference can be digest or tag
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteArtifactWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return deleteArtifactRequestCreation(projectName, repositoryName, reference, xRequestId);
    }

    /**
     * Delete tag
     * Delete the tag of the specified artifact
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param tagName The name of the tag
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteTagRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull String tagName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling deleteTag", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling deleteTag", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reference' is set
        if (reference == null) {
            throw new RestClientResponseException("Missing the required parameter 'reference' when calling deleteTag", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'tagName' is set
        if (tagName == null) {
            throw new RestClientResponseException("Missing the required parameter 'tagName' when calling deleteTag", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);
        pathParams.put("reference", reference);
        pathParams.put("tag_name", tagName);

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
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/tags/{tag_name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete tag
     * Delete the tag of the specified artifact
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param tagName The name of the tag
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteTag(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull String tagName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteTagRequestCreation(projectName, repositoryName, reference, tagName, xRequestId).body(localVarReturnType);
    }

    /**
     * Delete tag
     * Delete the tag of the specified artifact
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param tagName The name of the tag
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteTagWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull String tagName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteTagRequestCreation(projectName, repositoryName, reference, tagName, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Delete tag
     * Delete the tag of the specified artifact
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param tagName The name of the tag
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteTagWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull String tagName, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return deleteTagRequestCreation(projectName, repositoryName, reference, tagName, xRequestId);
    }

    /**
     * Get the addition of the specific artifact
     * Get the addition of the artifact specified by the reference under the project and repository.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>422</b> - Unsupported Type
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param addition The type of addition.
     * @param xRequestId An unique ID for the request
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAdditionRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull String addition, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling getAddition", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling getAddition", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reference' is set
        if (reference == null) {
            throw new RestClientResponseException("Missing the required parameter 'reference' when calling getAddition", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'addition' is set
        if (addition == null) {
            throw new RestClientResponseException("Missing the required parameter 'addition' when calling getAddition", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);
        pathParams.put("reference", reference);
        pathParams.put("addition", addition);

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

        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/additions/{addition}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the addition of the specific artifact
     * Get the addition of the artifact specified by the reference under the project and repository.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>422</b> - Unsupported Type
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param addition The type of addition.
     * @param xRequestId An unique ID for the request
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public String getAddition(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull String addition, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getAdditionRequestCreation(projectName, repositoryName, reference, addition, xRequestId).body(localVarReturnType);
    }

    /**
     * Get the addition of the specific artifact
     * Get the addition of the artifact specified by the reference under the project and repository.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>422</b> - Unsupported Type
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param addition The type of addition.
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> getAdditionWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull String addition, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getAdditionRequestCreation(projectName, repositoryName, reference, addition, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get the addition of the specific artifact
     * Get the addition of the artifact specified by the reference under the project and repository.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>422</b> - Unsupported Type
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param addition The type of addition.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAdditionWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull String addition, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getAdditionRequestCreation(projectName, repositoryName, reference, addition, xRequestId);
    }

    /**
     * Get the specific artifact
     * Get the artifact specified by the reference under the project and repository. The reference can be digest or tag.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param xAcceptVulnerabilities A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39;
     * @param withTag Specify whether the tags are inclued inside the returning artifacts
     * @param withLabel Specify whether the labels are inclued inside the returning artifacts
     * @param withScanOverview Specify whether the scan overview is inclued inside the returning artifacts
     * @param withSbomOverview Specify whether the SBOM overview is included in returning artifact, when this option is true, the SBOM overview will be included in the response
     * @param withAccessory Specify whether the accessories are included of the returning artifacts.
     * @param withSignature Specify whether the signature is inclued inside the returning artifacts
     * @param withImmutableStatus Specify whether the immutable status is inclued inside the tags of the returning artifacts.
     * @return Artifact
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getArtifactRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String xAcceptVulnerabilities, @jakarta.annotation.Nullable Boolean withTag, @jakarta.annotation.Nullable Boolean withLabel, @jakarta.annotation.Nullable Boolean withScanOverview, @jakarta.annotation.Nullable Boolean withSbomOverview, @jakarta.annotation.Nullable Boolean withAccessory, @jakarta.annotation.Nullable Boolean withSignature, @jakarta.annotation.Nullable Boolean withImmutableStatus) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling getArtifact", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling getArtifact", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reference' is set
        if (reference == null) {
            throw new RestClientResponseException("Missing the required parameter 'reference' when calling getArtifact", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);
        pathParams.put("reference", reference);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_tag", withTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_label", withLabel));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_scan_overview", withScanOverview));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_sbom_overview", withSbomOverview));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_accessory", withAccessory));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_signature", withSignature));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_immutable_status", withImmutableStatus));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xAcceptVulnerabilities != null)
        headerParams.add("X-Accept-Vulnerabilities", apiClient.parameterToString(xAcceptVulnerabilities));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<Artifact> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}/artifacts/{reference}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the specific artifact
     * Get the artifact specified by the reference under the project and repository. The reference can be digest or tag.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param xAcceptVulnerabilities A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39;
     * @param withTag Specify whether the tags are inclued inside the returning artifacts
     * @param withLabel Specify whether the labels are inclued inside the returning artifacts
     * @param withScanOverview Specify whether the scan overview is inclued inside the returning artifacts
     * @param withSbomOverview Specify whether the SBOM overview is included in returning artifact, when this option is true, the SBOM overview will be included in the response
     * @param withAccessory Specify whether the accessories are included of the returning artifacts.
     * @param withSignature Specify whether the signature is inclued inside the returning artifacts
     * @param withImmutableStatus Specify whether the immutable status is inclued inside the tags of the returning artifacts.
     * @return Artifact
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Artifact getArtifact(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String xAcceptVulnerabilities, @jakarta.annotation.Nullable Boolean withTag, @jakarta.annotation.Nullable Boolean withLabel, @jakarta.annotation.Nullable Boolean withScanOverview, @jakarta.annotation.Nullable Boolean withSbomOverview, @jakarta.annotation.Nullable Boolean withAccessory, @jakarta.annotation.Nullable Boolean withSignature, @jakarta.annotation.Nullable Boolean withImmutableStatus) throws RestClientResponseException {
        ParameterizedTypeReference<Artifact> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getArtifactRequestCreation(projectName, repositoryName, reference, xRequestId, page, pageSize, xAcceptVulnerabilities, withTag, withLabel, withScanOverview, withSbomOverview, withAccessory, withSignature, withImmutableStatus).body(localVarReturnType);
    }

    /**
     * Get the specific artifact
     * Get the artifact specified by the reference under the project and repository. The reference can be digest or tag.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param xAcceptVulnerabilities A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39;
     * @param withTag Specify whether the tags are inclued inside the returning artifacts
     * @param withLabel Specify whether the labels are inclued inside the returning artifacts
     * @param withScanOverview Specify whether the scan overview is inclued inside the returning artifacts
     * @param withSbomOverview Specify whether the SBOM overview is included in returning artifact, when this option is true, the SBOM overview will be included in the response
     * @param withAccessory Specify whether the accessories are included of the returning artifacts.
     * @param withSignature Specify whether the signature is inclued inside the returning artifacts
     * @param withImmutableStatus Specify whether the immutable status is inclued inside the tags of the returning artifacts.
     * @return ResponseEntity&lt;Artifact&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Artifact> getArtifactWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String xAcceptVulnerabilities, @jakarta.annotation.Nullable Boolean withTag, @jakarta.annotation.Nullable Boolean withLabel, @jakarta.annotation.Nullable Boolean withScanOverview, @jakarta.annotation.Nullable Boolean withSbomOverview, @jakarta.annotation.Nullable Boolean withAccessory, @jakarta.annotation.Nullable Boolean withSignature, @jakarta.annotation.Nullable Boolean withImmutableStatus) throws RestClientResponseException {
        ParameterizedTypeReference<Artifact> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getArtifactRequestCreation(projectName, repositoryName, reference, xRequestId, page, pageSize, xAcceptVulnerabilities, withTag, withLabel, withScanOverview, withSbomOverview, withAccessory, withSignature, withImmutableStatus).toEntity(localVarReturnType);
    }

    /**
     * Get the specific artifact
     * Get the artifact specified by the reference under the project and repository. The reference can be digest or tag.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param xAcceptVulnerabilities A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39;
     * @param withTag Specify whether the tags are inclued inside the returning artifacts
     * @param withLabel Specify whether the labels are inclued inside the returning artifacts
     * @param withScanOverview Specify whether the scan overview is inclued inside the returning artifacts
     * @param withSbomOverview Specify whether the SBOM overview is included in returning artifact, when this option is true, the SBOM overview will be included in the response
     * @param withAccessory Specify whether the accessories are included of the returning artifacts.
     * @param withSignature Specify whether the signature is inclued inside the returning artifacts
     * @param withImmutableStatus Specify whether the immutable status is inclued inside the tags of the returning artifacts.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getArtifactWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String xAcceptVulnerabilities, @jakarta.annotation.Nullable Boolean withTag, @jakarta.annotation.Nullable Boolean withLabel, @jakarta.annotation.Nullable Boolean withScanOverview, @jakarta.annotation.Nullable Boolean withSbomOverview, @jakarta.annotation.Nullable Boolean withAccessory, @jakarta.annotation.Nullable Boolean withSignature, @jakarta.annotation.Nullable Boolean withImmutableStatus) throws RestClientResponseException {
        return getArtifactRequestCreation(projectName, repositoryName, reference, xRequestId, page, pageSize, xAcceptVulnerabilities, withTag, withLabel, withScanOverview, withSbomOverview, withAccessory, withSignature, withImmutableStatus);
    }

    /**
     * Get the vulnerabilities addition of the specific artifact
     * Get the vulnerabilities addition of the artifact specified by the reference under the project and repository.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param xAcceptVulnerabilities A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39;
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVulnerabilitiesAdditionRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String xAcceptVulnerabilities) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling getVulnerabilitiesAddition", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling getVulnerabilitiesAddition", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reference' is set
        if (reference == null) {
            throw new RestClientResponseException("Missing the required parameter 'reference' when calling getVulnerabilitiesAddition", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);
        pathParams.put("reference", reference);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xAcceptVulnerabilities != null)
        headerParams.add("X-Accept-Vulnerabilities", apiClient.parameterToString(xAcceptVulnerabilities));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/additions/vulnerabilities", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the vulnerabilities addition of the specific artifact
     * Get the vulnerabilities addition of the artifact specified by the reference under the project and repository.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param xAcceptVulnerabilities A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39;
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public String getVulnerabilitiesAddition(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String xAcceptVulnerabilities) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVulnerabilitiesAdditionRequestCreation(projectName, repositoryName, reference, xRequestId, xAcceptVulnerabilities).body(localVarReturnType);
    }

    /**
     * Get the vulnerabilities addition of the specific artifact
     * Get the vulnerabilities addition of the artifact specified by the reference under the project and repository.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param xAcceptVulnerabilities A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39;
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> getVulnerabilitiesAdditionWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String xAcceptVulnerabilities) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVulnerabilitiesAdditionRequestCreation(projectName, repositoryName, reference, xRequestId, xAcceptVulnerabilities).toEntity(localVarReturnType);
    }

    /**
     * Get the vulnerabilities addition of the specific artifact
     * Get the vulnerabilities addition of the artifact specified by the reference under the project and repository.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param xAcceptVulnerabilities A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39;
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVulnerabilitiesAdditionWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String xAcceptVulnerabilities) throws RestClientResponseException {
        return getVulnerabilitiesAdditionRequestCreation(projectName, repositoryName, reference, xRequestId, xAcceptVulnerabilities);
    }

    /**
     * List accessories
     * List accessories of the specific artifact
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;Accessory&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listAccessoriesRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling listAccessories", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling listAccessories", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reference' is set
        if (reference == null) {
            throw new RestClientResponseException("Missing the required parameter 'reference' when calling listAccessories", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);
        pathParams.put("reference", reference);

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

        ParameterizedTypeReference<List<Accessory>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/accessories", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List accessories
     * List accessories of the specific artifact
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;Accessory&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Accessory> listAccessories(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<Accessory>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listAccessoriesRequestCreation(projectName, repositoryName, reference, xRequestId, q, sort, page, pageSize).body(localVarReturnType);
    }

    /**
     * List accessories
     * List accessories of the specific artifact
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseEntity&lt;List&lt;Accessory&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Accessory>> listAccessoriesWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<Accessory>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listAccessoriesRequestCreation(projectName, repositoryName, reference, xRequestId, q, sort, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * List accessories
     * List accessories of the specific artifact
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listAccessoriesWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        return listAccessoriesRequestCreation(projectName, repositoryName, reference, xRequestId, q, sort, page, pageSize);
    }

    /**
     * List artifacts
     * List artifacts under the specific project and repository. Except the basic properties, the other supported queries in \&quot;q\&quot; includes \&quot;tags&#x3D;*\&quot; to list only tagged artifacts, \&quot;tags&#x3D;nil\&quot; to list only untagged artifacts, \&quot;tags&#x3D;~v\&quot; to list artifacts whose tag fuzzy matches \&quot;v\&quot;, \&quot;tags&#x3D;v\&quot; to list artifact whose tag exactly matches \&quot;v\&quot;, \&quot;labels&#x3D;(id1, id2)\&quot; to list artifacts that both labels with id1 and id2 are added to
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param xAcceptVulnerabilities A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39;
     * @param withTag Specify whether the tags are included inside the returning artifacts
     * @param withLabel Specify whether the labels are included inside the returning artifacts
     * @param withScanOverview Specify whether the scan overview is included inside the returning artifacts
     * @param withSbomOverview Specify whether the SBOM overview is included in returning artifacts, when this option is true, the SBOM overview will be included in the response
     * @param withImmutableStatus Specify whether the immutable status is included inside the tags of the returning artifacts. Only works when setting \&quot;with_immutable_status&#x3D;true\&quot;
     * @param withAccessory Specify whether the accessories are included of the returning artifacts. Only works when setting \&quot;with_accessory&#x3D;true\&quot;
     * @return List&lt;Artifact&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listArtifactsRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String xAcceptVulnerabilities, @jakarta.annotation.Nullable Boolean withTag, @jakarta.annotation.Nullable Boolean withLabel, @jakarta.annotation.Nullable Boolean withScanOverview, @jakarta.annotation.Nullable Boolean withSbomOverview, @jakarta.annotation.Nullable Boolean withImmutableStatus, @jakarta.annotation.Nullable Boolean withAccessory) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling listArtifacts", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling listArtifacts", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_tag", withTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_label", withLabel));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_scan_overview", withScanOverview));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_sbom_overview", withSbomOverview));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_immutable_status", withImmutableStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_accessory", withAccessory));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xAcceptVulnerabilities != null)
        headerParams.add("X-Accept-Vulnerabilities", apiClient.parameterToString(xAcceptVulnerabilities));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<Artifact>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}/artifacts", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List artifacts
     * List artifacts under the specific project and repository. Except the basic properties, the other supported queries in \&quot;q\&quot; includes \&quot;tags&#x3D;*\&quot; to list only tagged artifacts, \&quot;tags&#x3D;nil\&quot; to list only untagged artifacts, \&quot;tags&#x3D;~v\&quot; to list artifacts whose tag fuzzy matches \&quot;v\&quot;, \&quot;tags&#x3D;v\&quot; to list artifact whose tag exactly matches \&quot;v\&quot;, \&quot;labels&#x3D;(id1, id2)\&quot; to list artifacts that both labels with id1 and id2 are added to
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param xAcceptVulnerabilities A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39;
     * @param withTag Specify whether the tags are included inside the returning artifacts
     * @param withLabel Specify whether the labels are included inside the returning artifacts
     * @param withScanOverview Specify whether the scan overview is included inside the returning artifacts
     * @param withSbomOverview Specify whether the SBOM overview is included in returning artifacts, when this option is true, the SBOM overview will be included in the response
     * @param withImmutableStatus Specify whether the immutable status is included inside the tags of the returning artifacts. Only works when setting \&quot;with_immutable_status&#x3D;true\&quot;
     * @param withAccessory Specify whether the accessories are included of the returning artifacts. Only works when setting \&quot;with_accessory&#x3D;true\&quot;
     * @return List&lt;Artifact&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Artifact> listArtifacts(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String xAcceptVulnerabilities, @jakarta.annotation.Nullable Boolean withTag, @jakarta.annotation.Nullable Boolean withLabel, @jakarta.annotation.Nullable Boolean withScanOverview, @jakarta.annotation.Nullable Boolean withSbomOverview, @jakarta.annotation.Nullable Boolean withImmutableStatus, @jakarta.annotation.Nullable Boolean withAccessory) throws RestClientResponseException {
        ParameterizedTypeReference<List<Artifact>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listArtifactsRequestCreation(projectName, repositoryName, xRequestId, q, sort, page, pageSize, xAcceptVulnerabilities, withTag, withLabel, withScanOverview, withSbomOverview, withImmutableStatus, withAccessory).body(localVarReturnType);
    }

    /**
     * List artifacts
     * List artifacts under the specific project and repository. Except the basic properties, the other supported queries in \&quot;q\&quot; includes \&quot;tags&#x3D;*\&quot; to list only tagged artifacts, \&quot;tags&#x3D;nil\&quot; to list only untagged artifacts, \&quot;tags&#x3D;~v\&quot; to list artifacts whose tag fuzzy matches \&quot;v\&quot;, \&quot;tags&#x3D;v\&quot; to list artifact whose tag exactly matches \&quot;v\&quot;, \&quot;labels&#x3D;(id1, id2)\&quot; to list artifacts that both labels with id1 and id2 are added to
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param xAcceptVulnerabilities A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39;
     * @param withTag Specify whether the tags are included inside the returning artifacts
     * @param withLabel Specify whether the labels are included inside the returning artifacts
     * @param withScanOverview Specify whether the scan overview is included inside the returning artifacts
     * @param withSbomOverview Specify whether the SBOM overview is included in returning artifacts, when this option is true, the SBOM overview will be included in the response
     * @param withImmutableStatus Specify whether the immutable status is included inside the tags of the returning artifacts. Only works when setting \&quot;with_immutable_status&#x3D;true\&quot;
     * @param withAccessory Specify whether the accessories are included of the returning artifacts. Only works when setting \&quot;with_accessory&#x3D;true\&quot;
     * @return ResponseEntity&lt;List&lt;Artifact&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Artifact>> listArtifactsWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String xAcceptVulnerabilities, @jakarta.annotation.Nullable Boolean withTag, @jakarta.annotation.Nullable Boolean withLabel, @jakarta.annotation.Nullable Boolean withScanOverview, @jakarta.annotation.Nullable Boolean withSbomOverview, @jakarta.annotation.Nullable Boolean withImmutableStatus, @jakarta.annotation.Nullable Boolean withAccessory) throws RestClientResponseException {
        ParameterizedTypeReference<List<Artifact>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listArtifactsRequestCreation(projectName, repositoryName, xRequestId, q, sort, page, pageSize, xAcceptVulnerabilities, withTag, withLabel, withScanOverview, withSbomOverview, withImmutableStatus, withAccessory).toEntity(localVarReturnType);
    }

    /**
     * List artifacts
     * List artifacts under the specific project and repository. Except the basic properties, the other supported queries in \&quot;q\&quot; includes \&quot;tags&#x3D;*\&quot; to list only tagged artifacts, \&quot;tags&#x3D;nil\&quot; to list only untagged artifacts, \&quot;tags&#x3D;~v\&quot; to list artifacts whose tag fuzzy matches \&quot;v\&quot;, \&quot;tags&#x3D;v\&quot; to list artifact whose tag exactly matches \&quot;v\&quot;, \&quot;labels&#x3D;(id1, id2)\&quot; to list artifacts that both labels with id1 and id2 are added to
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param xAcceptVulnerabilities A comma-separated lists of MIME types for the scan report or scan summary. The first mime type will be used when the report found for it. Currently the mime type supports &#39;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0&#39; and &#39;application/vnd.security.vulnerability.report; version&#x3D;1.1&#39;
     * @param withTag Specify whether the tags are included inside the returning artifacts
     * @param withLabel Specify whether the labels are included inside the returning artifacts
     * @param withScanOverview Specify whether the scan overview is included inside the returning artifacts
     * @param withSbomOverview Specify whether the SBOM overview is included in returning artifacts, when this option is true, the SBOM overview will be included in the response
     * @param withImmutableStatus Specify whether the immutable status is included inside the tags of the returning artifacts. Only works when setting \&quot;with_immutable_status&#x3D;true\&quot;
     * @param withAccessory Specify whether the accessories are included of the returning artifacts. Only works when setting \&quot;with_accessory&#x3D;true\&quot;
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listArtifactsWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String xAcceptVulnerabilities, @jakarta.annotation.Nullable Boolean withTag, @jakarta.annotation.Nullable Boolean withLabel, @jakarta.annotation.Nullable Boolean withScanOverview, @jakarta.annotation.Nullable Boolean withSbomOverview, @jakarta.annotation.Nullable Boolean withImmutableStatus, @jakarta.annotation.Nullable Boolean withAccessory) throws RestClientResponseException {
        return listArtifactsRequestCreation(projectName, repositoryName, xRequestId, q, sort, page, pageSize, xAcceptVulnerabilities, withTag, withLabel, withScanOverview, withSbomOverview, withImmutableStatus, withAccessory);
    }

    /**
     * List tags
     * List tags of the specific artifact
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param withImmutableStatus Specify whether the immutable status is included inside the returning tags
     * @return List&lt;Tag&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listTagsRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable Boolean withImmutableStatus) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling listTags", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling listTags", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reference' is set
        if (reference == null) {
            throw new RestClientResponseException("Missing the required parameter 'reference' when calling listTags", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);
        pathParams.put("reference", reference);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_immutable_status", withImmutableStatus));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<Tag>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/tags", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List tags
     * List tags of the specific artifact
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param withImmutableStatus Specify whether the immutable status is included inside the returning tags
     * @return List&lt;Tag&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Tag> listTags(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable Boolean withImmutableStatus) throws RestClientResponseException {
        ParameterizedTypeReference<List<Tag>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listTagsRequestCreation(projectName, repositoryName, reference, xRequestId, q, sort, page, pageSize, withImmutableStatus).body(localVarReturnType);
    }

    /**
     * List tags
     * List tags of the specific artifact
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param withImmutableStatus Specify whether the immutable status is included inside the returning tags
     * @return ResponseEntity&lt;List&lt;Tag&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Tag>> listTagsWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable Boolean withImmutableStatus) throws RestClientResponseException {
        ParameterizedTypeReference<List<Tag>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listTagsRequestCreation(projectName, repositoryName, reference, xRequestId, q, sort, page, pageSize, withImmutableStatus).toEntity(localVarReturnType);
    }

    /**
     * List tags
     * List tags of the specific artifact
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @param withImmutableStatus Specify whether the immutable status is included inside the returning tags
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listTagsWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable Boolean withImmutableStatus) throws RestClientResponseException {
        return listTagsRequestCreation(projectName, repositoryName, reference, xRequestId, q, sort, page, pageSize, withImmutableStatus);
    }

    /**
     * Remove label from artifact
     * Remove the label from the specified artiact.
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param labelId The ID of the label that removed from the artifact.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec removeLabelRequestCreation(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull Long labelId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectName' when calling removeLabel", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'repositoryName' is set
        if (repositoryName == null) {
            throw new RestClientResponseException("Missing the required parameter 'repositoryName' when calling removeLabel", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reference' is set
        if (reference == null) {
            throw new RestClientResponseException("Missing the required parameter 'reference' when calling removeLabel", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'labelId' is set
        if (labelId == null) {
            throw new RestClientResponseException("Missing the required parameter 'labelId' when calling removeLabel", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name", projectName);
        pathParams.put("repository_name", repositoryName);
        pathParams.put("reference", reference);
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
        return apiClient.invokeAPI("/projects/{project_name}/repositories/{repository_name}/artifacts/{reference}/labels/{label_id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove label from artifact
     * Remove the label from the specified artiact.
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param labelId The ID of the label that removed from the artifact.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void removeLabel(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull Long labelId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        removeLabelRequestCreation(projectName, repositoryName, reference, labelId, xRequestId).body(localVarReturnType);
    }

    /**
     * Remove label from artifact
     * Remove the label from the specified artiact.
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param labelId The ID of the label that removed from the artifact.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> removeLabelWithHttpInfo(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull Long labelId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return removeLabelRequestCreation(projectName, repositoryName, reference, labelId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Remove label from artifact
     * Remove the label from the specified artiact.
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectName The name of the project
     * @param repositoryName The name of the repository. If it contains slash, encode it twice over with URL encoding. e.g. a/b -&gt; a%2Fb -&gt; a%252Fb
     * @param reference The reference of the artifact, can be digest or tag
     * @param labelId The ID of the label that removed from the artifact.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec removeLabelWithResponseSpec(@jakarta.annotation.Nonnull String projectName, @jakarta.annotation.Nonnull String repositoryName, @jakarta.annotation.Nonnull String reference, @jakarta.annotation.Nonnull Long labelId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return removeLabelRequestCreation(projectName, repositoryName, reference, labelId, xRequestId);
    }
}
