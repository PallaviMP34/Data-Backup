let arr=[1,2,9,'ram','hiarn'];
console.log(arr);
for(let i=0;i<arr.length;i++){
    console.log(arr[i])
}
for(let i of arr){
    console.log(i)
}
arr.forEach(i=> console.log(i))

//adding a new element

arr.push(100);
arr.push('anu');
console.log(arr);

//removing an element

arr.pop(); // remove a last element
console.log(arr)

//remove a specific element
arr.splice(2,1);
console.log(arr);