const balance=1000
class Bank{
    constructor(balance){
        this.balance=balance
    }
    deposit(amount){
        this.balance+=amount
        console.log(`successfully credited ${amount} rupees`)
        console.log(`Balance amount : ${this.balance}`)
        balanceDiv.innerText=`Balance : ${this.balance}`
    }
    withdraw(amount){
        if(this.balance<amount){
            console.log("No sufficient amount")
        }
        else{
        this.balance-=amount
        console.log(`successfully debited ${amount} rupees`)
        console.log(`Balance amount : ${this.balance}`)
        }
        balanceDiv.innerText=`Balance : ${this.balance}`
    }
}

const obj=new Bank(balance)
console.log(`Initial balance : ${obj.balance}`)
//obj.deposit(2000)
//obj.withdraw(2000)
const balanceDiv = document.getElementById("balance");
const depositButton = document.getElementById("deposit");
const withdrawButton = document.getElementById("withdraw");
const amountInput = document.getElementById("amount");
const playDiv=document.getElementById('play');
//playDiv.addEventListener('click',function(){console.log("clicked")})
// document.addEventListener('keydown',function(e){
//     if(e.key=='q'){
//         console.log("pressed q")
//     }
//     else{
//         console.log("otherthan q")
//     }
// })


depositButton.onclick = () => obj.deposit(Number(amountInput.value));
withdrawButton.onclick = () => obj.withdraw(Number(amountInput.value));

