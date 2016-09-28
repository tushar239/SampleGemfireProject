package pivotal.gemfire.compression;

import com.gemstone.gemfire.distributed.ServerLauncher;

/**
 * @author Tushar Chokshi @ 10/9/15.
 */
public class StartMember
{
    public static void main(String[] args){
        ServerLauncher serverLauncher  = new ServerLauncher.Builder()
                .setMemberName("server1")
                .set("locators","my-localhost[10334]")
                .set("cache-xml-file", "cache.xml")
                .set("log-level", "info")
                .setWorkingDirectory("/Users/chokst/Desktop/Books/Gemfire/gemfire/8.2.0/my_gemfire")
                .build();

        System.out.println("Attempting to start cache server");

        serverLauncher.start();

        System.out.println("Cache server successfully started");
    }
}
