stringToInt = (str) => {
    let num = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
    let result = '';
    for (i = 0; i < str.length; i++) {
        if (num[str[i]]) {
            result += str[i];
        }
    }
    return result-0;
}