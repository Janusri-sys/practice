//asynchronouos programming
//You ordered soup
//meanwhile you continue your convo wit h ur friend 
//RESOLVED: server gonna serve you the soup
//REJECTED:No soup today
//const orderSoup=()=>console.log('soup is ready')
//console.log("start convo with ur friend")

//setTimeout(orderSoup,2000)
//console.log("still speaking")

const promise1=new Promise((resolve,reject)=>{
    setTimeout(()=>{
        isReady=[true,false][Math.floor(Math.random()*2)]
        isReady?resolve("soup is ready"):reject("no soup today")
    },2000)
})
console.log(promise1
    .then(success=>console.log({success}))
    .catch(error=>console.log({error}))
)

const getSoup=async()=>{
    const data={rate:0,tip:0,pay:0,review:0}
    try{
        const soup=await promise1
        console.log(soup)
        data.rate=5
        data.tip=.2
        data.pay=10
        data.review=5
        return data
    }
    catch(error){
        console.log(error)
        data.rate=1
        data.tip=0
        data.pay=0
        data.review=1
        return data

    }
}
getSoup().then(value=>console.log(value))
// console.log('fetch:',fetch('https://superheroapi.com/api.php/1686717685124453/245')
// .then(response=>response.json())
// .then(data=>console.log(data))
// )



// rules for using async/await
//1.you must create async in a afunction
//2.you must use keyword async and await

const superHero=async()=>{
    const url='https://superheroapi.com/api.php/1686717685124453/245'
    const response=await fetch(url)
    const data=await response.json()
    console.log(data)
}
//superHero()

