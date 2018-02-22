import java.util.LinkedList;
import java.util.List;

class MemoryLeak {
    public static int SIZE = 1000000; // 1 MB

    public static void main (String[] args) {
		List<Byte[]> list = new LinkedList<Byte[]> ();
		int counter = 0;

		while (true) {
	    	counter++;
	    	System.out.println ("" + counter + ". Allocating memory...");
	    	list.add (new Byte[SIZE]);
	    	try {
		    	Thread.sleep (2000);
		    } catch (InterruptedException e) {
		    	
		    }
		}
    }
}