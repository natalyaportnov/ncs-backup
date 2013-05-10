package edu.umn.ncs

class ProcedureUser {

	String username
	String firstName
	String lastName

	String toString() {
		if (firstName && lastName) {
			"${firstName} ${lastName}"
		} else {
			username
		}
	}

    static constraints = {
		username blank: false, unique: true
    }
}
