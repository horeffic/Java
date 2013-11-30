import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: yldo
 * Date: 11/30/13
 * Time: 3:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestA {
    public static void main(String[] args) throws IOException {
        String socketInput = null;

        Map<String, String> map = new HashMap<String, String>();
        map.put("dog","собака");

        Random random = new Random();
        int chance = random.nextInt(map.size())+1;

        String key ="";
        String value = "123";


        ServerSocket serverSocket = new ServerSocket();
        InetAddress inetAddress = InetAddress.getByName("192.168.1.132");
        SocketAddress socketAddress = new InetSocketAddress(inetAddress, 7777);
        serverSocket.bind(socketAddress);
        Socket socket = serverSocket.accept();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write(value);
        bufferedWriter.newLine();
        bufferedWriter.flush();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        socketInput = bufferedReader.readLine();
        System.out.println(socketInput);

        if (key == value) {
            bufferedWriter.write("nice");
        } else {
            bufferedWriter.write("wrong");
        }
        bufferedWriter.flush();
        bufferedWriter.flush();
        socket.close();
    }
}
