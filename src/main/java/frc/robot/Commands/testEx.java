// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;


import edu.wpi.first.wpilibj2.command.Command;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class testEx extends Command {


  static int contar = 0;
  /** Creates a new testEx. */
  public testEx() {
    
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
        contar = 0;

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
    contar +=1;

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    System.out.println(contar);
  }

  public static int getContar(){
    return contar;
  }

  
  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if(contar>1000){
      return true;
    } else {
      return false;
    }
   
  }

  
}
