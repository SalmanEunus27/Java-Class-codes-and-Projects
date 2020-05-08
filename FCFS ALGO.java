import java.util.Scanner;
public class FCFS{
    public static void main (String [] args){
         Scanner k = new Scanner(System.in);
        int p = k.nextInt();
for(int i = 0;i<=p;i++){
        int Btime[i] =k.nextInt();
        int StartT[i] = k.nextInt();
        int AT[i] = K.nextInt();
}
        int id = 1;
        int swt = 0;
        int stat = 0;
        while(id<4){
            int waitT = StartT - AT;
            EndT = StartT + Time;
            swt = swt +waitT;
            stat = stat +Btime;
            id++;
} 
double awt = swt/p;
double atat = stat/p;
System.out.println("Average Waiting Time = "+awt);
System.out.println("Average Turnaround Time = "+atat);
    }
}