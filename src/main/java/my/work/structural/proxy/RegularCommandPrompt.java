package my.work.structural.proxy;

public class RegularCommandPrompt implements Console {

	@Override
	public boolean executeCommand(String command) {
		System.out.println("Executing command: " + command);

		return true;
	}
}
