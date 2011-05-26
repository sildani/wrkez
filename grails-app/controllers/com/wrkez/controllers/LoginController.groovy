package com.wrkez.controllers

import com.wrkez.User
import java.util.Date

class LoginController {

    def index = {
		redirect(action:'form')
		return false
	}

    def form = {
		if (params.username || params.username == '') {
			def u = User.findByUsername(params.username)
			if (u && u.password == params.password) {
				session.user = u
				redirect(controller:'dashboard', action:'index')
			} else {
				return [username:params.username, failed:true]
			}
		} else {
			return []
		}
	}
}
