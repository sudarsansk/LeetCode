/**
 * @param {number[][]} boxTypes
 * @param {number} truckSize
 * @return {number}
 */
var maximumUnits = function(boxTypes, truckSize) {
    let sorted = boxTypes.sort((a,b) => b[1] - a[1]);
    let count = 0;
    for(let i=0; i< sorted.length;i++){
        if(truckSize > sorted[i][0]){
            count += sorted[i][0] * sorted[i][1];
            truckSize -= sorted[i][0]
        } else if (truckSize > 0){
            count += truckSize * sorted[i][1];
            truckSize = 0;
        } else{
            break;
        }
    }
    return count;
};