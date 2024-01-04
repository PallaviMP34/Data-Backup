let callMe=async function(count){
    if(count)
    return Promise.resolve('Count is OK')
    else
    return Promise.reject('Not Acceptable')
}

let greet=async ()=>{
    callMe(10).then((msg)=>
    console.log(msg))
    console.log('Greetings..')
}

// callMe(10).then((msg)=>{
//     console.log(msg)
// }).then(()=>console.log('Done'))
// .catch(error=>console.error(error))
// .finally(()=>console.log('Execution completed'))