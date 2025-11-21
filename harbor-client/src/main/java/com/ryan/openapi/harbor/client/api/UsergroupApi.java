package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.UserGroup;
import com.ryan.openapi.harbor.client.model.UserGroupSearchItem;

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
@Component("com.ryan.openapi.harbor.client.api.UsergroupApi")
public class UsergroupApi {
    private ApiClient apiClient;

    public UsergroupApi() {
        this(new ApiClient());
    }

    @Autowired
    public UsergroupApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create user group
     * Create user group information
     * <p><b>201</b> - User group created successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param usergroup The usergroup parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createUserGroupRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable UserGroup usergroup) throws RestClientResponseException {
        Object postBody = usergroup;
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
        return apiClient.invokeAPI("/usergroups", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create user group
     * Create user group information
     * <p><b>201</b> - User group created successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param usergroup The usergroup parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void createUserGroup(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable UserGroup usergroup) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        createUserGroupRequestCreation(xRequestId, usergroup).body(localVarReturnType);
    }

    /**
     * Create user group
     * Create user group information
     * <p><b>201</b> - User group created successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param usergroup The usergroup parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createUserGroupWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable UserGroup usergroup) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createUserGroupRequestCreation(xRequestId, usergroup).toEntity(localVarReturnType);
    }

    /**
     * Create user group
     * Create user group information
     * <p><b>201</b> - User group created successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param usergroup The usergroup parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createUserGroupWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable UserGroup usergroup) throws RestClientResponseException {
        return createUserGroupRequestCreation(xRequestId, usergroup);
    }

    /**
     * Delete user group
     * Delete user group
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param groupId The groupId parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteUserGroupRequestCreation(@jakarta.annotation.Nonnull Integer groupId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new RestClientResponseException("Missing the required parameter 'groupId' when calling deleteUserGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("group_id", groupId);

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
        return apiClient.invokeAPI("/usergroups/{group_id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete user group
     * Delete user group
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param groupId The groupId parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteUserGroup(@jakarta.annotation.Nonnull Integer groupId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteUserGroupRequestCreation(groupId, xRequestId).body(localVarReturnType);
    }

    /**
     * Delete user group
     * Delete user group
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param groupId The groupId parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteUserGroupWithHttpInfo(@jakarta.annotation.Nonnull Integer groupId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteUserGroupRequestCreation(groupId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Delete user group
     * Delete user group
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param groupId The groupId parameter
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteUserGroupWithResponseSpec(@jakarta.annotation.Nonnull Integer groupId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return deleteUserGroupRequestCreation(groupId, xRequestId);
    }

    /**
     * Get user group information
     * Get user group information
     * <p><b>200</b> - User group get successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param groupId Group ID
     * @param xRequestId An unique ID for the request
     * @return UserGroup
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getUserGroupRequestCreation(@jakarta.annotation.Nonnull Long groupId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new RestClientResponseException("Missing the required parameter 'groupId' when calling getUserGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("group_id", groupId);

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

        ParameterizedTypeReference<UserGroup> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/usergroups/{group_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get user group information
     * Get user group information
     * <p><b>200</b> - User group get successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param groupId Group ID
     * @param xRequestId An unique ID for the request
     * @return UserGroup
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public UserGroup getUserGroup(@jakarta.annotation.Nonnull Long groupId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<UserGroup> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getUserGroupRequestCreation(groupId, xRequestId).body(localVarReturnType);
    }

    /**
     * Get user group information
     * Get user group information
     * <p><b>200</b> - User group get successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param groupId Group ID
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;UserGroup&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserGroup> getUserGroupWithHttpInfo(@jakarta.annotation.Nonnull Long groupId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<UserGroup> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getUserGroupRequestCreation(groupId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get user group information
     * Get user group information
     * <p><b>200</b> - User group get successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param groupId Group ID
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getUserGroupWithResponseSpec(@jakarta.annotation.Nonnull Long groupId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getUserGroupRequestCreation(groupId, xRequestId);
    }

    /**
     * Get all user groups information
     * Get all user groups information, it is open for system admin
     * <p><b>200</b> - Get user group successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param ldapGroupDn search with ldap group DN
     * @param groupName group name need to search, fuzzy matches
     * @return List&lt;UserGroup&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listUserGroupsRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String ldapGroupDn, @jakarta.annotation.Nullable String groupName) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ldap_group_dn", ldapGroupDn));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "group_name", groupName));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<UserGroup>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/usergroups", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all user groups information
     * Get all user groups information, it is open for system admin
     * <p><b>200</b> - Get user group successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param ldapGroupDn search with ldap group DN
     * @param groupName group name need to search, fuzzy matches
     * @return List&lt;UserGroup&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<UserGroup> listUserGroups(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String ldapGroupDn, @jakarta.annotation.Nullable String groupName) throws RestClientResponseException {
        ParameterizedTypeReference<List<UserGroup>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listUserGroupsRequestCreation(xRequestId, page, pageSize, ldapGroupDn, groupName).body(localVarReturnType);
    }

    /**
     * Get all user groups information
     * Get all user groups information, it is open for system admin
     * <p><b>200</b> - Get user group successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param ldapGroupDn search with ldap group DN
     * @param groupName group name need to search, fuzzy matches
     * @return ResponseEntity&lt;List&lt;UserGroup&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UserGroup>> listUserGroupsWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String ldapGroupDn, @jakarta.annotation.Nullable String groupName) throws RestClientResponseException {
        ParameterizedTypeReference<List<UserGroup>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listUserGroupsRequestCreation(xRequestId, page, pageSize, ldapGroupDn, groupName).toEntity(localVarReturnType);
    }

    /**
     * Get all user groups information
     * Get all user groups information, it is open for system admin
     * <p><b>200</b> - Get user group successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @param ldapGroupDn search with ldap group DN
     * @param groupName group name need to search, fuzzy matches
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listUserGroupsWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable String ldapGroupDn, @jakarta.annotation.Nullable String groupName) throws RestClientResponseException {
        return listUserGroupsRequestCreation(xRequestId, page, pageSize, ldapGroupDn, groupName);
    }

    /**
     * Search groups by groupname
     * This endpoint is to search groups by group name.  It&#39;s open for all authenticated requests. 
     * <p><b>200</b> - Search groups successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param groupname Group name for filtering results.
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;UserGroupSearchItem&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec searchUserGroupsRequestCreation(@jakarta.annotation.Nonnull String groupname, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'groupname' is set
        if (groupname == null) {
            throw new RestClientResponseException("Missing the required parameter 'groupname' when calling searchUserGroups", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupname", groupname));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<UserGroupSearchItem>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/usergroups/search", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search groups by groupname
     * This endpoint is to search groups by group name.  It&#39;s open for all authenticated requests. 
     * <p><b>200</b> - Search groups successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param groupname Group name for filtering results.
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;UserGroupSearchItem&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<UserGroupSearchItem> searchUserGroups(@jakarta.annotation.Nonnull String groupname, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<UserGroupSearchItem>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return searchUserGroupsRequestCreation(groupname, xRequestId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Search groups by groupname
     * This endpoint is to search groups by group name.  It&#39;s open for all authenticated requests. 
     * <p><b>200</b> - Search groups successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param groupname Group name for filtering results.
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseEntity&lt;List&lt;UserGroupSearchItem&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UserGroupSearchItem>> searchUserGroupsWithHttpInfo(@jakarta.annotation.Nonnull String groupname, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<UserGroupSearchItem>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return searchUserGroupsRequestCreation(groupname, xRequestId, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Search groups by groupname
     * This endpoint is to search groups by group name.  It&#39;s open for all authenticated requests. 
     * <p><b>200</b> - Search groups successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param groupname Group name for filtering results.
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec searchUserGroupsWithResponseSpec(@jakarta.annotation.Nonnull String groupname, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        return searchUserGroupsRequestCreation(groupname, xRequestId, page, pageSize);
    }

    /**
     * Update group information
     * Update user group information
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param groupId Group ID
     * @param xRequestId An unique ID for the request
     * @param usergroup The usergroup parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateUserGroupRequestCreation(@jakarta.annotation.Nonnull Long groupId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable UserGroup usergroup) throws RestClientResponseException {
        Object postBody = usergroup;
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new RestClientResponseException("Missing the required parameter 'groupId' when calling updateUserGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("group_id", groupId);

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
        return apiClient.invokeAPI("/usergroups/{group_id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update group information
     * Update user group information
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param groupId Group ID
     * @param xRequestId An unique ID for the request
     * @param usergroup The usergroup parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateUserGroup(@jakarta.annotation.Nonnull Long groupId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable UserGroup usergroup) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateUserGroupRequestCreation(groupId, xRequestId, usergroup).body(localVarReturnType);
    }

    /**
     * Update group information
     * Update user group information
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param groupId Group ID
     * @param xRequestId An unique ID for the request
     * @param usergroup The usergroup parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateUserGroupWithHttpInfo(@jakarta.annotation.Nonnull Long groupId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable UserGroup usergroup) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateUserGroupRequestCreation(groupId, xRequestId, usergroup).toEntity(localVarReturnType);
    }

    /**
     * Update group information
     * Update user group information
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param groupId Group ID
     * @param xRequestId An unique ID for the request
     * @param usergroup The usergroup parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateUserGroupWithResponseSpec(@jakarta.annotation.Nonnull Long groupId, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable UserGroup usergroup) throws RestClientResponseException {
        return updateUserGroupRequestCreation(groupId, xRequestId, usergroup);
    }
}
