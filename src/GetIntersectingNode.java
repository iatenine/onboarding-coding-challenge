import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GetIntersectingNode {

    // Given 2 nodes, return first instance where the value are the same
    // i.e.     A = 3 -> 7 -> 8 -> 10
    //      and B = 99 -> 1 -> 8 -> 10
    //      return 8
    // Run in O(m + n) time


    public static Object getIntersectingNode(List listA, List listB){
        for(int i = 0; i < listA.size(); i++){
            if(listA.get(i) == listB.get(i))
                return listA.get(i);
            if(i == listB.size() - 1)
                break;
        }
        return null;
    }

    public static void main(String[] args) {
        List<Integer> a = new LinkedList<>();
        List<Integer> b = new ArrayList<>();
        Integer[] aArr = {3, 7, 8, 10};
        Integer[] bArr = {2, 1, 8, 10};
        a.addAll(Arrays.stream(aArr).toList());
        b.addAll(Arrays.stream(bArr).toList());

        Object o = getIntersectingNode(a, b);

        System.out.println(a);
        System.out.println(b);
        System.out.println((Integer) o);
        System.out.println((Integer) o == 8);
    }
}
