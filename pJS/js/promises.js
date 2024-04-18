// const cart=["shoes","pants"]

// createOrder(cart,function(){
//     proceedToPayement(OrderID);
// });

// //isssue :inversion of control
// //promise will hold the data
// const promise=createOrder(cart)
// //createorder details will be stored in promise and then after required time the promise will filled with data automatically
// promise.then(function(){
//     proceedToPayement(OrderID);
// });
                                                
//fetch()
//promise result and promise state : pending , fullfilled , rejected
//promise objects are immutable



//**Promise object is a place holder which can be filled later for certain period of time until we receive a avalue for 
//an asynchronous operation 
//A container for future value
//A promise is an object representing eventual completion or failure  of an asynchronous opration*/
//Handles call hell and inversion control

//without promises
createOrder(cart,function(){
    proceedToPayement(OrderID,function(){
        showOrderSummary(paymentinfo,function(){
            updateWalletBal()
        });
    });
 });

 //with promise
createOrder(cart)
.then(function(orderId){
     return proceedToPayement(orderId)
})
.then(paymentinfo=>showOrderSummary(paymentinfo))
.then(function(paymentinfo){
    return updateWalletBal(paymentinfo)
})



