package com.github.jacquet.sonar;

import org.springframework.beans.factory.annotation.Autowired;

public class SomeService23 {
	@Autowired
	private Test test;

	public void doStuff() {
		test.test();
	}
}
