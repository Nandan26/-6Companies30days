class Solution {
    public static String gcdOfStrings(String str1, String str2) {

        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }
        if (!str1.startsWith(str2)) return "";

        String reminder = str1.substring(str2.length());
        if (reminder.isEmpty()) {
            return str2;
        }

        return gcdOfStrings(str2, reminder);
    }
}
