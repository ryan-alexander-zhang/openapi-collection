package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.Robot;
import com.ryan.openapi.harbor.client.model.RobotCreate;
import com.ryan.openapi.harbor.client.model.RobotCreated;
import com.ryan.openapi.harbor.client.model.RobotSec;

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
@Component("com.ryan.openapi.harbor.client.api.RobotApi")
public class RobotApi {
    private ApiClient apiClient;

    public RobotApi() {
        this(new ApiClient());
    }

    @Autowired
    public RobotApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a robot account
     * Create a robot account
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param robot The JSON object of a robot account.
     * @param xRequestId An unique ID for the request
     * @return RobotCreated
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createRobotRequestCreation(@jakarta.annotation.Nonnull RobotCreate robot, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = robot;
        // verify the required parameter 'robot' is set
        if (robot == null) {
            throw new RestClientResponseException("Missing the required parameter 'robot' when calling createRobot", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<RobotCreated> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/robots", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a robot account
     * Create a robot account
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param robot The JSON object of a robot account.
     * @param xRequestId An unique ID for the request
     * @return RobotCreated
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public RobotCreated createRobot(@jakarta.annotation.Nonnull RobotCreate robot, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<RobotCreated> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createRobotRequestCreation(robot, xRequestId).body(localVarReturnType);
    }

    /**
     * Create a robot account
     * Create a robot account
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param robot The JSON object of a robot account.
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;RobotCreated&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RobotCreated> createRobotWithHttpInfo(@jakarta.annotation.Nonnull RobotCreate robot, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<RobotCreated> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createRobotRequestCreation(robot, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Create a robot account
     * Create a robot account
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param robot The JSON object of a robot account.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createRobotWithResponseSpec(@jakarta.annotation.Nonnull RobotCreate robot, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return createRobotRequestCreation(robot, xRequestId);
    }

    /**
     * Delete a robot account
     * This endpoint deletes specific robot account information by robot ID.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param robotId Robot ID
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteRobotRequestCreation(@jakarta.annotation.Nonnull Integer robotId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'robotId' is set
        if (robotId == null) {
            throw new RestClientResponseException("Missing the required parameter 'robotId' when calling deleteRobot", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("robot_id", robotId);

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
        return apiClient.invokeAPI("/robots/{robot_id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a robot account
     * This endpoint deletes specific robot account information by robot ID.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param robotId Robot ID
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteRobot(@jakarta.annotation.Nonnull Integer robotId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteRobotRequestCreation(robotId, xRequestId).body(localVarReturnType);
    }

    /**
     * Delete a robot account
     * This endpoint deletes specific robot account information by robot ID.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param robotId Robot ID
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteRobotWithHttpInfo(@jakarta.annotation.Nonnull Integer robotId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteRobotRequestCreation(robotId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Delete a robot account
     * This endpoint deletes specific robot account information by robot ID.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param robotId Robot ID
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteRobotWithResponseSpec(@jakarta.annotation.Nonnull Integer robotId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return deleteRobotRequestCreation(robotId, xRequestId);
    }

    /**
     * Get a robot account
     * This endpoint returns specific robot account information by robot ID.
     * <p><b>200</b> - Return matched robot information.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param robotId Robot ID
     * @param xRequestId An unique ID for the request
     * @return Robot
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRobotByIDRequestCreation(@jakarta.annotation.Nonnull Integer robotId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'robotId' is set
        if (robotId == null) {
            throw new RestClientResponseException("Missing the required parameter 'robotId' when calling getRobotByID", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("robot_id", robotId);

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

        ParameterizedTypeReference<Robot> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/robots/{robot_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a robot account
     * This endpoint returns specific robot account information by robot ID.
     * <p><b>200</b> - Return matched robot information.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param robotId Robot ID
     * @param xRequestId An unique ID for the request
     * @return Robot
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Robot getRobotByID(@jakarta.annotation.Nonnull Integer robotId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Robot> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRobotByIDRequestCreation(robotId, xRequestId).body(localVarReturnType);
    }

    /**
     * Get a robot account
     * This endpoint returns specific robot account information by robot ID.
     * <p><b>200</b> - Return matched robot information.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param robotId Robot ID
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;Robot&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Robot> getRobotByIDWithHttpInfo(@jakarta.annotation.Nonnull Integer robotId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Robot> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRobotByIDRequestCreation(robotId, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Get a robot account
     * This endpoint returns specific robot account information by robot ID.
     * <p><b>200</b> - Return matched robot information.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param robotId Robot ID
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRobotByIDWithResponseSpec(@jakarta.annotation.Nonnull Integer robotId, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return getRobotByIDRequestCreation(robotId, xRequestId);
    }

    /**
     * Get robot account
     * List the robot accounts with the specified level and project.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;Robot&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listRobotRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
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

        ParameterizedTypeReference<List<Robot>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/robots", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get robot account
     * List the robot accounts with the specified level and project.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return List&lt;Robot&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Robot> listRobot(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<Robot>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listRobotRequestCreation(xRequestId, q, sort, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get robot account
     * List the robot accounts with the specified level and project.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseEntity&lt;List&lt;Robot&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Robot>> listRobotWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<List<Robot>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listRobotRequestCreation(xRequestId, q, sort, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get robot account
     * List the robot accounts with the specified level and project.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param sort Sort the resource list in ascending or descending order. e.g. sort by field1 in ascending order and field2 in descending order with \&quot;sort&#x3D;field1,-field2\&quot;
     * @param page The page number
     * @param pageSize The size of per page
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listRobotWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable String sort, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize) throws RestClientResponseException {
        return listRobotRequestCreation(xRequestId, q, sort, page, pageSize);
    }

    /**
     * Refresh the robot secret
     * Refresh the robot secret
     * <p><b>200</b> - Return refreshed robot sec.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param robotId Robot ID
     * @param robotSec The JSON object of a robot account.
     * @param xRequestId An unique ID for the request
     * @return RobotSec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec refreshSecRequestCreation(@jakarta.annotation.Nonnull Integer robotId, @jakarta.annotation.Nonnull RobotSec robotSec, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = robotSec;
        // verify the required parameter 'robotId' is set
        if (robotId == null) {
            throw new RestClientResponseException("Missing the required parameter 'robotId' when calling refreshSec", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'robotSec' is set
        if (robotSec == null) {
            throw new RestClientResponseException("Missing the required parameter 'robotSec' when calling refreshSec", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("robot_id", robotId);

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

        ParameterizedTypeReference<RobotSec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/robots/{robot_id}", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Refresh the robot secret
     * Refresh the robot secret
     * <p><b>200</b> - Return refreshed robot sec.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param robotId Robot ID
     * @param robotSec The JSON object of a robot account.
     * @param xRequestId An unique ID for the request
     * @return RobotSec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public RobotSec refreshSec(@jakarta.annotation.Nonnull Integer robotId, @jakarta.annotation.Nonnull RobotSec robotSec, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<RobotSec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return refreshSecRequestCreation(robotId, robotSec, xRequestId).body(localVarReturnType);
    }

    /**
     * Refresh the robot secret
     * Refresh the robot secret
     * <p><b>200</b> - Return refreshed robot sec.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param robotId Robot ID
     * @param robotSec The JSON object of a robot account.
     * @param xRequestId An unique ID for the request
     * @return ResponseEntity&lt;RobotSec&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RobotSec> refreshSecWithHttpInfo(@jakarta.annotation.Nonnull Integer robotId, @jakarta.annotation.Nonnull RobotSec robotSec, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<RobotSec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return refreshSecRequestCreation(robotId, robotSec, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Refresh the robot secret
     * Refresh the robot secret
     * <p><b>200</b> - Return refreshed robot sec.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param robotId Robot ID
     * @param robotSec The JSON object of a robot account.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec refreshSecWithResponseSpec(@jakarta.annotation.Nonnull Integer robotId, @jakarta.annotation.Nonnull RobotSec robotSec, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return refreshSecRequestCreation(robotId, robotSec, xRequestId);
    }

    /**
     * Update a robot account
     * This endpoint updates specific robot account information by robot ID.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param robotId Robot ID
     * @param robot The JSON object of a robot account.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateRobotRequestCreation(@jakarta.annotation.Nonnull Integer robotId, @jakarta.annotation.Nonnull Robot robot, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        Object postBody = robot;
        // verify the required parameter 'robotId' is set
        if (robotId == null) {
            throw new RestClientResponseException("Missing the required parameter 'robotId' when calling updateRobot", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'robot' is set
        if (robot == null) {
            throw new RestClientResponseException("Missing the required parameter 'robot' when calling updateRobot", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("robot_id", robotId);

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
        return apiClient.invokeAPI("/robots/{robot_id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a robot account
     * This endpoint updates specific robot account information by robot ID.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param robotId Robot ID
     * @param robot The JSON object of a robot account.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateRobot(@jakarta.annotation.Nonnull Integer robotId, @jakarta.annotation.Nonnull Robot robot, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateRobotRequestCreation(robotId, robot, xRequestId).body(localVarReturnType);
    }

    /**
     * Update a robot account
     * This endpoint updates specific robot account information by robot ID.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param robotId Robot ID
     * @param robot The JSON object of a robot account.
     * @param xRequestId An unique ID for the request
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateRobotWithHttpInfo(@jakarta.annotation.Nonnull Integer robotId, @jakarta.annotation.Nonnull Robot robot, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateRobotRequestCreation(robotId, robot, xRequestId).toEntity(localVarReturnType);
    }

    /**
     * Update a robot account
     * This endpoint updates specific robot account information by robot ID.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param robotId Robot ID
     * @param robot The JSON object of a robot account.
     * @param xRequestId An unique ID for the request
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateRobotWithResponseSpec(@jakarta.annotation.Nonnull Integer robotId, @jakarta.annotation.Nonnull Robot robot, @jakarta.annotation.Nullable String xRequestId) throws RestClientResponseException {
        return updateRobotRequestCreation(robotId, robot, xRequestId);
    }
}
