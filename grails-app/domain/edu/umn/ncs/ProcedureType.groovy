package edu.umn.ncs

class ProcedureType {

	String name

	String toString() { name  }

    static constraints = {
		name blank: false, nullable: false, unique: true, maxSize: 50
    }
}
