package hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {
 
  private static Logger logger = LogManager.getLogger(HelloWorld.class);
   	
  public static void main(String[] args) {
    Greeter greeter = new Greeter();
    //System.out.println(greeter.sayHello());
	logger.debug(greeter.sayHello());
    t2();
  }

    public static void t2() {
    	int height = 10;
    	for (int i = 0; i < (1 << height); i++) {
        	switch (i) {
            	case 256:
        		System.out.println("Reached 256"); 
                	break;
            	case 2048:
        		System.out.println("Reached 2048"); 
                	break;
        	}
    	}
    }
}
