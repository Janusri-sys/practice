document.querySelector(".grandparent")
.addEventListener("click",()=>{console.log("grandparent clicked")},true)//capturing
document.querySelector(".parent")
.addEventListener("click",()=>{console.log("parent clicked")},false)//bubbling
document.querySelector(".child")
.addEventListener("click",()=>{console.log("child clicked")},true)
