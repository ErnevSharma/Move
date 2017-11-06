public class Move {

    private int from;
    private int to;
    

    public Move(int fromTower, int toTower) 
    {
        from = fromTower;
        to = toTower;
    }

    public String toString()
    {
        return "Move from tower " + from + " to tower " + to;
    }
    
    public int getFrom()
    {
        return from;
    }
    
    public int getTo()
    {
        return to;
    }
    
}
