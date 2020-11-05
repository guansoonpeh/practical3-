
public class SmallestElement {
    
    public static int smallestElementIndex(int []list ){
        int smallestIndex = -1;
        
        smallestIndex = 0;
        for (int i=1; i<list.length; i++) {
            if (list[i] < list[smallestIndex]) {
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }
    
    
    
    public static void main(String[] args) {
        
       int[] list = {1, 2, 4, 5, 10, 100, 2, -22};
        
        
       int index = smallestElementIndex(list);
        
        System.out.println("Index of the smallest element in this array is " +  index); 
       
        
    }
    
}
