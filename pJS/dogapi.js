console.log("hello world")
//https://dog.ceo/api/breeds/image/random
//.then - promises
//asynchronous programming

//stuff ou dont have to wiat for
console.log("run 1st")
const dogImageDiv=document.getElementById('dogImage')
fetch('https://dog.ceo/api/breeds/image/random')
//stuff you have to wait for
.then(response=>response.json())
.then(json=>
    {console.log(json.message)
dogImageDiv.innerHTML=`<img src='${json.message}'height=300 width=100/>`
})
console.log('run 3rd')