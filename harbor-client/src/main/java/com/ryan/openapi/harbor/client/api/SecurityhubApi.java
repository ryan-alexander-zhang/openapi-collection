package com.ryan.openapi.harbor.client.api;

import com.ryan.openapi.harbor.client.invoker.ApiClient;

import com.ryan.openapi.harbor.client.model.Errors;
import com.ryan.openapi.harbor.client.model.SecuritySummary;
import com.ryan.openapi.harbor.client.model.VulnerabilityItem;

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
public class SecurityhubApi {
    private ApiClient apiClient;

    public SecurityhubApi() {
        this(new ApiClient());
    }

    public SecurityhubApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get vulnerability system summary
     * Retrieve the vulnerability summary of the system
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param withDangerousCve Specify whether the dangerous CVEs are included inside summary information
     * @param withDangerousArtifact Specify whether the dangerous Artifact are included inside summary information
     * @return SecuritySummary
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSecuritySummaryRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean withDangerousCve, @jakarta.annotation.Nullable Boolean withDangerousArtifact) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_dangerous_cve", withDangerousCve));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_dangerous_artifact", withDangerousArtifact));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<SecuritySummary> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/security/summary", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get vulnerability system summary
     * Retrieve the vulnerability summary of the system
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param withDangerousCve Specify whether the dangerous CVEs are included inside summary information
     * @param withDangerousArtifact Specify whether the dangerous Artifact are included inside summary information
     * @return SecuritySummary
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public SecuritySummary getSecuritySummary(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean withDangerousCve, @jakarta.annotation.Nullable Boolean withDangerousArtifact) throws RestClientResponseException {
        ParameterizedTypeReference<SecuritySummary> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSecuritySummaryRequestCreation(xRequestId, withDangerousCve, withDangerousArtifact).body(localVarReturnType);
    }

    /**
     * Get vulnerability system summary
     * Retrieve the vulnerability summary of the system
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param withDangerousCve Specify whether the dangerous CVEs are included inside summary information
     * @param withDangerousArtifact Specify whether the dangerous Artifact are included inside summary information
     * @return ResponseEntity&lt;SecuritySummary&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SecuritySummary> getSecuritySummaryWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean withDangerousCve, @jakarta.annotation.Nullable Boolean withDangerousArtifact) throws RestClientResponseException {
        ParameterizedTypeReference<SecuritySummary> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSecuritySummaryRequestCreation(xRequestId, withDangerousCve, withDangerousArtifact).toEntity(localVarReturnType);
    }

    /**
     * Get vulnerability system summary
     * Retrieve the vulnerability summary of the system
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param withDangerousCve Specify whether the dangerous CVEs are included inside summary information
     * @param withDangerousArtifact Specify whether the dangerous Artifact are included inside summary information
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSecuritySummaryWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable Boolean withDangerousCve, @jakarta.annotation.Nullable Boolean withDangerousArtifact) throws RestClientResponseException {
        return getSecuritySummaryRequestCreation(xRequestId, withDangerousCve, withDangerousArtifact);
    }

    /**
     * Get the vulnerability list.
     * Get the vulnerability list. use q to pass the query condition, supported conditions: cve_id(exact match) cvss_score_v3(range condition) severity(exact match) status(exact match) repository_name(exact match) project_id(exact match) package(exact match) tag(exact match) digest(exact match) 
     * <p><b>200</b> - The vulnerability list.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param page The page number
     * @param pageSize The size of per page
     * @param tuneCount Enable to ignore X-Total-Count when the total count &gt; 1000, if the total count is less than 1000, the real total count is returned, else -1.
     * @param withTag Specify whether the tag information is included inside vulnerability information
     * @return List&lt;VulnerabilityItem&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listVulnerabilitiesRequestCreation(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable Boolean tuneCount, @jakarta.annotation.Nullable Boolean withTag) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tune_count", tuneCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_tag", withTag));

        if (xRequestId != null)
        headerParams.add("X-Request-Id", apiClient.parameterToString(xRequestId));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<VulnerabilityItem>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/security/vul", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the vulnerability list.
     * Get the vulnerability list. use q to pass the query condition, supported conditions: cve_id(exact match) cvss_score_v3(range condition) severity(exact match) status(exact match) repository_name(exact match) project_id(exact match) package(exact match) tag(exact match) digest(exact match) 
     * <p><b>200</b> - The vulnerability list.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param page The page number
     * @param pageSize The size of per page
     * @param tuneCount Enable to ignore X-Total-Count when the total count &gt; 1000, if the total count is less than 1000, the real total count is returned, else -1.
     * @param withTag Specify whether the tag information is included inside vulnerability information
     * @return List&lt;VulnerabilityItem&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<VulnerabilityItem> listVulnerabilities(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable Boolean tuneCount, @jakarta.annotation.Nullable Boolean withTag) throws RestClientResponseException {
        ParameterizedTypeReference<List<VulnerabilityItem>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listVulnerabilitiesRequestCreation(xRequestId, q, page, pageSize, tuneCount, withTag).body(localVarReturnType);
    }

    /**
     * Get the vulnerability list.
     * Get the vulnerability list. use q to pass the query condition, supported conditions: cve_id(exact match) cvss_score_v3(range condition) severity(exact match) status(exact match) repository_name(exact match) project_id(exact match) package(exact match) tag(exact match) digest(exact match) 
     * <p><b>200</b> - The vulnerability list.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param page The page number
     * @param pageSize The size of per page
     * @param tuneCount Enable to ignore X-Total-Count when the total count &gt; 1000, if the total count is less than 1000, the real total count is returned, else -1.
     * @param withTag Specify whether the tag information is included inside vulnerability information
     * @return ResponseEntity&lt;List&lt;VulnerabilityItem&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<VulnerabilityItem>> listVulnerabilitiesWithHttpInfo(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable Boolean tuneCount, @jakarta.annotation.Nullable Boolean withTag) throws RestClientResponseException {
        ParameterizedTypeReference<List<VulnerabilityItem>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listVulnerabilitiesRequestCreation(xRequestId, q, page, pageSize, tuneCount, withTag).toEntity(localVarReturnType);
    }

    /**
     * Get the vulnerability list.
     * Get the vulnerability list. use q to pass the query condition, supported conditions: cve_id(exact match) cvss_score_v3(range condition) severity(exact match) status(exact match) repository_name(exact match) project_id(exact match) package(exact match) tag(exact match) digest(exact match) 
     * <p><b>200</b> - The vulnerability list.
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal server error
     * @param xRequestId An unique ID for the request
     * @param q Query string to query resources. Supported query patterns are \&quot;exact match(k&#x3D;v)\&quot;, \&quot;fuzzy match(k&#x3D;~v)\&quot;, \&quot;range(k&#x3D;[min~max])\&quot;, \&quot;list with union releationship(k&#x3D;{v1 v2 v3})\&quot; and \&quot;list with intersetion relationship(k&#x3D;(v1 v2 v3))\&quot;. The value of range and list can be string(enclosed by \&quot; or &#39;), integer or time(in format \&quot;2020-04-09 02:36:00\&quot;). All of these query patterns should be put in the query string \&quot;q&#x3D;xxx\&quot; and splitted by \&quot;,\&quot;. e.g. q&#x3D;k1&#x3D;v1,k2&#x3D;~v2,k3&#x3D;[min~max]
     * @param page The page number
     * @param pageSize The size of per page
     * @param tuneCount Enable to ignore X-Total-Count when the total count &gt; 1000, if the total count is less than 1000, the real total count is returned, else -1.
     * @param withTag Specify whether the tag information is included inside vulnerability information
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listVulnerabilitiesWithResponseSpec(@jakarta.annotation.Nullable String xRequestId, @jakarta.annotation.Nullable String q, @jakarta.annotation.Nullable Long page, @jakarta.annotation.Nullable Long pageSize, @jakarta.annotation.Nullable Boolean tuneCount, @jakarta.annotation.Nullable Boolean withTag) throws RestClientResponseException {
        return listVulnerabilitiesRequestCreation(xRequestId, q, page, pageSize, tuneCount, withTag);
    }
}
