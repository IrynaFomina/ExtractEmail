package org.hillel.components;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class ExtractEmail {
    public static Map<String, String> matchString(String s) {
        String patternString = "(?<phone>\\+[0-9]{12})|(?<email>([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6})";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(s);
        Map<String, String> results = new HashMap<>();
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            results.put(matcher.group(0), start + "," + end);
            i = end;
        }
        System.out.println(results.toString());
        return results;
    }
}
