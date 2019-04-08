import java.io.IOException;
import java.io.PrintWriter;

public class SevenLetterWords {
  // printing seven letter words from corpus
	public static void main(String[] args) throws IOException{
		In file = new In("words.txt");
		PrintWriter writer = new PrintWriter("seven-letter-words.txt", "UTF-8");
	    while (!file.isEmpty()) {
			String line = file.readLine();
			if(line.length()==7){
				writer.println(line);
			}
		}
	    writer.close();
	}
	
}