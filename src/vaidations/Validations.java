/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaidations;

import admin.RegisterEmp;
import static java.awt.PageAttributes.MediaType.A;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validations 
{
    private Pattern name,phone,email,pass;
    private Matcher matcher;
    private static final String NAME_PATTERN="^[A-Z][a-zA-Z][^#&<>\\\"~;$^%{}?]{1,20}$";
    private static final String PHONE_PATTERN="[6789]{1}[0-9]{9}";
    private static final String PASS_PATTERN="^[A-za-z0-9]{3,25}$";
  
    private static final String EMAIL_PATTERN= "^(.+)@(.+)$";    
    
    public Validations()
    {
        name=Pattern.compile(NAME_PATTERN);
        phone=Pattern.compile(PHONE_PATTERN);
        email=Pattern.compile(EMAIL_PATTERN);
        pass=Pattern.compile(PASS_PATTERN);
    }
    public boolean  nameValidate(final String name1)
    {
        matcher=name.matcher(name1);
        return matcher.matches();
    }
    public boolean  phoneValidate(final String phone1)
    {
        matcher=phone.matcher( phone1);
        return matcher.matches();
    }
    public boolean emailvaidate(final String email1)
    {
        matcher=email.matcher(email1);
        return matcher.matches();
    }
     public boolean passvaidate(final String pass1)
    {
        matcher=pass.matcher(pass1);
        return matcher.matches();
    }
    
    
}
