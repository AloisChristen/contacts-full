package ch.heig.christen_scherler.presentation;

import ch.heig.christen_scherler.business.ContactService;
import ch.heig.christen_scherler.dto.CoupleDTO;
import ch.heig.christen_scherler.integration.ContactDAOLocal;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/listeCouplesDTO")
public class ListeCouplesDTO extends HttpServlet {

    @Inject
    private ContactDAOLocal contactDAO;

    @Inject
    private ContactService contactService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<CoupleDTO> couples = contactService.getCouples();
        request.setAttribute("couples", couples);
        request.getRequestDispatcher("/WEB-INF/pages/listeCouplesDTO.jsp").forward(request, response);
    }
}
