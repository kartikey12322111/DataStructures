public class FindTheIndexOfFrstOccInString {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int[] lps = new int[needle.length()];
        int j = 0;
        for (int i = 1; i < needle.length(); ) {
            if (needle.charAt(i) == needle.charAt(j)) {
                lps[i++] = ++j;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    lps[i++] = 0;
                }
            }
        }
        j = 0;
        for (int i = 0; i < haystack.length(); ) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == needle.length()) return i - j;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return -1;
    }
}
