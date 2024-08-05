// URL da sua API
const apiUrl = 'http://localhost:8080/alunos';

// Expressão regular para permitir apenas letras e espaços
const nomeRegex = /^[A-Za-zÀ-ÿ\s]+$/;

// Função para buscar dados de um aluno por ID
async function getAlunoById(id) {
    try {
        const response = await axios.get(`${apiUrl}/${id}`);
        return response.data;
    } catch (error) {
        console.error('Erro ao obter aluno:', error);
        return null;
    }
}

// Função para preencher o formulário com os dados do aluno
async function populateForm(id) {
    const aluno = await getAlunoById(id);
    if (aluno) {
        document.getElementById('alunoId').value = aluno.id;
        document.getElementById('nome').value = aluno.nome;
        document.getElementById('idade').value = aluno.idade;
        document.getElementById('notaPrimeiro').value = aluno.notaPrimeiro;
        document.getElementById('notaSegundo').value = aluno.notaSegundo;
        document.getElementById('professor').value = aluno.professor;
        document.getElementById('sala').value = aluno.sala;
    } else {
        alert('Aluno não encontrado!');
    }
}

// Função para validar o formulário
function validateForm() {
    let isValid = true;

    // Verificação e validação do campo nome
    const nome = document.getElementById('nome').value;
    if (!nome.trim()) {
        document.getElementById('nomeError').textContent = 'O nome do Aluno deve ser preenchido!';
        isValid = false;
    } else if (!nomeRegex.test(nome)) {
        document.getElementById('nomeError').textContent = 'O nome do Aluno deve conter apenas letras e espaços!';
        isValid = false;
    } else {
        document.getElementById('nomeError').textContent = '';
    }

    // Verificação e validação do campo professor
    const professor = document.getElementById('professor').value;
    if (!professor.trim()) {
        document.getElementById('professorError').textContent = 'O nome do Professor deve ser preenchido!';
        isValid = false;
    } else if (!nomeRegex.test(professor)) {
        document.getElementById('professorError').textContent = 'O nome do Professor deve conter apenas letras e espaços!';
        isValid = false;
    } else {
        document.getElementById('professorError').textContent = '';
    }

    return isValid;
}

// Função para atualizar um aluno
async function updateAluno(event) {
    event.preventDefault();

    // Valida o formulário
    if (!validateForm()) {
        return; // Não envia os dados se houver erros de validação
    }

    const id = parseInt(document.getElementById('alunoId').value);
    const aluno = {
        nome: document.getElementById('nome').value,
        idade: parseInt(document.getElementById('idade').value),
        notaPrimeiro: parseFloat(document.getElementById('notaPrimeiro').value),
        notaSegundo: parseFloat(document.getElementById('notaSegundo').value),
        professor: document.getElementById('professor').value,
        sala: parseInt(document.getElementById('sala').value)
    };

    try {
        await axios.put(`${apiUrl}/${id}`, aluno);
        alert('Aluno atualizado com sucesso!');
        window.location.href = 'cadastrados.html'; // Redireciona para a lista de alunos
    } catch (error) {
        console.error('Erro ao atualizar aluno:', error);
        alert('Erro ao atualizar aluno!');
    }
}

// Obtém o ID do aluno da URL e preenche o formulário
const urlParams = new URLSearchParams(window.location.search);
const alunoId = parseInt(urlParams.get('id'));
populateForm(alunoId);

// Adiciona o listener de submit ao formulário
document.getElementById('updateForm').addEventListener('submit', updateAluno);
