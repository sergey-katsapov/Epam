package result;


import vechile.LinerActions;
import view.TransportView;


public class TransportChecker {

    private LinerActions linerActions;
    private TransportView transportView;

    public TransportChecker(LinerActions action, TransportView transpView)
    {
        this.linerActions = action;
        this.transportView = transpView;
    }


    public void printAllLiners() {
        transportView.printAllLiners(linerActions.AllLiners());
    }


    public void addLiners(String bodyType, int numOfPassSeats, String model)
    {
        linerActions.addLiners(bodyType, numOfPassSeats, model);
    }


    public void delLinersByIndex(int index) {
        linerActions.delLinersByIndex(index);
    }

    public void printCountOfLiners()
    {
        transportView.printCountOfLiners(linerActions.NumOfLiners());
    }



    public void delAllLiners()
    {
        linerActions.delAllLiners();
    }


    public void checkModel(String model)
    {
        transportView.printModel(linerActions.getModel(model), model);
    }


    public void sort()
    {
        linerActions.SortSeats();
    }    
}
