package ExceptionHandling;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

public class ByteBufferrr {
    public static void main(String[] args) throws IOException {
        Pipe pipe = Pipe.open();
        Pipe.SinkChannel sinkChannel = pipe.sink();
        String str = "JAVA LPU Exception";
        ByteBuffer bb = ByteBuffer.allocate(1024);
        bb.clear();
        bb.put(str.getBytes());
        bb.flip();
        while (bb.hasRemaining()){
            sinkChannel.write(bb);
        }

        Pipe.SourceChannel sourceChannel = pipe.source();
        bb = ByteBuffer.allocate(512);
        while (sourceChannel.read(bb)>0){
            bb.flip();
            while (bb.hasRemaining()){
                char sc = (char) bb.get();
                System.out.print(sc);
            }
        }
    }
}
