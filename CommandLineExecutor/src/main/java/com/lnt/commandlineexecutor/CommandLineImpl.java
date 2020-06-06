package com.lnt.commandlineexecutor;

/*
 * @author Lakshminarayanan
 * @project CommandLineExecutor
 * @created 06/06/20
 */

import java.io.IOException;

public class CommandLineImpl implements CommandLine {

    @Override
    public void run(CommandLineOptions commandLineOptions) {
        Process process;
        try {
            process = Runtime.getRuntime().exec(commandLineOptions.getCommand(), null,
                    commandLineOptions.getDirectoryToRunCommand());
            process.get

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

}
