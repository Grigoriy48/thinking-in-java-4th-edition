public class Task6{
	public static void main(String[] args){
		class StorageOperation{
			int storage(String s){
				return s.length()*2;
			}
		} 
		StorageOperation s = new StorageOperation();
		System.out.print(s.storage("length"));
	}
}