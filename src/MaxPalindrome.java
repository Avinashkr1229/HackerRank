public class MaxPalindrome {

    public static int answerQuery(String s,int l, int r) {
        int[] count = new int[26];

        int maxLength = 0;
        int evenLength = 0;
        for (int i = l; i <= r; i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int j = 0; j < 26; j++) {
            if (count[j] % 2 == 0) {
                evenLength++;
            }
            maxLength = Math.max(maxLength, count[j]);
        }

        if (maxLength % 2 == 0) {
            evenLength--;
        }

        return (maxLength / 2 + 1) * (evenLength / 2 + 1);
    }

    public static void main(String[] args) {
        String s = "abcab";
        int l = 1;
        int r = 4;
        System.out.println(answerQuery(s, l, r));
    }
}
