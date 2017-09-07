package br.com.teste.struts.form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import br.com.teste.struts.data.CountryData;
import lombok.Getter;
import lombok.Setter;

public class InputForm extends ActionForm{
	
	// holds the country selected by the user
	@Getter @Setter
	private String country;
	// holds the state selected by the user.
	@Getter @Setter
	private String state;
	// holds the list of countries to be displayed.
	@Getter @Setter
	private ArrayList<CountryData> countryList;
	// holds the list of state to be displayed.
	@Getter @Setter
	private ArrayList stateList;

}
