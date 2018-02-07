    import java.rmi.*;  
    import java.rmi.server.*; 
    import java.io.*;
    import java.util.*; 
    public class AdderRemote extends UnicastRemoteObject implements Adder{  
    AdderRemote()throws RemoteException{  
    super();  
    }  
    public String add(String x){
	String dest="";
        String FILENAME = x;
	BufferedReader br = null;
		FileReader fr = null;

		try {

			//br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				dest+=sCurrentLine;
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
	return dest;}  
    }  
