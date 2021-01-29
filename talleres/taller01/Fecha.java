public class Fecha{
    
    int dia;
    int mes;
    int anyo;

    public Fecha(){
        dia = this.dia;
        mes = this.mes;
        anyo = this.anyo;
    }

    public int dia(){
        return dia;
    }

    public int mes(){
        return mes;
    }

    public int anyo(){
        return anyo;
    }

    public int comparar (Fecha otra){
        
        if(this.anyo < otra.anyo){
            return -1;
        }if(this.anyo > otra.anyo){
            return 1;
        }
        
        if(this.mes < otra.mes){
            return -1;
        }if(this.mes > otra.mes){
            return 1;
        }
        
        if(this.dia < otra.dia){
            return -1;
        }if(this.dia > otra.dia){
            return 1;
        }return 0;
    }
    

    public String toString() {
        String Fecha = "";
        Fecha = this.anyo + "/" + this.mes +"/" + this.dia;
        return Fecha;
    }
}
