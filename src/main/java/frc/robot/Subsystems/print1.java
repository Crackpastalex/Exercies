// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;




public class print1 extends SubsystemBase {

  CommandXboxController exerciceController = new CommandXboxController(1);


  /** Creates a new print. */
  public print1() {

  }

  public Command checkButton(){
    return runOnce(() -> System.out.println("B"));
  } 
  public Command sequential1(){
    return runOnce(() -> System.out.println("Sequential2"));
  } 

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}