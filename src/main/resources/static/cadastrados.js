// URL da sua API
const apiUrl = 'https://generation-uyl0.onrender.com/alunos';

// Função para buscar os dados dos alunos da API
async function fetchAlunos() {
    try {
        const response = await axios.get(apiUrl);
        return response.data; // Retorna os dados da resposta
    } catch (error) {
        console.error('Erro ao buscar alunos:', error);
        return []; // Retorna um array vazio em caso de erro
    }
}

// Função para renderizar a tabela com os dados dos alunos
async function renderTable() {
    const alunos = await fetchAlunos(); // Obtém os dados da API
    const tableBody = document.getElementById('alunoTableBody');
    tableBody.innerHTML = ''; // Limpa o conteúdo da tabela

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

// Função para redirecionar para a página de atualização
function updateAluno(id) {
    window.location.href = `atualizar.html?id=${id}`;
}

// Função para excluir um aluno da API
async function deleteAluno(id) {
    if (confirm(`Tem certeza de que deseja excluir o aluno com ID ${id}?`)) {
        try {
            await axios.delete(`${apiUrl}/${id}`); // Chamada à API para deletar o aluno
            alert('Aluno excluído com sucesso!');
            renderTable(); // Atualiza a tabela após a exclusão
        } catch (error) {
            console.error('Erro ao excluir aluno:', error);
            alert('Erro ao excluir aluno!');
        }
    }
}

// Inicializa a tabela
renderTable();
