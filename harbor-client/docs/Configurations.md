

# Configurations


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authMode** | **String** | The auth mode of current system, such as \&quot;db_auth\&quot;, \&quot;ldap_auth\&quot;, \&quot;oidc_auth\&quot; |  [optional] |
|**primaryAuthMode** | **Boolean** | The flag to indicate whether the current auth mode should consider as a primary one. |  [optional] |
|**ldapBaseDn** | **String** | The Base DN for LDAP binding. |  [optional] |
|**ldapFilter** | **String** | The filter for LDAP search |  [optional] |
|**ldapGroupBaseDn** | **String** | The base DN to search LDAP group. |  [optional] |
|**ldapGroupAdminDn** | **String** | Specify the ldap group which have the same privilege with Harbor admin |  [optional] |
|**ldapGroupAttributeName** | **String** | The attribute which is used as identity of the LDAP group, default is cn.&#39; |  [optional] |
|**ldapGroupSearchFilter** | **String** | The filter to search the ldap group |  [optional] |
|**ldapGroupSearchScope** | **Integer** | The scope to search ldap group. &#39;&#39;0-LDAP_SCOPE_BASE, 1-LDAP_SCOPE_ONELEVEL, 2-LDAP_SCOPE_SUBTREE&#39;&#39; |  [optional] |
|**ldapGroupAttachParallel** | **Boolean** | Attach LDAP user group information in parallel, the parallel worker count is 5 |  [optional] |
|**ldapScope** | **Integer** | The scope to search ldap users,&#39;0-LDAP_SCOPE_BASE, 1-LDAP_SCOPE_ONELEVEL, 2-LDAP_SCOPE_SUBTREE&#39; |  [optional] |
|**ldapSearchDn** | **String** | The DN of the user to do the search. |  [optional] |
|**ldapSearchPassword** | **String** | The password of the ldap search dn |  [optional] |
|**ldapTimeout** | **Integer** | Timeout in seconds for connection to LDAP server |  [optional] |
|**ldapUid** | **String** | The attribute which is used as identity for the LDAP binding, such as \&quot;CN\&quot; or \&quot;SAMAccountname\&quot; |  [optional] |
|**ldapUrl** | **String** | The URL of LDAP server |  [optional] |
|**ldapVerifyCert** | **Boolean** | Whether verify your OIDC server certificate, disable it if your OIDC server is hosted via self-hosted certificate. |  [optional] |
|**ldapGroupMembershipAttribute** | **String** | The user attribute to identify the group membership |  [optional] |
|**projectCreationRestriction** | **String** | Indicate who can create projects, it could be &#39;&#39;adminonly&#39;&#39; or &#39;&#39;everyone&#39;&#39;. |  [optional] |
|**readOnly** | **Boolean** | The flag to indicate whether Harbor is in readonly mode. |  [optional] |
|**selfRegistration** | **Boolean** | Whether the Harbor instance supports self-registration.  If it&#39;&#39;s set to false, admin need to add user to the instance. |  [optional] |
|**tokenExpiration** | **Integer** | The expiration time of the token for internal Registry, in minutes. |  [optional] |
|**uaaClientId** | **String** | The client id of UAA |  [optional] |
|**uaaClientSecret** | **String** | The client secret of the UAA |  [optional] |
|**uaaEndpoint** | **String** | The endpoint of the UAA |  [optional] |
|**uaaVerifyCert** | **Boolean** | Verify the certificate in UAA server |  [optional] |
|**httpAuthproxyEndpoint** | **String** | The endpoint of the HTTP auth |  [optional] |
|**httpAuthproxyTokenreviewEndpoint** | **String** | The token review endpoint |  [optional] |
|**httpAuthproxyAdminGroups** | **String** | The group which has the harbor admin privileges |  [optional] |
|**httpAuthproxyAdminUsernames** | **String** | The username which has the harbor admin privileges |  [optional] |
|**httpAuthproxyVerifyCert** | **Boolean** | Verify the HTTP auth provider&#39;s certificate |  [optional] |
|**httpAuthproxySkipSearch** | **Boolean** | Search user before onboard |  [optional] |
|**httpAuthproxyServerCertificate** | **String** | The certificate of the HTTP auth provider |  [optional] |
|**oidcName** | **String** | The OIDC provider name |  [optional] |
|**oidcEndpoint** | **String** | The endpoint of the OIDC provider |  [optional] |
|**oidcClientId** | **String** | The client ID of the OIDC provider |  [optional] |
|**oidcClientSecret** | **String** | The OIDC provider secret |  [optional] |
|**oidcGroupsClaim** | **String** | The attribute claims the group name |  [optional] |
|**oidcAdminGroup** | **String** | The OIDC group which has the harbor admin privileges |  [optional] |
|**oidcGroupFilter** | **String** | The OIDC group filter which filters out the group name doesn&#39;t match the regular expression |  [optional] |
|**oidcScope** | **String** | The scope of the OIDC provider |  [optional] |
|**oidcUserClaim** | **String** | The attribute claims the username |  [optional] |
|**oidcVerifyCert** | **Boolean** | Verify the OIDC provider&#39;s certificate&#39; |  [optional] |
|**oidcAutoOnboard** | **Boolean** | Auto onboard the OIDC user |  [optional] |
|**oidcExtraRedirectParms** | **String** | Extra parameters to add when redirect request to OIDC provider |  [optional] |
|**oidcLogout** | **Boolean** | Logout OIDC user session |  [optional] |
|**robotTokenDuration** | **Integer** | The robot account token duration in days |  [optional] |
|**robotNamePrefix** | **String** | The rebot account name prefix |  [optional] |
|**notificationEnable** | **Boolean** | Enable notification |  [optional] |
|**quotaPerProjectEnable** | **Boolean** | Enable quota per project |  [optional] |
|**storagePerProject** | **Integer** | The storage quota per project |  [optional] |
|**auditLogForwardEndpoint** | **String** | The audit log forward endpoint |  [optional] |
|**skipAuditLogDatabase** | **Boolean** | Skip audit log database |  [optional] |
|**sessionTimeout** | **Integer** | The session timeout for harbor, in minutes. |  [optional] |
|**scannerSkipUpdatePulltime** | **Boolean** | Whether or not to skip update pull time for scanner |  [optional] |
|**bannerMessage** | **String** | The banner message for the UI.It is the stringified result of the banner message object |  [optional] |
|**disabledAuditLogEventTypes** | **String** | the list to disable log audit event types. |  [optional] |



