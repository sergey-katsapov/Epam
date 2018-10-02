import static java.lang.Math.pow;

    public class Triangle
    {

        private double aX = 0;
        private double aY = 0;
        private double bX = 0;
        private double bY = 0;
        private double cX = 0;
        private double cY = 0;
        private double vectorAB = 0;
        private double vectorBC = 0;
        private double vectorAC = 0;


        public void setPointA(int x, int y) {
            aX = x;
            aY = y;
        }


        public void setPointB(int x, int y) {
            bX = x;
            bY = y;
        }


        public void setPointC(int x, int y) {
            cX = x;
            cY = y;
        }


        public boolean vectorIsNull() {
            vectorAB = pow(pow((bX - aX), 2) + pow((bY - aY), 2), 0.5);
            vectorBC = pow(pow((cX - bX), 2) + pow((cY - bY), 2), 0.5);
            vectorAC = pow(pow((cX - aX), 2) + pow((cY - aY), 2), 0.5);

            // check that the vectors !=0
            if (vectorAB != 0 && vectorBC != 0 && vectorAC != 0) {
                return false;
            }

            return true;
        }



        public boolean isOrtogon() {
            double tmpHypotAB = Math.hypot(vectorBC, vectorAC);
            double tmpHypotBC = Math.hypot(vectorAB, vectorAC);
            double tmpHypotAC = Math.hypot(vectorAB, vectorBC);

            if (tmpHypotAB == vectorAB ||
                    tmpHypotBC == vectorBC ||
                    tmpHypotAC == vectorAC)
            {
                return true;
            }
            return false;
        }


        public boolean Line() {

            if ((aX - cX) * (bY - cY) - (bX - cX) * (aY - cY) != 0) {
                return false;
            }

            return true;
        }


    }