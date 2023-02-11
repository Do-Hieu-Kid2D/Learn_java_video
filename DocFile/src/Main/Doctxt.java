package Main;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Doctxt {
	public static void main(String[] args) {
		
		File f = new File("‪D:\\java_workpace\\DocFile\\ngu.txt");
		try {
			BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
			String line = null;
			while(true) {
				line = br.readLine();
				if(line == null) {
					break;
				}
				else {
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
