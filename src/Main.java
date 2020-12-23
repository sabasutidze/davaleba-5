public class Main {

    public static void main(String[] args) {
        ServiceImpl calculatorService = new ServiceImpl();

        System.out.println(calculatorService.sum(5,3.1));
        System.out.println(calculatorService.prod(2.7,7));
    }

}