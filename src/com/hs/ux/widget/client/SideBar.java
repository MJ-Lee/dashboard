package com.hs.ux.widget.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class SideBar extends Composite  {

	private static SideBarUiBinder uiBinder = GWT.create(SideBarUiBinder.class);

	interface SideBarUiBinder extends UiBinder<Widget, SideBar> {
	}

	public SideBar() {
		initWidget(uiBinder.createAndBindUi(this));
	}


}
