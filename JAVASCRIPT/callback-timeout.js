function greet(message){
    console.log(message)
    
}

function callMe(){
    console.log('callme function called')
}
setTimeout(()=>greet('Good Afternoon'),5000)
callMe()