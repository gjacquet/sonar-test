package com.github.jacquet.sonar;

import java.util.Collections;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;

public class Test {
	public Resources<Resource<SomeBean>> test() {
		Iterable<SomeBean> list = Collections.singletonList(new SomeBean());
		return Resources.wrap(list);
	}
}
