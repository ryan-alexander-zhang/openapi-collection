package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.LdapConf;
import com.ryan.openapi.harbor.client.model.LdapFailedImportUser;
import com.ryan.openapi.harbor.client.model.LdapImportUsers;
import com.ryan.openapi.harbor.client.model.LdapPingResult;
import com.ryan.openapi.harbor.client.model.LdapUser;
import com.ryan.openapi.harbor.client.model.UserGroup;

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
@Component("com.ryan.openapi.harbor.client.api.LdapApi")
public class LdapApi {
    private ApiClient apiClient;

    public LdapApi() {
        this(new ApiClient());
    }

    @Autowired
    public LdapApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Import selected available ldap users.
     * This endpoint adds the selected available ldap users to harbor based on related configuration parameters from the system. System will try to guess the user email address and realname, add to harbor user information. If have errors when import user, will return the list of importing failed uid and the failed reason. 
     * <p><b>200</b> - Add ldap users successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Failed import some users.
     * <p><b>500</b> - Internal server error
     * @param uidList The uid listed for importing. This list will check users validity of ldap service based on configuration from the system.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec importLdapUserRequestCreation(@jakarta.annotation.Nonnull LdapImportUsers uidList, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = uidList;
        // verify the required parameter 'uidList' is set
        if (uidList == null) {
            throw new RestClientResponseException("Missing the required parameter 'uidList' when calling importLdapUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/ldap/users/import", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Import selected available ldap users.
     * This endpoint adds the selected available ldap users to harbor based on related configuration parameters from the system. System will try to guess the user email address and realname, add to harbor user information. If have errors when import user, will return the list of importing failed uid and the failed reason. 
     * <p><b>200</b> - Add ldap users successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Failed import some users.
     * <p><b>500</b> - Internal server error
     * @param uidList The uid listed for importing. This list will check users validity of ldap service based on configuration from the system.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void importLdapUser(@jakarta.annotation.Nonnull LdapImportUsers uidList, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        importLdapUserRequestCreation(uidList, xRequestId).body(localVarReturnType);
    }

    /**
     * Import selected available ldap users.
     * This endpoint adds the selected available ldap users to harbor based on related configuration parameters from the system. System will try to guess the user email address and realname, add to harbor user information. If have errors when import user, will return the list of importing failed uid and the failed reason. 
     * <p><b>200</b> - Add ldap users successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Failed import some users.
     * <p><b>500</b> - Internal server error
     * @param uidList The uid listed for importing. This list will check users validity of ldap service based on configuration from the system.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> importLdapUserWithHttpInfo(@jakarta.annotation.Nonnull LdapImportUsers uidList, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return importLdapUserRequestCreation(uidList, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Import selected available ldap users.
     * This endpoint adds the selected available ldap users to harbor based on related configuration parameters from the system. System will try to guess the user email address and realname, add to harbor user information. If have errors when import user, will return the list of importing failed uid and the failed reason. 
     * <p><b>200</b> - Add ldap users successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Failed import some users.
     * <p><b>500</b> - Internal server error
     * @param uidList The uid listed for importing. This list will check users validity of ldap service based on configuration from the system.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec importLdapUserWithResponseSpec(@jakarta.annotation.Nonnull LdapImportUsers uidList, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return importLdapUserRequestCreation(uidList, xRequestId);
    }

    /**
     * Ping available ldap service.
     * This endpoint ping the available ldap service for test related configuration parameters. 
     * <p><b>200</b> - Ping ldap service successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param ldapconf ldap configuration. support input ldap service configuration. If it is a empty request, will load current configuration from the system.
     * @return LdapPingResult
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec pingLdapRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable LdapConf ldapconf) throws RestClientResponseException {
        Object postBody = ldapconf;
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

        ParameterizedTypeReference<LdapPingResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/ldap/ping", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Ping available ldap service.
     * This endpoint ping the available ldap service for test related configuration parameters. 
     * <p><b>200</b> - Ping ldap service successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param ldapconf ldap configuration. support input ldap service configuration. If it is a empty request, will load current configuration from the system.
     * @return LdapPingResult
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public LdapPingResult pingLdap(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable LdapConf ldapconf) throws RestClientResponseException {
        ParameterizedTypeReference<LdapPingResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return pingLdapRequestCreation(xRequestId, ldapconf).body(localVarReturnType);
    }

    /**
     * Ping available ldap service.
     * This endpoint ping the available ldap service for test related configuration parameters. 
     * <p><b>200</b> - Ping ldap service successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param ldapconf ldap configuration. support input ldap service configuration. If it is a empty request, will load current configuration from the system.
     * @return ResponseEntity&lt;LdapPingResult&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LdapPingResult> pingLdapWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable LdapConf ldapconf) throws RestClientResponseException {
        ParameterizedTypeReference<LdapPingResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return pingLdapRequestCreation(xRequestId, ldapconf).toEntity(localVarReturnType);
    }

    /**
     * Ping available ldap service.
     * This endpoint ping the available ldap service for test related configuration parameters. 
     * <p><b>200</b> - Ping ldap service successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param ldapconf ldap configuration. support input ldap service configuration. If it is a empty request, will load current configuration from the system.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec pingLdapWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable LdapConf ldapconf) throws RestClientResponseException {
        return pingLdapRequestCreation(xRequestId, ldapconf);
    }

    /**
     * Search available ldap groups.
     * This endpoint searches the available ldap groups based on related configuration parameters. support to search by groupname or groupdn. 
     * <p><b>200</b> - Search ldap group successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param groupname Ldap group name
     * @param groupdn The LDAP group DN
     * @return List&lt;UserGroup&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec searchLdapGroupRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String groupname, @jakarta.annotation.Nullable String groupdn) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupname", groupname));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupdn", groupdn));

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
        return apiClient.invokeAPI("/ldap/groups/search", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search available ldap groups.
     * This endpoint searches the available ldap groups based on related configuration parameters. support to search by groupname or groupdn. 
     * <p><b>200</b> - Search ldap group successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param groupname Ldap group name
     * @param groupdn The LDAP group DN
     * @return List&lt;UserGroup&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<UserGroup> searchLdapGroup(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String groupname, @jakarta.annotation.Nullable String groupdn) throws RestClientResponseException {
        ParameterizedTypeReference<List<UserGroup>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return searchLdapGroupRequestCreation(xRequestId, groupname, groupdn).body(localVarReturnType);
    }

    /**
     * Search available ldap groups.
     * This endpoint searches the available ldap groups based on related configuration parameters. support to search by groupname or groupdn. 
     * <p><b>200</b> - Search ldap group successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param groupname Ldap group name
     * @param groupdn The LDAP group DN
     * @return ResponseEntity&lt;List&lt;UserGroup&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UserGroup>> searchLdapGroupWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String groupname, @jakarta.annotation.Nullable String groupdn) throws RestClientResponseException {
        ParameterizedTypeReference<List<UserGroup>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return searchLdapGroupRequestCreation(xRequestId, groupname, groupdn).toEntity(localVarReturnType);
    }

    /**
     * Search available ldap groups.
     * This endpoint searches the available ldap groups based on related configuration parameters. support to search by groupname or groupdn. 
     * <p><b>200</b> - Search ldap group successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param groupname Ldap group name
     * @param groupdn The LDAP group DN
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec searchLdapGroupWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String groupname, @jakarta.annotation.Nullable String groupdn) throws RestClientResponseException {
        return searchLdapGroupRequestCreation(xRequestId, groupname, groupdn);
    }

    /**
     * Search available ldap users.
     * This endpoint searches the available ldap users based on related configuration parameters. Support searched by input ldap configuration, load configuration from the system and specific filter. 
     * <p><b>200</b> - Search ldap users successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param username Registered user ID
     * @return List&lt;LdapUser&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec searchLdapUserRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String username) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

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

        ParameterizedTypeReference<List<LdapUser>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/ldap/users/search", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search available ldap users.
     * This endpoint searches the available ldap users based on related configuration parameters. Support searched by input ldap configuration, load configuration from the system and specific filter. 
     * <p><b>200</b> - Search ldap users successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param username Registered user ID
     * @return List&lt;LdapUser&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<LdapUser> searchLdapUser(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String username) throws RestClientResponseException {
        ParameterizedTypeReference<List<LdapUser>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return searchLdapUserRequestCreation(xRequestId, username).body(localVarReturnType);
    }

    /**
     * Search available ldap users.
     * This endpoint searches the available ldap users based on related configuration parameters. Support searched by input ldap configuration, load configuration from the system and specific filter. 
     * <p><b>200</b> - Search ldap users successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param username Registered user ID
     * @return ResponseEntity&lt;List&lt;LdapUser&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<LdapUser>> searchLdapUserWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String username) throws RestClientResponseException {
        ParameterizedTypeReference<List<LdapUser>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return searchLdapUserRequestCreation(xRequestId, username).toEntity(localVarReturnType);
    }

    /**
     * Search available ldap users.
     * This endpoint searches the available ldap users based on related configuration parameters. Support searched by input ldap configuration, load configuration from the system and specific filter. 
     * <p><b>200</b> - Search ldap users successfully.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param username Registered user ID
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec searchLdapUserWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String username) throws RestClientResponseException {
        return searchLdapUserRequestCreation(xRequestId, username);
    }
}
