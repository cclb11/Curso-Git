import java.util.Scanner;

public class InicioGit{

    public static void main(String[] args) {

        correr accion=new correr();

        Scanner entrada=new Scanner(System.in);

        System.out.println("Que ejercicio desea realizar: \n1.Correr \n2.Trotar");

        int deporte=entrada.nextInt();

        if (deporte==1) {
            System.out.println(accion.tipo());
        }

    }

}