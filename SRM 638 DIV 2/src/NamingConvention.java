import java.util.StringTokenizer;

public class NamingConvention {

    public String toCamelCase(String variableName) {
        if (variableName == null || variableName.length() == 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(variableName, "_");
        if (st.hasMoreTokens()) {
            String string = st.nextToken();
            sb.append(string);
        }
        while (st.hasMoreTokens()) {
            String string = st.nextToken();
            sb.append(string.substring(0, 1).toUpperCase() + string.substring(1));
        }
        return sb.toString();

    }
}
