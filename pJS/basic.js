// let weather=prompt("Is it rainy outside?")
// if (weather=='yes'){
//     console.log("grabb your umbrella")
// }
// else{
//     console.log("wear sun glasses")
// }
// function myFunction(){
//     console.log("janu")

// }
// function myFunction(name){
//     console.log(`${name} I don't want you`)
// }
// myFunction()
// myFunction("sri")

// let sum=(a,b)=>a+b

//console.log(sum(2,3))

// const ar=['grape','mango','apple']
// console.log(ar)
// ar.push('pineapple')
// console.log(ar.slice(0,2))
// console.log(ar.indexOf('mango'))
// console.log(ar.length)

//objects

// const person={
//     name:'Leonardo',
//     shirt:'white'

// }
// console.log(person.name)
// console.log(person['shirt'])
// person.phone=98766543
// console.log(person.phone)
// console.log(person)

const introducer=(name,shirt)=>{
const person={
    name:name,
    shirt:shirt,
    assets:100000,
    liability:50000,
    netWorth:function(){
        return this.assets-this.liability
    }

}
    const intro=`My name is ${person.name}  and the color of my shirt is ${person.shirt} 
    and my net worth is ${person.netWorth()}}`

    return intro
}
//console.log(introducer('janu','black'))
const fruits=['grape','mango','apple']

for(let i=0;i<fruits.length;i++){
    console.log(fruits[i])
}
for(const fruit of fruits){
    console.log(fruit)

}
const double=(numbers)=>{
    
    let result=[]
    for(const num of numbers){
        result.push(num**2)
    }
    return result
}
numbers=[1,2,3,4,5]
//console.log(double(numbers))

const letterCounter=(phrase)=>{
    
    count=0
    for(let letter in phrase){ // letter in phrase index will display
        //console.log(letter)
        count++
    }
    //return {count:phrase.length}
    return {count}
    
}
const phrase="Hey, can you go to grocery store with me?"
//console.log(letterCounter(phrase))

const sumArray=(numbers)=>{
    let result=0;
    for(const num of numbers){
        result+=num;
        console.log(num)
    }
    return {result}
}
//const nums=[1,2,3,4,5]
//console.log(sumArray(nums))

const max=(numbers)=>{
    let result=numbers[0]
    for(const number of numbers){
        //console.log(max)
        if(number>result){
            result=number
        }
    }
    return {result}
}
//const nums=[1,2,3,4,5]
//console.log(max(nums))

const letterFrequency=(phrase)=>{
    let frequency={}
    for(const letter of phrase){
        if(letter in frequency){
            frequency[letter]++
        }
        else{
            frequency[letter]=1
        }
    }
    return {frequency}
}
//console.log(letterFrequency("lol haha"))
const wordFrequency=(phrase)=>{
    // let frequency={}
    array=phrase.split(" ")
    /*for(const word of array){
        if(word in frequency){
            frequency[word]++
        }
        else{
            frequency[word]=1
        }
    }
    return {frequency}*/
    
    return letterFrequency(array)
}
//console.log(wordFrequency("lol lol haha yo yo"))

//HIGHER ORDER FUNCTIONS
//MAP , FILTER , REDUCE

//MAP = loops and return an array
let array=[1,2,3].map(x=>x*2)
//console.log(array)

const doubleMap=(numbers)=>{
     return numbers.map(number=>number*2)
}
//console.log(doubleMap([1,2,3,4]))

//FILTER = loops and return an array with matching conditions

const filter=(numbers,greaterthan)=>{
    let result=[]
    for (const number of numbers){
        if(number>greaterthan){
            result.push(number)
        }
    }
    return result
}
//console.log(filter([1,2,6,7,8],3))
console.log([1,2,3,4,5,6].filter(x=>x>3 && x<6))

const actors=[
    {name:'johnny',netWorth:20000},
    {name:'amber',netWorth:100},
    {name:'lenardo',netWorth:10000000}
]
//let result=(actors.filter(actor=>actor.netWorth>100))
//console.log(result)
//console.log(result.map(actor=>actor.name).join(','))

//REDUCE- when you think of sum use reduce
//reduce takes in a function as an argument
function sum(a,b){return a+b}
const nums=[1,2,3]
//const result=nums.reduce((prev,curr)=>prev+curr)
const result=nums.reduce(sum)
console.log(result)

console.log(actors.reduce((a,b)=>a+b.netWorth,0))
