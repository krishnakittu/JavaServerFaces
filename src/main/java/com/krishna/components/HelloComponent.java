package com.krishna.components;

import java.io.IOException;
import java.util.Map;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

@FacesComponent(createTag = true, tagName = "helloComponent" ,namespace = "http://krishna.com/tags" )
public class HelloComponent extends UIComponentBase{

	@Override
	public String getFamily() {
		// TODO Auto-generated method stub
		return 	"Greeting";
	}
	
	public void encodeBegin(FacesContext fc) throws IOException{
		Map<String, Object> attributes=getAttributes();
		ResponseWriter rs=fc.getResponseWriter();
		rs.startElement("p", this);
		rs.write("Message" 	);
		
	}
	
	

}
