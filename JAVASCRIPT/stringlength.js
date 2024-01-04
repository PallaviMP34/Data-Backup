let arr=['weredc','hari','','anu','luca',''];
let count=0;
for(let i=0;i<arr.length;i++){
    if(arr[i].length>3){
        count++;
    }
}
console.log(count);
let arr1=[];
for(let s of arr) {
    if(s.length==0) {
        continue
    }
    else {
        arr1.push(s);
    }
}
console.log(arr1);