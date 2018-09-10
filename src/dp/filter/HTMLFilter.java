package dp.filter;

public class HTMLFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
		String str = request.getRequestStr()
				.replace('<', '[').replace('>', ']') + "---HTMLFilter()";
		request.setRequestStr(str);
		chain.doFilter(request, response, chain);
		response.setResponseStr(response.getResponseStr()+"---HTMLFilter()");
	}

}
