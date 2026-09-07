class Solution
{
    public String multiply(String num1, String num2)
    {
        if (num1.equals("0") || num2.equals("0"))
            return "0";

        int n1 = num1.length(), n2 = num2.length();
        int[] result = new int[n1 + n2];

        for (int i = n1 - 1; i >= 0; i--)
        {
            for (int j = n2 - 1; j >= 0; j--)
            {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + result[p2];

                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }

        StringBuilder prodstring = new StringBuilder();
        for (int digit : result)
        {
            if (!(prodstring.length() == 0 && digit == 0))
                prodstring.append(digit);
        }

        return prodstring.toString();
    }
}