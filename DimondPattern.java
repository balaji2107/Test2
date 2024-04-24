public class DimondPattern {
    public static void main(String[] args) {
        char k='H';
        int len=k-65+1;
        for(int i=1;i<=len;i++){
            for(int j=len; j>=i; j--)
            {
                System.out.print(" ");
            }
            System.out.print((char)(64+i));
            for(int j=1; j<(i-1)*2; j++)
            {
                System.out.print(" ");
            }
            if(i==1)
            {
                System.out.print("\n");
            }
            else
            {
                System.out.print(((char)(64+i))+"\n");
            }
        }
        for(int i=len-1; i>=1; i--)
        {
            for(int j=len; j>=i; j--)
            {
                System.out.print(" ");
            }
            System.out.print((char)(64+i));
            for(int j=1; j<(i-1)*2; j++)
            {
                System.out.print(" ");
            }
            if(i==1)
            {
                System.out.print("\n");
            }
            else
            {
                System.out.print((char)(64+i)+"\n");
            }
        }
    }

}
