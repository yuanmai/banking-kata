pipeline {
    agent any

    stages {
        stage('签出') {
            steps {
                echo 'Building..'
            }
        }
        stage('编译') {
            steps {
                echo 'Testing..'
            }
        }
        stage('单元测试') {
            steps {
                echo 'Deploying....'
            }
        }
        stage('代码扫描') {    
            steps {
 parallel(
          "Sonar扫描": {
          echo 'Deploying....'
          },
          "安全扫描": {
          echo 'Deploying....'
            
          }
        )
            }
        }        
        stage('部署测试环境') {
            steps {
                echo 'Deploying....'
            }
        }        
        stage('自动化测试') {
 parallel(
          "自动化验收测试": {
          echo 'Deploying....'
          },
          "回归测试": {
          echo 'Deploying....'            
          }
        )
        }
        stage('部署生产环境') {
            steps {
                echo 'Deploying....'
            }
        }        
    }
}
