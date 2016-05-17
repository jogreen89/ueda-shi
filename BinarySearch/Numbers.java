class Numbers {
    private int size = 0;
    private int[] arr;

    Numbers() {
        size = 0;
        arr = new int[size];
    }
    Numbers(int size) {
        this.size = size;
        arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = i;
    }

    public int getSize() {
        return size;
    }

    public int getArray(int index) {
        return arr[index];
    }
}
