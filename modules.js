const data = require('./data.js'); //now  require is used to import but
//we cannot use data from data.js until we export them there
//when u use require and a relative path..all the code in that file will run (here data.js)
//we can also import particular data from data.js (const names = require(relative path)  or const {names,f} = require(relative path)
console.log(data); //we will get empty list until we export names in data.js
console.log(data.f);//if i only want fruits
//there are some built in modules available in nodejs like os ,file system
const os = require('os');
console.log(os.homedir());