package com.mashibing.dp.Iterator.my1;

/**
 * @author zhangning
 * @date 2020/9/24
 */
public class ArrayList_zn<E> implements Collection_zn<E> {

    public static void main(String[] args) {
        Collection_zn<String> arrayList_zn = new ArrayList_zn<>();
        for (int i = 1; i <= 15; i++) {
            arrayList_zn.add("Str:" + i);
        }

        Iterator_zn<String> iterator = arrayList_zn.iterator();
        while (iterator.hasNext()) {
            String  o = iterator.next();
            System.out.println(o);
        }

    }

    E[] objects = (E[]) new Object[10];
    //初始化一个10个长度的数组
    private int index = 0;

    @Override
    public void add(E o) {
//        Object[] objects = new Object[10];
        if (index == objects.length) {
            //长度不够了
            E[] newlisst = (E[]) new Object[objects.length * 2];
            //拷贝老的list到新的list
            System.arraycopy(objects, 0, newlisst, 0, objects.length);
            //
            System.out.println("扩容后长度为:" + objects.length * 2);
            objects = newlisst;
        }
        objects[index] = o;
        index++;
    }

    private class ArrayList_collection<E> implements Iterator_zn<E> {
        private int iterrator_index = 0;

        @Override
        public boolean hasNext() {
            if (iterrator_index >= index) {
                return false;
            }
            return true;
        }

        @Override
        public E next() {
            E element = (E) objects[iterrator_index];
            iterrator_index++;
            return element;
        }
    }

    @Override
    public int size() {
        return objects.length;
    }

    @Override
    public Iterator_zn<E> iterator() {
        return new ArrayList_collection<E>();
    }
}
