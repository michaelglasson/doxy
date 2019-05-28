package net.mynym.doxy.test;

import net.mynym.doxy.main.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Test1 {

	public static void main(String[] args) throws IOException {
		System.out.println(DocIdGen.getKey3());
		System.out.println(DocIdGen.getKey9());
		Library l = new Library();
		System.out.println(l.getId());
		Version v = new Version();
		v.versionNumber = 670;
		Path source = Paths.get("resources\\hello" + "-" + v.getVersion() + ".txt");
		System.out.println(v.incrementVersion());
		Path destination = Paths.get("resources\\hello" + "-" + v.getVersion() + ".txt");
		Files.copy(source, destination, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
		
	}
}
