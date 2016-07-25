<<<<<<< HEAD
import com.domain.auth.*

class BootStrap {

    def init = { servletContext ->
	// def adminRole = Role.findOrSaveWhere(authority:'ROLE_ADMIN')
// def user = User.findOrSaveWhere(username:'admin',password:'password')
def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
def userRole = new Role(authority: 'ROLE_USER').save(flush: true)

def testUser = new User(username: 'anees', password: '1234')
testUser.save(flush: true)


// UserRole.create(user,adminRole,true)
UserRole.create testUser, adminRole, true

assert User.count() == 1
assert Role.count() == 2
assert UserRole.count() == 1

=======
class BootStrap {

    def init = { servletContext ->
>>>>>>> bbf4ba3d5fb142467bb21b699cb55c41ead85efb
    }
    def destroy = {
    }
}
