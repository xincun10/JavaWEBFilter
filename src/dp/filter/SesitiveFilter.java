package dp.filter;

public class SesitiveFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
		String str = request.getRequestStr()
				.replace("被就业", "就业").replaceAll("敏感", "") + "---SesitiveFilter()";
		request.setRequestStr(str);
		chain.doFilter(request, response, chain);
		response.setResponseStr(response.getResponseStr()+"---SesitiveFilter()");
	}

}
