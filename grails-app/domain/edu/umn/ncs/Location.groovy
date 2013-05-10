package edu.umn.ncs

class Location {

	String name
	String address
	String city
	String state
	Integer zipCode
	Integer zip4

	Date dateCreated = new Date()

	String toString() { name  }
    static constraints = {

		name blank: false, maxSize: 50
		address nullable: true, maxSize: 64
		city nullable: true, maxSize: 30
		state nullable: true, maxSize: 2
		zipCode nullable:true, max: 99999, min: 0
		zip4 nullable: true, max: 9999, min: 0

		dateCreated()

    }
}
