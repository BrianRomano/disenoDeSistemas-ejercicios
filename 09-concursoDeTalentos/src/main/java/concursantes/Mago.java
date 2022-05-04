package concursantes;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Mago implements Adivinador {

    private String pensamientos;

    @Pointcut("execution(* concursantes.Pensador.pensarEnAlgo(String)) && args(pensamientos)")
    public void pensar(String pensamientos) {
    }

    @Around("pensar(pensamientos)")
    //@Override
    public void interceptarPensamientos(ProceedingJoinPoint joinpoint, String pensamientos) {
        try {
			joinpoint.proceed();
	        System.out.println("Magia....");
	        System.out.println("Estos son los pensamientos del voluntario: " + pensamientos);
	        this.pensamientos = pensamientos;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    public String getPensamientos() {
        return this.pensamientos;
    }

	@Override
	public void interceptarPensamientos(String pensamientos) {
		// TODO Auto-generated method stub
		
	}
}
