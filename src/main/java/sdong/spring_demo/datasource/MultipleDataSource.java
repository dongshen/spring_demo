package sdong.spring_demo.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
public class MultipleDataSource extends AbstractRoutingDataSource {
	@Override
	protected Object determineCurrentLookupKey() {
		return MultipleDataSourceContext.getKey();
	}
}
