def call() {
    stage('Run Python Script') {
        steps {
            sh 'python3 pythonapp.py'
        }
    }
}
