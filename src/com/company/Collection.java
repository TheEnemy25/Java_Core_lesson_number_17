package com.company;

public class Collection {

    private static final int arr = 20;
    private Object[] object;

    public Collection(Integer[] arraIntegers) {
        this.object = new Integer[arr];

    }

    public Object createCollection() {
        return (new Object());
    }

    public Object[] getObject() {
        return object;
    }

    public void setObject(Object[] object) {
        this.object = object;
    }

    public class Collclass1 implements Iterator {

        @Override
        public boolean hasNext() {
            int i = 0;
            while (i++ < object.length) {
                return true;
            }
            return false;
        }

        @Override
        public int next() {
            for (int i = 0; i < object.length; i++) {
                if (i % 2 != 0) {
                    object[i] = 0;
                } else {
                    object[i] = i;
                }
                System.out.print(object[i] + " ");
            }
            return 0;
        }
    }

    public Collclass1 collclass1() {
        return new Collclass1();
    }

    public class Collclass2 implements Iterator {

        @Override
        public boolean hasNext() {
            int i = object.length;
            while (i-- > 0) {
                return true;
            }
            return false;
        }

        @Override
        public int next() {
            int i = object.length;

            while (i-- > 0) {
                if (i % 2 != 0) {
                    object[i] = i;
                    System.out.print(object[i] + " ");
                }
            }
            return i;
        }
    }

    public Collclass2 collclass2() {
        return new Collclass2();
    }

}