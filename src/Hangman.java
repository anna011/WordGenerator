
public class Hangman {
	// still working progress; incomplete - hardcoded
	public static String level0(){
		return "cat";
	}
	
	public static void lives(){
		int tracker = 3;
		tracker--;
		System.out.println("\nTough luck... No match found.\n");
		if(tracker==2){
			System.out.println("\nlives: 10\n");
		}else if(tracker==1){
			System.out.println("\nlives: 01\n");
		}else{
			System.out.print("\nlives: 00\n\nGame Over... You lose.");
		}
	}
	
	public static void main(String[] args){
		System.out.println("lives: 11");
		System.out.println("level 0...\n");
		String w1 = level0();
		String def = "_";
		char[] update = new char[w1.length()];
		for(int i=0; i<w1.length(); i++){
			update[i] = def.charAt(0);
			System.out.print(update[i]);
		}
		System.out.print("\nEnter first guess: ");
		for(int i=0; i<args.length; i++){
			System.out.print(args[i]);
		}
		System.out.println("");
		char guess = args[0].charAt(0);
		char[] word = w1.toCharArray();
		boolean checker = false;
		if(args[0].length()==1){
			for(int i=0; i<word.length; i++){
				if(word[i]==guess){
					update[i] = guess;
					checker = true;
				}else{
					update[i] = def.charAt(0);
				}
			}
			for(int i=0; i<update.length; i++){
				System.out.print(update[i]);
			}
			System.out.println("\n\n");
			if(!checker){
				lives();
				checker = false;
				
			}
		}else{
			System.out.println("\nInvalid entry! Expecting a single character.\n");
		}
		boolean flag = false;
		for(int i=0; i<update.length; i++){
			if(update[i] == def.charAt(0) && !flag){
				System.out.print("\nEnter next guess: ");
				flag = true;
			}
		}
		if(flag){
			/*for(int i=1; i<args.length; i++){
				System.out.print(args[i]);
			}
			System.out.println("");
			int i = 1;
			char guess2 = args[i].charAt(0);
			boolean checker2 = false;
			if(args[i].length()==1){
				for(int j=0; j<word.length; j++){
					if(word[j]==guess2){
						update[j] = guess2;
						checker2 = true;
					}else{
						update[j] = def.charAt(0);
					}
				}
				for(int k=0; i<update.length; k++){
					System.out.print(update[k]);
				}
				System.out.println("\n\n");
				if(!checker2){
					lives();
					checker2 = false;
				}
			}else{
				System.out.println("\nInvalid entry! Expecting a single character.\n");
			}
			i++;*/
		}
	}
}
