package br.com.teste.struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.LabelValueBean;

import br.com.teste.struts.data.CountryData;
import br.com.teste.struts.form.InputForm;

public class InputAction extends Action {
    private final static String SUCCESS = "success";
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
    		HttpServletResponse response) throws Exception {

    	InputForm inputForm = (InputForm) form;
        ArrayList countryList = new ArrayList();
        ArrayList stateList = new ArrayList();
        

        countryList.add(new CountryData("1", "USA"));
        countryList.add(new CountryData("2", "Canada"));
        countryList.add(new CountryData("3", "Mexico"));

        stateList.add(new LabelValueBean("New York", "1"));
        stateList.add(new LabelValueBean("California", "2"));
        stateList.add(new LabelValueBean("Los Angeles", "3"));
        
        inputForm.setCountryList(countryList);
        inputForm.setStateList(stateList);
        
        request.setAttribute("lista", countryList);

        return mapping.findForward(SUCCESS);
    }

}
