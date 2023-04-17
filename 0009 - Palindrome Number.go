func isPalindrome(x int) bool {
    s := strconv.Itoa(x)
    
    for i := 0; i < len(s); i++ {
        j := len(s) - 1 - i
        if s[i] != s[j] {
            return false
        }
    }
    
    return true
}
