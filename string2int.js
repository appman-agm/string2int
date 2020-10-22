function string2int(string){
    return string.replace(/([A-Z])/gi, '');
}
console.log(string2int('abc573'));
console.log(string2int('a5b7c3'))