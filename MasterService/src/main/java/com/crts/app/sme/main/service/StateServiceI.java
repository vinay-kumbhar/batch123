package com.crts.app.sme.main.service;

import com.crts.app.sme.main.model.State;

public interface StateServiceI 
{


	public void saveState(State state);

	public Iterable<State> getState(String countryCode);

}
