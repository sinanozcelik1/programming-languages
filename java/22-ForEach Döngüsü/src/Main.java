 /**
 *
 * @author github.com/sinanozcelik1
 * web site -> sinanozcelik.com
 */
public class Main {
    public static void main(String[] args) {
        
        String[] array = {"Elma","Armut","Kiraz"};
        int[] array2  = {1,2,3,4,5,6,7};
        Deneme[] array3 = {new Deneme("Sinan"),new Deneme("Deneme"),new Deneme("Denemeee")};
        
        for (Deneme d : array3) {
            d.yaz();
            
        }
        for (int i: array2){
            System.out.println(i);
        }
        for (String a : array) {
            System.out.println(a);
        }
    }
    
}
