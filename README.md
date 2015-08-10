# Nimble grails plugin

Nimble is a Grails plugin and provides kickstart authentication and authorization functionality to any Grails application.
Nimble provides beautiful UI and ready to use functionality for login, user registration, password reset, Users, Roles, 
Groups and permission management. Nimble provides administration portal from where all of the above stuff can be managed. 
Its possible to extends nimble administration portal to add other administration functionality for your application.

Nimble is based on Apache shiro security framework

## Features
- Out of the box support for authentication and authorization
- Login
- Registration
- Forgot password
- UI for managing Administrators
- UI for managing users
- UI for managing user groups
- UI for managing roles
- UI for assigning roles and permissions to users and groups 

And much more 


This is the link to the old Demo : http://nimble.ap01.aws.af.cm/


Documentation (old version): 

- http://snimavat.github.io/nimble/index.html
- http://grails.org/plugin/nimble

## Installation
As the old maven repo where this project has been deployed to does not exist anymore, you can use the following repository to get the actual and updated nimble version:

```mavenRepo "http://buster.intersales.de:8081/nexus/content/repositories/releases"```

At the moment the version 0.9 is the actual version while this version is still in development and there are still errors on the admin views.

## Roadmap
- Improve test coverage
- Add support for impersonating users