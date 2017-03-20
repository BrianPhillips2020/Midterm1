package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

	
	
	public UUID getSectionID() {
		return this.SectionID;
	}

	public UUID getStudentID() {
		return this.StudentID;
	}

	public UUID getEnrollmentID() {
		return this.EnrollmentID;
	}

	public double getGrade() {
		return this.Grade;
	}

	private Enrollment() {
	}

	public Enrollment(UUID student, UUID section, double Grade) {
		this.EnrollmentID = UUID.randomUUID();
	}
	public void setGrade(double Grade){
		this.Grade = Grade;
	}
}
