package turtleGraphics;
import mvc.*;

public class PenCommand extends Command {
	public PenCommand(Model model) {
		super(model);
	}

	public void execute() {
		 Turtle turtle = (Turtle) model;
		 turtle.pen();
	}
}
	