class SecurityFilters {
	
	def filters = {
		
		loginCheck(controller:'login', invert:true) {
			before = {
				if (!session.user) {
					redirect(controller:'login', action:'form')
					return false
				}
			}
		}
		
	}
	
}