// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Commands.testEx;
import com.overture.lib.gamepads.OverXboxController;


import frc.robot.Subsystems.motor;

public class RobotContainer {
  public RobotContainer() {
    configureBindings();
  }

  
  OverXboxController exerciceController = new OverXboxController(0, 0, 0);


  motor motorOne = new motor();


  private void configureBindings() {
    exerciceController.a().onTrue(motorOne.runFull());
    exerciceController.y().onTrue(motorOne.runMid()); 
    exerciceController.b().whileTrue(new testEx());
   // exerciceController.x().onTrue(Commands.parallel(imprimir.checkName(),imprimir1.checkButton().unless(()-> !imprimir.getSequentialTimes())));


  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}


