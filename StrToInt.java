class StrToInt
{
    /*
     * main() method to test class
     **/
    public static void main(String[] args )
    {
	System.out.println(MyStrToInt( args[0] ));
    }//end main

    /*
     * Converts a String to an int.
     * Returns an int.
     **/
    public static int MyStrToInt(String str)
    {
        int i = 0;
        int num = 0;
        boolean isNeg = false;

        //check for negative sign; if it's there, set the isNeg flag
        if( str.charAt(0) == '-') 
	{
            isNeg = true;
            i = 1;
        }

        //process each char of the string; 
        while( i < str.length())  
	{
            num *= 10;
            num += str.charAt(i++) - '0'; //Offset ASCII code of '0' to get the value of the charAt(i++)
        }

        if (isNeg)num = -num;

        return num;
    }
}
