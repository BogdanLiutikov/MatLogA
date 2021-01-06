public class Var extends Parent
{
    private String name;

    public Var(String name) {
        this.name = name;
    }

    @Override
    public String buildTree() {
        return name;
    }

}
