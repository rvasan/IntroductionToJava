
public class StringFun
{
    public StringFun()
    {

    }

    public String firstLetter(String str) {
        return str.substring(0, 1);
    }

    public String firstThreeLetters(String str) {
        return str.substring(0, 3);
    }

    public String combine(String part1, String part2) {
        return part1 + part2;
    }

    public String firstNLetters(String str, int n) {
        return str.substring(0, n);
    }

    public String addFunnyEnding(String str) {
        return str + "blah";
    }

    public boolean beginsWithA(String str) {
        String first = firstLetter(str);
        if (first.equals("a"))
        {
            return true;
        }
        return false;
    }

    public String reverse(String str) 
    {
        int i = str.length()+ - 1;
        String reversed = "";
        while (i >= 0)
        {
            reversed = reversed + str.substring(i, i + 1);
            i = i -1;
        }
        return reversed;
    }
}
