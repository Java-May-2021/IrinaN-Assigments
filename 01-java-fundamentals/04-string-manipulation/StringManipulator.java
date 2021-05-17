public class StringManipulator {
    public String trimConcat(String var1, String var2) {
        return var1.trim().concat(var2.trim());
    }
    
    public Integer getIndexOrNull(String var1, char var2){
        int a = var1.indexOf(var2);
        return a;
    }

    public Integer getIndexOrNull(String var1, String var2){
        int a = var1.indexOf(var2);
        return a;
    }

    public String concatSubstring(String var1, int m, int n, String var2){
        String partofstring1 = var1.substring(m, n);
        return partofstring1.concat(var2);
    }
}