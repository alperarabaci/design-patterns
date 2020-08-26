package com.coffeepoweredcrew.command.ex1;

//A Concrete implementation of Command.
public class AddMemberCommand implements Command {

	private String emailAddress;
	
	private String listName;
	
	private EWSService receiver;
	
	public AddMemberCommand() {
	
	}
	
	public AddMemberCommand(String emailAddress, String listName, EWSService receiver) {
		super();
		this.emailAddress = emailAddress;
		this.listName = listName;
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		System.out.println("AddMemberCommand.execute...");
		receiver.addMember(emailAddress, listName);
	}
		
	

}
