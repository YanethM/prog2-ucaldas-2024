import java.util.Scanner;

public class Animal{
    Scanner sc = new Scanner(System.in);
    public String pet_type="";
    public String pet_name="";

    public void showInformation(){
       System.out.println("Ingresa la información");
       System.out.println("Tipo de mascota");
       pet_type = sc.nextLine();
       System.out.println("Nombre de la mascota");
       pet_name = sc.nextLine();
    }
}