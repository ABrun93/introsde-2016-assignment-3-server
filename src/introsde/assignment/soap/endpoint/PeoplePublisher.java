package introsde.assignment.soap.endpoint;

import introsde.assignment.soap.webservice.PeopleImplementation;

import javax.xml.ws.Endpoint;

public class PeoplePublisher {
    public static String SERVER_URL = "http://localhost";
    public static String PORT = "6903";
    public static String BASE_URL = "/ws/people";

    public static String getEndpointURL() {
        return SERVER_URL+":"+PORT+BASE_URL;
    }

    public static void main(String[] args) {
        String endpointUrl = getEndpointURL();
        System.out.println("Starting People Service...");
        System.out.println("--> Published at = "+endpointUrl);
        Endpoint.publish(endpointUrl, new PeopleImplementation());
    }
}
