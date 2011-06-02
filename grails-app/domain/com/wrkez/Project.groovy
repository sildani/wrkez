package com.wrkez

class Project {
	static belongsTo = [company:Company]
	static hasMany = [managers:User]
	static constraints = { }
	
	String name
}
