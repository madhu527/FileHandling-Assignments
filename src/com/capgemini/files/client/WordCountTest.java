package com.capgemini.files.client;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.model.WordCount;

public class WordCountTest {
	private WordCount wordCount;

	@Test
	public void testTheWordCount() throws IOException {
		wordCount = new WordCount("C:\\Madhu Kiran\\Git assignments");
		assertEquals(10, wordCount.wordCountInFile());
	}

}
