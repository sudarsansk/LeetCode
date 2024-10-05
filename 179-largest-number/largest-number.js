/**
 * @param {number[]} nums
 * @return {string}
 */
var largestNumber = function(nums) {
    nums = nums.map(String);
    let sorted = nums.sort((a, b) => (b+a)-(a+b));
    let result = nums.join('');
    return result[0] === '0' ? '0' : result;
};