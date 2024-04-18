                                                                                                                                                                                                                                                              const num=6;
isEven(7).then((msg)=>{console.log(msg)})
.catch((err)=>{console.log(err.message)});
function isEven(num){
	const pr=new Promise((resolve,reject)=>{
	if(num%2==0){
		resolve("even");
	}
	else{
		const err=new Error("number is not even");
		reject(err);
	}

	});return pr;
    
}