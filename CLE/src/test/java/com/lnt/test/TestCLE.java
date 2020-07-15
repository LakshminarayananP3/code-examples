package com.lnt.test;

import com.lnt.commandlineexecutor.CommandLine;
import com.lnt.commandlineexecutor.CommandLineImpl;
import com.lnt.commandlineexecutor.CommandLineOptions;

/*
 * @author Lakshminarayanan
 * @project CommandLineExecutor
 * @created 06/06/20
 */
public class TestCLE {

    public static void main(String[] args) {
        CommandLineOptions commandLineOptions = new CommandLineOptions();
        commandLineOptions.setCommand(new String[] {"ls", "-l"});
        commandLineOptions.setDirectoryToRunCommand(null);
        commandLineOptions.setDirectoryToRunCommand("/Users/admin");

        CommandLine commandLine = new CommandLineImpl();
        int status = commandLine.run(commandLineOptions);
        System.out.println("Status '" + status + "'");
    }
}
