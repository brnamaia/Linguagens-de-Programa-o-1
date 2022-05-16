package br.com.bruna;

public class Main {
    public static void main(String args[]){           	
        ActiveObjectClient obj = new ActiveObjectClient();        
        
        new Thread(() -> {
        	try {
        		int contadorP = 1;
            	int contadorN = 1;
        		
				for (int i = 0; i < 10; i++) {
					boolean prioridade = ((int)(Math.random() * 100)) % 2 == 0;
					
					Client c = new Client(prioridade ? ("P" + contadorP++) : ("N" + contadorN++), prioridade);
					obj.doTask(c);
					System.out.println(c.getNome() + " entrou na fila");
					Thread.sleep(100);        	
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        	
        }).start();
    }
    
}
