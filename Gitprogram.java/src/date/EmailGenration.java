package date;

import java.util.Date;

public class EmailGenration {
	
	    public static void main(String[] args) {
	        
	        Date date = new Date();
	        String today = date.toString();
	        String tdate = today.replaceAll("\\s", "");
	        String dremove = tdate.replaceAll("\\:", "");
	        String emailadd = dremove+"@gmail.com";
	        
	        System.out.println(emailadd);
	      
	    }
	}



