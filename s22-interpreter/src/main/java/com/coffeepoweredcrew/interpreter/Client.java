package com.coffeepoweredcrew.interpreter;

public class Client {

	public static void main(String[] args) {
		Report report1 = new Report("Cashflow Report", "NOT ADMIN");
		ExpressionBuilder builder = new ExpressionBuilder();
		
		PermissionExpression exp = builder.build(report1);
		System.out.println(exp);
		
		User user1 = new User("Dave", "USER", "ADMIN");
		System.out.println("User access report:" + exp.interpret(user1));

		System.out.println("---------- ---------- ---------- ----------");
		
		Report report2 = new Report("Cashflow Report 2", "ADMIN");
		
		PermissionExpression exp2 = builder.build(report2);
		System.out.println(exp2);
		
		User user2 = new User("Dave", "USER", "ADMIN");
		System.out.println("User access report:" + exp2.interpret(user2));
		
		System.out.println("---------- ---------- ---------- ----------");
		
		Report report3 = new Report("Cashflow Report 3", "FINANCE_USER OR ADMIN");
		
		PermissionExpression exp3 = builder.build(report3);
		System.out.println(exp3);
		
		User user3 = new User("Dave", "USER", "ADMIN");
		System.out.println("User access report:" + exp3.interpret(user3));
	}

}
