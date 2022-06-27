
public class Task1Pt2 {

	public static void main(String[] args) {
		// Set up array for words to reverse and empty string to hold the letters
		// as they get 'picked' in reverse order by a decrementing for loop
		String[] wordList = {"Stressed", "Parts", "Straw", "Keep", "Wolf"};		
		String reversedWord;
		
		// Outer loop to isolate elements (words) in the array
		for (int i = 0; i < wordList.length; i++) {
			// Initialise reversedWord string
			reversedWord = "";
			// Inner decrementing loop to 'pick' out the letters in reverse order
			// Uses charAt method to return the current letter to ReversedWord string
			// concatenating as it goes through the inner loop. 
			for (int x=wordList[i].length()-1; x>=0; x--) {
		        reversedWord += wordList[i].charAt(x);
		    }
			// Output result to console.
			System.out.println(reversedWord);
			// TODO: check for capital letters, lowercase those, uppercase first letters
			}
	}

}
