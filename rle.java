public class RLE {
    private static String rle(String srcString) {
        int cnt = 1;
        char prevChar = srcString.charAt(0);
        StringBuilder rleStringBuilder = new StringBuilder();
        for (int i = 1; i < srcString.length(); ++i) {
            if (srcString.charAt(i) == prevChar)
                cnt++;
            else {
                rleStringBuilder.append(prevChar);
                if (cnt >= 2) rleStringBuilder.append(cnt);
                cnt = 1;
            }
            prevChar = srcString.charAt(i);
        }
        rleStringBuilder.append(prevChar);
        if (cnt >= 2) rleStringBuilder.append(cnt);

        return rleStringBuilder.toString();
    }

    public static void main(String[] args) {
        String source = "AVVVBBBVVXDHJFFFFDDDDDDHAAAAJJJDDSLSSSDDDD";
        System.out.println(rle(source));
    }
}
