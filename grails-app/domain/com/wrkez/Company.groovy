package com.wrkez

class Company {
	static hasMany = [departments:Department, projects:Project, users:User]
    static constraints = { }
	
	String name
}
