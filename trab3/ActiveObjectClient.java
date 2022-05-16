package br.com.bruna;

import java.util.concurrent.PriorityBlockingQueue;

public class ActiveObjectClient  {
    private PriorityBlockingQueue<Client> dispatchQueue = new PriorityBlockingQueue<>();
    private Integer ordemAtual = 0;
    
    public Integer getOrdemAtual() {
        return ordemAtual;
    }

    public ActiveObjectClient() {
      new Thread(() -> {
          while (true) {
            try {
              Client client = dispatchQueue.take();
              Thread.sleep(500);
              System.out.println(client.getNome() + " atendido - ordem: " + client.getOrdemChegada());
            } catch (InterruptedException e) {
              break;
            }
          }
        }).start();
    }

    public void doTask(Client...clientes) {
    	for (int i = 0; i < clientes.length; i++) {
    		Client cliente = clientes[i];
    		
    		ordemAtual += 3;
    		
            if (cliente.getPrioridade()) {
            	cliente.setOrdemChegada(ordemAtual-8);
            } else { 
            	cliente.setOrdemChegada(ordemAtual);
            }
            
            dispatchQueue.put(cliente); 
		}
    }
  }