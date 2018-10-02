package epam.katsapov;

public class Mass_of_a_dinosaur
    {
        //из КГ в Г
        public static double convertGramm(double weight) {
            return weight * 1000;
        }

        //из КГ в Т
        public static double convertTon(double weight) {
            return weight * 0.001;
        }

        //из КГ в МГ
        public static double convertMilligram(double weight) {
            return weight * 1000000;
        }
}

