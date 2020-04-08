pipeline{
    agent any
    stages{
        stage('Pre-Build') {
            steps {
                Symbian CodeScanner{
                    step([$class: 'CodescannerPublisher'])}
            }
        }
    }  
}
