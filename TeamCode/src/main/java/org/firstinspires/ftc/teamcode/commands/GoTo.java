package org.firstinspires.ftc.teamcode.commands;

import org.firstinspires.ftc.robotcore.external.matrices.OpenGLMatrix;
import org.firstinspires.ftc.teamcode.Robot;
import org.firstinspires.ftc.teamcode.commands.Command;
import org.firstinspires.ftc.teamcode.Auto1;

public class GoTo implements Command {
    Robot robot;

    OpenGLMatrix location;

    boolean success = false;

    public GoTo(Robot robot, OpenGLMatrix location)
    {
        this.robot = robot;
        this.location = location;
    }

    public Boolean run()
    {
        return success = false;
    }

    public void cont()
    {

    }

    public Boolean succeeded()
    {
        return success;
    }
}