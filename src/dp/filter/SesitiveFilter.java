package dp.filter;

public class SesitiveFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
		String str = request.getRequestStr()
				.replace("����ҵ", "��ҵ").replaceAll("����", "") + "---SesitiveFilter()";
		request.setRequestStr(str);
		chain.doFilter(request, response, chain);
		response.setResponseStr(response.getResponseStr()+"---SesitiveFilter()");
	}

}
