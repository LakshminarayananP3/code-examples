package com.lnt.commandlineexecutor;
/*
 * @author Lakshminarayanan
 * @project CommandLineExecutor
 * @created 06/06/20
 */
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommandLineOptions {

    public String[] command;
    public File directoryToRunCommand;
    public String logDir;
    public String[] logFiles;

//    public String[] getCommand() {
//        return command;
//    }
//
//    public void setCommand(String[] command) {
//        this.command = command;
//    }
//
//    public File getDirectoryToRunCommand() {
//        return directoryToRunCommand;
//    }
//
//    public void setDirectoryToRunCommand(File directoryToRunCommand) {
//        this.directoryToRunCommand = directoryToRunCommand;
//    }
//
//    public String getLogDir() {
//        return logDir;
//    }
//
//    public void setLogDir(String logDir) {
//        this.logDir = logDir;
//    }
//
//    public String[] getLogFiles() {
//        return logFiles;
//    }
//
//    public void setLogFiles(String[] logFiles) {
//        this.logFiles = logFiles;
//    }
}
