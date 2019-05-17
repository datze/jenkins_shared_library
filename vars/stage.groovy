// "overwrites" the stage step and to add specific actions before and after each stage
// https://jenkins.io/doc/pipeline/steps/pipeline-stage-step/

def call(STAGE_NAME, Closure closure) {

	// do something before, like logging, downloads, metrics, log in, triggers, ...

    def res = steps.stage(STAGE_NAME) {
    	closure.call()
    }

    // do something afterwards

    return res
}
