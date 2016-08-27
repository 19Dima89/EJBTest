package de.dima.beans;

import javax.ejb.Stateless;

@Stateless
public class HelperBean {

	public String normalizeString(String inputValue) {
		StringBuilder sb = new StringBuilder();

		String[] splitResults = inputValue.split("-");

		for (String singleResult : splitResults) {
			sb.append(singleResult);
		}

		return sb.toString();
	}

}
