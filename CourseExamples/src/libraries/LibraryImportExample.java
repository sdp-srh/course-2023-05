package libraries;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

// import org.apache.commons.io.FileUtils;

public class LibraryImportExample {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\srh\\example.txt");
		String s = "Test";
		// String s = FileUtils.readFileToString(f, StandardCharsets.UTF_8);
		System.out.println(s);
	}
}
