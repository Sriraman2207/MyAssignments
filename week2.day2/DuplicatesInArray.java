package week2.day2;

public class DuplicatesInArray {
	public static void main(String[] args) {
		int [] count = new int [] {14,12,13,11,15,14,18,16,17,19,18,17,20}; 
        System.out.println("Duplicate elements in an given array ");  
        for(int i = 0;i < count .length; i++) {  
            for(int j = i + 1; j < count .length; j++) {  
                if(count [i] == count [j])  
                    System.out.println(count [j]);
            }  
	}

}
}
