package com.enrol

class BootStrap {

    def init = { servletContext ->


	def tom= new
	Leader(
	fullName:'Dr Tom Donaldson',
	department:'Computing', 
	subject:'Reader',
	leaderEmail:'t.donoldson@email.com',
	username:'tdonald',
	password:'secret', 
	office:'B9432',
	bio:'Lorem ipsum dolor sit amet').save()

	def jack= new
	Leader(
	fullName:'Dr Tom Donaldson',
	department:'Computing', 
	subject:'Reader',
	leaderEmail:'t.donoldson@email.com',
	username:'tdonald',
	password:'secret', 
	office:'B9432',
	bio:'Lorem ipsum dolor sit amet').save()


	def emma= new
	Leader(
	fullName:'Dr Tom Donaldson',
	department:'Computing', 
	subject:'Reader',
	leaderEmail:'t.donoldson@email.com',
	username:'tdonald',
	password:'secret', 
	office:'B9432',
	bio:'Lorem ipsum dolor sit amet').save()

	def Computing=new
	Course(
	department : 'Computing',
	code: 'CS123',
	title: 'BSc Hon Computing', 
	leader:tom, 
	startDate:new Date('09/09/2018'), 
	endDate:new Date('07/07/2022'), 
	numberOfStudents: 55, 
	studyMode:'Fulltime', 
	tuitionFees: 9000.60,
	description: 'Computing is cool').save()
	
	def Maths=new
	Course(
	department : 'Maths',
	code: 'M123',
	title: 'BSc Hon Maths', 
	leader:jack, 
	startDate:new Date('09/09/2018'), 
	endDate:new Date('07/07/2022'), 
	numberOfStudents: 55, 
	studyMode:'Fulltime', 
	tuitionFees: 9000.60,
	description: 'Computing is cool').save()

	def English=new
	Course(
	department : 'English',
	code: 'E123',
	title: 'BSc Hon English', 
	leader:emma, 
	startDate:new Date('09/09/2018'), 
	endDate:new Date('07/07/2022'), 
	numberOfStudents: 55, 
	studyMode:'Fulltime', 
	tuitionFees: 9000.60,
	description: 'Computing is cool').save()



	def lect1= new 
	Lecturer(
	fullName:'Dr Steve Crossbar',
	post:'Lecturer', 
	lecturerEmail:'s.h.crossbar@theUni.ac.uk',
	subject:'Web Design',
	office:'Office-2211',
	bio:'Lorem ipsum dolor sit amet.').save()
	
	def module1= new 
	Module(
	title:'System Architectures',
	code:'Sys234',
	credits:20,
	lecturer:'Dr Steve Crossbar',
	course:'Bsc Hon Computing',
	description:'Lorem ipsum dolo sit amet').save()
	
	def student1= new
	Student(
	name:'Jane Armado', 
	studentID:'b38845',
	dob:new Date('10/11/1996'), 
	email:'kst@email.com',
	isFundingAvaliable:true,
	username:'rvg96',
	password:'secret',
	course:Computing).save()

	def student2= new
	Student(
	name:'Jess Saunby', 
	studentID:'b38845',
	dob:new Date('10/11/1996'), 
	email:'kst@email.com',
	isFundingAvaliable:true,
	username:'rvg96',
	password:'secret',
	course:Maths).save()

	def student3= new
	Student(
	name:'Emma Smith', 
	studentID:'b38845',
	dob:new Date('10/11/1996'), 
	email:'kst@email.com',
	isFundingAvaliable:true,
	username:'rvg96',
	password:'secret',
	course:English).save()
	
	
    }
    def destroy = {
    }
} 
