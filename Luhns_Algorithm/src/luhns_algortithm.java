import java.util.*;
public class luhns_algortithm {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for(int i=0; i<num.length(); i++){
            int n=num.charAt(i) - '0';
            numList.add(n);
        }
        int start=0;
        if(numList.size()%2==0){
            start=1;
        }
        for(int i=start; i<numList.size(); i=i+2){
            int n=numList.get(i)*2;
            if(n>9){
                numList.set(i, (n-9));
            }else{
                numList.set(i, n);
            }
            int sum=0;
            for(int j=0; i<numList.size(); j++){
                sum= sum+numList.get(j);
            }
            int ans=0;
            if(sum%10!=0){
                ans =  10-(sum%10);
            }
            System.out.println(ans);
        }
    }
}
