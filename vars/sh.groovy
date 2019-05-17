def call(String script, String encoding=null, String label=null, boolean returnStatus=null, boolean returnStdout=null) {
    timestamps {
        // AnsiColor plugin required: https://wiki.jenkins.io/display/JENKINS/AnsiColor+Plugin
	    ansiColor('xterm') {
            return steps.sh(script: script, endoding: encoding, label: label, returnStatus: returnStatus, returnStdout: returnStdout)
        }
    }
}

def call(Map params = [:]) {
    return call(params.script, params.get('encoding', null), params.get('label', null), params.get('returnStatus', false), params.get('returnStdout', false)) 
}