package edu.umn.ncs



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(ProcedureType)
class ProcedureTypeTests {

    void testNullableFalse() {
		def pt = new ProcedureType()

		assert !pt.validate()
		assert "nullable" == pt.errors["name"].code
    }
}
