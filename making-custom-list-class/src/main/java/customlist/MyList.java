package customlist;

import java.util.Arrays;

public class MyList<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private int currentSize = 0;

    private Object[] mainArray;

    public MyList() {
        mainArray = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int customCapacity) {
        mainArray = new Object[customCapacity];
    }

    public int size() {
        return currentSize;
    }

    public int getCapacity() {
        return mainArray.length;
    }

    public void add(T t) {
        if (currentSize == mainArray.length) {
            increaseCapacity();
        }
        mainArray[currentSize++] = t;
    }

    public T get(int i) {
        if (i >= currentSize || i < 0) {
            return null;
        }
        return (T) mainArray[i];
    }

    public T remove(int i) {
        if (i >= currentSize || i < 0) {
            return null;
        }
        Object item = mainArray[i];
        int numElts = mainArray.length - (i + 1);
        System.arraycopy(mainArray, i + 1, mainArray, i, numElts);
        currentSize--;
        return (T) item;
    }

    public T set(int i, T t) {
        if (i >= currentSize || i < 0) {
            return null;
        }
        mainArray[i] = t;
        return (T) mainArray[i];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < currentSize; i++) {
            sb.append(mainArray[i].toString());
            if (i < currentSize - 1) {
                sb.append(",");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    private void increaseCapacity() {
        int newSize = mainArray.length * 2;
        mainArray = Arrays.copyOf(mainArray, newSize);
    }

    public Integer indexOf(T t) {
        for (int i = 0; i < mainArray.length; i++) {
            if (t == mainArray[i]) {
                return i;
            }
        }
        return null;
    }

    public int lastIndexOf(T t) {
        int lastIndex = -1;

        for (int i = 0; i < mainArray.length; i++) {
            if (t == mainArray[i]) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public boolean isEmpty() {
        return currentSize <= 0;
    }


    public T[] toArray() {
        return (T[]) mainArray;
    }

    public void clear() {
        //TO-DO
    }

    public MyList<T> sublist(int start, int finish) {
        //TO-DO
        return new MyList<>();
    }

    public boolean contains(T t) {
        return indexOf(t) >= 0;
    }

}