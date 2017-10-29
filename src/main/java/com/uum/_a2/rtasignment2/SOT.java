
package com.uum._a2.rtasignment2;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class SOT {
  XSSFWorkbook excel = new XSSFWorkbook();;  

  public SOT Data(Map<String, Integer> map, String name, String matric, 

            String loc, String blank, String comment, String actLoc, String ttl) {

        

        String key[] = new String [map.size()];

        String value[] = new String [map.size()];

        

        int a = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            key[a] = entry.getKey();

            value[a] = Integer.toString(entry.getValue());

            a++;

        }
      return null;
}
}

