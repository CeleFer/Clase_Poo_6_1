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
            txt += x+".) "+nombres[x]+"\n";
        }

        LE.mostrarInformacion(null, null, txt, "ok", null);

    }

    public void ingresar_alumno(int x , String y , double z){

        this.codigo[senti] = x;
        this.nombres[senti] = y;
        this.promedios[senti] = z;

        this.senti =  senti + 1;

    }

    




}