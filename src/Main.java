
public class Main {

	public static void main(String[] args) {
	
		// Create starting string, an empty string to store the final output
		// and an array to store the individual words from the starting string
		String sentence = "Are you as excited as I am?";
		String reverseSentence = "";
		String[] splitSentence = sentence.split(" ");
		
		// Loop from the number of words going backwards until no more words
		// taking into account the array index starts at zero (i.e words -1)
		for (int i = splitSentence.length - 1; i >= 0; i--) {

			reverseSentence+=splitSentence[i];
			reverseSentence+=" ";
			// TODO: maybe include some test for non-alphabet and Capital letters
			// at some point, if time... maybe.
	 
		}
		System.out.println(reverseSentence);
		
	}

}
