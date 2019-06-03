import java.util.ArrayList;

public class TopSort {
	TopSort(){
		int ln = Main.str3.length();
		int node = Integer.parseInt(Main.str1);
		int Edges = Integer.parseInt(Main.str2);
		int arr[][] = new int[Edges+1][Edges+1];
		int deg[] = new int[node+1];
		char ch[] = Main.str3.toCharArray();
		int a=0,b=0,j=0,i;
		
		ArrayList<Integer> myList1 = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> myList2  = new ArrayList<ArrayList<Integer>>();
		
		
		for(i=0;i<ln;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				if(a==0) {
					a = ch[i]-'A'+1;
					continue;
				}
				 if(b==0){
					b = ch[i]-'A'+1;
				}
				 if(a!=0 && b!=0)
				 {
					 myList1.add(b);
					 myList2.add(myList1);
					 deg[b]++;
					 System.out.println(a+" "+b);
					 a=0;
					 b=0;
				 }
				    
			}
		}
		for(i=0;i<myList2.size();i++)
		{
			for(j=0;j<myList2.get(i).size();j++)
			{
				System.out.print(myList2.get(i).get(j)+" ");
			}
			System.out.println();
		}
		/*for(int i=0;i<ln;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				if(a==0) {
					a = ch[i]-'A'+1;
					continue;
				}
				 if(b==0){
					b = ch[i]-'A'+1;
				}
				 if(a!=0 && b!=0)
				 {
					 arr[a][j++] = b;
					 deg[b]++;
					 a=0;
					 b=0;
				 }
				    
			}
		}*/
		
	}
}
