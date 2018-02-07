# JAVA RMI

Develop a simple, RMI-based server (CatServer), which will allow a client to read a text-file line by line. i.e. the server provides the following methods:

public boolean openFile(String filename) Opens a file, returns true if file is successfully opened, false otherwise.
public String nextLine() Reads and returns the next line from the file. Returns null if end-of-file is reached or if no file has been opened.
public boolean closeFile() Close the file which is currently open. Returns true if the file is successfully closed, false otherwise.
Develop a client (CatClient), which can connect to the server. The client works like a "remote cat", i.e. it requests a file to be opened by the server and reads the file line-by-line (through nextLine()).