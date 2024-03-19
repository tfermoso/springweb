window.onload = () => {
    document.getElementById("btnPedirDatos").onclick = () => {

        let url = location.origin + "/api/pedirdatos?dat=34&texto=hola";
        fetch(url)
            .then(datos => datos.json())
            .then(datos => {
                let lista=document.getElementById("lista");
                for (let i = 0; i < datos.length; i++) {
                   let liElement=document.createElement("li");
                   liElement.textContent=datos[i];
                   lista.append(liElement);
                }
            })
    }

    document.getElementById("btnEnviarAlumno").onclick=()=>{
        let alumno={
            id:document.getElementById("idalumno").value,
            nombre:document.getElementById("nombre").value,
            apellidos:document.getElementById("apellidos").value,
            edad:document.getElementById("edad").value
        }

    }
}