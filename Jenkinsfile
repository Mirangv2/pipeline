@Library('pipeline')

// Import necessary functions from separate files
import com.acceleratedskillup.*;

pipeline {
    parameters {
        activeChoice(
            name: 'Offline Run',
            script: {
                return [
                    [name: 'SanityRun', description: 'Run Sanity tests'],
                    [name: 'OfflineRun', description: 'Full Offline Run']
                ]
            },
            filterable: true, // Optional: enable filtering choices
            multiselect: true  // Enable multi-selection
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

