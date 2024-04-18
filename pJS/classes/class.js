class Car{
    constructor(name,color,topspeed){
        this.name=name
        this.color=color
        this.topspeed=topspeed
        this.currentspeed=0
    }
    drive(speed=20){
        console.log('drive')
        this.currentspeed+=speed
        //console.log(`Current speed is  at ${this.currentspeed}mph`)
    }
    brake(){
        this.currentspeed-=10
        console.log("brake")
    }
    zerotosixty(){
        setTimeout(()=>{
            console.log("phew! That was fast")
            this.currentspeed=60
            console.log(this.currentspeed)
        })

    }
    stop(){
        console.log("halt")
        this.currentspeed=0
    }
    getCurrentspeed(){
        return this.currentspeed
    }
}
const ferrari=new Car('ferrari','red',250)
const audi=new Car('audi','black',250)
// ferrari.drive()
// ferrari.drive()
// ferrari.drive()
// ferrari.drive() 
// ferrari.drive()
// ferrari.brake()
// ferrari.stop() 
//ferrari.zerotosixty()
// console.log(`final speed  : ${ferrari.currentspeed}`)
console.log(Object.values(audi))
console.log(audi)
const nums=[1,2,3,4].forEach(_=>audi.drive())
audi.brake()
console.log(` AFTER BRAKE current speed  : ${audi.getCurrentspeed()}`)
audi.zerotosixty()
console.log(`AFTER SIXTY current speed  : ${audi.getCurrentspeed()}`)
audi.stop()
console.log(`final speed  : ${audi.currentspeed}`)