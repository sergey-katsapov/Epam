package vechile;

public class LinerModelPass extends LinerModel {

        private int numOfSeats;
        private String model;


        @Override
        public String toString() {
            return model + " " + super.toString() + " " + Integer.toString(numOfSeats);
        }


        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            LinerModelPass passCar = (LinerModelPass) obj;

            return (this.getModel().equalsIgnoreCase(model) &&
                    this.getBodyType().equalsIgnoreCase(passCar.getBodyType()) &&
                    this.getNumOfSeats() == numOfSeats);
        }


        @Override
        public int hashCode() {
            final int PRIME = 17;
            int result = 1;
            result = PRIME * result + ((model == null) ? 0 : this.getModel().hashCode());
            result = PRIME * result + numOfSeats;
            result = PRIME * result + ((model == null) ? 0 : this.getModel().hashCode());
            return result;

        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        @Override
        public String getBodyType() {
            return super.getBodyType();
        }

        @Override
        public void setBodyType(String mType) {
            super.setBodyType(mType);
        }

        public void setNumOfSeats(int numOfSeats) {
            this.numOfSeats = numOfSeats;
        }

        public int getNumOfSeats() {
            return numOfSeats;
        }

    }

