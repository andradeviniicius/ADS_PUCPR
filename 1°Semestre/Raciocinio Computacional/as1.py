# Vinicius de Andrade
# Superior de Tecnologia em Análise e desenvolvimento de sistemas
import os

lista_estudantes = []

def clear_screen():
    if os.name == 'nt':
        os.system('cls')
    else:
        os.system('clear')

def inclusao_aluno():
    clear_screen()
    print("===== Inclusão de Estudante =====")
    nome_estudante = input("Nome do estudante: ")
    lista_estudantes.append(nome_estudante)
    input("Pressione ENTER para continuar ...")

def listar_aluno():
    clear_screen()
    print("===== Listagem de Estudantes =====")
    if lista_estudantes:
        print("Estudantes cadastrados:")
        for nome in lista_estudantes:
            print(nome)
        input("Pressione ENTER para voltar")
    else:
        print("Não há estudantes cadastrados")
        input("Pressione ENTER para voltar")


def atualizar_aluno():
    clear_screen()
    print("EM DESENVOLVIMENTO")
    input("Pressione ENTER para voltar")


def exclusao_aluno():
    clear_screen()
    print("EM DESENVOLVIMENTO")
    input("Pressione ENTER para voltar")


def menu_operacoes_estudante():
    while True:
        clear_screen()
        print("")
        print("")
        print("***** [ESTUDANTES] Menu de operações *****")
        print("1 - Incluir")
        print("2 - Listar")
        print("3 - Atualizar")
        print("4 - Excluir")
        print("9 - Voltar ao menu principal")

        opcao = input("Escolha uma opção: ")
        print("")
        print("")

        if opcao == "1":
            inclusao_aluno()
        elif opcao == "2":
            listar_aluno()
        elif opcao == "3":
            atualizar_aluno()
        elif opcao == "4":
            exclusao_aluno()
        elif opcao == "9":
            break
        else:
            clear_screen()
            print(
                "Opção inválida. Por favor, escolha uma das opções válidas (1, 2, 3, 4, ou 9).")
            input("Pressione ENTER para voltar")


def menu_operacoes_professores():
    clear_screen()
    print("EM DESENVOLVIMENTO - Professores")
    input("Pressione ENTER para voltar")


def menu_operacoes_disciplinas():
    clear_screen()
    print("EM DESENVOLVIMENTO - Disciplinas")
    input("Pressione ENTER para voltar")


def menu_operacoes_turmas():
    clear_screen()
    print("EM DESENVOLVIMENTO - Turmas")
    input("Pressione ENTER para voltar")


def menu_operacoes_matriculas():
    print("EM DESENVOLVIMENTO - Matrículas")
    input("Pressione ENTER para voltar")


def main_menu():
    while True:
        clear_screen()
        print("Menu principal:")
        print("1 - Estudantes")
        print("2 - Professores")
        print("3 - Disciplinas")
        print("4 - Turmas")
        print("5 - Matrículas")
        print("9 - Sair")

        choice = input("Escolha uma opção: ")

        if choice == "1":
            menu_operacoes_estudante()
        elif choice == "2":
            menu_operacoes_professores()
        elif choice == "3":
            menu_operacoes_disciplinas()
        elif choice == "4":
            menu_operacoes_turmas()
        elif choice == "5":
            menu_operacoes_matriculas()
        elif choice == "9":

            clear_screen()
            sairSemSalvar = input('Ao sair você perderá as informações registradas, digite "1" para sair e "2" para voltar:  ')
            if sairSemSalvar == '1':
                clear_screen()
                print("Saindo sem salvar")
                print("Lista de estudantes: ")
                print(lista_estudantes)
                print("Fechando o programa, tchauuuu")
                break
        else:
            input(
                "Escolha inválida, por favor escolha uma das opções disponíveis (1, 2, 3, 4, 5, or 9).")
            input("Pressione ENTER para voltar")


if __name__ == "__main__":
    clear_screen()
    main_menu()
