public class Zombies {
    public static void main(String[] args) {
        double zombies =100;
        int dia =1;

        while(zombies<= 1000){
            int crecimiento = (int) Math.floor(Math.random()*100+1);
            double porcentaje =(double) crecimiento/100;
            double aumento = zombies*porcentaje;
            System.out.println("Dia: "+dia);
            dia += 1;
            zombies+= aumento;
            System.out.println("la poblacion es: "+zombies);
            System.out.println("porcentaje "+porcentaje);
        }
        System.out.println("zombies");
    }
}
