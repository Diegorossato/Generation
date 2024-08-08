const apiUrl = 'https://generation-uyl0.onrender.com/alunos';

async function fetchAlunos() {
    try {
        const response = await axios.get(apiUrl);
        return response.data;
    } catch (error) {
        console.error('Erro ao buscar alunos:', error);
        return [];
    }
}

async function renderTable() {
    console.log('renderTable chamado');
    const alunos = await fetchAlunos(); // Obtém os dados da API
    const tableBody = document.getElementById('alunoTableBody');

    if (!tableBody) {
        console.error('Elemento com ID alunoTableBody não encontrado.');
        return;
    }

    tableBody.innerHTML = '';

    alunos.forEach(aluno => {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${aluno.id}</td>
            <td>${aluno.nome}</td>
            <td>${aluno.idade}</td>
            <td>${aluno.notaPrimeiro.toFixed(2)}</td>
            <td>${aluno.notaSegundo.toFixed(2)}</td>
            <td>${aluno.professor}</td>
            <td>${aluno.sala}</td>
            <td class="action-buttons">
                <button class="update-btn" onclick="updateAluno(${aluno.id})">Atualizar</button>
                <button class="delete-btn" onclick="deleteAluno(${aluno.id})">Excluir</button>
            </td>
        `;
        tableBody.appendChild(row);
    });
}

function updateAluno(id) {
    window.location.href = `atualizar.html?id=${id}`;
}

async function deleteAluno(id) {
    if (confirm(`Tem certeza de que deseja excluir o aluno com ID ${id}?`)) {
        try {
            await axios.delete(`${apiUrl}/${id}`);
            alert('Aluno excluído com sucesso!');
            renderTable();
        } catch (error) {
            console.error('Erro ao excluir aluno:', error);
            alert('Erro ao excluir aluno!');
        }
    }
}

document.addEventListener('DOMContentLoaded', function() {
    console.log('DOM completamente carregado e analisado');
    renderTable();
});
