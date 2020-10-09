

const convert = (data) => {
    if(!data) {
        return 0;
    } else {
        let value = data.split('')
        let newValue =  value.filter(v => {
            if(!isNaN(1*v)) {
                return v
            }
        });
        let main = newValue.length;
        let sum = 0;

        for (let i = 1; i <=newValue.length ; i++) {
            if(i === newValue.length) {
                sum = sum + newValue[i-1]* 1
            } else {
                sum = sum + newValue[i-1]* Math.pow(10, (main-1))
                main--
            }
        }
        return sum
    }
}


console.log(convert('da572da'));