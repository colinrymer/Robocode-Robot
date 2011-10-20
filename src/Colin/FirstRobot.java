package Colin;
import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Robot - a robot by (your name here)
 */
public class FirstRobot extends Robot
{
	/**
	 * run: Robot's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			goToCorner();
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}
	
	public void goToCorner()
	{	
		double[] corner = findClosestCorner();
	}
	
	public double[] findClosestCorner()
	{
		double[] result = {0,0};
		
		// If the x value of the robot is more than half the battlefield width, it is closer to the right than the left.
		if ((this.getBattleFieldWidth()/2) < this.getX())
			result[0] = this.getBattleFieldWidth();
		
		// If the y value of the robot is more than half the battlefield height, it is closer to the top than the bottom.
		if ((this.getBattleFieldHeight()/2) < this.getY())
			result[1] = this.getBattleFieldHeight();
		
		return result;
	}
}
