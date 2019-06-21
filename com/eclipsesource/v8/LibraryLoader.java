package com.eclipsesource.v8;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

class LibraryLoader
{
  static final String DELIMITER;
  static final String SEPARATOR;
  static final String SWT_LIB_DIR = ".j2v8";

  static
  {
    AppMethodBeat.i(74962);
    DELIMITER = System.getProperty("line.separator");
    SEPARATOR = System.getProperty("file.separator");
    AppMethodBeat.o(74962);
  }

  static void chmod(String paramString1, String paramString2)
  {
    AppMethodBeat.i(74952);
    if (isWindows())
      AppMethodBeat.o(74952);
    while (true)
    {
      return;
      try
      {
        Runtime.getRuntime().exec(new String[] { "chmod", paramString1, paramString2 }).waitFor();
        AppMethodBeat.o(74952);
      }
      catch (Throwable paramString1)
      {
        AppMethodBeat.o(74952);
      }
    }
  }

  private static String computeLibraryFullName()
  {
    AppMethodBeat.i(74948);
    String str = "lib" + computeLibraryShortName() + "." + getOSFileExtension();
    AppMethodBeat.o(74948);
    return str;
  }

  private static String computeLibraryShortName()
  {
    AppMethodBeat.i(74947);
    String str1 = getOS();
    String str2 = getArchSuffix();
    str1 = "j2v8" + "_" + str1 + "_" + str2;
    AppMethodBeat.o(74947);
    return str1;
  }

  static boolean extract(String paramString1, String paramString2, StringBuffer paramStringBuffer)
  {
    boolean bool1 = true;
    int i = 1;
    AppMethodBeat.i(74951);
    File localFile = new File(paramString1);
    try
    {
      if (localFile.exists())
        localFile.delete();
      paramString2 = LibraryLoader.class.getResourceAsStream("/".concat(String.valueOf(paramString2)));
      if (paramString2 == null);
    }
    catch (Throwable paramString1)
    {
      try
      {
        byte[] arrayOfByte = new byte[4096];
        FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
        localFileOutputStream.<init>(paramString1);
        try
        {
          while (true)
          {
            int j = paramString2.read(arrayOfByte);
            if (j == -1)
              break;
            localFileOutputStream.write(arrayOfByte, 0, j);
          }
        }
        catch (Throwable paramString1)
        {
          paramString1 = localFileOutputStream;
        }
        while (true)
        {
          if (paramString1 != null);
          try
          {
            paramString1.close();
            if (paramString2 == null);
          }
          catch (IOException paramString1)
          {
            try
            {
              paramString2.close();
              label118: if ((i != 0) && (localFile.exists()))
                localFile.delete();
              AppMethodBeat.o(74951);
              bool1 = false;
              while (true)
              {
                return bool1;
                localFileOutputStream.close();
                paramString2.close();
                chmod("755", paramString1);
                boolean bool2 = load(paramString1, paramStringBuffer);
                if (!bool2)
                  break;
                AppMethodBeat.o(74951);
              }
              paramString1 = paramString1;
            }
            catch (IOException paramString1)
            {
              break label118;
            }
          }
          paramString1 = paramString1;
          i = 0;
          paramString2 = null;
          paramString1 = null;
        }
      }
      catch (Throwable paramString1)
      {
        while (true)
          paramString1 = null;
      }
    }
  }

  static String getArchSuffix()
  {
    AppMethodBeat.i(74959);
    String str = System.getProperty("os.arch");
    if (str.equals("i686"))
    {
      str = "x86";
      AppMethodBeat.o(74959);
    }
    while (true)
    {
      return str;
      if (str.equals("amd64"))
      {
        str = "x86_64";
        AppMethodBeat.o(74959);
      }
      else if (str.equals("nacl"))
      {
        str = "armv7l";
        AppMethodBeat.o(74959);
      }
      else if (str.equals("aarch64"))
      {
        str = "armv7l";
        AppMethodBeat.o(74959);
      }
      else
      {
        AppMethodBeat.o(74959);
      }
    }
  }

  static String getOS()
  {
    AppMethodBeat.i(74961);
    if (isWindows())
    {
      localObject = "win32";
      AppMethodBeat.o(74961);
    }
    while (true)
    {
      return localObject;
      if (isMac())
      {
        localObject = "macosx";
        AppMethodBeat.o(74961);
      }
      else if ((isLinux()) && (!isAndroid()))
      {
        localObject = "linux";
        AppMethodBeat.o(74961);
      }
      else
      {
        if (!isAndroid())
          break;
        localObject = "android";
        AppMethodBeat.o(74961);
      }
    }
    Object localObject = new UnsatisfiedLinkError("Unsupported platform: " + getOsName());
    AppMethodBeat.o(74961);
    throw ((Throwable)localObject);
  }

  static String getOSFileExtension()
  {
    AppMethodBeat.i(74960);
    if (isWindows())
    {
      localObject = "dll";
      AppMethodBeat.o(74960);
    }
    while (true)
    {
      return localObject;
      if (isMac())
      {
        localObject = "dylib";
        AppMethodBeat.o(74960);
      }
      else if (isLinux())
      {
        localObject = "so";
        AppMethodBeat.o(74960);
      }
      else
      {
        if (!isNativeClient())
          break;
        localObject = "so";
        AppMethodBeat.o(74960);
      }
    }
    Object localObject = new UnsatisfiedLinkError("Unsupported platform: " + getOsName());
    AppMethodBeat.o(74960);
    throw ((Throwable)localObject);
  }

  static String getOsName()
  {
    AppMethodBeat.i(74953);
    String str = System.getProperty("os.name") + System.getProperty("java.specification.vendor");
    AppMethodBeat.o(74953);
    return str;
  }

  static boolean isAndroid()
  {
    AppMethodBeat.i(74958);
    boolean bool = getOsName().contains("Android");
    AppMethodBeat.o(74958);
    return bool;
  }

  static boolean isLinux()
  {
    AppMethodBeat.i(74956);
    boolean bool = getOsName().startsWith("Linux");
    AppMethodBeat.o(74956);
    return bool;
  }

  static boolean isMac()
  {
    AppMethodBeat.i(74955);
    boolean bool = getOsName().startsWith("Mac");
    AppMethodBeat.o(74955);
    return bool;
  }

  static boolean isNativeClient()
  {
    AppMethodBeat.i(74957);
    boolean bool = getOsName().startsWith("nacl");
    AppMethodBeat.o(74957);
    return bool;
  }

  static boolean isWindows()
  {
    AppMethodBeat.i(74954);
    boolean bool = getOsName().startsWith("Windows");
    AppMethodBeat.o(74954);
    return bool;
  }

  static boolean load(String paramString, StringBuffer paramStringBuffer)
  {
    AppMethodBeat.i(74950);
    try
    {
      if (paramString.indexOf(SEPARATOR) != -1)
        System.load(paramString);
      while (true)
      {
        bool = true;
        AppMethodBeat.o(74950);
        return bool;
        System.loadLibrary(paramString);
      }
    }
    catch (UnsatisfiedLinkError paramString)
    {
      while (true)
      {
        if (paramStringBuffer.length() == 0)
          paramStringBuffer.append(DELIMITER);
        paramStringBuffer.append('\t');
        paramStringBuffer.append(paramString.getMessage());
        paramStringBuffer.append(DELIMITER);
        boolean bool = false;
        AppMethodBeat.o(74950);
      }
    }
  }

  static void loadLibrary(String paramString)
  {
    AppMethodBeat.i(74949);
    if (isAndroid())
    {
      System.loadLibrary("j2v8");
      AppMethodBeat.o(74949);
    }
    StringBuffer localStringBuffer;
    while (true)
    {
      return;
      localStringBuffer = new StringBuffer();
      String str1 = computeLibraryShortName();
      String str2 = computeLibraryFullName();
      String str3 = System.getProperty("user.dir") + SEPARATOR + "jni" + SEPARATOR + computeLibraryFullName();
      if (load(str2, localStringBuffer))
      {
        AppMethodBeat.o(74949);
      }
      else if (load(str1, localStringBuffer))
      {
        AppMethodBeat.o(74949);
      }
      else if ((new File(str3).exists()) && (load(str3, localStringBuffer)))
      {
        AppMethodBeat.o(74949);
      }
      else
      {
        str1 = paramString;
        if (paramString == null)
          str1 = System.getProperty("java.io.tmpdir");
        if (!extract(str1 + SEPARATOR + str2, str2, localStringBuffer))
          break;
        AppMethodBeat.o(74949);
      }
    }
    paramString = new UnsatisfiedLinkError("Could not load J2V8 library. Reasons: " + localStringBuffer.toString());
    AppMethodBeat.o(74949);
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.LibraryLoader
 * JD-Core Version:    0.6.2
 */