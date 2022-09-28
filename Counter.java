public class Counter {
    private int val;
    public  Counter() {val = 0;}
    public  Counter(int n) {val=n;}
    public void reset() { val = 0;  }
    public void inc()   { val++;    }
    public void inc(int n)   { val += n ; }
    public void dec()   { val--; }
    public void dec(int n)   { val -= n ; }
    public int getValue() { return val; }
}
