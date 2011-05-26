package com.wrkez

class Role {
	static belongsTo = User
	static hasMany = [users:User]
    static constraints = { }
	
	String name
}
