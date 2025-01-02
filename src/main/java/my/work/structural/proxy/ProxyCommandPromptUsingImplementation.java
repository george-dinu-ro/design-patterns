package my.work.structural.proxy;

import java.util.Collection;
import java.util.List;

public class ProxyCommandPromptUsingImplementation implements Console {

	private static final Collection<String> RESTRICTED_COMMANDS = List.of("rm", "rmdir", "del");

	private boolean isAdmin;

	private RegularCommandPrompt regularCommandPrompt;

	public ProxyCommandPromptUsingImplementation(boolean isAdmin) {
		this.isAdmin = isAdmin;
		regularCommandPrompt = new RegularCommandPrompt();
	}

	@Override
	public boolean executeCommand(String command) {
		return (canExecuteCommand(command) && isCommandSuccessfullyExecuted(command));
	}

	private boolean canExecuteCommand(String command) {
		return (isAdmin || !RESTRICTED_COMMANDS.contains(command));
	}

	private boolean isCommandSuccessfullyExecuted(String command) {
		return regularCommandPrompt.executeCommand(command);
	}
}
