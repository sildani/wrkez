package com.wrkez

class User {
	static belongsTo = [company:Company]
	static hasMany = [roles:Role]
    static constraints = { }
    
	String username
	String password
    String firstName
    String lastName
}