def call(java.util.List theEnv, Closure closure) {

	// do something before, like logging, downloads, metrics, log in, triggers, ...
	
    def res = steps.withEnv(theEnv) {
    	closure.call()
    }
    
    // do something afterwards
    
    return res
}
