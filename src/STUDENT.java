

public class STUDENT {
	int index;
	String ime;
	static String fakultet="ITS";
	
	STUDENT(int r, String n) {
		index = r;
		ime = n;  
	}

	void display() {
		System.out.println(index + " " + ime + " " + fakultet);
	}
	
	public static void main(String[] args) {
		STUDENT s1 = new STUDENT(111, "Petar");
		STUDENT s2 = new STUDENT(222, "Marko");
	
		s1.display();
		s2.display();
	}

}
