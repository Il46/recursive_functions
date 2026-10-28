public class t40 {
    public static void main(String[] args) {
        String digits = "123";
        int target = 6;
        generateExpressions(digits, target, 0, "", 0, 0);
    }
    public static void generateExpressions(String digits, int target, int index, String currentExpr, long eval, long mult) {
        if (index == digits.length()) {
            if (eval == target) {
                System.out.println("Выражение: " + currentExpr);
            }
            return;
        }
        for (int i = index; i < digits.length(); i++) {
            String part = digits.substring(index, i + 1);
            long num = Long.parseLong(part);
            if (index == 0) {
                generateExpressions(digits, target, i + 1, part, num, num);
            } else {
                generateExpressions(digits, target, i + 1, currentExpr + "+" + part, eval + num, num);
                generateExpressions(digits, target, i + 1, currentExpr + "-" + part, eval - num, -num);
                generateExpressions(digits, target, i + 1, currentExpr + "*" + part, eval - mult + mult * num, mult * num);
            }
        }
    }
}