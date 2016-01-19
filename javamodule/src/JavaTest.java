/**
 * Created by rmedarametla on 1/18/2016.
 */
public class JavaTest {
    private String raj;
    private String rajendra;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JavaTest javaTest = (JavaTest) o;

        return raj != null ? raj.equals(javaTest.raj) : javaTest.raj == null;

    }

    @Override
    public int hashCode() {
        return raj != null ? raj.hashCode() : 0;
    }

    public String getRaj() {
        return raj;
    }

    public void setRaj(String raj) {
        this.raj = raj;
    }

    public static void main(String[] args){
        System.out.println("java output in console");
        System.out.println("java output in console just commit,not push");
    }
}
