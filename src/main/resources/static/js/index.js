window.onload = () => {
    document.getElementById("btnPedirDatos").onclick = () => {

        let url = location.origin + "/api/pedirdatos";
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
}