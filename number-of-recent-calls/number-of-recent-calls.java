class RecentCounter {
    Queue<Integer> requests;
    int size;
​
    public RecentCounter() {
        requests = new LinkedList<>();
        size = 0;
    }
    
    public int ping(int t) {
        requests.add(t);
        size++;
        while(requests.peek() < t - 3000) {
            requests.remove();
            size--;
        }
        return size;
    }
}
​
/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
