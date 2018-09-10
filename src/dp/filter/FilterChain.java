package dp.filter;

import java.util.*;

public class FilterChain implements Filter{

	List<Filter> filters = new ArrayList<Filter>();
	int index = 0;
	
	//��ӹ��˹��򣬷������������
	public FilterChain addFilter(Filter f)
	{
		this.filters.add(f);
		return this;
	}
	
	//���ݹ��������ַ������й���
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		if(index == filters.size()) return;
		Filter f = filters.get(index);
		index ++;
		f.doFilter(request, response, chain);		
	}
}
