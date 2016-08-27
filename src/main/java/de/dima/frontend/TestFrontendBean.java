package de.dima.frontend;

import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.dima.beans.HelperBean;

@Stateful
@Named("testFrontendBean")
@SessionScoped
public class TestFrontendBean {

	@Inject
	private HelperBean hBean;

	private String inputValue;

	public String getInputValue() {
		return inputValue;
	}

	public void setInputValue(String inputValue) {
		this.inputValue = inputValue;
	}

	public String normalizeInput() {
		this.inputValue = hBean.normalizeString(this.inputValue);
		return null;
	}

}
