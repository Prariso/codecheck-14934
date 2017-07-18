package codecheck;
import java.io.*;

public class App {
	public static void main(String[] args) throws IOException  {
		for (int i = 0, l = args.length; i < l; i++) {
			System.out.println(args[i]);
            
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("なんか入力してください。");
            String s = new String(in.readLine());
            System.out.println("入力値は「" + s + "」です。");
		}
	}
}
