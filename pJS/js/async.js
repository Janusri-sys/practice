async function callapi(){
	const data=await fetch("https://api.github.com/users/Janusri-sys");
	console.log(data.json());

}function callapi2(){
	fetch("https://api.github.com/users/Janusri-sys").
	then(res=>{return res.json()}).then(data=>console.log(data)).catch((err)=>console.log(err));

}const xmlrequest=new XMLHttpRequest();
xmlrequest.open('GET',"https://api.github.com/users/Janusri-sys");
xmlrequest.send();
xmlrequest.onload=()=>{
	if(xmlrequest.status===2000)console.log("Request successful");
	else console.log("error ocurred");
	console.log(JSON.parse(xmlrequest.response));

}