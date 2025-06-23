def runPipeline() {
    stage('Run Python Script') {
        sh 'python3 pythonapp.py'
    }
}
