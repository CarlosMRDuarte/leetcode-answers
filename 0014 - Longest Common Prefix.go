func longestCommonPrefix(strs []string) string {   
    if len(strs) == 0 {
        return ""
    }

    sort.Slice(strs, func(i, j int) bool {
        return len(strs[i]) < len(strs[j])
    })



    firstWord := strs[0]
    if len(strs) == 1 {
        return firstWord
    }



    longestPrefix := ""

    out:
    for i := 0; i < len(firstWord); i++ {
        for _, word := range strs[1:]{
            if word[i] != firstWord[i] {
                break out
            }
        }

        longestPrefix = longestPrefix + string(firstWord[i])
    }

    return longestPrefix
}
