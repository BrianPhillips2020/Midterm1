package com.cisc181.core;

import java.util.UUID;
import java.util.Date;

public class Semester {

	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;

	public Semester(Date StartDate, Date EndDate){
		this.SemesterID = UUID.randomUUID();
	}
	
	public UUID getSemesterID() {
		return this.SemesterID;
	}

	public Date getStartDate() {
		return this.StartDate;
	}

	public Date getEndDate() {
		return this.EndDate;
	}

	public void setSemesterID(UUID SemesterID) {
		this.SemesterID = SemesterID;
	}

	public void setStartDate(Date StartDate) {
		this.StartDate = StartDate;
	}

	public void setEndDate(Date EndDate) {
		this.EndDate = EndDate;
	}
}
