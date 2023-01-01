package com.arquitecturajava.ejemplo002.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arquitecturajava.ejemplo002.negocio.Curso;
import com.arquitecturajava.ejemplo002.servicios.ServicioCursos;

/**
 * Servlet implementation class ServletControlador despachador que apunta a un
 * jsp, e incluye lista de cursos
 */
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// peticion mostrar lista cursos
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//parte del modelo
		ServicioCursos sc = new ServicioCursos();
		List<Curso> lista = sc.buscarTodos();
		// envio de lista a un jsp mediante un despachador
		RequestDispatcher despachador = request.getRequestDispatcher("listaCursos.jsp");
		request.setAttribute("listaCursos", lista);
		//envio
		despachador.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
