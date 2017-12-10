package com.ming.sbm.account.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ming.sbm.account.service.AccountService;
import com.ming.sbm.account.service.impl.AccountServiceimpl;
import com.ming.sbm.conmon.bean.PageBean;
import com.ming.sbm.conmon.serice.CommonService;
import com.ming.sbm.conmon.serice.CommonServiceImpl;
import com.ming.sbm.goods.bean.Goods;

@SuppressWarnings("serial")
public class AccountServlet extends HttpServlet {
	private CommonService commonService = new CommonServiceImpl();
	private AccountService accountService = new AccountServiceimpl();
	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		switch (cmd) {
		case "getPageBean":
			getPageBean(request,response);
			break;
		case "addAccount":
			addAccount(request, response);
			break;
		case "getAccountByParam":
			getAccountByParam(request,response);
			break;
		case "deleteAccount":
			deleteAccount(request, response);
			break;
		case "updateAccount":
			updateAccount(request, response);
			break;
		default:
		}
		
	}

	private void updateAccount(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("update");
		String accountId = request.getParameter("accountId");
		String providerId = request.getParameter("providerId");
		String isPayed = request.getParameter("isPayed");
		
		int row = accountService.upDateAccountById(
				Integer.parseInt(accountId), 
				Integer.parseInt(providerId), 
				Integer.parseInt(isPayed));
		System.out.println("service");
		if(row > 0){
			//���³ɹ�
			response.sendRedirect("account?cmd=getPageBean&&p=1");
		}else{
			//����ʧ��
			PrintWriter out = response.getWriter();
			out.print("<script>alert('����ʧ��');</script>");
		}
	}

	private void deleteAccount(HttpServletRequest request, HttpServletResponse response) throws IOException {
	String accountId = request.getParameter("accountId");
		
		int row = accountService.deleteAccountById(Integer.parseInt(accountId));
		System.out.println("row"+row);
		if(row > 0){
			//ɾ���ɹ�
			response.sendRedirect("account?cmd=getPageBean&&p=1");
		}else{
			//ɾ��ʧ��
			PrintWriter out = response.getWriter();
			out.print("<script>alert('ɾ��ʧ��');</script>");
		}
	}

	private void addAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("add");
		Goods goods = (Goods) request.getAttribute("goods");
		String businessNum = request.getParameter("businessNum");
		String providerId = request.getParameter("providerId");
		String isPayed = request.getParameter("isPayed");
		
		int row = accountService.addAccount(
				goods, 
				Integer.parseInt(businessNum), 
				Integer.parseInt(providerId), 
				Integer.parseInt(isPayed));
		
		if(row > 0){
			System.out.println(row);
			//���¿��
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("goods?cmd=updateStore");
			System.out.println("row");
			requestDispatcher.forward(request, response);
			
		}else{
			//���ʧ��
			PrintWriter out = response.getWriter();
			out.print("<script>alert('���ʧ��');</script>");
		}
	}

	private void getAccountByParam(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String goodsName = request.getParameter("goodsName");
		String isPayed = request.getParameter("isPayed");
		List<String> wheres = new ArrayList<>();
		List<String> values = new ArrayList<>();
		if(goodsName != null && goodsName != ""){
			wheres.add("g.goodsName");
			values.add(goodsName);
		}
		if(isPayed != null && isPayed != ""){
			wheres.add("a.isPayed");
			values.add(isPayed);
		}
		
		PageBean pageBean = accountService.getPageBeanByParam(wheres, values);
		
		request.getSession().setAttribute("pageBean", pageBean);
		
		PrintWriter out = response.getWriter();
		out.print("<script>location.href = 'jsp/admin_bill_list.jsp'</script>");
	}
	

	private void getPageBean(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("pagebean");
		PageBean pageBean = new PageBean();
		int count = commonService.getCount("tb_account", null, null);
		pageBean.setCount(count);
		
		String p = request.getParameter("p");
		if(p != null && p != ""){
			//�в���p
			pageBean.setP(Integer.parseInt(p));
		}else{
			//û�в�������һ�ν���
			pageBean.setP(1);
		}
		
		pageBean = accountService.getPageBean(pageBean);
		//��������
		System.out.println(pageBean.getData().size());
		request.getSession().setAttribute("pageBean", pageBean);
		//�ض���
//		response.sendRedirect("jsp/admin_index.jsp");
		if(p != null && p != ""){
			//�в���p
			PrintWriter out = response.getWriter();
			out.print("<script>location.href = 'jsp/admin_bill_list.jsp'</script>");
		}else{
			response.sendRedirect("jsp/admin_index.jsp");
		}
	}
}
