/**
 * @param {number[]} arr
 * @return {number[]}
 */
var sortByBits = function(arr) {
    const countBits = (x)=>{
        let c = 0;
        while(x>0){
            if(x & 1) c++;
            x>>=1;
        }
        return c;
    }

    arr.sort((a,b)=>{
        let bitA = countBits(a);
        let bitB = countBits(b);
        if(bitA === bitB) return a-b;
        return bitA - bitB;
    });
    return arr;
};