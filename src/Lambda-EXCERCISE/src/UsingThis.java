
public class UsingThis {
	int outterField = 10;
	int innerField = 10;
	
	class Inner {
		int outterField = 20;
		int innerField = 20;
		
		void method() {
			FunctionalIF fif = () -> {
				System.out.println("outterField: " + outterField);
				System.out.println("this.outterField: " + this.outterField);
				System.out.println("UsingThis.this.ouuterField: " + UsingThis.this.outterField);
				
				System.out.println("innerField: " + innerField);
				System.out.println("this.innerField: " + this.innerField);
				System.out.println("UsingThis.this.innerField: " + UsingThis.this.innerField);
			};
			fif.forLambda();
		}
	}
}
