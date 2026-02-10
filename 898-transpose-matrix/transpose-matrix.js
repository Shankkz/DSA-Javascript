/**
 * @param {number[][]} matrix
 * @return {number[][]}
 */
var transpose = function(matrix) {
    const res = [];

    for(let i=0;i<matrix[0].length; i++){
        const temp = [];

        for(let j=0;j<matrix.length;j++){
            temp.push(matrix[j][i]);
        }

        res.push(temp);
    }

    return res;
};