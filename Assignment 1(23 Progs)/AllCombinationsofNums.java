public class AllCombinationsofNums
{
public static void main(String args[])
{
int i, j, k=1;
for(i=1;i<=3;i++){
    for(j=1;j<=3;j++){
        for(k=1;k<=3;k++){
            if(i!=j && i!=k && j!=k){
                System.out.print(i);
                System.out.print(j);
                System.out.print(k+"\n");
            }
        }
    }
}
}
}