package com.company.depinv_v2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.company.depinv.JSONFormatter;
import com.company.depinv.Message;

public class MainV2 {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("This is a message v2");
		MessagePrinterV2 printer = new MessagePrinterV2();
		try(PrintWriter writer = new PrintWriter(new FileWriter("test_v2.txt"))) {
			printer.writeMessage(msg, new JSONFormatter(), writer);
		}
	}

}
