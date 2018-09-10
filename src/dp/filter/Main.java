package dp.filter;

public class Main {

	//针对一些敏感词进行处理
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "<script>:)一些敏感词信息，比如被就业";
		Request request = new Request();
		request.setRequestStr(msg);
		
		Response response = new Response();
		response.setResponseStr("response");
		
		FilterChain fc = new FilterChain();
		FilterChain fc2 = new FilterChain();
		fc.addFilter(new HTMLFilter());
		fc2.addFilter(new SesitiveFilter());
		fc.addFilter(fc2);
		
		fc.doFilter(request, response, fc);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
	}

}
