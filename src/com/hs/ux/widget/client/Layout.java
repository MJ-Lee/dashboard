package com.hs.ux.widget.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Layout extends Composite  {

	private static ContentUiBinder uiBinder = GWT.create(ContentUiBinder.class);

	interface ContentUiBinder extends UiBinder<Widget, Layout> {
	}

	public Layout() {
		initWidget(uiBinder.createAndBindUi(this));
	}


}
