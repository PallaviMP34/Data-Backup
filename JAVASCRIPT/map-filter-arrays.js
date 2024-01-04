let arr=[10,20,30,40,50,60,70,80]

//filtering data
//find all the elements which are multiple of 20
console.log(arr.filter(e=>e%20==0))

//find an element
let arr30s=arr.find(e=>e%30==0)
console.log(arr30s)

//applying some changes to the element
let s=arr.map(e=>e/10)
console.log(s)

//count sum reduce
let count30s=arr.filter(e=>e%30==0).length;
console.log(count30s)

//find the sum of all elements
let sum=arr.reduce((x,y)=>x+y).toFixed()
console.log(sum)

//push can add value in thE array
//but concat can add new value in the new array
let sum2=arr.concat(100);
console.log(sum2);

//using set and map
let set=new Set([10,20,10,30,40,50,50,60]);
set.add(70);
console.log(set);

//Map 
let map=new Map();
map.set(1,'lachu');
map.set(2,'achu');
map.set(3,'pachu');
console.log(map)
console.log(map.get(2))