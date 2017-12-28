
node('maven'){
	stage ('Build') {
		checkout scm
		sh "mvn clean package"
	}
	stage ('Test') {
		sh "mvn fabric8:deploy"
	}
	stage ('Promote') {
		sh "oc tag store-orders:latest store-orders:promoteToQA"
	}	
}
