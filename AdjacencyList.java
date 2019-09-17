

public class AdjacencyList {
    /**
     * The target node.
     */
    public int target;

    /**
     * The weight of the corresponding edge (i.e., the edge from the node whose
     * adjacency list this AdjListElmnt belongs to, to the target node).
     */
    public double weight;

    /**
     * Class constructor.
     */
    public AdjacencyList(int target, double weight) 
    {
        this.target = target;
        this.weight = weight;
    }
}
    