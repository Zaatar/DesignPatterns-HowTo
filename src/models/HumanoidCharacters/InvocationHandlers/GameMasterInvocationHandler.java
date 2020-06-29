package models.HumanoidCharacters.InvocationHandlers;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import interfaces.GameCharacter;

public class GameMasterInvocationHandler implements InvocationHandler {
	GameCharacterInterface character;
	
	public GameMasterInvocationHandler(GameCharacterInterface character) {
		this.character = character;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			return method.invoke(character, args);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

}
