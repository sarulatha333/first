pipeline{
    agent any
    environment{
        PATH='/home/vvdn/.sdkman/candidates/groovy/current/bin:/home/vvdn/.npm-packages/bin:/home/vvdn/.nvm/versions/node/v8.16.0/bin:/home/vvdn/.local/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin:/usr/bin/git'
    }
    stages{
        stage('Pre-Build'){
            steps{
                script{
                    sh "export PATH=$PATH:/usr/bin/git"
                    sh 'env'  
		    sh 'rm git-message || true'
                    sh 'git log -1 >> git-message'	
                    def merge_mesg = sh(script: "cut -c 5- git-message | sed '8q;d'",returnStdout: true).trim()
		    mergeid=merge_mesg.split(':')[0];
                    echo "${mergeid}"
		    sh "curl -s -H \"Authorization: token ${Saru_Personal_Access_Token}\"  -X POST -d '{\"body\": \"https://jira-url\"}'  \"https://api.github.com/repos/sarulatha333/first/issues/8/comments\""
                    sh "curl https://api.github.com/repos/sarulatha333/first/pulls/8 | grep title | cut -d'\"' -f4"
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
     post{
        success{
            script{
                if(env.BRANCH_NAME!='feature/ci-pipeline'){
                    if(env.BRANCH_NAME=='feature/ci-pipeline'){
                        echo "inside second if"
                    }
                    else{
                        echo "inside second else"
                    }
                }
                else if(env.BRANCH_NAME!='feature/ci-pipeline'){
                    echo "outside first if"
                }
                else{
                    echo "WARNING!!!!!!!!!!!!!!!!!"
                }
            }
        }
    }
}    
