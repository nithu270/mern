//In client side js we have something called window object 
//from which we can use alert() , prompt() , setTimeout() , setInterval()
//for server side we have global object

// console.log(global); window is not present in node js.

const myname = (mname) =>{
console.log(`my name is ${mname}`); //string interpolation using backticks
}
myname("nithya");



const myfunc = setInterval(()=>{
    console.log("hi this is nithya");
} , 1000);

setTimeout(()=>{
    console.log("welcome");
    clearInterval(myfunc);
},5000);

//we can also get directory name and file name
console.log(__dirname);
console.log(__filename);

//why op looks like 
// my name is nithya
//c:\Users\HP\OneDrive\Documents\mern\node
//c:\Users\HP\OneDrive\Documents\mern\node\hello.js