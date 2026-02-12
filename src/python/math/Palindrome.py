class Palindrome:

    @staticmethod
    def isPalindrome(x: int) -> bool:
        if x < 0 or (x % 10 == 0 and x != 0):
            return False

        temp = x
        result = 0
        ans = False

        while temp != 0:
            result += temp % 10
            temp //= 10
            if result < x:
                result *= 10

        if x == result or x == 0:
            ans = True

        return ans



print(Palindrome.isPalindrome(121))
