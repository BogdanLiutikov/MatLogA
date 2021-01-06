public class Dis extends Parent
{
    private Parent left; //Dis
    private Parent right; //Conjunction

    public Dis(Parent left, Parent right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String buildTree() {
        return "(|," + left.buildTree() + "," + right.buildTree() + ")";
    }
}
