package utils;



import org.apache.commons.codec.binary.Base64;

import cucumber.deps.com.thoughtworks.xstream.io.path.Path;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;


public class Utils {
    

	private static String encodeBase64String(String inputString) {
        return Base64.encodeBase64URLSafeString(inputString.getBytes());
    }

    private static boolean fileExists(String pathToFile) {
        return new File(pathToFile).exists();
    }

    public static void makeDirectory(String newDirString) {
        File file = new File(newDirString);
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("\ninfo: Directory was created!\n");
            } else {
                System.out.println("\nerror: Failed to create directory!\n");
            }
        }
    }

    public static void importTestsFromJIRA(String username, String password, String jiraURL, String jiraKeys, String pathToOutputFile) {
        String[] command = {"curl.exe", "-D-", "-X", "GET", "-H",
                "Authorization: Basic " + encodeBase64String(username + ":" + password),
               jiraURL + "/rest/raven/1.0/export/test?keys=" + jiraKeys, "-o", pathToOutputFile
         };
         ProcessBuilder process = new ProcessBuilder(command);
         Process p;
         
         try {
             System.out.println("\ninfo: Starting process that accepts curl GET command\n");
             p = process.start();
         } catch (IOException e) {
             System.out.print("\nerror: Tried to execute curl command and output to a file, something went wrong\n");
             e.printStackTrace();
         }
         do {
             System.out.println("\ninfo: Checking if tests are imported and put in a new file\n");
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException ex) {
                 Thread.currentThread().interrupt();
             }
         } while (!fileExists(pathToOutputFile));
     }
    
    

    public static void exportReportToJIRA(String username, String password, String jiraURL, String reportFilePath) {
        //String[] command = {"curl", "-D-", "-X", "POST",
        //        "-H", "Content-Type: application/json",
        //        "-H", "Authorization: Basic " + encodeBase64String(username + ":" + password),
        //       "--data", "@" + reportFilePath,
        //        jiraURL + "/rest/raven/1.0/import/execution/cucumber"
        //};
    	
    	//Curl command for xml results and creates new test & test execution
    	//curl -H "Content-Type: text/xml" -X POST -H "Authorization: Bearer $token"  --data @"allcukes.xml" https://xray.cloud.xpand-it.com/api/v1/import/execution/junit?projectKey=CD
        //C
    	String[] command = {"curl", "-H", "Content-Type: application/json", "-X", "POST", "-H", "Authorization: Bearer $token", "  --data", "@"+"cucumber.json", "https://xray.cloud.xpand-it.com/api/v1/import/execution/cucumber"
        };
        
     
        
        ProcessBuilder p = new ProcessBuilder(command);
        do {
            System.out.println("\ninfo: Checking if cucumber.json file has been generated\n");
            System.out.println(""+p.command());
            
            
            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();              
            }
        } while (!fileExists(reportFilePath));

        try {
            System.out.println("\ninfo: Starting process that accepts curl POST command\n");
            Process p2 = p.start();
            p2.waitFor();         
        } catch (IOException|InterruptedException e) {
            System.out.print("\nerror: Tried to execute curl command that posts json file to JIRA Xray, something went wrong in POST\n");
            e.printStackTrace();
        }
    }
    

}