
var today=new Date();
day=today.getDay() //returns the day number
daylist=['Monday','Tuesday','Wednesday','Thursday','Friday','Saturday']
document.write("Today is : "+daylist[day-1]);
var hour=today.getHours();
var minute=today.getMinutes();
var second=today.getSeconds();
var prepand=(hour>=12)?"PM":"AM";
if(hour==0 && prepand=="PM"){
    if(minute==0 && second==0){
        hour=12;
        prepand="Noon";
    }
    else{
        hour=12;
        prepand="PM";
    }

}
if(hour==0 && prepand=="AM"){
    if(minute==0 && second==0){
        hour=12;
        prepand="Midnight";
    }
    else{
        hour=12;
        prepand="AM";
    }
    
}
document.write("Current time:"+hour+prepand+":"+minute+":"+second);