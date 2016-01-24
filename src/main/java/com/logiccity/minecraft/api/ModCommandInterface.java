package com.logiccity.minecraft.api;

/**
 * The interface for commands that requires continuously running asynchronous operations in 
 * update or render tic threads until certain conditions are met 
 * @author Minecraftkids
 *
 */
public interface ModCommandInterface {
	/**
	 * Initialize the command
	 * @param args command arguments
	 */
	void initCmd(String[] args);
	/**
	 * Cleanup the command
	 */
	public void cleanupCmd();
	/**
	 * Run operations in the update tic thread. This method will be invoked every few milliseconds
	 * @return true will cause the command to be stopped, false will cause the command to continue
	 */
	boolean doInUpdateTicThread();
	/**
	 * Run operations in the render tic thread. This method will be invoked every few milliseconds
	 * @return true will cause the command to be stopped, false will cause the command to continue
	 */
	boolean doInRenderTicThread();
	/**
	 * Configure this command based on user input from on the chat line. All command configuration
	 * chat inputs start with "/-"
	 * @param input the string after "/-"
	 * @return true will cause the command to be stopped, false will cause the command to continue
	 */
	boolean doInCmdInputThread(String input);
}
