import java.util.Scanner;
public class Practice{
    

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner c = new Scanner(System.in);
            int T  = c.nextInt();
            if(T<1 || T>10){
                 T  = c.nextInt();

            }
            int N = c.nextInt();
            if(N<2 || N>10000){

                N = c.nextInt();
            }
            String S []  = new String [N];
            for(int i = 0;i<T;i++){
                for(int k = 0;k<N;k++){
                    S[k] =c.nextLine();
                    if(k%2==0){
                        System.out.print(S[k]);

                }
              
                    else {
    
                        System.out.print(S[k]);
                    } 
                }
            }
        }
    }
    
