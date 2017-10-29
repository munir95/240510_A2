/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2.rtasignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LOC {
    String folder = PATH.getPath();
    String line ;
    int noLines, comment, codeLine, realLOC;
    
    public void CountLines() throws IOException{
    
    File test = new File(folder);
    FileReader fr = new FileReader(test);
    BufferedReader br = new BufferedReader(fr);
    
    while ((line = br.readLine())!=null){
        if (line.trim().isEmpty()){
            noLines++;
        }
        if (line.contains("//")){
            comment++;
        }
        else if (line.contains("/*")){
            comment++;
            while (!line.contains("*/") && !(line = br.readLine()).contains("*/")){
                
            }
        }
        codeLine++;
    }
    realLOC = codeLine - noLines - comment;
}
    public int getLineOfCodes() {

        return codeLine;

    }



    public int getBlankLines() {

        return noLines;

    }



    public int getComments() {

        return comment;

    }



    public int getActualLineOfCodes() {

        return realLOC;

    }
}
