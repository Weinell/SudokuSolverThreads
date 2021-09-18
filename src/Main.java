import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);

        Reader reader = new Reader(arrayList);

        System.out.println(reader);

    }
}
