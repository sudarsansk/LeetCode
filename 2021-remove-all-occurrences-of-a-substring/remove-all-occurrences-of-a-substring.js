/**
 * @param {string} s
 * @param {string} part
 * @return {string}
 */
var removeOccurrences = function(s, part) {
    if(!s.includes(part)){
        return s;
    }
    s = s.replace(part, "")
    return removeOccurrences(s, part);
};