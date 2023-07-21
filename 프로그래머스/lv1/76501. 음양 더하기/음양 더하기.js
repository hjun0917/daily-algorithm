function solution(absolutes, signs) {
    var answer = 123456789;
    
    let count = 0;
    let sum = 0;
    
    absolutes.forEach(function(item){
        if(signs[count] === true) {
            sum += item;
        } else {
            sum -= item;
        }
        count += 1;
    })
    
    return sum;
}