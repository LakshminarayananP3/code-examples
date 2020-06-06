package com.lnt.copyfilesfromimportlines;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String importParentPath = "/Users/admin/GitHub/metalyzer-service/metalyzer-service/src/main/java/";
        String importLines = "import com.p3solutions.metalyzer_service.configured_dbs.enums.DatasourceProfileStatus;\n" +
                "import com.p3solutions.metalyzer_service.configured_dbs.models.DatasourceProfileModel;\n" +
                "import com.p3solutions.metalyzer_service.configured_dbs.dto.RDBMSConnectionInfoDTO;\n" +
                "import com.p3solutions.metalyzer_service.configured_dbs.enums.AuthType;\n" +
                "import com.p3solutions.metalyzer_service.configured_dbs.enums.DSCategory;\n" +
                "import com.p3solutions.metalyzer_service.flat_file.dto.request.FlatFileRequestDTO;";
        importLines = importLines.replace("import", "").replace(";", "").trim().replace(".", File.separator);
        new File("output").mkdirs();


        for (String line : importLines.split("\n")) {
            if(line.trim().isEmpty())
                continue;
            File jFile = new File((importParentPath.trim() + line.trim() + ".java").trim());
            String outputPath = "." + File.separator + "output" + File.separator + jFile.getName();

            InputStream in = new BufferedInputStream(
                    new FileInputStream(jFile));
            OutputStream out = new BufferedOutputStream(
                    new FileOutputStream(outputPath));

            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
            if(new File(outputPath).exists()){
                System.out.println(jFile.getName() + "File copied");
            }
        }

    }
}
