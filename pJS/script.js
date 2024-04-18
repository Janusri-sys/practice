console.log("hello")
let titleDiv=document.getElementById('title')
msg="good bye"
console.log(titleDiv.innerText)
titleDiv.innerText=msg
titleDiv.innerHTML=`<p>${msg}</p>`
titleDiv.style.color='blue'

let redDiv=document.getElementById("red")
let yellowDiv=document.getElementById("yellow")
let greenDiv=document.getElementById("green")

// redDiv.onclick=()=>console.log("you clicked red")
// yellowDiv.onclick=()=>console.log("you clicked yellow")
// greenDiv.onclick=()=>console.log("you clicked green")

const squares=document.querySelectorAll('.colorButton')
//console.log(squares[0].value)

const timesClicked={'red':0,'yellow':0,"green":0}
squares.forEach(square=>{
    square.onclick=()=>{
        timesClicked[square.value]+=1
        square.innerText=timesClicked[square.value]
        //console.log(`you clicked ${square.value}`)
    }
})
const clearGamebtn=document.getElementById("clear-game")
clearGamebtn.onclick=()=>clearScores()
function clearScores(){
    timesClicked.red=0
    timesClicked.yellow=0
    timesClicked.green=0
    squares.forEach(square=>square.innerText='')
}