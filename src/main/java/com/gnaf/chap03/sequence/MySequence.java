package com.gnaf.chap03.sequence;

/**
 * 顺序结构线性表
 */
public class MySequence {

    private int data[];

    // 数组大小
    private int size;

    // 线性表长度，即数组中实际存储数据数量
    private int length;

    public MySequence() {
        this(10);
    }

    public MySequence(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Illegal size: " + size);
        }

        this.size = size;
        this.data = new int[size];
    }

    /**
     * index是第几个数据 小于1非法并且如果其大于线性表实际长度也错误
     *
     * @param index
     * @return
     */
    public int get(int index) {
        if (index < 0 || index > length) {
            throw new IllegalArgumentException("数组 长度: " + length + " 下标: " + index);
        }

        return data[index - 1];
    }

    /**
     * 末尾插入数据
     *
     * @param value
     * @return
     */
    public boolean add(int value) {
        if (length >= size) {
            throw new IllegalArgumentException("数组已满");
        }
        data[length++] = value;
        return true;
    }

    /**
     * 指定位置插入数据，这里插入必须前后有元素才行，否则请使用add
     *
     * @param value
     * @param index
     * @return
     */
    public boolean add(int index, int value) {
        if (length >= size) {
            throw new IllegalArgumentException("数组已满");
        }
        if (index < 0 || index > length) {
            throw new IllegalArgumentException("数组 长度: " + length + " 下标: " + index);
        }

        System.arraycopy(data, index, data, index + 1, length - index);
        data[index] = value;
        length++;

        return true;
    }

    public int remove(int index) {
        if (index < 0 || index >= length) {
            throw new IllegalArgumentException("数组 长度: " + length + " 下标: " + index);
        }
        int value = data[index];
        data[index] = 0;
        if (index != length - 1) {
            System.arraycopy(data, index + 1, data, index, length - index - 1);
        }
        length--;
        return value;
    }

    public int length(){
        return length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i : data) {
            sb.append(i + ",");
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        return sb.append("]").toString();
    }
}
