import java.util.Scanner;
public class Day03_IfElse {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter age :");
        int age=sc.nextInt();
        sc.nextLine();
        System.err.print("Enter name :");
        String name=sc.nextLine();
        System.err.println("Name:"+name+" Age:"+age);
        if(age>=18){
            System.err.println("Eligibale");  
        }
        else if(age<18){
            System.err.println("bachee");
        }
        switch (age) {
            case 1:System.err.println("Class me ja");
                
                break;
                case 2:System.err.println("OKva");
            default:
                System.err.println("error 6");
        }
    

    }
}

// import java.util.Scanner;
// public class Day03_IfElse {
//     public static void main(String a[]){
        
//         System.out.print("Enter age :");
//         Scanner sc=new Scanner(System.in);
//         int age=sc.nextInt();
//        sc.nextLine();
        

//         System.out.print("Enter your name: ");
        
//         String name = sc.nextLine();
       // System.out.println("Your name is "+name+"and age is "+age);




//     }
// }


// import java.util.Scanner;

// public class Day03_IfElse {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();

//         if (age >= 18) {
//             System.out.println("Eligible to vote");
//         } else {
//             System.out.println("Not eligible to vote");
//         }

//         sc.close();
//     }
// }