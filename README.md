# ratpack-spring-cloud-functional-test
Sample ratpack app + boot + spring cloud (eureka client) to show problem with functional test execution.

This uses ratpack 1.3.3, spring boot 1.3.5-RELEASE, spring cloud release train Brixton.SR1, groovy 2.4.4, gradle 2.14.

This very basic application is an eureka client that renders a greeting text on response to 'GET /'.
A spock specification test in app.FunctionalTest has 2 identical methods that fires up an embedded ratpack server, issue a 'GET /'
and check response text.  Test fails when both methods are executed but succeeds if one or the other is ignored.

Functional test based on the best ratpack book in print so far (;-)) : http://shop.oreilly.com/product/0636920037545.do

The exception 
```
org.springframework.jmx.export.UnableToRegisterMBeanException: Unable to register MBean [org.springframework.cloud.context.environment.EnvironmentManager@3968b2d] with key 'environmentManager'; nested exception is javax.management.InstanceAlreadyExistsException: org.springframework.cloud.context.environment:name=environmentManager,type=EnvironmentManager
```
occurs when test fails.

To show the problem, run `./gradlew test`.

To run the app (to show that it runs correctly) :
* start an eureka server on default port (8761) (server not provided in this project; this step is optional, but eureka client exceptions will be thrown if the server is not present)
* run the app with `./gradlew bootRun`.

I don't know if this is a ratpack problem or spring boot or spring cloud ...
