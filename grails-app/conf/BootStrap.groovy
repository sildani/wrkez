import com.wrkez.Company
import com.wrkez.User
import com.wrkez.Role
import com.wrkez.Department
import com.wrkez.Project

class BootStrap {

    def init = { servletContext ->
		def staffingCompany = new Company(name:'One Source Hospitality').save()
		
		def staffingManager = new User(username:'jsilva', firstName:'Jose',
			lastName:'Silva', password:'jsilva', company:staffingCompany,
			roles:[new Role(name:'Staffing Manager')]).save()
		
		def temp = new User(username:'dsilva', firstName:'Daniel',
			lastName:'Silva', password:'dsilva', company:staffingCompany,
			roles:[new Role(name:'Temp')]).save()
		
		def clientCompany = new Company(name:'Marriott',
			departments:[new Department(name:'Housekeeping')],
			projects:[new Project(name:'Temporary Housekeeping Staff')]).save()
			
		def manager = new User(username:'pthurdekoos', firstName:'Pablo',
				lastName:'Thurdekoos', password:'pthurdekoos',
				company:clientCompany,
				roles:[new Role(name:'Client Manager')]).save()
		
    }

    def destroy = {
    }
}
