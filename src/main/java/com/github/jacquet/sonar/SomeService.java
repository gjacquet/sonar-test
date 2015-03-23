package com.github.jacquet.sonar;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class SomeService implements Serializable {
	@Autowired
	private Test test;

	public void doStuff() {
		test.test();
	}
}
