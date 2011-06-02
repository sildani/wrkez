import com.wrkez.Company
import com.wrkez.User
import com.wrkez.Role
import com.wrkez.Department
import com.wrkez.Project

class BootStrap {

    def init = { servletContext ->
		def oneSource = new Company(name:'One Source Hospitality').save()
		def staffingManagerRole = new Role(name:'Staffing Manager').save()
		def tempRole = new Role(name:'Temp').save()
		def housekeepingDept = new Department(name:'Housekeeping').save()
		def staffingProject = new Project(name:'Temporary Housekeeping Staff').save()
		def clientManagerRole = new Role(name:'Client Manager').save()
		
		def jose = new User(username:'jsilva', firstName:'Jose',
			lastName:'Silva', password:'jsilva', company:oneSource,
			roles:[staffingManagerRole]).save()
		
		def temp = new User(username:'dsilva', firstName:'Daniel',
			lastName:'Silva', password:'dsilva', company:oneSource,
			roles:[tempRole]).save()
		
		def marriott = new Company(name:'Marriott',
			departments:[housekeepingDept], projects:[staffingProject]).save()
			
		def pablo = new User(username:'pthurdekoos', firstName:'Pablo',
				lastName:'Thurdekoos', password:'pthurdekoos',
				company:marriott, roles:[clientManagerRole]).save()
				
		def project = Project.findByName('Housekeeping')
		project.company = marriott
		project.managers = [pablo]
		project.save()
		
    }

    def destroy = {
    }
}
