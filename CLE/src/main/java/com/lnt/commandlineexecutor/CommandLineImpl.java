package com.lnt.commandlineexecutor;

/*
 * @author Lakshminarayanan
 * @project CommandLineExecutor
 * @created 06/06/20
 */

import java.io.*;

public class CommandLineImpl implements CommandLine {

    public static final String NEWLINE = "\n";

    @Override
    public int run(CommandLineOptions commandLineOptions) {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(commandLineOptions.getCommand(), null,
                    new File(commandLineOptions.getDirectoryToRunCommand()));
            String errorLogPath = processStream(process.getErrorStream(), StreamType.ERROR);
            String outputLogPath = processStream(process.getInputStream(), StreamType.INPUT);
            commandLineOptions.setErrorLogPath(errorLogPath);
            commandLineOptions.setOutputLogPath(outputLogPath);
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return process.exitValue();
    }

    private String processStream(InputStream inputStream, StreamType streamType) {
        String fileName = streamType == StreamType.INPUT ? "outputLog" : "errorLog";
        String logDir = "log";
        new File(logDir).mkdirs();
        File logFile = new File(logDir+ File.separator + fileName + ".log");
        InputStreamReader ir = null;
        BufferedReader br = null;
        Writer out = null;
        try {
            ir = new InputStreamReader(inputStream);
            br = new BufferedReader(ir);
            out = new OutputStreamWriter(new FileOutputStream(logFile));
            String line;
            while ((line = br.readLine()) != null) {
               out.write(line + NEWLINE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (out != null) {
                    out.flush();
                    out.close();
                }
            } catch (IOException e) {
            }
        }
        return logFile.getAbsolutePath();
    }

}
