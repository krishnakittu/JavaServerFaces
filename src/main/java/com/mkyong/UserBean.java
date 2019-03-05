package com.mkyong;
 

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named(value ="bean")
@ViewScoped
public class UserBean implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String registerAction(){
		return "result";
	}
	
	public void actionMethod(ActionEvent e){
		
		 FacesContext context = FacesContext.getCurrentInstance();
//		 UIComponent composite = context.getApplication().getViewHandler()
//		        .getViewDeclarationLanguage(context, context.getViewRoot().getViewId())
//		        .createComponent(context, "http://xmlns.jcp.org/jsf/composite/mkyong", "testComposite", null);
//		    composite.setId(id);
		 
		 
//		UIComponent component = FacesContext.getCurrentInstance().getApplication().getViewHandler()
//				.getViewDeclarationLanguage(FacesContext.getCurrentInstance(), FacesContext.getCurrentInstance().getViewRoot().getViewId())
//				.createComponent(FacesContext.getCurrentInstance(), "http://xmlns.jcp.org/jsf/composite/mkyong", "register", null);
//		
//		component.setId("saurabh");
//		((HtmlForm)context.getViewRoot().findComponent("form2")).getChildren().add(component);
		System.out.println("abavd");
	}
}