package vechile;

public class LinerActions {

        private final short ALL_LINERS = 80;
        private LinerModelPass[] airport = new LinerModelPass[ALL_LINERS];


        public void addLiners(String bodyType, int numOfPassSeats, String model) {
            for (int i = 0; i < airport.length; i++)
            {
                if (airport[i] == null)
                {
                    airport[i] = new LinerModelPass();
                    airport[i].setBodyType(bodyType);
                    airport[i].setNumOfSeats(numOfPassSeats);
                    airport[i].setModel(model);
                    break;
                }
            }
        }


        public String[] AllLiners() {
            String[] AllLinersArray = new String[airport.length];
            for (int i = 0; i < airport.length; i++)
            {
                if (airport[i] != null)
                {
                    AllLinersArray[i] = airport[i].toString();
                }
            }
            return AllLinersArray;
        }



        public void delLinersByIndex(int index)
        {
            if (index <= airport.length && index > 0)
            {
                if (airport[index] != null)
                {
                    for (int i = index - 1; i < airport.length; i++)
                    {
                        if (airport[i] != null)
                        {
                            airport[i] = airport[i + 1];
                        } else {
                            break;
                        }
                    }
                }
            }
        }


        public short NumOfLiners()
        {
            short count = 0;
            for (LinerModelPass liners : airport)
            {
                if (liners != null)
                {
                    count++;
                } else {
                    break;
                }
            }
            return count;
        }



        public void delAllLiners()
        {
            for (int i = 0; i < airport.length; i++)
            {
                if (airport[i] != null)
                {
                    airport[i] = null;
                } else {
                    break;
                }
            }
        }

        public String[] getModel(String model)
        {

            String[] models = new String[ALL_LINERS];
            int iter = 0;
            for (int i = 0; i < airport.length; i++)
            {
                if (airport[i] != null) {
                    if (airport[i].getModel().equalsIgnoreCase(model))
                    {
                        models[iter] = model;
                        iter++;
                    }
                } else {
                    break;
                }
            }
            return models;
        }




        public void SortSeats()
        {
            if (airport[0] != null)
            {
                int start = 0;
                int end = -1;
                for (int i = 0; i < airport.length; i++) {
                    if (airport[i] != null) {
                        end++;
                    } else {
                        break;
                    }
                }
                Sort(start, end);
            }
        }


        private void Sort(int left, int right) {
            int index = partition(airport, left, right);
            if (left < index - 1)
                Sort(left, index - 1);
            if (index < right)
                Sort(index, right);
        }

        private int partition(LinerModelPass arr[], int left, int right) {
            int i = left, j = right;
            LinerModelPass tmp;
            int pivot = arr[(left + right) / 2].getNumOfSeats();

            while (i <= j) {
                while (arr[i].getNumOfSeats() < pivot)
                    i++;
                while (arr[j].getNumOfSeats() > pivot)
                    j--;

                if (i <= j) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i++;
                    j--;
                }
            }

            return i;
        }


    }

