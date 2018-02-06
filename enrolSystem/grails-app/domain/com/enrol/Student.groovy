package com.enrol

class Student {

	String name 
	String studentID
	Date dob
	Boolean isFundingAvaliable
	String email
	String username
	String password
	Course course
	

	String toString(){
	"$name, $studentID, $course" 
	} 




    static constraints = {
	name blank:false, nullable:false
	studentID blank:false, nullable:false
	dob blank:false, nullable:false
	email blank:false, nullable:false, email:true
	username blank:false, nullable:false 
	password blank:false, nullable:false 
	isFundingAvaliable blank:false, nullable:false
	course blank:false, nullable:false
	
    }
}
