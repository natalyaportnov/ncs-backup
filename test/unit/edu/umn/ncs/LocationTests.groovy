package edu.umn.ncs



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Location)
class LocationTests {

    void testConstraints() {
		mockForConstraintsTests(Location, [])

		def l = new Location(name: "MAC",
							 address: "200 SE Oak Street",
							 city: "Minneapolis",
							 state: "MN",
							 zipCode: 55455,
							 zip4: 1234		 
		)

		assertTrue("Location should validate", l.validate())

		l = new Location(name: " ")

		assertFalse("Location should not validate.", l.validate())
		assertEquals("Name should fail blank validation", "blank", l.errors["name"])


    }
}
