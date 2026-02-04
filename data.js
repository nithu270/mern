const names = ["nithya", "shree" , "pranathi"];
const f =  ["apple","mango","banana"];
const n = 5;
const p = 6;
console.log(p);
console.log(names);
console.log("my frnds");
//module.exports = names,f; - this wont work cuz we have to export multiple data in obj format
module.exports = {
    names,f  // we can directly export without variable name and only value
}
module.exports = {p}

