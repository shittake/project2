pipeline {
	agent any
	tools {
		maven 'maven'
		jdk 'Java JDK 17'
	}
	stages {
		stage("test") {
			steps {
				echo "Start Test"
				bat "mvn test"
			}
		}
	}
}