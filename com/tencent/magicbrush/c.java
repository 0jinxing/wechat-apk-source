package com.tencent.magicbrush;

import android.os.SystemClock;
import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

public class c
{
  private static String bSy = "";
  private static String bSz = null;

  public static long az(long paramLong)
  {
    AppMethodBeat.i(115853);
    long l = SystemClock.elapsedRealtime();
    AppMethodBeat.o(115853);
    return l - paramLong;
  }

  public static void b(Closeable paramCloseable)
  {
    AppMethodBeat.i(115849);
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      AppMethodBeat.o(115849);
      return;
    }
    catch (IOException paramCloseable)
    {
      while (true)
        AppMethodBeat.o(115849);
    }
  }

  public static boolean isNullOrNil(String paramString)
  {
    AppMethodBeat.i(115850);
    boolean bool;
    if ((paramString == null) || ("".equals(paramString)))
    {
      bool = true;
      AppMethodBeat.o(115850);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(115850);
    }
  }

  public static void loadLibrary(String paramString)
  {
    AppMethodBeat.i(115851);
    String str = null;
    if (bSz != null)
      str = bSz + "/lib" + paramString + ".so";
    if ((str != null) && (new File(str).exists()))
      c.c.d("MagicBrush.Utils", "System.load(%s)", new Object[] { str });
    while (true)
    {
      try
      {
        paramString = c.class.getClassLoader();
        Runtime localRuntime = Runtime.getRuntime();
        Method localMethod = localRuntime.getClass().getDeclaredMethod("load", new Class[] { String.class, ClassLoader.class });
        localMethod.setAccessible(true);
        localMethod.invoke(localRuntime, new Object[] { str, paramString });
        AppMethodBeat.o(115851);
        return;
      }
      catch (Exception paramString)
      {
        c.c.e("MagicBrush.Utils", "loadLibrary Exception", new Object[] { paramString });
        AppMethodBeat.o(115851);
        continue;
      }
      c.c.d("MagicBrush.Utils", "System.loadLibrary(%s)", new Object[] { paramString });
      System.loadLibrary(paramString);
      AppMethodBeat.o(115851);
    }
  }

  public static long yz()
  {
    AppMethodBeat.i(115852);
    long l = SystemClock.elapsedRealtime();
    AppMethodBeat.o(115852);
    return l;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.c
 * JD-Core Version:    0.6.2
 */