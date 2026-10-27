// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.Command;
import com.overture.lib.motorcontrollers.OverTalonFX;
import com.ctre.phoenix6.controls.VoltageOut;

// Configuracion del motor, no usar el xboxControler, 

public class motor extends SubsystemBase {
  OverTalonFX overMotor = new OverTalonFX(constants.constantsConfig(), 23, constants.rio);
  VoltageOut voltageRequest = new VoltageOut(0.0);


  /** Creates a new motor. */
  public motor() {
   
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public Command runFull(){
    return runOnce(() -> 
       overMotor.setControl(voltageRequest.withOutput(12.0))
    );
  } 
    public Command runMid(){
    return runOnce(() -> 
      overMotor.setControl(voltageRequest.withOutput(5.0))
    );
  } 
}







