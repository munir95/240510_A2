
package com.uum._a2.rtasignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaKeyword  {
    
    
    
     public final String KEYWORDS[] = {"abstract", "assert", "boolean ",

        "break", "byte ", "case", "catch", "char ", "class", "const",

        "continue", "default", "do", "double ", "else", "extends", "false",

        "final", "finally", "float ", "for", "goto", "if", "implements",

        "import", "instanceof", "int ", "interface", "long ", "native",

        "new", "null", "package", "private", "protected", "public",

        "return", "short", "static", "strictfp", "super", "switch",

        "synchronized", "this", "throw", "throws", "transient", "true",

        "try", "void", "volatile", "while", "enum"};
     
     
    int counter = 0;

      public Map <String, Integer>  JavaKeyword() throws FileNotFoundException, IOException {
       String folder = PATH.getPath();
       
       
       
       Map<String,Integer> map = new TreeMap<>();

        Set<String> keywordSet = new HashSet<>(Arrays.asList(KEYWORDS));

        Scanner input = new Scanner(folder);

        while (input.hasNext()){ 

            String key = input.next();

            if (key.length() > 0){

                if (keywordSet.contains(key)){

                    Integer value = map.get(key);
                    

                    counter++;

                    if (value == null)

                        value = 0;

                    value++;

                    map.put(key, value);

                }

            }

        }

        return map;

    }

    

    public int noKeywords (){

        return counter;

    }

}

    

