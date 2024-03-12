import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n,i=0,cuadrado,suma=0, opcion;
        System.out.println("Por favor digite un numero");
        n = entrada.nextInt();
        System.out.println("Escriba el numero de la opcion segun el ciclo que desea utilizar");
        System.out.println("1: While ");
        System.out.println("2: For");
        System.out.println("3: Dowhile");
        opcion= entrada.nextInt();
        switch (opcion){
            case 1:

                while (i<=n) {
                cuadrado = i*i;
                suma = suma+cuadrado;
                i++;

                    System.out.println("L suma de los cuadrados del numero"+n+" es: "+suma);
            }
                break;
            case 2: for (i=0;i<=n;i++){

                cuadrado = i*i;
                suma = suma+cuadrado;

                System.out.println("L suma de los cuadrados del numero"+n+" es: "+suma);
            }
            break;
            case 3: do {
                cuadrado = i*i;
                suma = suma+cuadrado;
                i++;
                System.out.println("L suma de los cuadrados del numero"+n+" es: "+suma);
            }while (i<=n);
            break;
        }
    }
}