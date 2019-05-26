public class Hundred {
    public static void main(String[] args) {
        int limit = 100;
        /** 
         
        Comments
        
        */
        for (int i=1; i<=limit; i++)
            System.out.print(i+" ");    //print the value i
        
        System.out.println();
        while(limit-- > 0) {
            System.out.print(limit+1 + " ");
        }
    }
}