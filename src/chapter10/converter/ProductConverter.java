package chapter10.converter;

import java.util.Map;

import charpter10.model.Product;
import ognl.DefaultTypeConverter;

public class ProductConverter extends DefaultTypeConverter {

	@Override
	public Object convertValue(Map context, Object value, Class toType) {
		if (toType == Product.class) {
			String[] params = (String[]) value;
			Product product = new Product();
			String[] productValues = params[0].split(",");
			product.setName(productValues[0]);
			product.setPrice(Float.parseFloat(productValues[1]));
			product.setCount(Integer.parseInt(productValues[2]));
			return product;
		} else if (toType == String.class) {
			
		}
		return null;
	}
	
}
