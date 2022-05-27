public class arrayCalculation {

        public static final ArrayProcessor maximumValue = (arrayName) -> {
            double maximum = arrayName[0];
            for (int i = 0; i < arrayName.length; i++) {
                if (arrayName[i] > maximum)
                    maximum = arrayName[i];
            }
            return maximum;
        };

        public static final ArrayProcessor minimumValue = (arrayName) -> {
            double minimum = arrayName[0];
            for (int i = 0; i < arrayName.length; i++) {
                if (arrayName[i] < minimum)
                    minimum = arrayName[i];
            }
            return minimum;
        };

        public static final ArrayProcessor sumValue = (arrayName) -> {
            double sum = 0;
            for (int i = 0; i < arrayName.length; i++) {
                sum = sum + arrayName[i];
            }
            return sum;
        };

        public static final ArrayProcessor averageValue =
                (arrayName) -> sumValue.apply(arrayName) / arrayName.length;

        public static ArrayProcessor counter(double value) {
            return arrayName -> {
                int add = 0;
                for (int i = 0; i < arrayName.length; i++) {
                    if (arrayName[i] == value)
                        add++;
                }
                return add;
            };
        }

        public static void main(String[] args) {

            double[] array1 = {11, 21, 45, 74, 3, 52, 41, 65, 46, 46, 46, 21, 11, 21};

            System.out.printf("Maximum value in the array: "
                    + maximumValue.apply(array1));
            System.out.printf("\nMinimum value in the array: "
                    + minimumValue.apply(array1));
            System.out.printf("\nSum of the values in the array: "
                    + sumValue.apply(array1));
            System.out.printf("\nAverage of the values in the array: "
                    + averageValue.apply(array1));
            System.out.printf("\nNumber of times the value 46 occurred in the array is: "
                    + counter(46.0).apply(array1));
        }
}
