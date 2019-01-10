# Spring OAuth SSO Demo

External authentication provider, oauth2-vanilla-authserver, Authorization Server tut-spring-boot-oauth2/auth-server/ and ClientApplication of tut-spring-boot-oauth2/auth-server/src/test

tut-spring-boot-oauth2/auth-server/ - turns the app into a fully-fledged OAuth2 Authorization Server, able to issue its own tokens, but still using the external OAuth2 providers for authentication. upgrade spring boot to 2.0.1.RELEASE

1. Start tut-spring-boot-oauth2/auth-server/src/test/ClientApplication
2. Start spring-oauth-sso-demo
3. Start oauth2-vanilla-authserver 
4. Go to http://localhost:9900/client
5. Click on oauth2-vanilla 
6. Browser gets redirected to http://localhost:9991/uaa/oauth/authorize?client_id=acme&redirect_uri=http://localhost:8081/login/oauth2-vanilla&response_type=code&state=nD0W2p
7. Sign in using user/password
8. After signing in, the browser gets redirected to http://localhost:9900/client/