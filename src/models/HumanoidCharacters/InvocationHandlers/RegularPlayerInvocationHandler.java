package models.HumanoidCharacters.InvocationHandlers;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RegularPlayerInvocationHandler implements InvocationHandler {
	
	GameCharacterInterface character;
	
	public RegularPlayerInvocationHandler(GameCharacterInterface character) {
		this.character = character;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			if(method.getName().startsWith("get")) {
				return method.invoke(character, args);	
			} else if (method.getName().startsWith("set")) {
				throw new IllegalAccessException();
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
}
