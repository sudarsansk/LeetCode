/**
 * @param {string[]} timePoints
 * @return {number}
 */
var findMinDifference = function(timePoints) {
    let arr = timePoints.map((time) => {
        const [hours, minutes] = time.split(':').map(Number);
        return hours * 60 + minutes;
    })
   arr.sort((a, b) => a - b);
    
    let minDiff = Number.MAX_VALUE;
    let temp;
    for (let i = 0; i < arr.length; i++) {
        temp = Math.abs(arr[i] - arr[i+1 == arr.length ? 0 : i+1])
        temp = temp > 720 ? 1440 - temp : temp;
        minDiff = minDiff > temp ? temp : minDiff;
    }
    return minDiff;
};