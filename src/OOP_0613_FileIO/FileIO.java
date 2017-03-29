package OOP_0613_FileIO;
import java.io.File;
import java.util.Date;

//ChrisyknipdeMacBook-Pro:bin Chrisyknip$ javac ../src/FileIO.java 
//ChrisyknipdeMacBook-Pro:bin Chrisyknip$ java FileIO "../123.JPG"
public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File(args[0]);
		if(f.isFile()){
			System.out.println(f.exists());
			System.out.println(f.getName());
			System.out.println(f.length());
			System.out.println(new Date(f.lastModified()));
		}else{
			System.out.println(f.listFiles());
		}
	}

}
