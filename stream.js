//buffer - chunks of data
//buffering - loading the upcoming data 
//streaming ex - youtube videos
//when wew use fs to read and write files it is suitable for small size 
//but streams will be useful when u want to read big files.here i want to read a huge file

const fs = require('fs');
const readstream = fs.createReadStream('./docs/hugeFile.txt' , {encoding: 'utf-8'});
readstream.on('data',(buffer)=>{
    console.log("\nhello\n");
    console.log(buffer);
})
const writeStream = fs.createWriteStream('./docs/copyofhugeFile.txt');
readstream.pipe(writeStream); // will simply copy and write it in the file

