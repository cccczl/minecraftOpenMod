package com.logiccity.minecraft.api.command.staging;

import com.logiccity.minecraft.api.impl.CustomModCommandBase;

public class GoForward extends CustomModCommandBase {

	private GoForward() {
		super("goF", 1);
	}

	double dist , startX, startY, startZ;
	
	@Override
	public void initCmd(String [] args) {
		dist = Double.parseDouble(args[0]);
		startX = gameInfo.getPlayerPosX();
		startY = gameInfo.getPlayerPosY();
		startZ = gameInfo.getPlayerPosZ();
		dist = dist * dist;
	}
	
	@Override
	public boolean doInUpdateTicThread() {
		if (gameInfo.getPlayerDistanceSq(startX,
				startY, startZ) < dist) {
			gameControl.pressReleaseForwardKey(true);
			return false;
		}
		gameControl.pressReleaseForwardKey(false);
		return true;
	}
}
