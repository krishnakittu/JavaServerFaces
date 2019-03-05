package com.mkyong;
import javax.faces.context.FacesContext;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import com.sun.faces.lifecycle.Phase;
public class PerformancePhaseListener implements PhaseListener {

	/**
	 * 
	 */
	private Object obj;
	
	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	private static final long serialVersionUID = 1L;

	public void beforePhase(PhaseEvent phaseEvent) {
		String phaseName = phaseEvent.getPhaseId().toString();
		System.out.println(phaseName);
	}
	
	public void afterPhase(PhaseEvent phaseEvent) {
		String phaseName = phaseEvent.getPhaseId().toString();
		System.out.println(phaseName);
	}
	
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}
}