package com.gaurav.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmpBusinessLogicTest {

	@InjectMocks
	EmpBusinessLogic empBusinessLogic;

	EmployeeDetails employee;

	@Mock
	EmployeeDetails employeeMock;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");
	}

	@Before
	public void before() {
		System.out.println("Instantiating Object ... ");
		empBusinessLogic = new EmpBusinessLogic();
		employee = new EmployeeDetails("Rajeev", 8000, 26);
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("in after class");
	}

	@After
	public void after() {
		System.out.println("Deleting Object ... ");
		empBusinessLogic = null;
		employee = null;
	}
	
	@Test(timeout = 1)
	public void testCalculateYearlySalary() {
		int salary = empBusinessLogic.calculateYearlySalary(employee);
		System.out.println("salary ... " + salary);
		assertEquals(96000, salary,0.0);
	}
	
	@Ignore("Not Ready to Run")
	@Test
	public void testCalculateAppraisal() {
		int appraisal = empBusinessLogic.calculateAppraisal(employee);
		System.out.println("appraisal ... " + appraisal);
		assertEquals(500, appraisal, 0.0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalculateAppraisalWithMockito() {
		EmployeeDetails emp = new EmployeeDetails("GARG",9000, 21);
		when(employeeMock.getEmployee()).thenReturn(emp);
		assertEquals(500, empBusinessLogic.calculateAppraisal(employeeMock.getEmployee()));
	}
	

	@Test(expected = ArithmeticException.class)
	public void divisionWithException() {
		int i = 1 / 0;
	}
	
	@Test
	public void assertMethods() {
		int salary = empBusinessLogic.calculateYearlySalary(employee);
		int appraisal = empBusinessLogic.calculateAppraisal(employee);
		
		assertTrue(salary>appraisal);
		//assertFalse(salary>appraisal);
		//assertNull(employee);
		assertNotNull(employee);
	}

}
