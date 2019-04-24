
package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="testprop")
public class TestProperties {

	private boolean visibleEveryThings;

	public boolean isVisibleEveryThings() {
		return visibleEveryThings;
	}

	public void setVisibleEveryThings(boolean visibleEveryThings) {
		this.visibleEveryThings = visibleEveryThings;
	}
	
}
