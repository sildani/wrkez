package com.wrkez

class SubDepartment {
	static belongsTo = [parentDept:Department]
    static constraints = { }
	
	String name
}
