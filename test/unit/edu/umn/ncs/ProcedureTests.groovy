package edu.umn.ncs

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Procedure)
@Mock([ProcedureType, ProcedureUser, Location])
class ProcedureTests {

    void testValidateDateBackInOffsiteStorage() {
		def today = new Date()
		def yesterday = today - 1
	    def tomorrow = today + 1

		def p = getProcedure()

		p.dateProcedurePerformed = yesterday
		p.datePutBackInOffsiteStorage = today

//		mockForContraintsTests(Procedure)
//		assert p.validate()
/*
		p.dateProcedurePerformed = today
		p.datePutBackInOffsiteStorage = yesterday

		assert !p.validate()
		assert "validator" == p.errors["datePutBackInOffsiteStorage"].code
*/
	}

	private Procedure getProcedure() {

		def pu = new ProcedureUser(
			username: 'sqv',
			firstName: 'Simone',
			lastName: 'Vuong'
		)
		
		Date dpp = new Date()

		ProcedureType pt = new ProcedureType(name: 'backup')

		def lmc = new Location(name: 'McNamara',
			address: '200 SE Oak St',
			city: 'Minneapolis',
			state: 'MN',
			zipCode: 55455,
			zip4: 1111)

		def lmo = new Location(name: 'Mayo')

       def pd = new Procedure(
		   hardDriveNumber: 1,
		   procedureUser: pu,
		   type: pt,
		   dateProcedurePerformed: dpp,
		   locationOffsiteStorageRemoved: lmc,
		   locationProcedurePerformed: lmo,
		   locationOffsiteStoragePutBack: lmc
	   )
       pd		
	}
}
