
import java.util.Scanner;

public class Usuario {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static int obtenerNumero(String mensaje) {
        System.out.println(mensaje + ": ");
        return scanner.nextInt();
    }
    
    public static String obtenerCadena(String mensaje) {
        System.out.println(mensaje + ": ");
        return scanner.nextLine();
    }
    
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de inicio de sesion");
        
        String usuarioCorrecto = "isaak";
        String contrasenaCorrecta = "123";
        
        String usuarioIngresado = obtenerCadena("Ingresa tu nombre de usuario");
        String contrasenaIngresada = obtenerCadena("Ingresa tu contrasena");
        
        boolean usuarioValido = usuarioCorrecto.equals(usuarioIngresado);
        boolean contrasenaValida = contrasenaCorrecta.equals(contrasenaIngresada);
        
        if (usuarioValido && contrasenaValida) {
            System.out.println("Inicio de sesion exitoso! Bienvenido " + usuarioCorrecto);
    
        }
    }
}