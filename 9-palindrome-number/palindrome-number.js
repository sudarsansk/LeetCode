/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x < 0 || (x % 10 == 0 && x != 0))
        return false;
    var result = 0; 
    var i = x;
    while(i > 0){
        result = (result * 10) + i % 10;
        i = Math.floor(i / 10); //instead of parseInt(i / 10)
    }
    return x == result;
};