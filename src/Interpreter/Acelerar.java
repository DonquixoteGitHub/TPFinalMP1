package Interpreter;

public class Acelerar extends ExpresionAbstracta{

	@Override
	public void ejecutar(ContextoLocomotora c) {
		c.acelerar();
	}

}
