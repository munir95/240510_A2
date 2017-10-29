
package com.uum._a2.rtasignment2;

import java.io.File;
import java.nio.file.Paths;



public class PATH {
    
    public static String getPath(){
     
        return Paths.get("").toAbsolutePath().toString() + "\\" + "TESTER" + "\\";
        //return System.getProperty("user.dir") + File.separator + "TESTER";
    }
    
    
}
