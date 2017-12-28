node('maven'){
	stage ('Build') {
		checkout scm
		sh "mvn clean package"
	}
	stage ('Test') {
		sh "mvn fabric8:deploy"
	}
	stage ('Promote') {
		sh "oc tag myproject/orders:latest myproject/orders:promoteToQA"
	}	
}
