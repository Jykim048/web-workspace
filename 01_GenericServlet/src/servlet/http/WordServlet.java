
//protected void service(HttpServletRequest request, )

String result = request.getParameter("word"); // form의 name

PrintWriter out = response.getWriter();
out.println("<html><body>");
out.println("<h2>Client Send Data ...</h2>")
out.println("<p>" + result + "</p>")
out