
package lab4p2_diego_alvaro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Lab4P2_Diego_Alvaro {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Random r = new Random();
        ArrayList <Enemigos> enemigos = new ArrayList();
        ArrayList <Spiderman> spidermans = new ArrayList();
        
        enemigos.add(new Enemigos("Blindado", "Hombre de Arena", 350, 1000, "LecheWay"));
        enemigos.add(new Enemigos("Alienigena", "Venom", 400, 1000, "SulaWay"));
        enemigos.add(new Enemigos("Alterado Geneticamente", "Bicho", 500, 1000, "Universito"));
        enemigos.add(new Enemigos("Blindado", "Janffry", 200, 1000, "Galaxy"));
        enemigos.add(new Enemigos("Blindado", "Mini Delincuente", 270, 1000, "Galaxy"));
        enemigos.add(new Enemigos("Blindado", "Critian", 100, 1000, "Galaxy"));
        
        spidermans.add(new Spiderman("Spider Punk", "Toby Maguire", 500, 1300, "Universon Catolico"));
        spidermans.add(new Spiderman("Spider Punk", "Steven", 400, 1300, "Universon Catolico"));
        spidermans.add(new Spiderman("Clasico", "Pepe", 300, 1300, "Universon Catolico"));
        spidermans.add(new Spiderman("Spider Punk", "Maxer", 200, 1300, "Universon Catolico"));
        spidermans.add(new Spiderman("Superior Spiderman", "Spider Menso", 270, 1300, "Universon Catolico"));
        spidermans.add(new Spiderman("Spider Punk", "Spidertanque", 440, 1300, "Universon Catolico"));
        
        int opcion = 1;
        while(opcion != 0){
            System.out.println("====================================");
            System.out.println("            Menu                    ");
            System.out.println("====================================");
            System.out.println("");
            System.out.println("0. Salir");
            System.out.println("1. Listar Spiderman");
            System.out.println("2. Listar Enemigos");
            System.out.println("3. Modificar Spiderman");
            System.out.println("4. Modificar Enemigos");
            System.out.println("5. Jugar");
            System.out.print("Ingrese opcion: ");
            opcion = lea.nextInt();
            
            switch(opcion){
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    try {
                    //desordena ambas listas
                    Collections.shuffle(enemigos);
                    Collections.shuffle(spidermans);
 
                    
                    for (int i = 0; i < 5; i++) {
                        System.out.println(spidermans.get(i).getNombre() + " ataco a " + enemigos.get(i).getNombre() + " haciendole " + spidermans.get(i).getAtaque() + " y dejandolo a " + enemigos.get(i).getVida() + " de vida.");
                    }
                } catch (Exception e) {
                        System.out.println("Ocurrio un error, contacte a un administrador.");
                }
                    
                    break;
                case 6:
                    break;
            }
    }
        
        
    }
    
}
