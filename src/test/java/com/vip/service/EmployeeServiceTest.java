package com.vip.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.vip.entity.Employee;
import com.vip.services.EmployeeSerivces;
import com.vip.servicesimpl.EmployeeServicesImpl;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.vip.service.*")
public class EmployeeServiceTest {

	@Test
	public void findAllEmployee() {
		EmployeeSerivces mockSerivces = mock(EmployeeServicesImpl.class);
		PowerMockito.when(mockSerivces.findAllEmployee()).thenReturn(new ArrayList<Employee>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(new Employee("Vipul", "Tiwari", "Email@gmail.com"));
				new Employee("Vipeen", "Tiwari", "Email@gmail.com");
			}
		});
		assertNotNull(mockSerivces.findAllEmployee());
	}
}
