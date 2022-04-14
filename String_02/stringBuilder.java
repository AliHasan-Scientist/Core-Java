package String_02;

import java.lang.StringBuilder;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Pankistan");
        // sb.setCharAt(0, 'p');
        // sb.insert(0, 'a');

        // System.out.println(sb);
        sb.append(" may always long live!");
        System.out.println(sb);
}
}