package dp.filter;

public interface Filter {
	void doFilter(Request request, Response response, FilterChain chain);
}
