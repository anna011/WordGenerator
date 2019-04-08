import java.util.Random;
public class WordRandomizer {

	public static boolean finalFlag = false;
	
	public static int wordLength(){                             // sets word length
		int len = 5 + (int)(Math.random() * ((5 - 5) + 1));
		return len;
	}
	
	public static String wordLetters(){                         // generates string with concatenated random letters
		int len = wordLength();                                      // restricted by set word length
		String word = "";
		for(int i=0; i<len; i++){
			Random rand = new Random();
			char letter = (char) (rand.nextInt(26) + 'a');
			word += letter;
		}
		return word;
	}
	
	public static boolean checkWord(String word){               // checks if generated word is valid           
		System.out.println(word);                                    // validation checked with word corpus
		String checker = word;
		In file = new In("words.txt");
		while (!file.isEmpty()) {
		    String line = file.readLine();
		    if (line.equals(checker)) {
		        System.out.print("\n\nValid word: " + checker);
		        finalFlag = true;
		        return true;
		    }
		}
		return false;
	}
	
	public static void main(String[] args){                     // main function to generate valid word
		boolean flag = false;                                     
		while(flag==false && finalFlag==false){
			flag = checkWord(wordLetters());
		}
	}
	
}
