class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
             return false ;

        }

        char[] eSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(eSort);
        Arrays.sort(tSort);
        return Arrays.equals(eSort, tSort);

    }
}
