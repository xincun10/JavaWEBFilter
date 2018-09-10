package dp.filter;

public class Main {

	//���һЩ���дʽ��д���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "<script>:)һЩ���д���Ϣ�����类��ҵ";
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
