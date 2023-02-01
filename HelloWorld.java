// Your First Program

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
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
