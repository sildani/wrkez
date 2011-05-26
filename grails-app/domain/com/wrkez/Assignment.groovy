package com.wrkez

class Assignment {
	static hasMany = [timeRecords:TimeRecord]
    static constraints = { }
	User temp
	Date startDate
	Date endDate
	Project project
}
