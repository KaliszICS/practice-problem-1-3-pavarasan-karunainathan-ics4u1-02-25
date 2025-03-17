import java.io.FileReader;
import java.io.IOException;

public class PracticeProblem {
	static String readFile(String filename){
		FileReader inputStream = null;
		try{
			inputStream = new FileReader(filename);
			String str = "";
			char c = '\0';
			while((c = (char)inputStream.read()) != (char)-1){
				str += c;
			}
			inputStream.close();
			return str;
		}catch(IOException e){
			try{
				if(inputStream != null){
					inputStream.close();
				}
			}catch(IOException e1){
				System.out.println(e1);
			}
			System.out.println(e);
		}
		return "";
	}

	static String backwardsReadFile(String filename){
		FileReader inputStream = null;
		try{
			inputStream = new FileReader(filename);
			String str = "";
			char c = '\0';
			while((c = (char)inputStream.read()) != (char)-1){
				str += c;
			}
			inputStream.close();
			String reversed = "";
			for(int i = str.length()-1; i > -1; --i){
				reversed += str.charAt(i);
			}
			return reversed;
		}catch(IOException e){
			try{
				if(inputStream != null){
					inputStream.close();
				}
			}catch(IOException e1){
				System.out.println(e1);
			}
			System.out.println(e);
		}
		return "";
	}

	public static void main(String args[]){}
}
