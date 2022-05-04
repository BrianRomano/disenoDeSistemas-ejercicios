package concursantes;

import org.aspectj.lang.ProceedingJoinPoint;

public interface Adivinador {

    public void interceptarPensamientos(String pensamientos);

    public String getPensamientos();

	void interceptarPensamientos(ProceedingJoinPoint joinpoint, String pensamientos);
}
