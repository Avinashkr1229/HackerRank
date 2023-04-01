import java.util.List;

public class PasswordCracker {
    public static String passwordCracker(List<String> passwords, String loginAttempt) {
        int n = loginAttempt.length();
        int m = passwords.size();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                String password = passwords.get(j);
                int len = password.length();
                if (i >= len && dp[i - len] && loginAttempt.substring(i - len, i).equals(password)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        if (dp[n]) {
            StringBuilder sequence = new StringBuilder();
            for (int i = n; i > 0;) {
                for (int j = 0; j < m; j++) {
                    String password = passwords.get(j);
                    int len = password.length();
                    if (i >= len && dp[i - len] && loginAttempt.substring(i - len, i).equals(password)) {
                        sequence.insert(0, password + " ");
                        i -= len;
                        break;
                    }
                }
            }
            return sequence.toString().trim();
        } else {
            return "WRONG PASSWORD";
        }
    }

    public static void main(String[] args) {
        //passwordCracker()
    }
}
