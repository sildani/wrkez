package com.wrkez

class Department {
	static belongsTo = [company:Company]
    static constraints = { }
	
	String name
	SubDepartment subDept
}
