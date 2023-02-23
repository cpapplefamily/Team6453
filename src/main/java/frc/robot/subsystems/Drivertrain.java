// RobotBuilder Version: 5.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;


import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Drivertrain extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private WPI_TalonSRX rightMotor1;
private WPI_TalonSRX rightMotor2;
private MotorControllerGroup rightMotorGroup;
private WPI_TalonSRX leftMotro1;
private WPI_TalonSRX leftMotor2;
private MotorControllerGroup leftMototGroup;
private DifferentialDrive differentialDrive1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    /**
    *
    */
    public Drivertrain() {
        // -BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
rightMotor1 = new WPI_TalonSRX(31);
rightMotor1.setInverted(true);



rightMotor2 = new WPI_TalonSRX(33);
rightMotor2.setInverted(true);
 
 

rightMotorGroup = new MotorControllerGroup(rightMotor1, rightMotor2  );
 addChild("RightMotorGroup",rightMotorGroup);
 

leftMotro1 = new WPI_TalonSRX(30);
 
 

leftMotor2 = new WPI_TalonSRX(32);
 
 

leftMototGroup = new MotorControllerGroup(leftMotro1, leftMotor2  );
 addChild("LeftMototGroup",leftMototGroup);
 

differentialDrive1 = new DifferentialDrive(leftMototGroup, rightMotorGroup);
 addChild("Differential Drive 1",differentialDrive1);
 differentialDrive1.setSafetyEnabled(true);
differentialDrive1.setExpiration(0.1);
differentialDrive1.setMaxOutput(1.0);



    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void my_drverTank(double leftspeed, double rightspeed){
        differentialDrive1.tankDrive(leftspeed,rightspeed);
    }
}

