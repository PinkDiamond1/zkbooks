package org.zkoss.reference.developer.spring.scope;

import org.springframework.stereotype.Component;

@Component
public class SystemConfiguration {
	private String value = "my configuration";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
