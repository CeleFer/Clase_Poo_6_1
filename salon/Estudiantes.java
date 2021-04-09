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
            txt += x+".) "+nombres[x]+"     codigo: "+codigo[x]+"\n";
        }

        LE.mostrarInformacion(null, null, txt, "ok", null);

    }

    public void ingresar_alumno(){

        this.codigo[senti] = LE.leerInt("Ingrese codigo : ");
        this.nombres[senti] = LE.leerString("Ingrese nombre : ");
        this.promedios[senti] = LE.leerDouble("Ingrese proedio : ");

        this.senti =  senti + 1;

    }

    public void notaMayor(){

        double mayor = -1;
        int vec = 0;

        for(int x = 0; x < senti ; x++){

            if(mayor < promedios[x]){
                mayor = promedios[x];
                vec = x;
            }            

            LE.mostrarInformacion("promedio mas alto"+"\n"+nombres[x]+"     nota :"+promedios[x]);

        }
    }

    
    public void menu(){

            
    }
    






}