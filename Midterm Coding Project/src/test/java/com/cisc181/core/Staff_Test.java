package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;
import com.cisc181.eNums.*;
public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() throws PersonException {
		Staff staff1 = new Staff("Name1", "Name2","Name3",new Date(),"Address","(123)-456-7890","Email","OfficeHours", 5, 5.00, new Date(), eTitle.MR);
		Staff staff2 = new Staff("Brian", "Richard","Phillips",new Date(),"Delaware","(123)-456-7890","imawesome@awesome.com","Tuesdays", 100, 5.00, new Date(), eTitle.GURU);
		Staff staff3 = new Staff("Jacob", "Idontknow","therestofhisname",new Date(),"Delaware","(123)-456-7890","newrandomemail@yeah.com","Wednesday", 0, 5.00, new Date(), eTitle.BARBER);
		Staff staff4 = new Staff("Steve", "Steven","Stevenson",new Date(),"Somewhere","(123)-456-7890","stevesemail@email.com","never", 5, 8.79, new Date(), eTitle.DR);
		Staff staff5 = new Staff("Michael", "J","Fox",new Date(),"Hill Valley, California","(888)-888-8888","calvinkline@thatscenewasgross.com","yesterday", 88, 1.21, new Date(), eTitle.DR);
		
		double expectedavg = (5 + 5 + 5 + 8.79 + 1.21)/5;
		int exp = ((int) expectedavg);
		double actualavg = (staff1.getSalary()+staff2.getSalary()+staff3.getSalary()+staff4.getSalary()+staff5.getSalary())/5;
		int act = ((int) actualavg);
		assertEquals(exp,act);
	}	
	@Test (expected = PersonException.class)
	public void TestPhone() throws PersonException{
		
		Staff staff1 = new Staff("Name1", "Name2","Name3",new Date(),"Address","123-456-7890","Email","OfficeHours", 5, 5.00, new Date(), eTitle.MR);
		
	}
	
	@Test(expected = PersonException.class)
	public void TestDOB() throws PersonException{
		
		Staff staff1 = new Staff("Name1", "Name2","Name3",new Date(-200, 20, 20),"Address","(123)-456-7890","Email","OfficeHours", 5, 5.00, new Date(), eTitle.MR);
		
	}

}
