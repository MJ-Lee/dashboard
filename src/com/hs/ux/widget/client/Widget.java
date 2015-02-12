package com.hs.ux.widget.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Widget implements EntryPoint {

	public void onModuleLoad() {
		RootPanel.get("container").add(new MainContainer());
	}
}
