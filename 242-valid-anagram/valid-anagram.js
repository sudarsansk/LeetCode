/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if(s.length != t.length){
        return false;
    }
    let charCount = {};
    for (let char of s) {
        if (charCount[char]) {
            charCount[char] += 1;
        } else {
            charCount[char] = 1;
        }
    }
    for(let char of t){
        if(!charCount[char]){
            return false;
        }
        charCount[char]--;
    }
    return true;
};