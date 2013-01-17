// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.


package org.usfirst.frc4843.FIRST2013.subsystems;

import org.usfirst.frc4843.FIRST2013.RobotMap;
import org.usfirst.frc4843.FIRST2013.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class chassis extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController lmotor = RobotMap.chassislmotor;
    SpeedController rmotor = RobotMap.chassisrmotor;
    RobotDrive robotdrive = RobotMap.chassisrobotdrive;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void drive(GenericHID lstick, GenericHID rstick){
        robotdrive.tankDrive(lstick, rstick, true);
    }

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new cmddrive());
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        

        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

