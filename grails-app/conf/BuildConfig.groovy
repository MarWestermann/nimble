grails.project.work.dir = 'target'

grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		inherits true
		
		grailsPlugins()
        grailsHome()
        mavenLocal()
        grailsCentral()
        mavenCentral()
	}

	dependencies {
		compile "net.tanesha.recaptcha4j:recaptcha4j:0.0.7"
	}

	plugins {
		runtime ":twitter-bootstrap:3.3.4"
		runtime ":resources:1.2.14"
		runtime ":fields:1.5.1"
		runtime ":jquery:1.11.1"
		compile (":shiro:1.2.1") {
			excludes "servlet-api"
		}
		compile ":mail:1.0.7"
		build(":release:3.1.1",
              ":rest-client-builder:2.1.1") {
            export = false
        }

		
	}
}

grails.project.repos.default = "buster"
release.scm.enabled = false
