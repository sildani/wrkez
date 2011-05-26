package com.wrkez

class Project {
	static belongsTo = [company:Company]
	static constraints = { }
	
	String name
}
