package edu.umn.ncs

class Procedure {

	Integer hardDriveNumber
	ProcedureUser procedureUser
	ProcedureType type

	Location locationOffsiteStorageRemoved
	Date dateRemovedFromOffsiteStorage

	Location locationProcedurePerformed
	Date dateProcedurePerformed

	Location locationOffsiteStoragePutBack
	Date datePutBackInOffsiteStorage

	Date dateCreated = new Date()

	String toString() {
		"Hard drive: ${hardDriveNumber}  Procedure type: ${type.name}   performed by: ${procedureUser.username}"
	}

	static afterDateProcedurePerformed = {val, obj ->
		return obj.properties['dateProcedurePerformed'] >= val
	}

	static beforeDateProcedurePerformed = {val, obj ->
		return obj.properties['dateProcedurePerformed'] >= val
	}

    static constraints = {
		hardDriveNumber inList: [1,2]
		dateRemovedFromOffsiteStorage nullable: true, validator: beforeDateProcedurePerformed
		dateProcedurePerformed max: new Date()
		datePutBackInOffsiteStorage nullable: true, validator: afterDateProcedurePerformed
    }
}
