// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Subsystems.print;
import frc.robot.Subsystems.print1;

public class RobotContainer {
  public RobotContainer() {
    configureBindings();
  }

  
  CommandXboxController exerciceController = new CommandXboxController(1);
  print imprimir = new print();
  print1 imprimir1 = new print1();

  private void configureBindings() {
    CommandScheduler.getInstance().run();
    exerciceController.a().onTrue(Commands.parallel(imprimir.checkName(),imprimir1.checkButton()));
    exerciceController.y().onTrue(Commands.parallel(imprimir.checkName(), Commands.waitSeconds(5).andThen(imprimir1.checkButton()))); 
    exerciceController.b().onTrue(imprimir.CommandSetSequentialTimes());
    exerciceController.x().onTrue(Commands.parallel(imprimir.checkName(),imprimir1.checkButton().unless(()-> !imprimir.getSequentialTimes())));


  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
