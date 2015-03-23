package com.github.jacquet.sonar;

import java.io.Serializable;
import java.util.Collections;

import lombok.RequiredArgsConstructor;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;

@RequiredArgsConstructor
public class Test implements Serializable {
	private static final long serialVersionUID = 8928414860315448801L;

	private SomeService service;

	public Resources<Resource<SomeBean>> test() {
		Iterable<SomeBean> list = Collections.singletonList(new SomeBean());
		return Resources.wrap(list);
	}
}
