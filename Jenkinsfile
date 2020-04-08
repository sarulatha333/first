pipeline{
    agent any
   
    stages{
        stage('Pre-Build') {
            steps {
                step([$class: 'CodescannerPublisher']): threshold
            }
        }
    }  
}
