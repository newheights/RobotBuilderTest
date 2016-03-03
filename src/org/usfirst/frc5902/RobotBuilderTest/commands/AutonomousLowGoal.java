package org.usfirst.frc5902.RobotBuilderTest.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 Automatically drives the robot to the low-goal...
 Fahrt das roboter zu das niedrieges tor automatish...
 */
public class AutonomousLowGoal extends CommandGroup {
    
    public  AutonomousLowGoal() {
    	addSequential(new DriveToDefense());
    	addSequential(new WaitHalfSecond());
    	addSequential(new TurnRight());
    	addSequential(new WaitHalfSecond());
    	addSequential(new DriveToTower());
    	addSequential(new OneEightyIntake());
    	addSequential(new AutoShootBall());



        
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
