package tabView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.faces.component.html.HtmlForm;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.PrimeFaces;
import org.primefaces.component.tabview.Tab;
import org.primefaces.component.tabview.TabView;
import org.primefaces.context.PrimeFacesContext;
import org.primefaces.event.TabCloseEvent;

@Named(value="tabViewBean")
@ViewScoped
public class tabViewBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Tab> dynamicTab = new ArrayList<Tab>();

	public List<Tab> getDynamicTab() {
		return dynamicTab;
	}

	public void setDynamicTab(List<Tab> dynamicTab) {
		this.dynamicTab = dynamicTab;
	}

	public tabViewBean() {
		super();
	}

	public void buttonListener(ActionEvent a){
		HtmlForm f=new HtmlForm();
		Tab tempTab = new Tab(); 
		String id="abc"+UUID.randomUUID().toString(); 
		tempTab.setId(id); 
		tempTab.setTitle(id); 
		tempTab.setClosable(true); 
		tempTab.getChildren().add(f); 
		HtmlOutputText t=new HtmlOutputText();
		t.setValue(id);
		tempTab.getChildren().add(t);
		dynamicTab.add(tempTab);
	}

	public void onTabClose(TabCloseEvent event) { 
		Tab tab = event.getTab(); 
		dynamicTab.remove(tab);
		TabView t=(TabView)FacesContext.getCurrentInstance().getViewRoot().findComponent("tabView");
//		TabView t=(TabView)PrimeFacesContext.getCurrentInstance().getViewRoot().findComponent("tabView");
		t.getChildren().remove(tab);
	}

	public void view() {
		PrimeFaces.current().dialog().openDynamic("cars");
		}







}
