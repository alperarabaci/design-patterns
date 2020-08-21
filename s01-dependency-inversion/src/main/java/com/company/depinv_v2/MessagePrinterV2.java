package com.company.depinv_v2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.company.depinv.Formatter;
import com.company.depinv.JSONFormatter;
import com.company.depinv.Message;

public class MessagePrinterV2 {

	//Writes message to a file
	public void writeMessage(Message msg, Formatter formatter, PrintWriter writer) throws IOException {

		writer.println(formatter.format(msg)); //formats and writes message
		writer.flush();

		
	}
}
