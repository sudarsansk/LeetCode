/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let max = nums[0];
    let current = nums[0];
    let start = 0;
    let end = 0;
    for(let i=1; i<nums.length; i++){
        if(nums[i] > current + nums[i]){
            current = nums[i];
            start = i;
        } else {
            current += nums[i]; 
        }
        if(current > max){
            max = current;
            end = i;
        }
    }
    let subArr = nums.slice(start, end + 1);
    return max;
    //Reduce Method
    // subArr.reduce((acc, cur) => {
    //         return acc + cur
    // }, 0);
};