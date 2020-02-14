import java.util.Scanner; 

public class ApiPopQuiz
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner (System.in); 
				System.out.println("Hello, please type in two words below and separate them by a space");
				String word1 = userInput.next(); 
				String word2 = userInput.next(); 
				System.out.println("Here are your two words in the proper format");
				System.out.println(word1.toLowerCase().concat(word2.substring(0,1).toUpperCase() + word2.substring(1).toLowerCase()));  
						
				

			}

	}
