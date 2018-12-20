import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import syntaxtree.*;

public class Main {
   public static void main(String [] args) throws IOException {
      try {
    	  FromFile f = new FromFile();
    	  String input = f.readFile("teste");
    	  System.out.println(input);
    	  Program root = new MiniJavaParser(new java.io.StringReader(input)).Goal();
    	  System.out.println("Lexical analysis successfull");
      }
      catch (ParseException e) {
    	  System.out.println("Lexer Error : \n"+ e.toString());
      }
   }
}


class FromFile {
	
	public String readFile(String filename) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(filename));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();
	        while (line != null) {
	            sb.append(line);
	            sb.append(System.lineSeparator());
	            line = br.readLine();
	        }
	        String everything = sb.toString();
	        return everything;
	    } finally {
	        br.close();
	    }	
	}
	
}