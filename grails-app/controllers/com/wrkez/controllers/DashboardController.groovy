package com.wrkez.controllers

class DashboardController {

    def index = {
		redirect(action:'main')
		return false
	}
	
	def main = { }
}
