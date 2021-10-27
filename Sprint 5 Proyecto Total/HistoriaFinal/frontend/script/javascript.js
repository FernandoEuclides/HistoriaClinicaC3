$(function(){
    $("#cargar").click(function(){
        console.log("prueba");

        $.get("http://127.0.0.1:8080/paciente", function(data){
            console.log(data);
            $("#cuerpo").html("");
            for (let i = 0 ; i<data.length;i++){
                let tr=`<tr>
                    <td>`+data[i].id+`</td>
                    <td>`+data[i].prioridad+`</td>
                    <td>`+data[i].nombre+`</td>
                    <td>`+data[i].fecha_nacimiento+`</td>
                    <td>`+data[i].genero+`</td>
                    <td>`+data[i].celular+`</td>
                    <td>`+data[i].email+`</td>
                    <td>`+data[i].fecha_consulta+`</td>
                    <td>`+data[i].aseguradora+`</td>
                    <td><input type="submit" id="eliminar" value="Eliminar" onclick="eliminarPaciente(${data[i].id})"></td>
                   
                    </tr>`;
                $("#cuerpo").append(tr)
            }
        })
    }).then(response => response.json().then(()=>alert("Relacionado")))
})

$(function(){
  $("#guardar").on("click",function(e){
      e.preventDefault();
  
      // relacion de campos
      let aseguradora = document.getElementById("Aseguradora").value; 
      let celular=  $("#celular").val();
      let ciudad=  $("#ciudad").val();
      let direccion=  $("#direccion").val();
      let email=  $("#email").val();
      let estado_civil=  $("#estado_civil").val();
      let fecha_consulta=  $("#fecha_consulta").val();
      let fecha_nacimiento=  $("#fecha_nacimiento").val();
      let genero=  $("#genero").val();

      let nombre = document.getElementById("nombre").value; 
      let nombre_acompanante = document.getElementById("nombre_acompañante").value; 

      let observacion=  $("#observacion").val();
      let parentesco=  $("#parentesco").val();
      let prioridad=  $("#prioridad").val();
      let telefono=  $("#telefono").val();
      let telefonoacomp=  $("#telefonoacomp").val();

      let tipo_documento=  $("#tipodocumento").val();
    //let tipo_documento=  $("#tipo_documento").val();

      let tipo_paciente=  $("#tipo_paciente").val();
      
      //relacion de campos
      console.log(aseguradora,celular,ciudad,direccion,email,estado_civil,fecha_consulta,fecha_nacimiento,genero,nombre,nombre_acompanante,observacion,parentesco,prioridad,telefono,telefonoacomp,tipo_documento,tipo_paciente);

      fetch("http://127.0.0.1:8080/paciente" , {
          method:"POST",
          mode:"cors",
          cache:"no-cache",
          headers:{"Content-type":"application/json"},

          body:JSON.stringify({aseguradora,celular,ciudad,direccion,email,estado_civil,fecha_consulta,fecha_nacimiento,genero,nombre,nombre_acompanante,observacion,parentesco,prioridad,telefono,telefonoacomp,tipo_documento,tipo_paciente})

      }).then(response => response.json().then(()=>alert("Guardado")))

  });
});

$(function(){
    $("#buscar_NroDocumento").click(function(){
        let prioridad = document.getElementById("buscar").value;
        let url="http://127.0.0.1:8080/paciente/query?prioridad=";

        $.get(url+prioridad, function(data){

            $("#cuerpo").html("");
            for (let i = 0 ; i<data.length;i++){
                let tr=`<tr>
                    <td>`+data[i].id+`</td>
                    <td>`+data[i].prioridad+`</td>
                    <td>`+data[i].nombre+`</td>
                    <td>`+data[i].fecha_nacimiento+`</td>
                    <td>`+data[i].genero+`</td>
                    <td>`+data[i].celular+`</td>
                    <td>`+data[i].email+`</td>
                    <td>`+data[i].fecha_consulta+`</td>
                    <td>`+data[i].aseguradora+`</td>

                    <td><input type="submit" id="eliminar" value="Eliminar" onclick="eliminarPaciente(${data[i].id})"></td>
  
                        </tr>`;
                $("#cuerpo").append(tr)
            }

        })

        })
})

$(function(){
    $("#buscar_id").click(function(){
        let id = document.getElementById("buscarid").value;
        console.log(id);
        let url="http://127.0.0.1:8080/paciente/";

        $.get(url+id, function(data){
            
            $("#cuerpo").html("");
                let tr=`<tr>
                    
                    <td>`+data.id+`</td>
                    <td>`+data.prioridad+`</td>
                    <td>`+data.nombre+`</td>
                    <td>`+data.fecha_nacimiento+`</td>
                    <td>`+data.genero+`</td>
                    <td>`+data.celular+`</td>
                    <td>`+data.email+`</td>
                    <td>`+data.fecha_consulta+`</td>
                    <td>`+data.aseguradora+`</td>

                    <td><input type="submit" id="eliminar" value="Eliminar" onclick="eliminarPaciente(${data.id})"></td>
 
                        </tr>`;
                $("#cuerpo").append(tr)
        })
        })
})

const eliminarPaciente= (id) =>{
    if(confirm("seguro desea eliminar?")){
        console.log(id);
        $.ajax({
            url:"http://127.0.0.1:8080/paciente/"+id,
            type:"DELETE",
            success:(res) =>{
                console.log("Eliminado")
            }

        })
    }
}


                 //  <td><input type="submit" id="actualizar" value="Actualizar" onclick="actualizarPaciente(${data.id})"></td>
                 //  <td><input type="submit" id="actualizar" value="Actualizar" onclick="actualizarPaciente(${data[i].id})"></td>
                 //  <td><input type="submit" id="actualizar" value="Actualizar" onclick="actualizarPaciente(${data[i].id})"></td> 
