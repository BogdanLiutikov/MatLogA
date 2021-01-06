public class Conj extends Parent
{
    private Parent left; //Conj
    private Parent right; //Negative

    public Conj(Parent left, Parent right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String buildTree() {
        return "(&," + left.buildTree() + "," + right.buildTree() + ")";
    }

}
