class Main {

    static Random rgen = new Random();

    public static void main(String[] args) {
        System.out.println("Hello, World");
    }

    public static void sort(Object[] v, int left, int right, Compare cmp) {
        int i, last;

        if (left >= right)  // nothing to do
            return;

        swap(v, left, rand(left, right));
        last = left;

        for (i = left + 1; i <= right; i++)
            if (cmp.compare(v[i], v[left]) < 0)
                swap(v, last++, i);

        swap(v, left, last);
        sort(v, left, last - 1, cmp);
        soft(v, last + 1, right, cmp);
    }

    public static void swap(Object[] v, int i, int j) {
        Object temp;

        temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    public static int rand(int left, int right) {
        return left + Math.abs(rgen.nextInt()) % (right - left + 1);
    }
}
