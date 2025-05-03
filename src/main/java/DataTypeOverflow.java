public class DataTypeOverflow {
    public static void main(String[] args) {
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        float overFlowedVolumeFloat = maxFloat*2;
        System.out.println("Максимальное значение float: " + maxFloat);
        System.out.println("Минимальное значение float: " + minFloat);
        System.out.println("Переполнение float: " + overFlowedVolumeFloat);

        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        double overFlowedVolumeDouble = maxDouble*2;
        System.out.println("Максимальное значение double: " + maxDouble);
        System.out.println("Минимальное значение double: " + minDouble);
        System.out.println("Переполнение double: " + overFlowedVolumeDouble);
    }
}
