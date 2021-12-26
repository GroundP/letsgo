import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListPrac {

    void practice(){
        ArrayList list = new ArrayList();
        list.add("asd");
        list.add(1);

        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.contains("asd"));

        String arr[] = { "asd", "qwe", "zxc"};
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(arr));

        System.out.println(list2);
    }

    void sort()
    {
        String arr[] = { "asd", "qwe", "zxc"};
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(arr));

        //list2.sort(Comparator.naturalOrder());
        list2.sort(Comparator.reverseOrder());
        System.out.println(list2);
    }

    public static void main(String[] args) {
        ListPrac prac = new ListPrac();
        prac.practice();
        prac.sort();
    }
}
