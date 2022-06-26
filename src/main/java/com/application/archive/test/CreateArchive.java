package com.application.archive.test;

import java.io.File;
import java.io.IOException;

import com.application.archive.ArchiveFormat;
import com.application.archive.Archiver;
import com.application.archive.ArchiverFactory;

public class CreateArchive {

	public static void main(String[] args) {
		
		// Hardcoded for candidate testing purposes
		String archiveName = "test2";
		File destination = new File("destination");		
		File source = new File("testZipExtracted");
		Archiver archiver = ArchiverFactory.createArchiver(ArchiveFormat.ZIP);
		try {
			if(destination.canWrite()) {
				File archive = archiver.create(archiveName, destination, source);
			}else{
				throw new IllegalArgumentException("The folder is not writable please check the permissions");
			}
			System.out.println("Done.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
