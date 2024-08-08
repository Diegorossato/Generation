
const apiUrl = 'https://generation-uyl0.onrender.com/alunos';

document.getElementById('alunoForm').addEventListener('submit', async function(event) {
    event.preventDefault();

    let isValid = true;

    const nomeRegex = /^[A-Za-zÀ-ÿ\s]+$/;

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

    const idade = document.getElementById('idade').value;
    if (!idade) {
        document.getElementById('idadeError').textContent = 'A idade do Aluno deve ser preenchida!';
        isValid = false;
    } else {
        document.getElementById('idadeError').textContent = '';
    }

    const notaPrimeiro = document.getElementById('notaPrimeiro').value;
    if (!notaPrimeiro) {
        document.getElementById('notaPrimeiroError').textContent = 'A nota do Primeiro Semestre deve ser preenchida!';
        isValid = false;
    } else {
        document.getElementById('notaPrimeiroError').textContent = '';
    }

    const notaSegundo = document.getElementById('notaSegundo').value;
    if (!notaSegundo) {
        document.getElementById('notaSegundoError').textContent = 'A nota do Segundo Semestre deve ser preenchida!';
        isValid = false;
    } else {
        document.getElementById('notaSegundoError').textContent = '';
    }


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

    const sala = document.getElementById('sala').value;
    if (!sala) {
        document.getElementById('salaError').textContent = 'A sala do Aluno deve ser preenchida!';
        isValid = false;
    } else {
        document.getElementById('salaError').textContent = '';
    }

    if (!isValid) {
        return;
    }

    const alunoData = {
        nome: nome,
        idade: parseInt(idade),
        notaPrimeiro: parseFloat(notaPrimeiro),
        notaSegundo: parseFloat(notaSegundo),
        professor: professor,
        sala: parseInt(sala)
    };

    try {
        await axios.post(apiUrl, alunoData);
        alert('Aluno cadastrado com sucesso!');
        window.location.href = 'cadastrados.html';
    } catch (error) {
        console.error('Erro ao cadastrar aluno:', error);
        alert('Erro ao cadastrar aluno!');
    }
});
