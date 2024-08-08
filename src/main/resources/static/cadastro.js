// URL da sua API
const apiUrl = 'https://generation-uyl0.onrender.com/alunos';

// Adiciona o ouvinte de evento para o envio do formulário
document.getElementById('alunoForm').addEventListener('submit', async function(event) {
    event.preventDefault(); // Impede o envio padrão do formulário

    let isValid = true;

    // Expressão regular para permitir apenas letras e espaços
    const nomeRegex = /^[A-Za-zÀ-ÿ\s]+$/;

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

    // Verificação e validação do campo idade
    const idade = document.getElementById('idade').value;
    if (!idade) {
        document.getElementById('idadeError').textContent = 'A idade do Aluno deve ser preenchida!';
        isValid = false;
    } else {
        document.getElementById('idadeError').textContent = '';
    }

    // Verificação e validação do campo notaPrimeiro
    const notaPrimeiro = document.getElementById('notaPrimeiro').value;
    if (!notaPrimeiro) {
        document.getElementById('notaPrimeiroError').textContent = 'A nota do Primeiro Semestre deve ser preenchida!';
        isValid = false;
    } else {
        document.getElementById('notaPrimeiroError').textContent = '';
    }

    // Verificação e validação do campo notaSegundo
    const notaSegundo = document.getElementById('notaSegundo').value;
    if (!notaSegundo) {
        document.getElementById('notaSegundoError').textContent = 'A nota do Segundo Semestre deve ser preenchida!';
        isValid = false;
    } else {
        document.getElementById('notaSegundoError').textContent = '';
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

    // Verificação e validação do campo sala
    const sala = document.getElementById('sala').value;
    if (!sala) {
        document.getElementById('salaError').textContent = 'A sala do Aluno deve ser preenchida!';
        isValid = false;
    } else {
        document.getElementById('salaError').textContent = '';
    }

    if (!isValid) {
        return; // Não envia os dados se houver erros de validação
    }

    // Coleta os dados do formulário
    const alunoData = {
        nome: nome,
        idade: parseInt(idade),
        notaPrimeiro: parseFloat(notaPrimeiro),
        notaSegundo: parseFloat(notaSegundo),
        professor: professor,
        sala: parseInt(sala)
    };

    try {
        // Envia os dados para a API
        await axios.post(apiUrl, alunoData);
        alert('Aluno cadastrado com sucesso!');
        window.location.href = 'cadastrados.html'; // Redireciona para a página cadastrados.html
    } catch (error) {
        console.error('Erro ao cadastrar aluno:', error);
        alert('Erro ao cadastrar aluno!');
    }
});
