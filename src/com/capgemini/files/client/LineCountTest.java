package com.capgemini.files.client;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.model.LineCount; 

public class LineCountTest {
	private LineCount lineCount1;
	@Test
	public void testTheNumberOfLinesInFile() throws IOException {
		lineCount1=new LineCount("C:\\Madhu Kiran\\Git assignments");
		assertEquals(8,lineCount1.lineCount());
		
	}
	

	

}

