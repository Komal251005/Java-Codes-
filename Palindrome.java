/*Given an integer x, return true if x is a palindrome, and false otherwise.
Example:
Input: x = 121
Output: true
*/
class Palindrome{
    public static boolean isPalindrome(int x) {
        int input=x;
        int rev=0;
        int lastdegit=0;
        while(x>0){
            lastdegit=x%10;
            rev=(rev*10)+lastdegit;
            x=x/10;
        }
        if(rev==input){
            return true;
        }
        else{
           return false;
        }
    }
    public static void main(String args[]){
        System.out.println(isPalindrome(121));
    }
}