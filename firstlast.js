function first(list) {
    if (Array.isArray(list) && list.length > 0) {
        return list[0];
    }
    return undefined;
}

function last(list) {
    if (Array.isArray(list) && list.length > 0) {
        return list[list.length - 1];
    }        
    return undefined;
}

var t1 = 1;
var t2 = [1, 2, 3];
var t3 = "String";

console.log(first(t1));
console.log(last(t1));

console.log(first(t2));
console.log(last(t2));

console.log(first(t3));
console.log(last(t3));
