public class ConfigFileReader {

	public static String getReportConfigPath(){
		/*FileReader reader=new FileReader("src\extent-config.xml");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  */
	    
		String reportConfigPath = "src\\main\\resources\\archetype-resources\\src\\extent-config.xml";
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
}
