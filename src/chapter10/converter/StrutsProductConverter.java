package chapter10.converter;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import charpter10.model.Product;

public class StrutsProductConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		Product product = new Product();
		String[] productValues = values[0].split(",");
		product.setName(productValues[0].trim());
		product.setPrice(Float.parseFloat(productValues[1].trim()));
		product.setCount(Integer.parseInt(productValues[2].trim()));
		
		return product;
	}

	@Override
	public String convertToString(Map context, Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
