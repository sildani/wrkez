package com.wrkez.controllers

class LogoutController {

    def index = {	
		redirect(action:'notice')
		return false
	}
	
	def notice = {
		session.invalidate()
	}
}
