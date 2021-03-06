/*
 * Copyright � 2015 modByKids contributors
 * All rights reserved.
 */

package com.logiccity.minecraft.api.command.demo;

import com.logiccity.minecraft.api.impl.CustomModCommandBase;

public class Sneak extends CustomModCommandBase {

	private Sneak() {
		super("Sneak");
	}

	@Override
	public void initCmd(String[] args) {
		gameControl.sendSneakingStartStopPacket(true);
	}

	@Override
	public void cleanupCmd() {
		gameControl.pressReleaseSneakKey(false);
		gameControl.sendSneakingStartStopPacket(false);
	}
}
