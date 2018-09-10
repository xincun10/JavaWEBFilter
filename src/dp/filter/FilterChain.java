package dp.filter;

import java.util.*;

public class FilterChain implements Filter{

	List<Filter> filters = new ArrayList<Filter>();
	int index = 0;
	
	//添加过滤规则，返回自身的引用
	public FilterChain addFilter(Filter f)
	{
		this.filters.add(f);
		return this;
	}
	
	//根据过滤链对字符串进行过滤
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		if(index == filters.size()) return;
		Filter f = filters.get(index);
		index ++;
		f.doFilter(request, response, chain);		
	}
}
