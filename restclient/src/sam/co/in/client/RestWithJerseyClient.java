package sam.co.in.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RestWithJerseyClient {
	
private void getEmployees(){
	Client client=Client.create();
	WebResource resource=client.resource("http://localhost:8666/Restwithjersey/rest/Employees/getEmployees");
	ClientResponse response=resource.accept("application/json").get(ClientResponse.class);
	//ClientResponse response=resource.accept("application/xml").get(ClientResponse.class);
	if(response.getStatus()==200){
		String output=response.getEntity(String.class);
		System.out.println("=======================Get Employees=====================");
		System.out.println(output);
		System.out.println("=======================Get Employees=====================");
	}
	
}
	
private void recuriteEmployee(){
	
	Client client=Client.create();
	WebResource resource=client.resource("http://localhost:8666/Restwithjersey/rest/Employees/recuriteEmployees");
	//ClientResponse response=resource.accept("application/json").get(ClientResponse.class);
//	String xmlInput="<?xml version="1.0" encoding="UTF-8" standalone="yes"?><xmlResponseWrapper><employeeDetails><entry><key>17</key><value><employeeAddress>304,sarannay gokulam</employeeAddress><employeeId>17</employeeId><employeeName>employee7</employeeName><employeeSalary>35007.0</employeeSalary></value></entry><entry><key>16</key><value><employeeAddress>304,sarannay gokulam</employeeAddress><employeeId>16</employeeId><employeeName>employee6</employeeName><employeeSalary>35006.0</employeeSalary></value></entry><entry><key>19</key><value><employeeAddress>304,sarannay gokulam</employeeAddress><employeeId>19</employeeId><employeeName>employee9</employeeName><employeeSalary>35009.0</employeeSalary></value></entry><entry><key>18</key><value><employeeAddress>304,sarannay gokulam</employeeAddress><employeeId>18</employeeId><employeeName>employee8</employeeName><employeeSalary>35008.0</employeeSalary></value></entry><entry><key>20</key><value><employeeAddress>304,sarannay gokulam</employeeAddress><employeeId>20</employeeId><employeeName>employee10</employeeName><employeeSalary>35010.0</employeeSalary></value></entry><entry><key>11</key><value><employeeAddress>304,sarannay gokulam</employeeAddress><employeeId>11</employeeId><employeeName>employee1</employeeName><employeeSalary>35001.0</employeeSalary></value></entry><entry><key>12</key><value><employeeAddress>304,sarannay gokulam</employeeAddress><employeeId>12</employeeId><employeeName>employee2</employeeName><employeeSalary>35002.0</employeeSalary></value></entry><entry><key>13</key><value><employeeAddress>304,sarannay gokulam</employeeAddress><employeeId>13</employeeId><employeeName>employee3</employeeName><employeeSalary>35003.0</employeeSalary></value></entry><entry><key>14</key><value><employeeAddress>304,sarannay gokulam</employeeAddress><employeeId>14</employeeId><employeeName>employee4</employeeName><employeeSalary>35004.0</employeeSalary></value></entry><entry><key>15</key><value><employeeAddress>304,sarannay gokulam</employeeAddress><employeeId>15</employeeId><employeeName>employee5</employeeName><employeeSalary>35005.0</employeeSalary></value></entry></employeeDetails></xmlResponseWrapper>";
	//String jsonInput="{"employeeId":101,"employeeName":"Shameer khan","employeeAddress":"304-saranaya gokulam","employeeSalary":35000.0}";
	ClientResponse response=resource.accept("application/xml").post(ClientResponse.class,jsonInput);
	if(response.getStatus()==200){
		String output=response.getEntity(String.class);
		System.out.println("=======================Get Employees=====================");
		System.out.println(output);
		System.out.println("=======================Get Employees=====================");
	}
	
}	
	
public static void main(String [] args){
	RestWithJerseyClient restWithJerseyClient=new RestWithJerseyClient();
	restWithJerseyClient.getEmployees();
	
}
	

}
