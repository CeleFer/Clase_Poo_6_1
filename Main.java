
import biblioteca.LE;
import salon.*;

/*
Desarrollar una solución que permita almacenar los códigos, nombres y
promedios de todos los alumnos de un salón de clase. Utilice un menú con las
opciones siguientes:

1. Ingreso de datos.
2. Alumno con promedio mas alto.
3. Listado de alumnos cachimbos.
4. Mostrar datos.
5. Finalizar

Utilice vectores paralelos para almacenar los datos.

*/
public class Main{

    public static void main(String[] args) {
        
        int tam = LE.leerInt("ingrese cantidad maxima de estudiantes : ");


        Estudiantes objEstudiantes = new Estudiantes(tam);

        objEstudiantes.menu();

    }

}