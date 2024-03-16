@Library('pipeline')

// Import necessary functions from separate files
import com.acceleratedskillup.*;

pipeline {
    parameters {
        activeChoice(
            name: 'Offline Run',
            script: {
                // Assuming choices are defined elsewhere (e.g., environment variables)
                def offlineRunOptions = env.OFFLINE_RUN_OPTIONS?.split(',') ?: []
                return offlineRunOptions.collect { option ->
                    [name: option, description: "Run ${option} tests"]
                }
            },
            filterable: true,
            multiselect: true
        )
    }

    // Pipeline stages and steps using the selected choices from 'Offline Run' parameter
    stages {
        stage('Build') {
            steps {
                echo "Selected Offline Run options:"
                for (choice in params.OfflineRun) {
                    echo "  - $choice"
                }
                // Script for your build based on the chosen offline run options
            }
        }
    }
}

