const cart=["shoes","pants","kurta"]
createOrder(cart)
.then(function(orderId){
        console.log(orderId)
        return orderId
})
.then(function(orderId){
    return proceedToPayment(orderId)
})
.then(function({message,amt}){
    console.log(message,'of amount:',amt);
    return showOrderSummary(message,amt);
})
.then(function({message,amt}){
    console.log("Your wallet has been debited by :",amt);
})
.catch((err)=>console.log(err.message))
function createOrder(cart){
    let validateCart=true;
    const pr=new Promise((resolve,reject)=>{
        const orderId="12345";
        if(validateCart){
            setTimeout(()=>resolve(orderId),1000);//pending state
        }
        else{
            const err=new Error("Cart is not valid");
            reject(err);
        }
    })
    return pr;
}
function proceedToPayment(orderId){
    let enoughBal=true
    const pr=new Promise((resolve, reject) => {
        if(enoughBal){
            resolve({message:`Payment successfull for order ID:${orderId}`,amt:2500})
        }
        else{
            const err=new Error("Insufficient amount");
            reject(err)
        }
    })
    return pr;
}
function showOrderSummary(paymentInfo,amt){
    return new Promise((resolve,reject)=>{
        if(amt>=2500){
            resolve({message:`You have ordered items that cost ${amt}RS`,amt});
        }
        else{
            reject(new Error('Please buy more for discount'))
        }
    })
}

