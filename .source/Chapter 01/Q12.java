package project;

public class Q12{
    public static void main(String[] args){
        int i, j;
        
        System.out.print("   |");
        for(i=1;i<10;i++){
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.println("---+----------------------------");

        for(i=1;i<10;i++){
            System.out.printf("%3d|", i);
            for(j=1;j<10;j++){
                System.out.printf("%3d", i*j);
            }
            System.out.println();
        }
    }
}
