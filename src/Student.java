 import java.io.*;

public class Student implements Serializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
User user= null;

FileInputStream filein=new FileInputStream("C:\\Users\\arjun\\eclipse-workspace\\Brocode Java\\exam.ser");
ObjectInputStream obj=new ObjectInputStream(filein);
user=(User)obj.readObject();
obj.close();
filein.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		user.sayHello();
	}

}
