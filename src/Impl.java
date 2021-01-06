public class Impl extends Parent
{
    private Parent left; //Disjunction
    private Parent right; //Parent

    public Impl(Parent left, Parent right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String buildTree() {
        return "(->," + left.buildTree() + "," + right.buildTree() + ")";
    }
}
