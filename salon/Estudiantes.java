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

        for(int x = 0; x<senti;x++){
            txt += x+".) "+nombres[x]+"     codigo: "+codigo[x]+"\n";
        }

        LE.mostrarInformacion("Sistema", "Lista estudiantes", txt, "ok", null);

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
        }
        //Mostrar mas alumnos con la nota mayor
        LE.mostrarInformacion("promedio mas alto"+"\n"+nombres[vec]+"     nota :"+promedios[vec]);
        // todos los numeros mayores se contatenaran

    }

    public void lista_alumnos_total(){

        String txt = "";

        for(int x = 0; x<senti;x++){
            txt += x+".) "+nombres[x]+"     codigo: "+codigo[x]+"   Promedios :"+promedios[x]+"\n";
        }

        LE.mostrarInformacion(null, null, txt, "ok", null);

    }

   
    
    public void menu(){

        String txt = "";

        boolean salida = true;

        txt += "        Menu"+"\n";
        txt += "        ----"+"\n";
        txt += "1.) Ingresar estudiante"+"\n";
        txt += "2.) Listado de alumnos"+"\n";
        txt += "3.) Nota más alta"+"\n";
        txt += "4.) Lista completa "+"\n";
        txt += "5.) Salir "+"\n";

        while(salida){


            int op = LE.leerInt(txt);
            switch(op){
                case 1:

                if(senti >= codigo.length ){
                    LE.mostrarAdvertencia("numero maximo de alumnos");
                }else{
                    ingresar_alumno();
                }
                
                break;

                case 2:
                lista_alumnos();
                break;

                case 3:
                notaMayor();
                break;

                case 4:
                lista_alumnos_total();
                break;

                case 5:
                salida = false;
                break;

                default :
                LE.mostrarAdvertencia("Ingrese una opcion valida");     

            }


        }

            
    }
    






}