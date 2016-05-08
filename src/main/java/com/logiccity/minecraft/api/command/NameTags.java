/*
 * Copyright � 2015 modByKids contributors
 * All rights reserved.
 */

package com.logiccity.minecraft.api.command;

import com.logiccity.minecraft.api.impl.CustomCommandBase;

public class NameTags extends CustomCommandBase {

	private NameTags() {
		super("NameTags", "G");
	}
	
	@Override
	public void execute(final String[] args) {
		if (args != null && args.length > 0) {
			gameControl.setPlayerLabelScale(Float.parseFloat(args[0]));
		} else {
			gameControl.setPlayerLabelScale(2);
		}
	}
}
