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

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommandLineOptions {

    public String[] command;
    public String directoryToRunCommand;
    public String logDir;
    public String outputLogPath;
    public String errorLogPath;

}
