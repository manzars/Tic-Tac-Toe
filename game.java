import java.util.*;
class TicTacToe{
	public void WinorLose(char [][]abc,String s){
		if(abc[0][0]=='X' && abc[0][1]=='X' && abc[0][2]=='X'){
			System.out.println("winner is "+s);
			System.exit(0);
		}
		else if(abc[1][0]=='X' && abc[1][1]=='X' && abc[1][2]=='X'){
			System.out.println("winner is "+s);
			System.exit(0);
		}
		else if(abc[2][0]=='X' && abc[2][1]=='X' && abc[2][2]=='X'){
			System.out.println("winner is "+s);
			System.exit(0);
		}
		else if(abc[0][0]=='X' && abc[1][0]=='X' && abc[2][0]=='X'){
			System.out.println("winner is "+s);
			System.exit(0);
		}
		else if(abc[0][1]=='X' && abc[1][1]=='X' && abc[2][1]=='X'){
			System.out.println("winner is "+s);
			System.exit(0);
		}
		else if(abc[0][2]=='X' && abc[1][2]=='X' && abc[2][2]=='X'){
			System.out.println("winner is "+s);
			System.exit(0);
		}
		else if(abc[0][0]=='X' && abc[1][1]=='X' && abc[2][2]=='X'){
			System.out.println("winner is "+s);
			System.exit(0);
		}
		else if(abc[0][2]=='X' && abc[1][1]=='X' && abc[2][0]=='X'){
			System.out.println("winner is "+s);
			System.exit(0);
		}
		
		
		
		else if(abc[0][0]=='O' && abc[0][1]=='O' && abc[0][2]=='O'){
			System.out.println("winner is "+s);
			System.exit(0);
		}
		else if(abc[1][0]=='O' && abc[1][1]=='O' && abc[1][2]=='O'){
			System.out.println("winner is "+s);
			System.exit(0);
		}
		else if(abc[2][0]=='O' && abc[2][1]=='O' && abc[2][2]=='O'){
			System.out.println("winner is "+s);
			System.exit(0);
		}
		else if(abc[0][0]=='O' && abc[1][0]=='O' && abc[2][0]=='O'){
			System.out.println("winner is "+s);
			System.exit(0);
		}
		else if(abc[0][1]=='O' && abc[1][1]=='O' && abc[2][1]=='O'){
			System.out.println("winner is "+s);
			System.exit(0);
		}
		else if(abc[0][2]=='O' && abc[1][2]=='O' && abc[2][2]=='O'){
			System.out.println("winner is "+s);
			System.exit(0);
		}
		else if(abc[0][0]=='O' && abc[1][1]=='O' && abc[2][2]=='O'){
			System.out.println("winner is "+s);
			System.exit(0);
		}
		else if(abc[0][2]=='O' && abc[1][1]=='O' && abc[2][0]=='O'){
			System.out.println("winner is "+s);
			System.exit(0);
		}
		else{
			return;
		}
	}
	public void example(){
		int i,j;
		int place[][]=new int[3][3];
		place[0][0]=1;
		place[0][1]=2;
		place[0][2]=3;
		place[1][0]=4;
		place[1][1]=5;
		place[1][2]=6;
		place[2][0]=7;
		place[2][1]=8;
		place[2][2]=9;
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
			System.out.print("["+place[i][j]+"]\t");
			}
			System.out.println();
		}
	}
	public void show(char [][]abc){
		int i,j;
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
			System.out.print("["+abc[i][j]+"]\t");
			}
			System.out.println();
		}
	}
	public static void main(String []args){
		char box[][]=new char[3][3];
		int i,j,loc=0,k=0,l=0;
		boolean one,two;
		one=true;
		two=true;
		TicTacToe TT=new TicTacToe();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter player one name");
		String p1=sc.nextLine();
		System.out.println("Enter player two name");
		String p2=sc.nextLine();
		System.out.println(p1+" will be X");
		System.out.println(p2+" will be O");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				box[i][j]='-';
			}
		}
		for(i=2;i<10;i++){
			if(i%2==0){
				System.out.println(p1+"'s turn");
				System.out.println("Enter the location");
                System.out.println();
                System.out.println("********************");
				TT.example();
                System.out.println("********************");
                System.out.println();
				while(one){
					while(two){
						loc=sc.nextInt();
						if(loc>9){
							System.out.println("You Are High...Get some Sleep....or ReEnter Location");
						}
						else{
							two=false;
						}
					}	
					switch(loc){
						case 1:k=0;
						l=0;
						break;
						case 2:k=0;
						l=1;
						break;
						case 3:k=0;
						l=2;
						break;
						case 4:k=1;
						l=0;
						break;
						case 5:k=1;
						l=1;
						break;
						case 6:k=1;
						l=2;
						break;
						case 7:k=2;
						l=0;
						break;
						case 8:k=2;
						l=1;
						break;
						case 9:k=2;
						l=2;
						break;
					}
					if(box[k][l]=='-'){
						box[k][l]='X';
                        System.out.println();
                        System.out.println("********************");
						TT.show(box);
                        System.out.println("********************");
                        System.out.println();
						TT.WinorLose(box,p1);
						one=false;
					}
					else{
						System.out.println("This Location Is Already Taken....Enter Again");
                        two=true;
					}
				}
			}
			else{
				one=true;
				two=true;
				System.out.println(p2+"'s turn");
				System.out.println("Enter the location");
                System.out.println();
                System.out.println("********************");
				TT.example();
                System.out.println("********************");
                System.out.println();
				while(one){
					while(two){
						loc=sc.nextInt();
						if(loc>9){
							System.out.println("You Are High...Get some Sleep....or ReEnter Location");
						}
						else{
							two=false;
						}
					}	
					switch(loc){
						case 1:k=0;
						l=0;
						break;
						case 2:k=0;
						l=1;
						break;
						case 3:k=0;
						l=2;
						break;
						case 4:k=1;
						l=0;
						break;
						case 5:k=1;
						l=1;
						break;
						case 6:k=1;
						l=2;
						break;
						case 7:k=2;
						l=0;
						break;
						case 8:k=2;
						l=1;
						break;
						case 9:k=2;
						l=2;
						break;
					}
					if(box[k][l]=='-'){
						box[k][l]='O';
                        System.out.println();
                        System.out.println("********************");
						TT.show(box);
                        System.out.println("********************");
                        System.out.println();
						TT.WinorLose(box,p2);
						one=false;
					}
					else{
						System.out.println("This Location Is Already Taken");
                        two=true;
					}
				}
			}
			one=true;
			two=true;
		}
        System.out.println("It's A Tie");
	}
}
