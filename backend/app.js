//importamos express
import express from "express"
// crear una instancia de nuestra aplicación
const app = express()

app.get("/",(request,response)=>{
response.send("<h1> Hola desde mi app</h1>")
})
//ponemos a escuchar nuestra aplicación en el puero 3001
app.listen(3001,() =>{
    console.log('Escuchando en http://localhost:3001');
    
})
