import java.util.Scanner;

public class conv {
    int j;
    Scanner sc = new Scanner(System.in);
    public  void upcse(String block) {
        System.out.println("THE UPPER CASE OF THE ENTERED STRING" + "  " + block.toUpperCase());}
        public  void lwcse(String block){
            System.out.println("THE LOWER CASE OF THE ENTERED STRING" + "  " + block.toLowerCase());
        }
        public  void ident(String block){
            System.out.println("The numbers inside the entered string is\r\n");
            System.out.println(block.replaceAll("[^0-9]",""));
        }
        public void number(String block){
            try {
                Double.parseDouble(block);
                System.out.println("String is a number" + "  " + block);
            } catch (NumberFormatException e) {
                System.out.println("String is an invalid number" + "   " + block);
                return;
            }

        }
        public void extrxt(String block){
            String block2 = block.replaceAll("[0-9]", "");
            System.out.println("Selct from the below menu\r\n");
            System.out.println("1. Convert to UpperCase\r\n");
            System.out.println("2.Convert to LowerCase\r\n");
            j = sc.nextInt();
            switch (j) {
                case 1:
                    System.out.println(block2.toUpperCase());
                    break;
                case 2:
                    System.out.println(block2.toLowerCase());
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
            
        }
    }
    


    
    
    




    
