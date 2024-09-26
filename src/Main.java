import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        System.out.println(list);

        int interger = 2;
        list.add(0, interger);

        int size = list.size();
        for (int i = 1; i < size; i++) {
            int current = list.get(i); //current number at index 1
            int step = i; //Step 1
            while(step > 0 && list.get(step - 1) > current){ //While step is greater than 0 and value left of step is greater than current val
                list.set(step, list.get(step - 1)); //Set value at step to value greater than value at step.
                step--; //Decrement Step
            }
            list.set(step, current); //If not, leave as is and set current step to value at step.
        }
        System.out.println("sort");


        list.add(0, 8);

        size = list.size();
        for (int i = 1; i < size; i++) {
            int current = list.get(i); //current number at index 1
            int step = i; //Step 1
            while(step > 0 && list.get(step - 1) > current){ //While step is greater than 0 and value left of step is greater than current val
                list.set(step, list.get(step - 1)); //Set value at step to value greater than value at step.
                step--; //Decrement Step
            }
            list.set(step, current); //If not, leave as is and set current step to value at step.
        }
        System.out.println("sort");
        System.out.println(list);
    }
}