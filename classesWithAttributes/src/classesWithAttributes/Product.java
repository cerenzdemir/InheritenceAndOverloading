package classesWithAttributes;

public class Product {
	
		public Product(int _id, String _name,String _description,double _price,int _stockAmound,String _code) {
			System.out.println("Constructor block worked");
			this._id = _id;
			this._name=_name;
			this._description=_description;
			this._price=_price;
			this._stockAmound=_stockAmound;
			this._code=_code;
					
		}
		public Product() {
			
		}
		//Attribute or field
		int _id;
		String _name;
		String _description;
		double _price;
		int _stockAmound;
		String _code;
		
		
		//getter
		public int getId() {
			return _id;
		}
		//setter
		public void setId(int id) {
			this._id=id;
		}
		public String getName() {
			return _name;
		}
		public void setName(String Name) {
			this._name=Name;
		}
		public String getDescription() {
			return _description;
		}
		public void setDescription(String Description) {
			this._description = Description;
		}
		public double getPrice() {
			return _price;
		}
		public void setPrice(double Price) {
			this._price=Price;
		}
		public int getStockAmound() {
			return _stockAmound;
		}
		public void setStockAmound(int StockAmound) {
			this._stockAmound = StockAmound;
		}
		public String getCode() {
			return _code;
		}
		public void setCode(String Code) {
			this._code=Code;
			
		} 
		
		
}
