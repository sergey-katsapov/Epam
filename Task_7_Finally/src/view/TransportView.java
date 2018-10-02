package view;

public class TransportView {




    public void printAllLiners(String[] allLiners) {
        if (allLiners[0] != null)
        {
            for (String liners : allLiners)
            {
                if (liners != null)
                {
                    System.out.println(liners);
                }
            }
        }
        else
            {
            System.out.println("NO LINERS IN THE AIRPORT");
        }
        System.out.println();
    }





    public void printCountOfLiners(short numOfLiners) {
        System.out.println( "Liners in the airport:"+ numOfLiners + "\n");
    }






    public void printModel(String[] models, String modd) {
        if (models[0] != null)
        {
            for (String model : models)
            {
                if (model != null)
                {
                    System.out.print("This is model: " + model + " - there is in the airport!");
                }
            }
        }
        else {
            System.out.println("This is model: " + modd + " - not found in the airport!");
        }
        System.out.println();
    }
}
