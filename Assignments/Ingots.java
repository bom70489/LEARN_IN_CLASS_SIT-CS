import java.util.Scanner;
// 10 iron make sword
// 8 ingots for shield
// 3 ingots for helmet
// If there’re any ingots left, the blacksmith will prioritize making a sword, a shield and then a helmet respectively. 
public class Ingots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ingots = sc.nextInt();
        int sword = 0;
        int shield = 0;
        int helmet = 0;

        while(ingots >= 21) {
            sword++;
            shield++;
            helmet++;
            ingots -= 21;
        }
        
        while(ingots >= 3) {
            if(ingots >= 10) {
                sword++;
                ingots -= 10;
            }
        
            if(ingots >= 8) {
                shield++;
                ingots -= 8;
            }
        
            if(ingots >= 3) {
                helmet++;
                ingots -= 3;
            }
        }
        
        System.out.println(sword + " " + shield + " " + helmet + " " + ingots);
        sc.close();
    }
}