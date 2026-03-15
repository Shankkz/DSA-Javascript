/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
    const s = [0,1];
    for(let i=2;i<=n;i++){
        s.push(s[i-1] + s[i-2]);
    }
    return s[n];
};