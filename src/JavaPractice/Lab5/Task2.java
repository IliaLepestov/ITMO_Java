package Lab5;

public class Task2 {
    public static void main(String[] args) {
        String[] testArray = {"Топот", "шёпот", "шомпол", "шот", "стекло", "дыня", "таракан"};

        for (String word : testArray) {
            isPalyndrom(word);
        }
    }

    public static void isPalyndrom(String word){
        word = word.toLowerCase();
        boolean isPalyndrom = false;
        char[] letterArray = word.toCharArray();
        int j = letterArray.length-1;
        for (int i = 0; i < letterArray.length / 2; i++){
            if (letterArray[i] != letterArray[j]) {
                break;
            }
            else{
                j--;
            }
            isPalyndrom = true;
        }
        System.out.println(isPalyndrom);
    }
}
