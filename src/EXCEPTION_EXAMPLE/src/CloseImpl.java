
public class CloseImpl implements AutoCloseable {
	private String file;
	
	public CloseImpl(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println("file: " + file);
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("closed " + file);
		
	}
}
