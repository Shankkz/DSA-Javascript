class Solution {
    public String multiply(String a, String b) {
        int[] res = new int[a.length() + b.length()];

        for (int i = a.length()-1; i >= 0; i--) {
            for (int j = b.length()-1; j >= 0; j--) {
                int mul = (a.charAt(i)-'0') * (b.charAt(j)-'0');
                int sum = mul + res[i+j+1];

                res[i+j+1] = sum % 10;
                res[i+j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : res) {
            if (!(sb.length() == 0 && num == 0)) sb.append(num);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}