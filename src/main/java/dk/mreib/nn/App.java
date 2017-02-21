package dk.mreib.nn;

import org.tensorflow.TensorFlow;
/**
 * Hello world!
 *
 */
public class App 
{

    static {
        try {

            //System.setProperty("java.library.path", System.getProperty("java.library.path")+":"+"/work/source/git/sharesnn/so"+":"+"/usr/lib/nvidia-367");
            System.out.println(System.getProperty("java.library.path"));
            System.out.println(System.mapLibraryName("tensorflow_jni"));
            System.load("/usr/lib/nvidia-367/libnvidia-fatbinaryloader.so.367.57");
            //System.loadLibrary("tensorflow_jni");
            System.load("/work/source/git/sharesnn/so/"+System.mapLibraryName("tensorflow_jni"));





        } catch (UnsatisfiedLinkError e) {
            System.err.println("Native code library failed to load.\n" + e);
            System.exit(1);
        }
    }

    public static void main(String argv[])
    {
        System.out.println("I'm using TensorFlow version: " +  TensorFlow.version());
    }

}
