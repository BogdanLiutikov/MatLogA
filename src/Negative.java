public class Negative extends Parent
{
    private Parent negative;

    public Negative(Parent negated) {
        this.negative = negated;
    }

    @Override
    public String buildTree() {
        return "(!" + negative.buildTree() + ")";
    }
}
