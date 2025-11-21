package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.OIDCCliSecretReq;
import com.ryan.openapi.harbor.client.model.PasswordReq;
import com.ryan.openapi.harbor.client.model.Permission;
import com.ryan.openapi.harbor.client.model.UserCreationReq;
import com.ryan.openapi.harbor.client.model.UserProfile;
import com.ryan.openapi.harbor.client.model.UserResp;
import com.ryan.openapi.harbor.client.model.UserSearchRespItem;
import com.ryan.openapi.harbor.client.model.UserSysAdminFlag;

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
public class UserApi {
    private ApiClient apiClient;

    public UserApi() {
        this(new ApiClient());
    }

    public UserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a local user.
     * This API can be used only when the authentication mode is for local DB.  When self registration is disabled.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - When the  self registration is disabled, non-admin does not have permission to create user.  When self registration is enabled, this API can only be called from UI portal, calling it via script will get a 403 error.
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param userReq The new user
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createUserRequestCreation(@jakarta.annotation.Nonnull UserCreationReq userReq, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = userReq;
        // verify the required parameter 'userReq' is set
        if (userReq == null) {
            throw new RestClientResponseException("Missing the required parameter 'userReq' when calling createUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/users", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a local user.
     * This API can be used only when the authentication mode is for local DB.  When self registration is disabled.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - When the  self registration is disabled, non-admin does not have permission to create user.  When self registration is enabled, this API can only be called from UI portal, calling it via script will get a 403 error.
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param userReq The new user
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void createUser(@jakarta.annotation.Nonnull UserCreationReq userReq, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        createUserRequestCreation(userReq, xRequestId).body(localVarReturnType);
    }

    /**
     * Create a local user.
     * This API can be used only when the authentication mode is for local DB.  When self registration is disabled.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - When the  self registration is disabled, non-admin does not have permission to create user.  When self registration is enabled, this API can only be called from UI portal, calling it via script will get a 403 error.
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param userReq The new user
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createUserWithHttpInfo(@jakarta.annotation.Nonnull UserCreationReq userReq, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createUserRequestCreation(userReq, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Create a local user.
     * This API can be used only when the authentication mode is for local DB.  When self registration is disabled.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - When the  self registration is disabled, non-admin does not have permission to create user.  When self registration is enabled, this API can only be called from UI portal, calling it via script will get a 403 error.
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param userReq The new user
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createUserWithResponseSpec(@jakarta.annotation.Nonnull UserCreationReq userReq, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return createUserRequestCreation(userReq, xRequestId);
    }

    /**
     * Mark a registered user as be removed.
     * This endpoint let administrator of Harbor mark a registered user as removed.It actually won&#39;t be deleted from DB. 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param userId User ID for marking as to be removed.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteUserRequestCreation(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new RestClientResponseException("Missing the required parameter 'userId' when calling deleteUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("user_id", userId);

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
        return apiClient.invokeAPI("/users/{user_id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Mark a registered user as be removed.
     * This endpoint let administrator of Harbor mark a registered user as removed.It actually won&#39;t be deleted from DB. 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param userId User ID for marking as to be removed.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteUser(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteUserRequestCreation(userId, xRequestId).body(localVarReturnType);
    }

    /**
     * Mark a registered user as be removed.
     * This endpoint let administrator of Harbor mark a registered user as removed.It actually won&#39;t be deleted from DB. 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param userId User ID for marking as to be removed.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteUserWithHttpInfo(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteUserRequestCreation(userId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Mark a registered user as be removed.
     * This endpoint let administrator of Harbor mark a registered user as removed.It actually won&#39;t be deleted from DB. 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param userId User ID for marking as to be removed.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteUserWithResponseSpec(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return deleteUserRequestCreation(userId, xRequestId);
    }

    /**
     * Get current user info.
     * 
     * <p><b>200</b> - Get current user information successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return UserResp
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCurrentUserInfoRequestCreation(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
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

        ParameterizedTypeReference<UserResp> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/users/current", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get current user info.
     * 
     * <p><b>200</b> - Get current user information successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return UserResp
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public UserResp getCurrentUserInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<UserResp> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getCurrentUserInfoRequestCreation(xRequestId).body(localVarReturnType);
    }

    /**
     * Get current user info.
     * 
     * <p><b>200</b> - Get current user information successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;UserResp&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserResp> getCurrentUserInfoWithHttpInfo(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<UserResp> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getCurrentUserInfoRequestCreation(xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get current user info.
     * 
     * <p><b>200</b> - Get current user information successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCurrentUserInfoWithResponseSpec(@jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getCurrentUserInfoRequestCreation(xRequestId);
    }

    /**
     * Get current user permissions.
     * 
     * <p><b>200</b> - Get current user permission successfully.
     * <p><b>401</b> - User need to log in first.
     * <p><b>500</b> - Internal errors.
     * @param xRequestId An unique ID for the request
     * @param scope The scope for the permission
     * @param relative If true, the resources in the response are relative to the scope, eg for resource &#39;/project/1/repository&#39; if relative is &#39;true&#39; then the resource in response will be &#39;repository&#39;. 
     * @return List&lt;Permission&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCurrentUserPermissionsRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String scope, @jakarta.annotation.Nullable Boolean relative) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "scope", scope));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "relative", relative));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<Permission>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/users/current/permissions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get current user permissions.
     * 
     * <p><b>200</b> - Get current user permission successfully.
     * <p><b>401</b> - User need to log in first.
     * <p><b>500</b> - Internal errors.
     * @param xRequestId An unique ID for the request
     * @param scope The scope for the permission
     * @param relative If true, the resources in the response are relative to the scope, eg for resource &#39;/project/1/repository&#39; if relative is &#39;true&#39; then the resource in response will be &#39;repository&#39;. 
     * @return List&lt;Permission&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Permission> getCurrentUserPermissions(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String scope, @jakarta.annotation.Nullable Boolean relative) throws RestClientResponseException {
        ParameterizedTypeReference<List<Permission>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getCurrentUserPermissionsRequestCreation(xRequestId, scope, relative).body(localVarReturnType);
    }

    /**
     * Get current user permissions.
     * 
     * <p><b>200</b> - Get current user permission successfully.
     * <p><b>401</b> - User need to log in first.
     * <p><b>500</b> - Internal errors.
     * @param xRequestId An unique ID for the request
     * @param scope The scope for the permission
     * @param relative If true, the resources in the response are relative to the scope, eg for resource &#39;/project/1/repository&#39; if relative is &#39;true&#39; then the resource in response will be &#39;repository&#39;. 
     * @return ResponseEntity&lt;List&lt;Permission&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Permission>> getCurrentUserPermissionsWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String scope, @jakarta.annotation.Nullable Boolean relative) throws RestClientResponseException {
        ParameterizedTypeReference<List<Permission>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getCurrentUserPermissionsRequestCreation(xRequestId, scope, relative).toEntity(localVarReturnType);
    }

    /**
     * Get current user permissions.
     * 
     * <p><b>200</b> - Get current user permission successfully.
     * <p><b>401</b> - User need to log in first.
     * <p><b>500</b> - Internal errors.
     * @param xRequestId An unique ID for the request
     * @param scope The scope for the permission
     * @param relative If true, the resources in the response are relative to the scope, eg for resource &#39;/project/1/repository&#39; if relative is &#39;true&#39; then the resource in response will be &#39;repository&#39;. 
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCurrentUserPermissionsWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String scope, @jakarta.annotation.Nullable Boolean relative) throws RestClientResponseException {
        return getCurrentUserPermissionsRequestCreation(xRequestId, scope, relative);
    }

    /**
     * Get a user&#39;s profile.
     * 
     * <p><b>200</b> - Get user&#39;s info successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param userId The userId parameter
     * @param xRequestId An unique ID for the request
     * @return UserResp
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getUserRequestCreation(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new RestClientResponseException("Missing the required parameter 'userId' when calling getUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("user_id", userId);

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

        ParameterizedTypeReference<UserResp> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/users/{user_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a user&#39;s profile.
     * 
     * <p><b>200</b> - Get user&#39;s info successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param userId The userId parameter
     * @param xRequestId An unique ID for the request
     * @return UserResp
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public UserResp getUser(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<UserResp> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getUserRequestCreation(userId, xRequestId).body(localVarReturnType);
    }

    /**
     * Get a user&#39;s profile.
     * 
     * <p><b>200</b> - Get user&#39;s info successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param userId The userId parameter
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;UserResp&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserResp> getUserWithHttpInfo(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<UserResp> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getUserRequestCreation(userId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get a user&#39;s profile.
     * 
     * <p><b>200</b> - Get user&#39;s info successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param userId The userId parameter
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getUserWithResponseSpec(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getUserRequestCreation(userId, xRequestId);
    }

    /**
     * List users
     * 
     * <p><b>200</b> - return the list of users.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;UserResp&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listUsersRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
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

        ParameterizedTypeReference<List<UserResp>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/users", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List users
     * 
     * <p><b>200</b> - return the list of users.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;UserResp&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<UserResp> listUsers(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<UserResp>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listUsersRequestCreation(xRequestId, q, sort, page, pageSize).body(localVarReturnType);
    }

    /**
     * List users
     * 
     * <p><b>200</b> - return the list of users.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseEntity&lt;List&lt;UserResp&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UserResp>> listUsersWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<UserResp>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listUsersRequestCreation(xRequestId, q, sort, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * List users
     * 
     * <p><b>200</b> - return the list of users.
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
    public ResponseSpec listUsersWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        return listUsersRequestCreation(xRequestId, q, sort, page, pageSize);
    }

    /**
     * Search users by username
     * This endpoint is to search the users by username.  It&#39;s open for all authenticated requests. 
     * <p><b>200</b> - Search users by username successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param username Username for filtering results.
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;UserSearchRespItem&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec searchUsersRequestCreation(@jakarta.annotation.Nonnull String username, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new RestClientResponseException("Missing the required parameter 'username' when calling searchUsers", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "username", username));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<UserSearchRespItem>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/users/search", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search users by username
     * This endpoint is to search the users by username.  It&#39;s open for all authenticated requests. 
     * <p><b>200</b> - Search users by username successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param username Username for filtering results.
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;UserSearchRespItem&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<UserSearchRespItem> searchUsers(@jakarta.annotation.Nonnull String username, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<UserSearchRespItem>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return searchUsersRequestCreation(username, xRequestId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Search users by username
     * This endpoint is to search the users by username.  It&#39;s open for all authenticated requests. 
     * <p><b>200</b> - Search users by username successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param username Username for filtering results.
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseEntity&lt;List&lt;UserSearchRespItem&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UserSearchRespItem>> searchUsersWithHttpInfo(@jakarta.annotation.Nonnull String username, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<UserSearchRespItem>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return searchUsersRequestCreation(username, xRequestId, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Search users by username
     * This endpoint is to search the users by username.  It&#39;s open for all authenticated requests. 
     * <p><b>200</b> - Search users by username successfully.
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param username Username for filtering results.
     * @param xRequestId An unique ID for the request
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec searchUsersWithResponseSpec(@jakarta.annotation.Nonnull String username, @jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        return searchUsersRequestCreation(username, xRequestId, page, pageSize);
    }

    /**
     * Set CLI secret for a user.
     * This endpoint let user generate a new CLI secret for himself.  This API only works when auth mode is set to &#39;OIDC&#39;. Once this API returns with successful status, the old secret will be invalid, as there will be only one CLI secret for a user.
     * <p><b>200</b> - The secret is successfully updated
     * <p><b>400</b> - Invalid user ID.  Or user is not onboarded via OIDC authentication. Or the secret does not meet the standard.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>412</b> - The auth mode of the system is not \&quot;oidc_auth\&quot;, or the user is not onboarded via OIDC AuthN.
     * <p><b>500</b> - Internal server error
     * @param userId User ID
     * @param secret The secret parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec setCliSecretRequestCreation(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nonnull OIDCCliSecretReq secret, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = secret;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new RestClientResponseException("Missing the required parameter 'userId' when calling setCliSecret", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'secret' is set
        if (secret == null) {
            throw new RestClientResponseException("Missing the required parameter 'secret' when calling setCliSecret", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("user_id", userId);

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
        return apiClient.invokeAPI("/users/{user_id}/cli_secret", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Set CLI secret for a user.
     * This endpoint let user generate a new CLI secret for himself.  This API only works when auth mode is set to &#39;OIDC&#39;. Once this API returns with successful status, the old secret will be invalid, as there will be only one CLI secret for a user.
     * <p><b>200</b> - The secret is successfully updated
     * <p><b>400</b> - Invalid user ID.  Or user is not onboarded via OIDC authentication. Or the secret does not meet the standard.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>412</b> - The auth mode of the system is not \&quot;oidc_auth\&quot;, or the user is not onboarded via OIDC AuthN.
     * <p><b>500</b> - Internal server error
     * @param userId User ID
     * @param secret The secret parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void setCliSecret(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nonnull OIDCCliSecretReq secret, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        setCliSecretRequestCreation(userId, secret, xRequestId).body(localVarReturnType);
    }

    /**
     * Set CLI secret for a user.
     * This endpoint let user generate a new CLI secret for himself.  This API only works when auth mode is set to &#39;OIDC&#39;. Once this API returns with successful status, the old secret will be invalid, as there will be only one CLI secret for a user.
     * <p><b>200</b> - The secret is successfully updated
     * <p><b>400</b> - Invalid user ID.  Or user is not onboarded via OIDC authentication. Or the secret does not meet the standard.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>412</b> - The auth mode of the system is not \&quot;oidc_auth\&quot;, or the user is not onboarded via OIDC AuthN.
     * <p><b>500</b> - Internal server error
     * @param userId User ID
     * @param secret The secret parameter
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> setCliSecretWithHttpInfo(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nonnull OIDCCliSecretReq secret, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return setCliSecretRequestCreation(userId, secret, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Set CLI secret for a user.
     * This endpoint let user generate a new CLI secret for himself.  This API only works when auth mode is set to &#39;OIDC&#39;. Once this API returns with successful status, the old secret will be invalid, as there will be only one CLI secret for a user.
     * <p><b>200</b> - The secret is successfully updated
     * <p><b>400</b> - Invalid user ID.  Or user is not onboarded via OIDC authentication. Or the secret does not meet the standard.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>412</b> - The auth mode of the system is not \&quot;oidc_auth\&quot;, or the user is not onboarded via OIDC AuthN.
     * <p><b>500</b> - Internal server error
     * @param userId User ID
     * @param secret The secret parameter
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec setCliSecretWithResponseSpec(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nonnull OIDCCliSecretReq secret, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return setCliSecretRequestCreation(userId, secret, xRequestId);
    }

    /**
     * Update a registered user to change to be an administrator of Harbor.
     * 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Unexpected internal errors.
     * @param userId The userId parameter
     * @param sysadminFlag Toggle a user to admin or not.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec setUserSysAdminRequestCreation(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nonnull UserSysAdminFlag sysadminFlag, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = sysadminFlag;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new RestClientResponseException("Missing the required parameter 'userId' when calling setUserSysAdmin", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'sysadminFlag' is set
        if (sysadminFlag == null) {
            throw new RestClientResponseException("Missing the required parameter 'sysadminFlag' when calling setUserSysAdmin", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("user_id", userId);

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
        return apiClient.invokeAPI("/users/{user_id}/sysadmin", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a registered user to change to be an administrator of Harbor.
     * 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Unexpected internal errors.
     * @param userId The userId parameter
     * @param sysadminFlag Toggle a user to admin or not.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void setUserSysAdmin(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nonnull UserSysAdminFlag sysadminFlag, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        setUserSysAdminRequestCreation(userId, sysadminFlag, xRequestId).body(localVarReturnType);
    }

    /**
     * Update a registered user to change to be an administrator of Harbor.
     * 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Unexpected internal errors.
     * @param userId The userId parameter
     * @param sysadminFlag Toggle a user to admin or not.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> setUserSysAdminWithHttpInfo(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nonnull UserSysAdminFlag sysadminFlag, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return setUserSysAdminRequestCreation(userId, sysadminFlag, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Update a registered user to change to be an administrator of Harbor.
     * 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Unexpected internal errors.
     * @param userId The userId parameter
     * @param sysadminFlag Toggle a user to admin or not.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec setUserSysAdminWithResponseSpec(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nonnull UserSysAdminFlag sysadminFlag, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return setUserSysAdminRequestCreation(userId, sysadminFlag, xRequestId);
    }

    /**
     * Change the password on a user that already exists.
     * This endpoint is for user to update password. Users with the admin role can change any user&#39;s password. Regular users can change only their own password. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Invalid user ID; Password does not meet requirement
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - The caller does not have permission to update the password of the user with given ID, or the old password in request body is not correct.
     * <p><b>500</b> - Internal server error
     * @param userId The userId parameter
     * @param password Password to be updated, the attribute &#39;old_password&#39; is optional when the API is called by the system administrator.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateUserPasswordRequestCreation(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nonnull PasswordReq password, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = password;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new RestClientResponseException("Missing the required parameter 'userId' when calling updateUserPassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new RestClientResponseException("Missing the required parameter 'password' when calling updateUserPassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("user_id", userId);

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
        return apiClient.invokeAPI("/users/{user_id}/password", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Change the password on a user that already exists.
     * This endpoint is for user to update password. Users with the admin role can change any user&#39;s password. Regular users can change only their own password. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Invalid user ID; Password does not meet requirement
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - The caller does not have permission to update the password of the user with given ID, or the old password in request body is not correct.
     * <p><b>500</b> - Internal server error
     * @param userId The userId parameter
     * @param password Password to be updated, the attribute &#39;old_password&#39; is optional when the API is called by the system administrator.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateUserPassword(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nonnull PasswordReq password, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateUserPasswordRequestCreation(userId, password, xRequestId).body(localVarReturnType);
    }

    /**
     * Change the password on a user that already exists.
     * This endpoint is for user to update password. Users with the admin role can change any user&#39;s password. Regular users can change only their own password. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Invalid user ID; Password does not meet requirement
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - The caller does not have permission to update the password of the user with given ID, or the old password in request body is not correct.
     * <p><b>500</b> - Internal server error
     * @param userId The userId parameter
     * @param password Password to be updated, the attribute &#39;old_password&#39; is optional when the API is called by the system administrator.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateUserPasswordWithHttpInfo(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nonnull PasswordReq password, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateUserPasswordRequestCreation(userId, password, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Change the password on a user that already exists.
     * This endpoint is for user to update password. Users with the admin role can change any user&#39;s password. Regular users can change only their own password. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Invalid user ID; Password does not meet requirement
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - The caller does not have permission to update the password of the user with given ID, or the old password in request body is not correct.
     * <p><b>500</b> - Internal server error
     * @param userId The userId parameter
     * @param password Password to be updated, the attribute &#39;old_password&#39; is optional when the API is called by the system administrator.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateUserPasswordWithResponseSpec(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nonnull PasswordReq password, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return updateUserPasswordRequestCreation(userId, password, xRequestId);
    }

    /**
     * Update user&#39;s profile.
     * 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param userId Registered user ID
     * @param profile Only email, realname and comment can be modified.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateUserProfileRequestCreation(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nonnull UserProfile profile, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = profile;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new RestClientResponseException("Missing the required parameter 'userId' when calling updateUserProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profile' is set
        if (profile == null) {
            throw new RestClientResponseException("Missing the required parameter 'profile' when calling updateUserProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("user_id", userId);

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
        return apiClient.invokeAPI("/users/{user_id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update user&#39;s profile.
     * 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param userId Registered user ID
     * @param profile Only email, realname and comment can be modified.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateUserProfile(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nonnull UserProfile profile, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateUserProfileRequestCreation(userId, profile, xRequestId).body(localVarReturnType);
    }

    /**
     * Update user&#39;s profile.
     * 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param userId Registered user ID
     * @param profile Only email, realname and comment can be modified.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateUserProfileWithHttpInfo(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nonnull UserProfile profile, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateUserProfileRequestCreation(userId, profile, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Update user&#39;s profile.
     * 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param userId Registered user ID
     * @param profile Only email, realname and comment can be modified.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateUserProfileWithResponseSpec(@jakarta.annotation.Nonnull Integer userId, @jakarta.annotation.Nonnull UserProfile profile, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return updateUserProfileRequestCreation(userId, profile, xRequestId);
    }
}
