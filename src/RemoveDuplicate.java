
public class RemoveDuplicate {
	
	private static String removeDuplicate(char str[]){
		if(str == null || str.length == 0)
			return "";
		String uniqueString = "";
		for(int i = 0; i < str.length; i++){
			//check to see if the character is part of the unique string
			if(uniqueString.indexOf(str[i]) == -1){
				uniqueString += str[i];
			}
		}
		return uniqueString;
	}//removeDuplicate

	public static void main(String[] args) {
		
		String word = "bazil";
		System.out.println(removeDuplicate(null));
		
	}

}
