function greet(message,callback){
    console.log(message)
    callback()
}

function callMe(){
    console.log('callback function called')
}

greet('gdmrng',callMe)
greet('Hello World',()=>console.log('Iam a better callback'))