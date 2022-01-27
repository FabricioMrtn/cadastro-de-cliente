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
		System.out.println("sucesso");
		
		String nomeCliente = request.getParameter("nome");
		String sobrenomeCliente = request.getParameter("sobrenome");
		String cpf = request.getParameter("cpf");
		Pessoa pessoa = new Pessoa();
		pessoa.setStrnome(nomeCliente);
		pessoa.setStrsobrenome(sobrenomeCliente);
		pessoa.setStrcpf(cpf);
		
		
		
		BancoProvisorio b = new BancoProvisorio();
		b.adiciona(pessoa);
		
		System.out.println(pessoa.getStrcpf());
		
		PrintWriter out = response.getWriter();
		out.println("<html><body> Cliente " + nomeCliente + " " + sobrenomeCliente + " cadastrado com sucesso ! </body></html>");
	}

}
