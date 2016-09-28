package pivotal.gemfire.compression;

import com.gemstone.gemfire.distributed.LocatorLauncher;

import java.util.concurrent.TimeUnit;

// http://theblasfrompas.blogspot.com/2014/09/pivotal-gemfire-8-starting-locator.html
// Set up Env variable as "/Users/chokst/Desktop/Books/Gemfire/gemfire/my_gemfire". It is a location where you want to create locator and servers.

public class StartLocator
{
    public static void main(String[] args)
    {
        LocatorLauncher locatorLauncher  = new LocatorLauncher.Builder()
                .set("jmx-manager", "true")
                .set("jmx-manager-start", "true")
                .set("jmx-manager-http-port", "8083")
                .set("jmx-manager-ssl", "false")
                .setMemberName("my-locator")
                .setPort(10334)
                .setBindAddress("localhost")
                .setWorkingDirectory("/Users/chokst/Desktop/Books/Gemfire/gemfire/8.2.0/my_gemfire")
                .build();

        System.out.println("Attempting to start Locator");

        locatorLauncher.start();

        locatorLauncher.waitOnStatusResponse(30, 5, TimeUnit.SECONDS);

        System.out.println("Locator successfully started");
    }

}