package w4d3hw4;

public class Homework4 {

	public static void main(String[] args) {
		String sentence = "In the beginning God created the heavens and the earth";
		System.out.println("Number of occurences of the, beginning, and, create");
		System.out.println(NumOfWords(sentence, "the"));
		System.out.println(NumOfWords(sentence, "beginning"));
		System.out.println(NumOfWords(sentence, "and"));
		System.out.println(NumOfWords(sentence, "recreate"));
		
	}
	
	private static int NumOfWords(String sentence, String target) {
		int count = 0;
		
		String[] words = sentence.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (word.equals(target)) {
				count++;
			}
		}
		
		return count;
	}

}
