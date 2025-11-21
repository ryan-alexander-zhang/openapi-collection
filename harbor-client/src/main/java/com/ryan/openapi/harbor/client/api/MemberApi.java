package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.ProjectMember;
import com.ryan.openapi.harbor.client.model.ProjectMemberEntity;
import com.ryan.openapi.harbor.client.model.RoleRequest;

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
@Component("com.ryan.openapi.harbor.client.api.MemberApi")
public class MemberApi {
    private ApiClient apiClient;

    public MemberApi() {
        this(new ApiClient());
    }

    @Autowired
    public MemberApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create project member
     * Create project member relationship, the member can be one of the user_member and group_member,  The user_member need to specify user_id or username. If the user already exist in harbor DB, specify the user_id,  If does not exist in harbor DB, it will SearchAndOnBoard the user. The group_member need to specify id or ldap_group_dn. If the group already exist in harbor DB. specify the user group&#39;s id,  If does not exist, it will SearchAndOnBoard the group. 
     * <p><b>201</b> - Project member created successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param projectMember The projectMember parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createProjectMemberRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable ProjectMember projectMember) throws RestClientResponseException {
        Object postBody = projectMember;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling createProjectMember", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xIsResourceName != null)
        headerParams.add("X-Is-Resource-Name", apiClient.parameterToString(xIsResourceName));
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
        return apiClient.invokeAPI("/projects/{project_name_or_id}/members", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create project member
     * Create project member relationship, the member can be one of the user_member and group_member,  The user_member need to specify user_id or username. If the user already exist in harbor DB, specify the user_id,  If does not exist in harbor DB, it will SearchAndOnBoard the user. The group_member need to specify id or ldap_group_dn. If the group already exist in harbor DB. specify the user group&#39;s id,  If does not exist, it will SearchAndOnBoard the group. 
     * <p><b>201</b> - Project member created successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param projectMember The projectMember parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void createProjectMember(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable ProjectMember projectMember) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        createProjectMemberRequestCreation(projectNameOrId, xRequestId, xIsResourceName, projectMember).body(localVarReturnType);
    }

    /**
     * Create project member
     * Create project member relationship, the member can be one of the user_member and group_member,  The user_member need to specify user_id or username. If the user already exist in harbor DB, specify the user_id,  If does not exist in harbor DB, it will SearchAndOnBoard the user. The group_member need to specify id or ldap_group_dn. If the group already exist in harbor DB. specify the user group&#39;s id,  If does not exist, it will SearchAndOnBoard the group. 
     * <p><b>201</b> - Project member created successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param projectMember The projectMember parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createProjectMemberWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable ProjectMember projectMember) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createProjectMemberRequestCreation(projectNameOrId, xRequestId, xIsResourceName, projectMember).toEntity(localVarReturnType);
    }

    /**
     * Create project member
     * Create project member relationship, the member can be one of the user_member and group_member,  The user_member need to specify user_id or username. If the user already exist in harbor DB, specify the user_id,  If does not exist in harbor DB, it will SearchAndOnBoard the user. The group_member need to specify id or ldap_group_dn. If the group already exist in harbor DB. specify the user group&#39;s id,  If does not exist, it will SearchAndOnBoard the group. 
     * <p><b>201</b> - Project member created successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param projectMember The projectMember parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createProjectMemberWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable ProjectMember projectMember) throws RestClientResponseException {
        return createProjectMemberRequestCreation(projectNameOrId, xRequestId, xIsResourceName, projectMember);
    }

    /**
     * Delete project member
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param mid Member ID.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteProjectMemberRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long mid, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling deleteProjectMember", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'mid' is set
        if (mid == null) {
            throw new RestClientResponseException("Missing the required parameter 'mid' when calling deleteProjectMember", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);
        pathParams.put("mid", mid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xIsResourceName != null)
        headerParams.add("X-Is-Resource-Name", apiClient.parameterToString(xIsResourceName));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/members/{mid}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete project member
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param mid Member ID.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteProjectMember(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long mid, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteProjectMemberRequestCreation(projectNameOrId, mid, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Delete project member
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param mid Member ID.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteProjectMemberWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long mid, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteProjectMemberRequestCreation(projectNameOrId, mid, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Delete project member
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param mid Member ID.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteProjectMemberWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long mid, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return deleteProjectMemberRequestCreation(projectNameOrId, mid, xRequestId, xIsResourceName);
    }

    /**
     * Get the project member information
     * Get the project member information
     * <p><b>200</b> - Project member retrieved successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param mid The member ID
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ProjectMemberEntity
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getProjectMemberRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long mid, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling getProjectMember", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'mid' is set
        if (mid == null) {
            throw new RestClientResponseException("Missing the required parameter 'mid' when calling getProjectMember", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);
        pathParams.put("mid", mid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xIsResourceName != null)
        headerParams.add("X-Is-Resource-Name", apiClient.parameterToString(xIsResourceName));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<ProjectMemberEntity> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/members/{mid}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the project member information
     * Get the project member information
     * <p><b>200</b> - Project member retrieved successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param mid The member ID
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ProjectMemberEntity
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ProjectMemberEntity getProjectMember(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long mid, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<ProjectMemberEntity> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProjectMemberRequestCreation(projectNameOrId, mid, xRequestId, xIsResourceName).body(localVarReturnType);
    }

    /**
     * Get the project member information
     * Get the project member information
     * <p><b>200</b> - Project member retrieved successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param mid The member ID
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseEntity&lt;ProjectMemberEntity&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectMemberEntity> getProjectMemberWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long mid, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        ParameterizedTypeReference<ProjectMemberEntity> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProjectMemberRequestCreation(projectNameOrId, mid, xRequestId, xIsResourceName).toEntity(localVarReturnType);
    }

    /**
     * Get the project member information
     * Get the project member information
     * <p><b>200</b> - Project member retrieved successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param mid The member ID
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getProjectMemberWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long mid, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName) throws RestClientResponseException {
        return getProjectMemberRequestCreation(projectNameOrId, mid, xRequestId, xIsResourceName);
    }

    /**
     * Get all project member information
     * Get all project member information
     * <p><b>200</b> - Get project members successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param page The page number
     * @param pageSize The size of per page
     * @param entityname The entity name to search.
     * @return List&lt;ProjectMemberEntity&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listProjectMembersRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String entityname) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling listProjectMembers", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entityname", entityname));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xIsResourceName != null)
        headerParams.add("X-Is-Resource-Name", apiClient.parameterToString(xIsResourceName));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<ProjectMemberEntity>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/projects/{project_name_or_id}/members", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all project member information
     * Get all project member information
     * <p><b>200</b> - Get project members successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param page The page number
     * @param pageSize The size of per page
     * @param entityname The entity name to search.
     * @return List&lt;ProjectMemberEntity&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<ProjectMemberEntity> listProjectMembers(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String entityname) throws RestClientResponseException {
        ParameterizedTypeReference<List<ProjectMemberEntity>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listProjectMembersRequestCreation(projectNameOrId, xRequestId, xIsResourceName, page, pageSize, entityname).body(localVarReturnType);
    }

    /**
     * Get all project member information
     * Get all project member information
     * <p><b>200</b> - Get project members successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param page The page number
     * @param pageSize The size of per page
     * @param entityname The entity name to search.
     * @return ResponseEntity&lt;List&lt;ProjectMemberEntity&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ProjectMemberEntity>> listProjectMembersWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String entityname) throws RestClientResponseException {
        ParameterizedTypeReference<List<ProjectMemberEntity>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listProjectMembersRequestCreation(projectNameOrId, xRequestId, xIsResourceName, page, pageSize, entityname).toEntity(localVarReturnType);
    }

    /**
     * Get all project member information
     * Get all project member information
     * <p><b>200</b> - Get project members successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param page The page number
     * @param pageSize The size of per page
     * @param entityname The entity name to search.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listProjectMembersWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String entityname) throws RestClientResponseException {
        return listProjectMembersRequestCreation(projectNameOrId, xRequestId, xIsResourceName, page, pageSize, entityname);
    }

    /**
     * Update project member
     * Update project member relationship
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param mid Member ID.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param role The role parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateProjectMemberRequestCreation(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long mid, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable RoleRequest role) throws RestClientResponseException {
        Object postBody = role;
        // verify the required parameter 'projectNameOrId' is set
        if (projectNameOrId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectNameOrId' when calling updateProjectMember", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'mid' is set
        if (mid == null) {
            throw new RestClientResponseException("Missing the required parameter 'mid' when calling updateProjectMember", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("project_name_or_id", projectNameOrId);
        pathParams.put("mid", mid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        if (xIsResourceName != null)
        headerParams.add("X-Is-Resource-Name", apiClient.parameterToString(xIsResourceName));
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
        return apiClient.invokeAPI("/projects/{project_name_or_id}/members/{mid}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update project member
     * Update project member relationship
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param mid Member ID.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param role The role parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateProjectMember(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long mid, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable RoleRequest role) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateProjectMemberRequestCreation(projectNameOrId, mid, xRequestId, xIsResourceName, role).body(localVarReturnType);
    }

    /**
     * Update project member
     * Update project member relationship
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param mid Member ID.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param role The role parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateProjectMemberWithHttpInfo(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long mid, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable RoleRequest role) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateProjectMemberRequestCreation(projectNameOrId, mid, xRequestId, xIsResourceName, role).toEntity(localVarReturnType);
    }

    /**
     * Update project member
     * Update project member relationship
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param projectNameOrId The name or id of the project
     * @param mid Member ID.
     * @param xRequestId An unique ID for the request
     * @param xIsResourceName The flag to indicate whether the parameter which supports both name and id in the path is the name of the resource. When the X-Is-Resource-Name is false and the parameter can be converted to an integer, the parameter will be as an id, otherwise, it will be as a name.
     * @param role The role parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateProjectMemberWithResponseSpec(@jakarta.annotation.Nonnull String projectNameOrId, @jakarta.annotation.Nonnull Long mid, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean xIsResourceName, @jakarta.annotation.Nullable RoleRequest role) throws RestClientResponseException {
        return updateProjectMemberRequestCreation(projectNameOrId, mid, xRequestId, xIsResourceName, role);
    }
}
