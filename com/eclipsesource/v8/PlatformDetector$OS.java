package com.eclipsesource.v8;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class PlatformDetector$OS
{
  public static String getLibFileExtension()
  {
    AppMethodBeat.i(75012);
    if (isWindows())
    {
      localObject = "dll";
      AppMethodBeat.o(75012);
    }
    while (true)
    {
      return localObject;
      if (isMac())
      {
        localObject = "dylib";
        AppMethodBeat.o(75012);
      }
      else
      {
        if ((!isLinux()) && (!isAndroid()) && (!isNativeClient()))
          break;
        localObject = "so";
        AppMethodBeat.o(75012);
      }
    }
    Object localObject = new UnsatisfiedLinkError("Unsupported platform library-extension for: " + getName());
    AppMethodBeat.o(75012);
    throw ((Throwable)localObject);
  }

  public static String getName()
  {
    AppMethodBeat.i(75006);
    String str1 = System.getProperty("os.name");
    Object localObject = PlatformDetector.access$100(str1);
    String str2 = System.getProperty("java.specification.vendor");
    if ((PlatformDetector.access$200(str2).contains("android")) || (((String)localObject).contains("android")))
    {
      localObject = "android";
      AppMethodBeat.o(75006);
    }
    while (true)
    {
      return localObject;
      if (((String)localObject).equals("unknown"))
      {
        localObject = new UnsatisfiedLinkError("Unsupported platform/vendor: " + str1 + " / " + str2);
        AppMethodBeat.o(75006);
        throw ((Throwable)localObject);
      }
      AppMethodBeat.o(75006);
    }
  }

  public static boolean isAndroid()
  {
    AppMethodBeat.i(75011);
    boolean bool = getName().equals("android");
    AppMethodBeat.o(75011);
    return bool;
  }

  public static boolean isLinux()
  {
    AppMethodBeat.i(75009);
    boolean bool = getName().equals("linux");
    AppMethodBeat.o(75009);
    return bool;
  }

  public static boolean isMac()
  {
    AppMethodBeat.i(75008);
    boolean bool = getName().equals("macosx");
    AppMethodBeat.o(75008);
    return bool;
  }

  public static boolean isNativeClient()
  {
    AppMethodBeat.i(75010);
    boolean bool = getName().equals("nacl");
    AppMethodBeat.o(75010);
    return bool;
  }

  public static boolean isWindows()
  {
    AppMethodBeat.i(75007);
    boolean bool = getName().equals("windows");
    AppMethodBeat.o(75007);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.PlatformDetector.OS
 * JD-Core Version:    0.6.2
 */