class GFG {

    static int lastPosition(int n, int m, int k)
    {
        //if m(number of items) is less than total number of children(size of circle N) + starting point then the last item will be delivered to total items+starting point 
        if (m <= n - k + 1)
            return m + k - 1;

        //no of itmes remaining before we reach to beggining of actual circul (not starting point)      
        m = m - (n - k + 1);
 
        //return if m is divisible by n then last boy will get damaged toy otherwise m%n
        return (m % n == 0) ? n : (m % n);
    }
}
