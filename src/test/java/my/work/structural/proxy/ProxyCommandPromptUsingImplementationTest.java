package my.work.structural.proxy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ProxyCommandPromptUsingImplementationTest {

	@ParameterizedTest
	@MethodSource("my.work.structural.proxy.TestUtils#providingSuccessfulCombinations")
	void givenSuccessfullCombinations_whenRunExecuteCommand_ThenSuccess(boolean isAdmin, String command) {
		var proxy = new ProxyCommandPromptUsingImplementation(isAdmin);
		var result = proxy.executeCommand(command);

		assertThat(result).isTrue();
	}

	@Test
	void givenRegularUser_whenRunRestrictedCommand_ThenFailure() {
		var proxy = new ProxyCommandPromptUsingImplementation(false);
		var result = proxy.executeCommand("rm");

		assertThat(result).isFalse();
	}
}
