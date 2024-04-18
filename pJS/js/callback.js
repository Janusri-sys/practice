console.log("sfwef")

setTimeout(function(){
    console.log("adwwd")
},5000)

console.log("looj")

const cart=["shoes","pamts"]

api.createOrder(cart,function(){
    api.proceedToPay(function(){
        api.orderSummary(function(){
            api.updateWallet()
        })
    })
})

