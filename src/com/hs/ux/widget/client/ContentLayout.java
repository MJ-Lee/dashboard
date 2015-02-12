package com.hs.ux.widget.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ContentLayout extends Composite  {

	private static ContentLayoutUiBinder uiBinder = GWT
			.create(ContentLayoutUiBinder.class);

	interface ContentLayoutUiBinder extends UiBinder<Widget, ContentLayout> {
	}

	public ContentLayout() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
