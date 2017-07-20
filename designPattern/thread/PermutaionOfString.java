package designPattern.thread;

public class PermutaionOfString {

	public void permutation(String str, int firstIndex, int lastIndex) {
		if (lastIndex == firstIndex) {
			System.out.println(str);
			return;
		}
		for (int i = firstIndex; i <= lastIndex; i++) {
			str = swap(str, firstIndex, i);
			permutation(str, firstIndex + 1, lastIndex);
			str = swap(str, firstIndex, i);
		}
	}

	private String swap(String str, int m, int n) {
		char[] charArray = str.toCharArray();
		char temp = charArray[m];
		charArray[m] = charArray[n];
		charArray[n] = temp;
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		String myStrng = "jai";
		char[] charArray = myStrng.toCharArray();
		//System.out.println(charArray);
		// System.out.println(charArray.toString());
		//System.out.println(String.valueOf(charArray));
		
		PermutaionOfString permutaionOfString = new PermutaionOfString();
		int lengthOfString = myStrng.length();
		permutaionOfString.permutation(myStrng, 0, lengthOfString-1);
		
		
	}

}
