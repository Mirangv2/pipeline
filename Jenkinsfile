@Library('pipeline')

// Import necessary functions from separate files
import com.acceleratedskillup.*;
pipeline {
    agent any
    
    parameters {
        booleanParam(name: 'test_addition', defaultValue: false, description: 'Run addition operation')
        booleanParam(name: 'test_subtraction', defaultValue: false, description: 'Run subtraction operation')
        booleanParam(name: 'test_multiplication', defaultValue: false, description: 'Run multiplication operation')
        booleanParam(name: 'test_division', defaultValue: false, description: 'Run division operation')
        string(name: 'operand1', defaultValue: '10', description: 'First operand')
        string(name: 'operand2', defaultValue: '5', description: 'Second operand')
    }

    stages {
        stage('Addition Operation') {
            steps {
                script {
                    // Perform arithmetic operations based on user input
                    when{
                        expression{params.test_addition=='True'}
                    }
                    echo 'Running addition operation...'
                    def add= new addition()
                    println add.add(params.operand1.toInteger(),params.operand2.toInteger())
                }
            }
        }
        stage('Subtraction Operation'){
            steps{
                script{
                    when{
                        expression{params.test_subtraction=='True'}
                    }
                    echo 'Running subtraction operation...'
                    def sub= new subtraction()
                    println sub.sub(params.operand1.toInteger(),params.operand2.toInteger())
                }
            }
        }
        stage('Multiplication Operation'){
            steps{
                script{
                        when{
                        expression{params.test_addition=='True'}
                    }
                    echo 'Running multiplication operation...'
                    def mul= new Multiplication()
                    println mul.mul(params.operand1.toInteger(),params.operand2.toInteger())
                    }
                }
            }
        stage('Division Operation'){
            steps{
                script{
                    when{
                        expression{params.test_addition=='True'}
                    }
                    echo 'Running division operation...'
                    def div= new division()
                    println div.div(params.operand1.toInteger(),params.operand2.toInteger())
                    }
                }
            }
        }
    }
