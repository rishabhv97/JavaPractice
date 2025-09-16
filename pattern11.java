public class pattern11 {
    public static void hollow_rectangle(int r,int c){
        
        for(int i=1;i<=r;i++){
            for(int j=1; j<=c; j++){
                if(i==1 || i== r || j==1|| j==c){
                    System.out.print("*");
                }else {
                    System.err.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_halfpyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_halfpyramid_with_numbers(int n){
        for(int i=1;i<=n;i++){
            int num=1;
            for(int j=1;j<=n-i+1;j++){
                
                System.out.print(num);
                num++;
            }
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Floyds_Triangle(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void Triangle01(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if ((i+j)%2==0) {
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
                
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        // 1st Half
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=(n-i)*2; j++){
                System.out.print(" ");
            } 
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd Half
        for(int i=n; i>=1;i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=(n-i)*2; j++){
                System.out.print(" ");
            } 
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void hollow_rhombus(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
               if (i==1 || i==n ||j==1|| j==n) {
                 System.out.print("*");
               }else {System.out.print(" ");}
            }
            System.out.println();

        }
    }

    public static void diamond(int n){
        //first part
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Second part
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
       diamond(4);

        
    }   
}
