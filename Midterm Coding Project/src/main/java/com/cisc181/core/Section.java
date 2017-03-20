package com.cisc181.core;

import java.util.UUID;

public class Section {

	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public Section(int RoomID){
		this.CourseID = UUID.randomUUID();
		this.SemesterID = UUID.randomUUID();
		this.SectionID = UUID.randomUUID();
	}

	public UUID getCourseID() {
		return this.CourseID;
	}

	public UUID getSemesterID() {
		return this.SemesterID;
	}

	public UUID getSectionID() {
		return this.SectionID;
	}

	public int getRoomID() {
		return this.RoomID;
	}

	public void setCourseID(UUID CourseID) {
		this.CourseID = CourseID;
	}

	public void setSemesterID(UUID SemesterID) {
		this.SemesterID = SemesterID;
	}
	public void setSectionID(UUID SectionID){
		this.SectionID=SectionID;
	}
	public void setRoomID(int RoomID){
		this.RoomID = RoomID;
		

	}
}
