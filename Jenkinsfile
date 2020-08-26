pipeline{
    agent any
    
    stages{
        stage('Pre-Build'){
            steps{
                script{
                    sh "export PATH=$PATH:/usr/bin/git"
                    sh 'env'
                    sh 'git log -1 >> git-message'
                    def mergeid = sh(script: "cut -c 5-11 git-message | sed '8q;d'",returnStdout: true).trim()
                    echo "${mergeid}"
                }    
            }
        }
        stage('master-branch-stuff'){
            when { branch "PR-/*" }
            steps {
                echo 'run this stage - ony if the branch = master branch'
            }
        }
    }
}    
