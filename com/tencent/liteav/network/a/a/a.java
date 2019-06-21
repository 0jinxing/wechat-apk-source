package com.tencent.liteav.network.a.a;

import com.tencent.liteav.network.a.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.Reader;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class a
{
  public static InetAddress[] a()
  {
    AppMethodBeat.i(67635);
    Object localObject2;
    try
    {
      Object localObject1 = Runtime.getRuntime().exec("getprop").getInputStream();
      LineNumberReader localLineNumberReader = new java/io/LineNumberReader;
      localObject2 = new java/io/InputStreamReader;
      ((InputStreamReader)localObject2).<init>((InputStream)localObject1);
      localLineNumberReader.<init>((Reader)localObject2);
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>(5);
      while (true)
      {
        Object localObject3 = localLineNumberReader.readLine();
        if (localObject3 == null)
          break;
        int i = ((String)localObject3).indexOf("]: [");
        if (i != -1)
        {
          localObject1 = ((String)localObject3).substring(1, i);
          localObject3 = ((String)localObject3).substring(i + 4, ((String)localObject3).length() - 1);
          if ((((String)localObject1).endsWith(".dns")) || (((String)localObject1).endsWith(".dns1")) || (((String)localObject1).endsWith(".dns2")) || (((String)localObject1).endsWith(".dns3")) || (((String)localObject1).endsWith(".dns4")))
          {
            localObject3 = InetAddress.getByName((String)localObject3);
            if (localObject3 != null)
            {
              localObject1 = ((InetAddress)localObject3).getHostAddress();
              if ((localObject1 != null) && (((String)localObject1).length() != 0))
                ((ArrayList)localObject2).add(localObject3);
            }
          }
        }
      }
    }
    catch (IOException localIOException)
    {
      Logger.getLogger("AndroidDnsServer").log(Level.WARNING, "Exception in findDNSByExec", localIOException);
    }
    InetAddress[] arrayOfInetAddress = null;
    AppMethodBeat.o(67635);
    while (true)
    {
      return arrayOfInetAddress;
      if (((ArrayList)localObject2).size() <= 0)
        break;
      arrayOfInetAddress = (InetAddress[])((ArrayList)localObject2).toArray(new InetAddress[((ArrayList)localObject2).size()]);
      AppMethodBeat.o(67635);
    }
  }

  public static InetAddress[] b()
  {
    AppMethodBeat.i(67636);
    try
    {
      Object localObject1 = Class.forName("android.os.SystemProperties").getMethod("get", new Class[] { String.class });
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(5);
      for (int i = 0; i < 4; i++)
      {
        Object localObject3 = (String)((Method)localObject1).invoke(null, new Object[] { new String[] { "net.dns1", "net.dns2", "net.dns3", "net.dns4" }[i] });
        if ((localObject3 != null) && (((String)localObject3).length() != 0))
        {
          localObject3 = InetAddress.getByName((String)localObject3);
          if (localObject3 != null)
          {
            String str = ((InetAddress)localObject3).getHostAddress();
            if ((str != null) && (str.length() != 0) && (!localArrayList.contains(localObject3)))
              localArrayList.add(localObject3);
          }
        }
      }
      if (localArrayList.size() > 0)
      {
        localObject1 = (InetAddress[])localArrayList.toArray(new InetAddress[localArrayList.size()]);
        AppMethodBeat.o(67636);
        return localObject1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Logger.getLogger("AndroidDnsServer").log(Level.WARNING, "Exception in findDNSByReflection", localException);
        AppMethodBeat.o(67636);
        Object localObject2 = null;
      }
    }
  }

  public static c c()
  {
    AppMethodBeat.i(67637);
    a.1 local1 = new a.1();
    AppMethodBeat.o(67637);
    return local1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.a.a.a
 * JD-Core Version:    0.6.2
 */