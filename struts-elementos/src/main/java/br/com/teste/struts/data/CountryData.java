package br.com.teste.struts.data;

import lombok.Getter;
import lombok.Setter;

public class CountryData {
	@Getter @Setter
	private String cod;
	@Getter @Setter
	private String country;
	public CountryData(String cod, String country) {
		super();
		this.cod = cod;
		this.country = country;
	}
}
