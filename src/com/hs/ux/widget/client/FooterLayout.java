package com.hs.ux.widget.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class FooterLayout extends Composite {

	private static FooterLayoutUiBinder uiBinder = GWT
			.create(FooterLayoutUiBinder.class);

	interface FooterLayoutUiBinder extends UiBinder<Widget, FooterLayout> {
	}

	public FooterLayout() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
