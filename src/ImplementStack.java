import java.util.LinkedList;
import java.util.List;

public class ImplementStack {
    // Implement a stack with the following methods
    // push(v a 1): pushes v a 1 onto the stack
    // pop(): Remove and return the topmost element of the stack. Throw error if no elements
    // Max value implies stack holds ints or at least numeric primitives
    // max(): Return the maximum value in the stack currently. Throw error if empty
    // Each method should have O(1) time complexity

    private List<Number> list = new LinkedList<>();
    private Number max;

    public void push(Number newElement) {
        if(list.isEmpty())
            max = newElement;
        else {
            String c = max.getClass().getName();
            // This can't possibly be the best approach
            switch (c){
                case "java.lang.Integer":
                    max = Math.max(max.intValue(), newElement.intValue());
                    break;
                case "java.lang.Float":
                    max = Math.max(max.floatValue(), newElement.floatValue());
                    break;
                case "java.lang.Byte":
                    max = Math.max(max.byteValue(), newElement.byteValue());
                    break;
                case "java.lang.Short":
                    max = Math.max(max.shortValue(), newElement.shortValue());
                    break;
                case "java.lang.Long":
                    max = Math.max(max.longValue(), newElement.longValue());
                    break;
                case "java.lang.Double":
                    max = Math.max(max.doubleValue(), newElement.doubleValue());
                    break;
            }
        }
            list.add(newElement);
    }

    public Number pop() throws Exception {
        if(list.size() == 0)
            throw new Exception("Can't pop from empty stack");
        return list.remove(list.size()-1);
    }

    public Number max() throws Exception {
        if(list.size() == 0)
            throw new Exception("Can't get max value from empty stack");
        return max;
    }

    public static void main(String[] args) throws Exception {
        ImplementStack s = new ImplementStack();

        s.push(4);
        s.push(6);
        s.push(3);
        int max = s.max().intValue();
        int i = s.pop().intValue();
        System.out.println("Should equal 3: " + i);
        System.out.println("Should equal 6: " + max);
    }
}
