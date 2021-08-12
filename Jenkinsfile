@Library('pipeline_library')_

pipeline {
agent any
stages{
stage('Demo') {
steps
{
echo 'Hello...'
sayHello 'Abhiraj here '
}
}
stage("build")
{
steps
{
script{
def filePath = readFile "Hello.csv"
def lines = filePath.readLines()
def linesbyline = filePath.readLines()
for (line in linesbyline) {
println "$line"}
}
}
}
}
post {
always {
emailext body: '${env.BUILD_URL} has result ${currentBuild.result}', subject: 'test email', to: 'abhiraj.2998@gmail.com'
mail to: 'abhiraj.2998@gmail.com',
subject: "Status of pipeline: ${currentBuild.fullDisplayName}",
body: "${env.BUILD_URL} has result ${currentBuild.result}"
}
}
}
