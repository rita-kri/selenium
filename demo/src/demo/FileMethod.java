package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

////Write Data to file and read the data and print.
public class FileMethod {

	public static void main(String[] args) throws IOException {
		
		Path filePath = Path.of("example.txt");
		
		String content = "Hello! Welcome to Advance Java Training";
		try {
			Files.writeString(filePath, content);
			//System.out.println("Written");
			System.out.println("=====================================");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			String readContent=Files.readString(filePath);
			System.out.println("Read content"+readContent);
			}catch (Exception e) {
				e.printStackTrace();
			}
		
		BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
		System.out.println("Creation Time :" +attributes.creationTime());
		System.out.println("Last Access Time :" + attributes.lastAccessTime());
		System.out.println("Is Directory : "+ attributes.isDirectory());
		System.out.println("Is Regular File : "+ attributes.isRegularFile());
		System.out.println("Is Symbolic Link : "+ attributes.isSymbolicLink());
		System.out.println("Size :" +attributes.size());
		

	}

}
