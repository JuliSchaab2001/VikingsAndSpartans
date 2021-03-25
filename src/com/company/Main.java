package com.company;

import com.company.Classes.Human;
import com.company.Classes.Spartan;
import com.company.Classes.Viking;
import com.company.Implementations.SpartanDrinkImpl;
import com.company.Implementations.SpartanPeeImpl;
import com.company.Implementations.VikingDrinkImpl;
import com.company.Implementations.VikingPeeImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Viking>vikingList = new ArrayList<Viking>();
        vikingList.add(new Viking("Ragnar Lothbrok", 40,90,new VikingDrinkImpl(), new VikingPeeImpl(),9));
        vikingList.add(new Viking("Bjorn Ironside", 20,70,new VikingDrinkImpl(), new VikingPeeImpl(),6));
        vikingList.add(new Viking("Lagertha Lothbrok", 35,60,new VikingDrinkImpl(), new VikingPeeImpl(),8));
        vikingList.add(new Viking("Floki", 40,80,new VikingDrinkImpl(), new VikingPeeImpl(),4));

        List<Spartan> spartanList = new ArrayList<Spartan>();
        spartanList.add(new Spartan("Leónidas II", 35, 87,new SpartanDrinkImpl(), new SpartanPeeImpl(),8));
        spartanList.add(new Spartan("Cleómbroto II", 40, 93,new SpartanDrinkImpl(), new SpartanPeeImpl(),3));
        spartanList.add(new Spartan("Leónidas II", 50, 110,new SpartanDrinkImpl(), new SpartanPeeImpl(),9));
        spartanList.add(new Spartan("Cleómenes III", 35, 70,new SpartanDrinkImpl(), new SpartanPeeImpl(),7));
        play(vikingList,spartanList);
    }

    public static String play(List<Viking> vikingList, List<Spartan> spartanList){
        int vikingPoints=0;
        int spartanPoints=0;
        String winnerTeam="";
        System.out.println("----PRESENTACION DE LOS EQUIPOS----");
        System.out.println("\n//->VIKINGOS<-//\n");
        Iterator<Viking> vikingIterator = vikingList.iterator();
        while (vikingIterator.hasNext()){
            Viking viking = vikingIterator.next();

            System.out.println(viking.getName() +", Peso-> "+viking.getWeight()+", edad ->"+viking.getAge());
        }
        wait(3);
        System.out.println("\n//->SPARTANOS<-//\n");
        Iterator<Spartan> spartanIterator = spartanList.iterator();
        while (spartanIterator.hasNext()){
            Spartan spartan = spartanIterator.next();
            System.out.println(spartan.getName() +", Peso-> "+spartan.getWeight()+", edad ->"+spartan.getAge());
        }
        wait(5);
        limpiar();
        System.out.println("\n\n/////// QUE EMPIEZE EL TORNEO ///////\n\n");
        wait(7);
        limpiar();
        String winner="";
        vikingIterator = vikingList.iterator();
        spartanIterator = spartanList.iterator();
        while(spartanIterator.hasNext() && vikingIterator.hasNext()){
            Viking viking = vikingIterator.next();
            Spartan spartan = spartanIterator.next();
            winner=versus(viking,spartan);
            if(winner.equals("Viking")){
                vikingPoints++;
            }
            if(winner.equals("Spartan")){
                spartanPoints++;
            }
        }
        if(spartanPoints == vikingPoints){
            return "Draw";
        }
        if(spartanPoints>vikingPoints){
            return "Spartan";
        }else{
            return "Viking";
        }
    }



    public static String versus(Viking viking, Spartan spartan){
        viking.Drink();
        boolean spartanLoser=false;
        boolean vikingLoser=false;
        System.out.println("\n");
        spartan.Drink();
        for (int i =0; i<3; i++){
            if((viking.getProfessionalDrinker() - (int) (Math.random()*11+0) > 0)){
                viking.Drink();
            }else{
                viking.Pee();
                vikingLoser=true;
            }
            if((spartan.getExtraTolerance() - (int) (Math.random()*11+0) > 0)){
                spartan.Drink();
            }else{
                spartan.Pee();
                spartanLoser=true;
            }
            if(spartanLoser && vikingLoser){ //Orinan los dos -> empate
                System.out.println("Ninguno aguanto el poder de la cerva, EMPATE!");
                return "Draw";
            }
            if(vikingLoser){ //Orina el vikingo -> gana el spartano
                System.out.println("El vikingo no aguanto el meo, EL SPARTANO GANA!");
                return "Spartan";
            }
            if(spartanLoser){ //Orina el spartano -> gana el vikingo
                System.out.println("El spartano no aguanto el meo, EL VIKINGO GANA!");
                return "Viking";
            }
        }
        return "Draw";//No orina ninguno -> empate
    }



    public static void limpiar()
    {
        for (int i=0; i < 50; i++)
        {
            System.out.println("");
        }
    }



    public static void wait(int segundos){
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
