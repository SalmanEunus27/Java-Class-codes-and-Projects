public class Starline{
    public static void main (String [] args){
        for(int row = 4;row>=1;row--){
            for(int col = 1;col<=5-row;col++){
                System.out.print("#");
            }

            System.out.println();
        }
        for(int row = 0;row<3;row++){
            for(int col = 1;col<=3-row;col++){
                System.out.print("#");
            }

        
            System.out.println();
        }
    }
}




