package com.xiaobu.socket;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2019/3/28 14:23
 * @description V1.0
 */
public class Client {
    NetDataTypeTransform mNetDataTypeTransform = new NetDataTypeTransform();
    private static final String IP = "172.18.9.166";
    private static final int NetPort = 9004;
    private Socket sock;

    public Client() {
        try {
            onCreate();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void onCreate() throws IOException {
        InetSocketAddress addr = new InetSocketAddress(IP, NetPort); //创建socket
        sock = new Socket();
        sock.connect(addr);//连接服务器
        System.out.println("服务器连接成功......");
        byte[] receive = new byte[1024];
        sock.getInputStream().read(receive);
        // byte[] receive = toByteArray(sock.getInputStream());
        String tempString = mNetDataTypeTransform.ByteArraytoString(receive, receive.length);
        System.out.println("  Server said:send your " + tempString);
        if (tempString.equals("Password")) {
            System.out.println("I can send password 123\0!");
        }
        String password = "123\0";//注意，别忘了‘\0’
        sock.getOutputStream().write(mNetDataTypeTransform.StringToByteArray(password));
        byte[] isOk = new byte[4];
        sock.getInputStream().read(isOk);
        String okString = mNetDataTypeTransform.ByteArraytoString(isOk, isOk.length);
        System.out.println("  ----- is ok?--" + okString);
        if (okString.equals("OK")) {
            System.out.println("new Thread begin...");
            NetDataCommand commd = new NetDataCommand(1, "E:\0");
            sock.getOutputStream().write(commd.getByteArrayData());
            ThreadRead mThreadRead = new ThreadRead(sock, this);
            mThreadRead.start();//启动监听线程。
        }
        //////////////////////////////////////////////////////////////
    /*    try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        new Client();
    }

    public void GetDriverPro(Socket mSocket, NetDataCommand mCommand) {
        System.out.println("command ID=" + mCommand.getID() + "--" + "command Lparam=" + mCommand.getLparam());
        NetDataCommand commd = new NetDataCommand(2, mCommand.getLparam() + "\\\0");
        try {
            mSocket.getOutputStream().write(commd.getByteArrayData());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void GetDirInfoPro(Socket mSocket, NetDataCommand mCommand) {
        System.out.println("command ID=" + mCommand.getID() + "command Lparam=" + mCommand.getLparam());
    }

    public void ExecFilePro(Socket mSocket, NetDataCommand mCommand) {
        System.out.println("command ID=" + mCommand.getID() + "command Lparam=" + mCommand.getLparam());
    }

    public void DelFilePro(Socket mSocket, NetDataCommand mCommand) {
        System.out.println("command ID=" + mCommand.getID() + "command Lparam=" + mCommand.getLparam());

    }

    public void FileInfoPro(Socket mSocket, NetDataCommand mCommand) {
        System.out.println("command ID=" + mCommand.getID() + "command Lparam=" + mCommand.getLparam());
    }

    public void CreateDirPro(Socket mSocket, NetDataCommand mCommand) {
        System.out.println("command ID=" + mCommand.getID() + "command Lparam=" + mCommand.getLparam());
    }

    public void GetFilePro(Socket mSocket, NetDataCommand mCommand) {
        System.out.println("command ID=" + mCommand.getID() + "command Lparam=" + mCommand.getLparam());
    }

    public void PutFilePro(Socket mSocket, NetDataCommand mCommand) {
        System.out.println("command ID=" + mCommand.getID() + "command Lparam=" + mCommand.getLparam());
    }

    public void GetScreenPro(Socket mSocket, NetDataCommand mCommand) {
        System.out.println("command ID=" + mCommand.getID() + "command Lparam=" + mCommand.getLparam());

    }


    public static byte[] toByteArray(InputStream input) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int n = 0;
        while (-1 != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
        }
        return output.toByteArray();
    }
}
