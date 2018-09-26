public class Stack {


    private boolean isEmpty = true;

    private Object lastItem;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void push(String item) {
        isEmpty = false;
        lastItem = item;
    }
}
