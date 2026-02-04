 //sequential code will never wait for async functions to get finished
const fs = require('fs');

//mkdir
if(!fs.existsSync('./docs')){  //existsSync is a sync func that checks whether the folder exists or not
fs.mkdir('./docs',(err)=>{ //mkdir is a func used to create folder this takes 2 param one is the path and the other one is a callback function
    if(err){
        console.log(err.message);
    }
    else{
        console.log("folder has been created");
    }
})
}
console.log("here");
console.log("comes"); //these are sequential
fs.writeFile('./docs/file.txt','hello everyone',(err)=>{
    if(err){
        console.log(err.message);
    }
    else{
        console.log("file is written");
    }
})
if(fs.existsSync('./docs/file.txt')){
fs.readFile('./docs/file.txt',(err,data)=>{
    if(err){
        console.log(err.message);
    }
    else{
        console.log(data);//will give data in hexadecimal format use toString()
    }
})
}

if(fs.existsSync('./docs')){
fs.rmdir('./docs',(err)=>{
    if(err){
        console.log(err.message);
    }
    else{
        console.log("folder deleted");
    }
})
}

