package org.usfirst.frc5902.RobotBuilderTest.commands;

import org.usfirst.frc5902.RobotBuilderTest.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 Waves the flag
 */
public class WaveFlagC extends Command {

    public WaveFlagC() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.cheeringSection);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.cheeringSection.defaultPos();
    	setTimeout(.5);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.cheeringSection.defaultPos();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
