

public class SwapCase {

	public static void main(String[] args) {
		
		private static void convertOpposite(StringBuffer str) ;
	     { 
	        int ln = str.length(); 
	             
	         
	        for (int i=0; i<ln; i++) 
	        { 
	            Character c = str.charAt(i); 
	            if (Character.isLowerCase(c)) 
	                str.replace(i, i+1, Character.toUpperCase(c)+""); 
	            else
	                str.replace(i, i+1, Character.toLowerCase(c)+""); 
	            
	            StringBuffer str = new StringBuffer("CODe DiffERently IS a GrEaT ProGRam!"); 
	            // Calling the Method 
	            convertOpposite(str); 
	              
	            System.out.println(str);
	             
	        } 
	     } 
	     
	     
	    
	 } 
		// TODO Auto-generated method stub

	}

}
