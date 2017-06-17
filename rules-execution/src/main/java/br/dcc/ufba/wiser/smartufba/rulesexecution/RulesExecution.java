package br.dcc.ufba.wiser.smartufba.rulesexecution;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RulesExecution {

	private String uri;
	
public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

public void getActuator(){
		
		Client client = ClientBuilder.newClient();
		System.out.println("atuando");
		try{
			
			System.out.println("Conectando a" + uri); 
			Response resp = client.target(uri).queryParam("status", true).request(MediaType.APPLICATION_JSON_TYPE).method("POST");
	
			
			Integer status = resp.getStatus();
			System.out.println(status);
		}catch (Exception e){
			e.printStackTrace();
			
		}finally{
			client.close();
		}
	}
	
}
