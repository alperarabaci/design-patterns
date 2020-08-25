package com.coffeepoweredcrew.chainofresponsibility;

import java.time.LocalDate;

import com.coffeepoweredcrew.chainofresponsibility.LeaveApplication.Type;

public class Client {
	
	private static LocalDate now = LocalDate.now();

	public static void main(String[] args) {
		LocalDate tomorrow = now.plusDays(1);
		testCase(tomorrow, Type.Sick);

		LocalDate day10 = now.plusDays(10);
		testCase(day10, Type.Sick);
	   
		LocalDate day30 = now.plusDays(30);
		testCase(day30, Type.PTO);
	}

	private static void testCase(LocalDate to, Type type) {
		LeaveApplication application = LeaveApplication.getBuilder()
												.withType(type)
												.from(now)
												.to(to)
												.build();
		
		System.out.println(application);
		
		LeaveApprover approver = createChain();
		approver.processLeaveApplication(application);
		
		System.out.println(application);
		System.out.println("------------------------------");
	}

	private static LeaveApprover createChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead lead = new ProjectLead(manager);
		return lead;
	}
}
