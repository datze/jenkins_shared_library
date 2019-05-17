package com.github.datze.jenkins_shared_library

// Here you mainly should place help classes or methods for your global "vars". 
// (See examples below.)
//  
// Import in your pipeline script like this:
// @Library('the-name-you-gave-it-in-the-jenkins-config')
// import com.github.datze.jenkins_shared_library.Utils
class Utils {

	def getCurrentBuild() {
    	return currentBuild
	}
	
	def getCurrentBuildNumber() {
    	return currentBuild.number
	}
	
	def isJobStartedManually() {
		def cause = currentBuild.rawBuild.getCause(hudson.model.Cause.UserIdCause.class)
		return cause != null;
	}

}