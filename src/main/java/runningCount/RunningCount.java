package runningCount;

public class RunningCount {

    public void count(int n){
        int rc = 0;
        while(true){
            if(n>=2 && n<=6){
                rc = rc + 1;
            }
            else if(n==10 || n==11){
                rc = rc -1;
            }
            System.out.println(rc);
        }

    }


}
