package y2021.q1;

public class e {
    public static void main(String[] args) {
        String name = "Raihan";
        String temp = name.substring(1, name.length());
        name = temp;
        System.out.println(name);

        StringBuffer st = new StringBuffer("Raiahn");
        st.deleteCharAt(st.length() - 1);
        System.out.println(st);
    }
}
