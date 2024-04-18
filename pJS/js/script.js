// const app=document.getElementById('app');
// app.addEventListener('click',()=>{
//     app.innerHTML='Welcome sri'

// })

const button=document.getElementById('button');
button.addEventListener('click',()=>{
let testPromise=new Promise((resolve,reject)=>{
    const number=document.getElementById('number');
    let n=number.value;
    console.log(n)
    if(n<4){
        resolve("Lessthan 4")
    }
    else{
        reject("greater than 4")
    }

})
testPromise.then(n=>console.log("success"))
.catch(error=>console.log("error"))
})