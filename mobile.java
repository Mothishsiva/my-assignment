package week1.day1;

public class mobile {
       public void takemobile () {
    	   System.out.println("play game");
       }
       public void downloadfile () {
    	   System.out.println("file is downloaded");
       }
       public void takephoto () {
    	   System.out.println("camara is working"); 
       }
    		   public void sendsms ()  {
    		   System.out.println("send sms to frd");
    		   }
    		   public void exploreapp () {
    		   System.out.println("exploreing app");
    		   }
    		   public void watchphotos () {
    			   System.out.println("watching the photos");
    		   }
    		   public static void main(String[] args) {
				mobile obj=new mobile ();
				obj.downloadfile();
				obj.exploreapp();
				obj.takemobile();
				obj.sendsms();
				obj.takephoto();
				obj.watchphotos();
				
			}
    		   
    		   
    	   
}

