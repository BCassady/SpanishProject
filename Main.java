import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String conj = "";
    System.out.print("Enter the word to conjugate: ");
    String s1 = sc.nextLine();
    System.out.println("Formal (0) or Informal (1)");
    int formalInformal = sc.nextInt();
    if(formalInformal==0){
        System.out.println("Usted (0) or Ustedes (1)");
        int ustedUstedes = sc.nextInt();
        if(ustedUstedes==0){
            if(s1.endsWith("ar")==true){
                conj = s1.substring(0,s1.length()-2) + "e"; 
            } else if (s1.endsWith("er")==true||s1.endsWith("ir")==true){
                conj = s1.substring(0,s1.length()-2) + "a"; 
            }
        } else {
            if(s1.endsWith("ar")==true){
                conj = s1.substring(0,s1.length()-2) + "en"; 
            } else if (s1.endsWith("er")==true||s1.endsWith("ir")==true){
                conj = s1.substring(0,s1.length()-2) + "an"; 
            }
        }
    } else {
        System.out.println("Positive (0) or Negative (1)");
        int positiveNegative = sc.nextInt();
        if(positiveNegative==0){
            if(s1.endsWith("ar")==true){
                conj = s1.substring(0,s1.length()-2) + "a"; 
            } else if (s1.endsWith("er")==true||s1.endsWith("ir")==true){
                conj = s1.substring(0,s1.length()-2) + "e"; 
            }
        } else {
            if(s1.endsWith("ar")==true){
                conj = s1.substring(0,s1.length()-2) + "es"; 
            } else if (s1.endsWith("er")==true||s1.endsWith("ir")==true){
                conj = s1.substring(0,s1.length()-2) + "as"; 
            }
        }
    }
    System.out.println(conj);
  }
}