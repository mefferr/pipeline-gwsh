pipeline {
  agent
  stages {
            stage('Test') {
                steps {
                    sh ./gradlew test
                }
            }

            stage('Build') {
                steps {
                    sh ./gradlew build
                }
            }

        }
  }
}