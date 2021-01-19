package Loop;

/**This is loop
 * Sample answers
 * @Priya
 * @06/11/2020
 */

public class forLoop {

    /**
     * Increment for loop
     */

    //fot the fixed data
    public void sample(){
        for(int i = 0; i<5; i++){
            System.out.println("Hey " + i);
        }
    }

    /**
     * Decrement for loop
     */
    public void sample1(){
        for(int i = 5; i>0; i--){
            System.out.println("Hi " + i );
        }
    }
    /**
     * Decrement while loop
     */

    public void checkWhileLoop(){
        int j = 5;
        while(j>0){
            System.out.println(j);
            System.out.println("Decrement of while loop");
            j--;
        }
    }
    /**
     * Decrement do while loop
     */

    //do at least once; when data types are not fixed
    public void checkDoWhileLoop(boolean flag){
        do{
            System.out.println("Decrement of do while loop");
        }while(flag);

    }
}
