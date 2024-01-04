let count=5
let promise = new Promise(
   // ()=>{
        //Promise.resolve('Promise Resolved'),
       // Promise.reject('Promise Rejected')
       (resolve,reject)=>{
           if(count)
           resolve('Promise Resolved')
           else 
           reject('Invalid Count value')
       }
    //}
)
//console.log(promise)

promise.then((msg)=>{
    console.log(msg)
}).then(()=>console.log('Done'))
.catch(error=>console.error(error))
.finally(()=>console.log('Execution completed'))