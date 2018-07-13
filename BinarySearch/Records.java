class Record {
    
    public static void main(String[] args)
    {
        System.out.println("Hello, World");
        // Pass an array into the binary_search() function
    }
    
    public static int binary_search(A, n, T)
    {
        int L = 0;
        int R = n - 1;
        
        while (L <= R)
        {
            int m = floor((L + R) / 2);
            if (A[m] < T)
            {
                L = m + 1;
            } 
            else if (A[m] > T)
            {
                R = m - 1;
            }
            else 
            {
                return m;
            }
        return "The binary search was unsuccessful";
    }
}
