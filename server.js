//creating a node js server
const http = require('http');
const fs = require('fs');
if(!(fs.existsSync('./docs/index.html'))){
fs.writeFile('./docs/index.html','hello everyone, gudmrng',()=>{
    console.log("file is been created");
})
}

http.createServer((req,res)=>{
    console.log("server is created");
}) // we should make this server listen

const server = http.createServer((req,res)=>{ //req is an obj here
    console.log("request made");
    console.log(req.url);
    console.log(req.method);
    res.setHeader('content-type','text/html');
    let path = './docs/';
if(req.url == '/' ){
    path+= 'index.html';
    res.statusCode = 200;
}
else if(req.url == '/home'){
    res.statusCode = 302;
    res.setHeader('Location','/'); //redirecting
    res.end() //orelse it will go and start reading the file 
}
else if(req.url == '/about'){
    path+= 'about.html';
     res.statusCode = 200;
}
else if(req.url == '/join'){
    path+= 'join.html';
     res.statusCode = 200;
}
else{
    path+= 'notFound.html';
    res.statusCode = 404;
}
    fs.readFile(path,(err,data)=>{
        if(err){
            console.log(err.message);
        }
        else{
            res.write(data);
            res.end();
        }
    })
}
)
server.listen(3002,'localhost',()=>{
    console.log("server is listening");  
})

//status codes
//200 - success , 201 - when we enter data in a form or when we successfully stored the data in server
//300 - redirect 
//404 - filenotfound