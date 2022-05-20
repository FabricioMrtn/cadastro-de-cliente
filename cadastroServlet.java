package br.com.novolar.cadastro.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cadastroServlet
 */
@WebServlet("/cliente")
public class cadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrado:");
		
		String nomeCliente = request.getParameter("nome");
		String sobrenomeCliente = request.getParameter("sobrenome");
		String cpf = request.getParameter("cpf");
		
		String telefone1 = request.getParameter("telefone1");
		String telefone2 = request.getParameter("telefone2");
		String email = request.getParameter("email");
		
		String endereco = request.getParameter("endereco");
		String numero = request.getParameter("numero");
		String cep = request.getParameter("cep");
		
		Pessoa pessoa = new Pessoa();
		Endereco end = new Endereco();
		Contato contato = new Contato();
		
		pessoa.setStrnome(nomeCliente);
		pessoa.setStrsobrenome(sobrenomeCliente);
		pessoa.setStrcpf(cpf);
		contato.setStrTel1(telefone1);
		contato.setStrTel2(telefone2);
		contato.setStrEmail(email);
		end.setStrrua(endereco);
		end.setStrnumeroCasa(numero);
		end.setStrCep(cep);
		
		
		BancoProvisorio b = new BancoProvisorio();
		b.adiciona(pessoa);
		b.adiciona2(end);
		b.adiciona3(contato);
		
		System.out.println(pessoa.dadosDePessoa());
		System.out.println(contato.dadosDeContato());
		System.out.println(end.dadosDeEndereco());
		
		PrintWriter out = response.getWriter();
		out.println("<html><body> Cliente " + nomeCliente + " " + sobrenomeCliente + " cadastrado com sucesso ! </body></html>");
	}

}
