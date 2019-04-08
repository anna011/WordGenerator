import java.io.IOException;
import java.io.PrintWriter;

public class SixLetterWords {
  // printing six letter words from corpus
	public static void main(String[] args) throws IOException{
		In file = new In("words.txt");
		PrintWriter writer = new PrintWriter("six-letter-words.txt", "UTF-8");
	    while (!file.isEmpty()) {
			String line = file.readLine();
			if(line.length()==6){
				writer.println(line);
			}
		}
	    writer.close();
	}
	
}