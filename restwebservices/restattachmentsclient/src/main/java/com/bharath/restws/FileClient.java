package com.bharath.restws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.ContentDisposition;

public class FileClient {

	public static void main(String[] args) throws FileNotFoundException {

		WebClient client = WebClient.create("http://localhost:8080/restattachments/services/fileService/upload");
		client.type("multipart/form-data");
		ContentDisposition cd = new ContentDisposition("attachement;filename=MAVEN.JPG");

		Attachment attachement = new Attachment("root",
				new FileInputStream(new File("/Users/bharaththippireddy/Documents/Images/MAVEN.JPG")), cd);

		client.post(attachement);

	}

}
