import result.TransportChecker;
import vechile.LinerActions;
import view.TransportView;

public class MainClass {
    public static void main(String[] args) {



        TransportView transportView = new TransportView();
        LinerActions linerStation = new LinerActions();
        TransportChecker transportChecker = new TransportChecker(linerStation, transportView);
        System.out.println("_____________________________ALL LINERS_______________________________");
        transportChecker.addLiners("Narrow_bodied", (int) 450, "Airbus_A320");
        transportChecker.addLiners("Wide_bodied", (int) 370, "Ilyushin Il-76TD");
        transportChecker.addLiners("Single_deck", (int) 430, "Boeing 737-800");
        transportChecker.addLiners("Double_Decker", (int) 320, "Ilyushin Il-96-300");
        transportChecker.addLiners("Flat_bed", (int) 230, "Yakovlev Yak-42");
        transportChecker.printAllLiners();
        System.out.println("_____________________________CHECK MODEL LINER_______________________________");
        transportChecker.checkModel("Boeing 737-800");
        transportChecker.checkModel("Boeing 737-900");
        transportChecker.delLinersByIndex(4);
        System.out.println("_____________________________ALL LINERS AFTER OBJECT DELETE_______________________________");
        transportChecker.printAllLiners();
        System.out.println("_____________________________COUNT OF LINERS_______________________________");
        transportChecker.printCountOfLiners();
        transportChecker.delAllLiners();
        System.out.println("_____________________________ALL LINERS AFTER ALL DELETE_______________________________");
        transportChecker.printAllLiners();
        System.out.println("_____________________________NEW ALL LINERS_______________________________");
        transportChecker.addLiners("Narrow_bodied", (int) 430, "Boeing 737-800");
        transportChecker.addLiners("Wide_bodied", (int) 180, "Ilyushin Il-76TD");
        transportChecker.addLiners("Single_deck", (int) 270, "Airbus_A320");
       transportChecker.printAllLiners();
       transportChecker.sort();
        System.out.println("_____________________________ALL LINERS AFTER SORT_______________________________");
       transportChecker.printAllLiners();

    }
}

