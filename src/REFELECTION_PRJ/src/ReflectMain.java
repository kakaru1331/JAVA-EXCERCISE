import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectMain {
	
	public static void main(String[] args) throws Exception {
		ReflectTarget unknownObj = new ReflectTarget();
		
		Class unknownClass = unknownObj.getClass();
		System.out.println("unknown class name: " + unknownClass.getName());
		
		Method[] methods = unknownClass.getMethods();
		System.out.println("Method list: ");
		for (Method m : methods)
			System.out.println(m.getName());
		
		Method yellSomething = unknownClass.getDeclaredMethod("yellAnother", String.class);
		yellSomething.invoke(unknownObj, "Pizza");
		
		Method yellChicken = unknownClass.getDeclaredMethod("yellChicken");
		yellChicken.invoke(unknownObj);
		
		Field f = unknownClass.getDeclaredField("str");
		f.setAccessible(true);
		f.set(unknownObj, "Chicken'll never Die!");
		yellChicken.invoke(unknownObj);

		Method whisperChicken = unknownClass.getDeclaredMethod("whisperChicken");
		whisperChicken.setAccessible(true);
		whisperChicken.invoke(unknownObj);
	}	
	
}
