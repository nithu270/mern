const exp = require('express');
const app = exp() //creates exp application
app.listen(3001); // telling the server to listen to this port
 
//middleware - used to acknowledge
app.use((req,res,next)=>{
console.log("req is received");
next(); // this next is to tell the middleware to move to the next part (that is sending the appropriate resp to browser)

});

app.get('/hello',(req,res) =>{
     res.statusCode = 201;
    console.log("req is made");
    res.status(200).send('<h1>hello guys</h1>'); //we can chain up like this
  
})
const path = require('path');


app.get('/about',(req,res)=>{
    res.sendFile('./docs/about.html', { root: path.join(__dirname, '..') });
 

}) //previously we had to set header and status code but using this app.get 
//automatically displays in network page


app.get('/',(req,res)=>{
   res.sendFile('./docs/index.html',{root: path.join(__dirname,'..')});
}) 
app.get('/join',(req,res)=>{
    res.sendFile('./docs/join.html', { root: path.join(__dirname, '..') });

}) 
// __dirname = C:\mern\node

// path.join(__dirname, '..') = C:\mern

// Relative path './docs/join.html' → becomes:

// C:\mern\docs\join.html
//if none of the above files are requested
//redirecting in express 
app.get('/joinus',(req,res)=>{
    res.redirect('/join');
})
app.use((req,res)=>{
    res.sendFile('./docs/notFound.html',{root: path.join(__dirname,'..')});
})//it is a middleware it wont check any other responses or paths thats why we
//should use it at last

