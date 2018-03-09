package generalMethods;

import java.io.File;
import java.io.IOException;

public class addDeleteFolders {

	public static void main(String[] args) {
		File obj= new File("C:\\Users\\vpadigela\\Desktop\\welcome4");
		obj.mkdir();
		File abc= new File("C:\\Users\\vpadigela\\Desktop\\welcome4\\New Text Document.txt");
		try {
			abc.createNewFile();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.delete();
		
	//to verify the existence of the folder
		
	boolean a=obj.exists();
	if (a==true)
	{
		System.out.println("Folder exists");
	}
	else System.out.println("Folder does not exist");
	
	System.out.println("test");
	
		}

}
