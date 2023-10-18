import java.util.Scanner;

public class tictactoe{
    public static void main(String[] args) {
       
        mapGen();
        play();
    }
    public static void mapGen(){
        Scanner sc =new Scanner(System.in);
        System.out.println("** Welcome to Tic Tac Toe Game **");
        char pos[]={'0','1','2','3','4','5','6','7','8'};
        System.out.println("         |         |");
        System.out.println("         |         |");
        System.out.println("____"+pos[0]+"____|"+"____"+pos[1]+"____|"+"____"+pos[2]+"____");
        System.out.println("         |         |");
        System.out.println("         |         |");
        System.out.println("____"+pos[3]+"____|"+"____"+pos[4]+"____|"+"____"+pos[5]+"____");
        System.out.println("         |         |");
        System.out.println("         |         |");
        System.out.println("____"+pos[6]+"____|"+"____"+pos[7]+"____|"+"____"+pos[8]+"____");
   
    }
    public static void play(){

        Scanner sc=new Scanner(System.in);
        System.out.println("** Welcome to Tic Tac Toe Game **");
        System.out.println();
        System.out.println();
        System.out.println("Player -1 : X");
        System.out.println("Player -2 : O");
        System.out.println("Enter your name player -1 :");
        String name1=sc.next();
        System.out.println("Enter your name player -2 :");
        String name2=sc.next();

        int p1win=0;
        int p2win=0;
        int position1=-2;
        int position2=-1;
        int moves=0;
        char pos[]={'0','1','2','3','4','5','6','7','8'};
        while(p1win!=1 || p2win!=1){

        System.out.println("Enter the position "+name1);
         position1 = sc.nextInt();
        if(position1==position2){
            System.out.println("Invalid move");
        }
        else if(position1 >8 || position1<0){
            System.out.println("Invalid move !");
        }
        else{
        pos[position1]='X';
        }

        System.out.println("         |         |");
        System.out.println("         |         |");
        System.out.println("____"+pos[0]+"____|"+"____"+pos[1]+"____|"+"____"+pos[2]+"____");
        System.out.println("         |         |");
        System.out.println("         |         |");
        System.out.println("____"+pos[3]+"____|"+"____"+pos[4]+"____|"+"____"+pos[5]+"____");
        System.out.println("         |         |");
        System.out.println("         |         |");
        System.out.println("____"+pos[6]+"____|"+"____"+pos[7]+"____|"+"____"+pos[8]+"____");
        moves++;

          
       if(pos[0]=='X' && pos[3]=='X' && pos[6]=='X'){
                 p1win=1;
                 break;
        }
        else if(pos[0]=='X' && pos[4]=='X' && pos[8]=='X'){
               p1win=1;
               break;
        }
         else if(pos[0]=='X' && pos[1]=='X' && pos[2]=='X'){
               p1win=1;
               break;
        }
         else if(pos[1]=='X' && pos[4]=='X' && pos[7]=='X'){
               p1win=1;
               break;
        }
         else if(pos[2]=='X' && pos[5]=='X' && pos[8]=='X'){
               p1win=1;
               break;
        }
         else if(pos[3]=='X' && pos[4]=='X' && pos[5]=='X'){
               p1win=1;
               break;
        }
         else if(pos[6]=='X' && pos[7]=='X' && pos[8]=='X'){
               p1win=1;
               break;
        }
         else if(pos[2]=='X' && pos[4]=='X' && pos[6]=='X'){
               p1win=1;
               break;
        }
        
        System.out.println("Enter the position "+name2);
         position2 = sc.nextInt();
        if(position2==position1){
            System.out.println("Invalid move");
        }
        else if(position2 >8 || position2<0){
            System.out.println("Invalid move !");
        }
        else{
        pos[position2]='O';
        }
       
        
        System.out.println("         |         |");
        System.out.println("         |         |");
        System.out.println("____"+pos[0]+"____|"+"____"+pos[1]+"____|"+"____"+pos[2]+"____");
        System.out.println("         |         |");
        System.out.println("         |         |");
        System.out.println("____"+pos[3]+"____|"+"____"+pos[4]+"____|"+"____"+pos[5]+"____");
        System.out.println("         |         |");
        System.out.println("         |         |");
        System.out.println("____"+pos[6]+"____|"+"____"+pos[7]+"____|"+"____"+pos[8]+"____");
        
        moves++;
       
          if(pos[0]=='O' && pos[4]=='O' && pos[8]=='O'){
             
             p2win=1;
             break;
        }
         else if(pos[0]=='O' && pos[1]=='O' && pos[2]=='O'){
             p2win=1;
             break;
        }
         else if(pos[1]=='O' && pos[4]=='O' && pos[7]=='O'){
               p2win=1;
               break;
        }
         else if(pos[2]=='O' && pos[5]=='O' && pos[8]=='O'){
               p2win=1;
               break;
        }
         else if(pos[3]=='O' && pos[4]=='O' && pos[5]=='O'){
               p2win=1;
               break;
        }
    
         else if(pos[6]=='O' && pos[7]=='O' && pos[8]=='O'){
               p2win=1;
               break;
        }
         else if(pos[2]=='O' && pos[4]=='O' && pos[6]=='O'){
               p2win=1;
               break;
        }
         else if(pos[0]=='O' && pos[3]=='O' && pos[6]=='O'){
               p2win=1;
               break;
         }

        else if(moves==8){
            System.out.println(" Draw !");
            break;
        }
    }
    if(p1win==1){
     System.out.println(name1+" wins");
    }
    else if(p2win==1) {
    System.out.println(name2+" wins");
    }

    }
}
   

  


