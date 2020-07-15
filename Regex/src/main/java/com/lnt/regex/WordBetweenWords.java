package com.lnt.regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * @author Lakshminarayanan
 * @project Regex
 * @created 25/06/20
 */
public class WordBetweenWords {

    public void begin(String inputText) {
        inputText = "<a class=\"d-inline-block\" href=\"/P3-Core-Dev-Team/archon-notification-channel\" itemprop=\"name " +
                "codeRepository\" data-hovercard-type=\"repository\" " +
                "data-hovercard-url=\"/P3-Core-Dev-Team/archon-notification-channel/hovercard\">";
        String word1 = "href=\"\\/P3-Core-Dev-Team\\/";
        String word2 = "/pulls\">";
        String regex = "(?<=" + word1 + ").*(?=\\" + word2 + ")";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputText);
        System.out.println("Count " + matcher.groupCount());
        while (matcher.find()) {
            System.out.println("https://github.com/P3-Core-Dev-Team/" + inputText.substring(matcher.start(), matcher.end()) + ".git");
        }

    }

    public static void main(String[] args) throws Exception {


        String inputText = "/Users/admin/Work/_bin/temp/view-source_https___github.com_P3-Core-Dev-Team.html";
        String line = null;
        StringBuffer sb= new StringBuffer();

//        BufferedReader br = new BufferedReader(new FileReader(inputText));
//        while ((line = br.readLine()) != null) {
//            sb.append(line);
//        }
//        br.close();
        WordBetweenWords wordBetweenWords = new WordBetweenWords();
        wordBetweenWords.begin(sb.toString());
    }

}
