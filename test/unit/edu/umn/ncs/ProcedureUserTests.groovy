package edu.umn.ncs

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(ProcedureUser)
class ProcedureUserTests {

    void testConstraints() {
       def existingProcedureUser = new ProcedureUser( 
		   username: 'ngp',
		   firstName: 'Natalya',
		   lastName: 'Portnov'
	   )

	   //validate should fail if username is null
	   def procedureUser = new ProcedureUser()

	   assert !procedureUser.validate()
	   assert 'nullable' == procedureUser.errors['username'].code

	   //Validate should pass
	   procedureUser = new ProcedureUser(username: 'sqv', firstName: 'Simone', lastName: 'Vuong')
	   assert procedureUser.validate()

    }
}
