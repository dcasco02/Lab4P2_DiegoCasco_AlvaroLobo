
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
        enemigos.add(new Enemigos("Blindado", "Cristian", 100, 1000, "Galaxy"));
        
        spidermans.add(new Spiderman("Spider Punk", "Toby Maguire", 500, 1300, "Universon Catolico"));
        spidermans.add(new Spiderman("Spider Punk", "Steven", 400, 1300, "Universon Catolico"));
        spidermans.add(new Spiderman("Clasico", "Pepe", 300, 1300, "Universon Catolico"));
        spidermans.add(new Spiderman("Spider Punk", "Maxer", 200, 1300, "Universon Catolico"));
        spidermans.add(new Spiderman("Superior Spiderman", "Spider Menso", 270, 1300, "Universon Catolico"));
        spidermans.add(new Spiderman("Spider Punk", "Evelyn", 440, 1300, "Universon Catolico"));
        
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
            System.out.println("");
            System.out.print("Ingrese opcion: ");
            opcion = lea.nextInt();
            
            switch(opcion){
                case 1:
                    for (int i = 0; i < spidermans.size(); i++) {
                        System.out.println(i + " - " + spidermans.get(i).getNombre());
                    }
                    break;
                case 2:
                    for (int i = 0; i < enemigos.size(); i++) {
                        System.out.println(i + " - " + enemigos.get(i).getNombre());
                    }
                    break;
                case 3:
                    System.out.println("1. Tipo");
                    System.out.println("2. Nombre");
                    System.out.println("3. Ataque");
                    System.out.println("4. Vida");
                    System.out.println("5. Universo");
                    System.out.println("");
                    
                    System.out.print("Opcion: ");
                    opcion = lea.nextInt();
                    
                    
                    switch(opcion){
                        case 1:
                            System.out.print("Nuevo tipo: ");
                            lea.nextLine();
                            String tipo = lea.nextLine();
                            
                            System.out.print("Numero de spiderman a cambiar: ");
                            opcion = lea.nextInt();
                            spidermans.get(opcion).setTipo(tipo);
                            
                            break;
                        case 2:
                            for (int i = 0; i < spidermans.size(); i++) {
                                System.out.println(i + " - " + spidermans.get(i).getNombre());
                            }
                            System.out.print("opcion: ");
                            opcion = lea.nextInt();
                            
                            System.out.print("Nuevo nombre: ");
                            lea.nextLine();
                            String nombre = lea.nextLine();
                            
                            spidermans.get(opcion).setNombre(nombre);
                            break;
                        case 3:
                            System.out.print("Nuevo ataque: ");
                            lea.nextLine();
                            String ataque = lea.nextLine();
                            
                            System.out.print("Numero de spiderman a cambiar: ");
                            opcion = lea.nextInt();
                            
                            spidermans.get(opcion).setNombre(ataque);
                            break;
                        case 4:
                            System.out.print("Nueva vida: ");
                            String vida = lea.nextLine();
                            
                            System.out.print("Numero de spiderman a cambiar: ");
                            opcion = lea.nextInt();
                            
                            spidermans.get(opcion).setNombre(vida);
                            break;
                        case 5:
                            System.out.print("Nuevo universo: ");
                            String universo = lea.nextLine();
                            
                            System.out.print("Numero de spiderman a cambiar: ");
                            opcion = lea.nextInt();
                            
                            spidermans.get(opcion).setNombre(universo);
                            break;
                        case 6:
                            System.out.print("Nuevo nombre: ");
                            lea.nextLine();
                            String nombre1 = lea.nextLine();
                            
                            System.out.print("Numero de spiderman a cambiar: ");
                            opcion = lea.nextInt();
                            
                            spidermans.get(opcion).setNombre(nombre1);
                            
                            System.out.print("Nuevo ataque: ");
                            String ataque1 = lea.nextLine();
                            
                            System.out.print("Numero de spiderman a cambiar: ");
                            opcion = lea.nextInt();
                            
                            spidermans.get(0).setNombre(ataque1);
                            
                            System.out.print("Nueva vida: ");
                            String vida1 = lea.nextLine();
                            
                            spidermans.get(0).setNombre(vida1);
                            
                            System.out.print("Nuevo universo: ");
                            String universo1 = lea.nextLine();
                            
                            spidermans.get(0).setNombre(universo1);
                            
                            break;
                            
                    }
                    
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
