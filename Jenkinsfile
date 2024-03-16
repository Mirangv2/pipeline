@Library('pipeline')

// Import necessary functions from separate files
import com.acceleratedskillup.*;

properties([
  parameters([
    // Existing Environment parameter with cascading host selection
    [
      $class: 'ChoiceParameter',
      choiceType: 'PT_SINGLE_SELECT',
      name: 'Environment',
      script: [
        $class: 'ScriptlerScript',
        scriptlerScriptId:'Environments.groovy'
      ]
    ],
    [
      $class: 'CascadeChoiceParameter',
      choiceType: 'PT_SINGLE_SELECT',
      name: 'Host',
      referencedParameters: 'Environment',
      script: [
        $class: 'ScriptlerScript',
        scriptlerScriptId:'HostsInEnv.groovy',
        parameters: [
          [name:'Environment', value: '$Environment']
        ]
      ]
    ],
    // New parameter for Offline Run options
    [
      $class: 'ChoiceParameter',
      choiceType: 'PT_SINGLE_SELECT',
      name: 'OfflineRun',
      choices: ['SanityOffline Run', 'OfflineRun']
    ]
  ])
])

pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo "${params.Environment}"
        echo "${params.Host}"
        echo "${params.OfflineRun}" // Access the newly added parameter
      }
    }
  }
}
