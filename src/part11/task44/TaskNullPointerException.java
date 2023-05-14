package part11.task44;


import part8.task33.DishWasher;

public class TaskNullPointerException {
    public static void main(String[] args) {
        DishWasher dishWasher = new DishWasher("LG", 5000);
        try {
            dishWasher = null;
            System.out.println(dishWasher.getBrandName());
        } catch (NullPointerException exceptionNull) {
            exceptionNull.printStackTrace();
            System.out.println("Null pointer exception");
            System.exit(1);
        } finally {
            System.exit(0);
        }

    }

}
