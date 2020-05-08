import java.util.Scanner;
/**
 *
 * @author 17101051
 */
public class FCFS{
    public static void main(String[] args) {
        System.out.println("Enter the number of procceses.");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        String process[] = new String[j];
        int burst_time[] = new int[j];
        
        for ( int i=0; i<j; i++)
        {
            System.out.println("Enter name of process " + (i+1) + " : ");
            Scanner s1 = new Scanner(System.in);
            process[i]= s1.nextLine();
        }
        
        for ( int k=0; k<j; k++)
        {
          System.out.println("Enter the burst time of " + process[k]);
          Scanner s2 = new Scanner(System.in);
          burst_time[k]= s2.nextInt();
        }
        int wt[]= new int [j];
        int turnaround_time[] = new int[j];
       
        WaitingTime(process,burst_time,wt,turnaround_time);
           
    }
    
   public static void WaitingTime(String []v, int []d, int wt[], int TT[])
    {
        wt[0]=0;
        int tt= 0;
        int sum=0;
        
        System.out.println("Waiting time for "+v[0]+" is = "+ wt[0]);
        for( int u=1; u<d.length; u++)
        {
          wt[u]= d[u-1] + tt;
          tt = wt[u];
            System.out.println("Waiting time for "+ v[u] +" is = " +wt[u]);
        }
        for( int p=0; p<wt.length; p++)
        {
          sum = wt[p]+ sum;
        }
        float avgtime = (float) sum/wt.length ;
        
        System.out.println("Average Waiting time: "+ avgtime);
        
        for( int r=0; r<TT.length; r++)
        {
          TT[r] = wt[r]+d[r];
          System.out.println("Turnaround time for " + v[r] + " is " + TT[r]);
        }
    }
    
}