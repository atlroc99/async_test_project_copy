
topic: convert spring boot project to war file.

this project is a copy of async-test-project.
Reason:
we created this copy becasue we wanted to convert this project to war file.
then deploy to tomcat servelet container.
ultimately this project will be tested for jenkins deploy to tomcat localhost;
-------------------------------------------------------------------------------------
Things we did:
1) renamed the artifactId(bcz it colllied with the original project)
2) updated packaging from jar to war.
3) added or made the embaded tomcat scope to provided.
4) Extended the SpringServletInitializer abastract class in the main class.
5) override the configure method of the extended class.
configure method returns SpringApplicationBuilder object




We are able to call the http://localhost:8083/teams from our external angular App that is running on localhost:4200.
Initially, we faced CROS issue due to cros server and port number. 
We added a filter class in our spring boot application that handles Http request comming in from another local sever and port number.

The url for the angular project: https://github.com/atlroc99/http-services.git


 more good inoformation about java / sprin boot: https://github.com/mickknutson





































