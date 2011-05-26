package com.wrkez

class TimeRecord {
	static belongsTo = [assignment:Assignment]
    static constraints = { }
	Date date
	int hours
	int minutes
}
