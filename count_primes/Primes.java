import java.util.ArrayList;
import java.util.Scanner;

public class Primes {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int rngA = in.nextInt();
        int rngB = in.nextInt();
        boolean[] isPrime = new boolean[rngB];
        ArrayList<Integer> primes = new ArrayList<>();

        for(int i=2;i<isPrime.length;i++){
            isPrime[i]=true;
        }
        for(int i=1;i<(int)Math.sqrt(rngB)+1;i++){
            if(isPrime[i]){
                for(int j=2;j<=rngB/i;j++){
                    if((j*i)<rngB){
                        isPrime[j*i]=false;
                    }
                }
            }
        }
        for(int i=rngA;i<rngB;i++){
            if(isPrime[i]){
                primes.add(i);
            }
        }
        System.out.println(primes.size());
    }
}
