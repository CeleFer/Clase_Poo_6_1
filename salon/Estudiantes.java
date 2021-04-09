package salon;

import biblioteca.LE;

public class Estudiantes{

    private int senti = 0;

    private int[] codigo;
    private String[] nombres;
    private double[] promedios;

    public Estudiantes(int x){
        this.codigo = new int[x];
        this.nombres = new String[x];
        this.promedios = new double[x];
    }

    public void lista_alumnos(){

        String txt = "";

        for(int x = 0; x<senti-1;x++){
            txt += x+".) "+nombres[x]+"     codigo: "+codigo[x] +"\n";
        }

        LE.mostrarInformacion(null, null, txt, "ok", null);

    }

    public void ingresar_alumno(){

        this.codigo[senti] = LE.leerInt("Ingrese codigo : ");
        this.nombres[senti] = LE.leerString("Ingrese nombre : ");
        this.promedios[senti] = LE.leerDouble("Ingrese proedio : ");

        this.senti =  senti + 1;

    }

    






}