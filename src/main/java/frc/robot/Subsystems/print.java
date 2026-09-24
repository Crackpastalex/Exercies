// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;




public class print extends SubsystemBase {

  CommandXboxController exerciceController = new CommandXboxController(1);
  
  int sequentialTimes = 0;
  



  /** Creates a new print. */
  public print() {

  }

    public Command checkName(){
    return runOnce(() -> System.out.println("Carlos Pastrana"));
  } 
  public void setSequentialTimes(){
    sequentialTimes +=1;
  }
  public boolean getSequentialTimes(){
    if (sequentialTimes >= 10) {
      return true;
    } else {
      return false;
    }
  }
  
  public Command CommandSetSequentialTimes(){
    return runOnce(() -> setSequentialTimes());
  } 
  
    public Command sequential1(){
    return runOnce(() ->System.out.println("Sequential1"));
  } 

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}