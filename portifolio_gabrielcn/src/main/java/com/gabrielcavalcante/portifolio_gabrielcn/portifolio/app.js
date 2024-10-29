document.addEventListener("DOMContentLoaded", function () {
    fetch("http://localhost:8080/api/projetos")
        .then(response => response.json())
        .then(projetos => {
            const listaProjetos = document.getElementById("lista-projetos");
            projetos.forEach(projeto => {
                const item = document.createElement("li");
                item.innerHTML = `<h3>${projeto.nome}</h3><p>${projeto.descricao}</p><a href="${projeto.url}">Ver Projeto</a>`;
                listaProjetos.appendChild(item);
            });
        });
});
