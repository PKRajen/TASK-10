package taskten;

public class person {

	
	 //main
    public class Main {
        public static void main(String[] args) {
            person person = new person("Viyan", 25);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

        }
    }
			String name;
	     int age;
	    public person(String name, int age){
	        this.name = name;
	        this.age = age;
	    }
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;}


	   
}
	
	



