package com.enrol

class BootStrap {

    def init = { servletContext ->
	def computing=new
	Course(
	department:'Computing',
	code:'CS123',
	title:'BSc Computing',
	leader:'Dr Michelle Murphy',
	startDate: new Date('09/09/2018'), 
	endDate: new Date('07/07/2022'),
	numberOfStudents: 55,
	studyMode:'Fulltime',
	tuitionFees: 9000.60,
	description:'Lorem ipsum dolo sit amet.'
	).save()
    }
    def destroy = {
    }
}
