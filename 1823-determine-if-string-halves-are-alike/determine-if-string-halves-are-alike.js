/**
 * @param {string} s
 * @return {boolean}
 */
var halvesAreAlike = function(s) {
    const v = 'aeiouAEIOU';
    let count = 0;
    let mid = s.length / 2;

    for (let i = 0; i < s.length; i++) {
        if (v.includes(s[i])) {
            count += i < mid ? 1 : -1;
        }
    }
    return count === 0;
};