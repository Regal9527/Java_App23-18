pipeline{
        agent any 

        stages{
            stage(' Sonar quality status'){
                agent{

                    docker {
                        image 'maven'
                    }
                }    
                steps{
                    script{
                        withSonarQubeEnv(credentialsId: 'github-jenkins') {
                             sh 'mvn clean package sonar:sonar'
                    }
                    }
                }



            }
        }
    }
