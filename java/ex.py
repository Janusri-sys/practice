Integer max=null;
        Integer secMax=null;
        Integer thirdMax=null;
        for(Integer num:nums){
            if(num.equals(max)||num.equals(secMax)||num.equals(thirdMax)){
                continue;
            }
            if(max==null || num>max){
                thirdMax=secMax;
                secMax=max;
                max=num;
            }
            else if(secMax==null || num>secMax){
                thirdMax=secMax;
                secMax=num;
            }
            else if(thirdMax==null||num>thirdMax){
                thirdMax=num;
            }
        }
        if(thirdMax==null){
            return max;
        }
            
        return thirdMax;
