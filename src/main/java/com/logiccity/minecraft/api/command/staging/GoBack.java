package com.logiccity.minecraft.api.command.staging;

import com.logiccity.minecraft.api.impl.CustomModCommandBase;

public class GoBack extends CustomModCommandBase {
	private GoBack() {
		super("goB", 1);
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
			gameControl.pressReleaseBackKey(true);
			return false;
		}
		gameControl.pressReleaseBackKey(false);
		return true;
	}

}
