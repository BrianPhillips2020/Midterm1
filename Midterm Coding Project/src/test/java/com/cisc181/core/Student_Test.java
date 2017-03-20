package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() throws PersonException {
	
		
		
	}

	@Test
	public void testgpa() throws PersonException{
		ArrayList<Course> Courses = new ArrayList<Course>();
		Course C1 = new Course("Chemistry", 5, eMajor.CHEM);
		Course C2 = new Course("Business", 5, eMajor.BUSINESS);
		Course C3 = new Course("CompSci", 5, eMajor.COMPSI);
		Courses.add(C1);
		Courses.add(C2);
		Courses.add(C3);
		
		ArrayList<Student> Students= new ArrayList<Student>();
		
		Student S1 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S2 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S3 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S4 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S5 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S6 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S7 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S8 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S9 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S10 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Students.add(S1);
		Students.add(S2);
		Students.add(S2);
		Students.add(S3);
		Students.add(S4);
		Students.add(S5);
		Students.add(S6);
		Students.add(S7);
		Students.add(S8);
		Students.add(S9);
		Students.add(S10);
		
		ArrayList<Semester> Semesters = new ArrayList<Semester>();
		
		Semester fall = new Semester(new Date(), new Date());
		Semester spring = new Semester(new Date(), new Date());
		Semesters.add(fall);
		Semesters.add(spring);
		
		ArrayList<Section> Sections = new ArrayList<Section>();
		
		Section Sec1 = new Section(1);
		Section Sec2 = new Section(2);
		Section Sec3 = new Section(3);
		Section Sec4 = new Section(4);
		Section Sec5 = new Section(5);
		Section Sec6 = new Section(6);
		Sections.add(Sec1);
		Sections.add(Sec2);
		Sections.add(Sec3);
		Sections.add(Sec4);
		Sections.add(Sec5);
		Sections.add(Sec6);
		
		ArrayList<Enrollment> Enrollments = new ArrayList<Enrollment>();
		for(Student s : Students){
			for(Section sec : Sections){
				Enrollments.add(new Enrollment(s.getStudentID(), sec.getSectionID(), 3));
			}
		}
		
		for(Student s : Students){
			double gpa = 0;
			for(Enrollment e : Enrollments){
				if(s.getStudentID() == e.getStudentID()){
					gpa = gpa + e.getGrade();
				}
			}
			gpa = gpa / 6;
			assertEquals(3,((int) gpa));
		}
		
		for(Course c : Courses){
			double averagegrade = 0;
			for(Section s : Sections){
				if(s.getCourseID() == s.getCourseID()){
					for(Enrollment e : Enrollments){
						if(s.getSectionID() == e.getSectionID()){
							averagegrade = averagegrade + e.getGrade();
						}
					}
					averagegrade = averagegrade / 10;
					assertEquals(3,((int) averagegrade));
				}
			}
		}
		
}
	@Test
	public void testmajor() throws PersonException{
		ArrayList<Course> Courses = new ArrayList<Course>();
		Course C1 = new Course("Chemistry", 5, eMajor.CHEM);
		Course C2 = new Course("Business", 5, eMajor.BUSINESS);
		Course C3 = new Course("CompSci", 5, eMajor.COMPSI);
		Courses.add(C1);
		Courses.add(C2);
		Courses.add(C3);
		
		ArrayList<Student> Students= new ArrayList<Student>();
		
		Student S1 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S2 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S3 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S4 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S5 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S6 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S7 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S8 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S9 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Student S10 = new Student("FirstName", "MiddleName", "LastName",new Date(), eMajor.BUSINESS, "Address","(123)-456-7890", "Email");
		Students.add(S1);
		Students.add(S2);
		Students.add(S2);
		Students.add(S3);
		Students.add(S4);
		Students.add(S5);
		Students.add(S6);
		Students.add(S7);
		Students.add(S8);
		Students.add(S9);
		Students.add(S10);
		
		ArrayList<Semester> Semesters = new ArrayList<Semester>();
		
		Semester fall = new Semester(new Date(), new Date());
		Semester spring = new Semester(new Date(), new Date());
		Semesters.add(fall);
		Semesters.add(spring);
		
		ArrayList<Section> Sections = new ArrayList<Section>();
		
		Section Sec1 = new Section(1);
		Section Sec2 = new Section(2);
		Section Sec3 = new Section(3);
		Section Sec4 = new Section(4);
		Section Sec5 = new Section(5);
		Section Sec6 = new Section(6);
		Sections.add(Sec1);
		Sections.add(Sec2);
		Sections.add(Sec3);
		Sections.add(Sec4);
		Sections.add(Sec5);
		Sections.add(Sec6);
		
		Students.get(0).setMajor(eMajor.COMPSI);
		
		assertEquals(eMajor.COMPSI, Students.get(0).getMajor());
}
}