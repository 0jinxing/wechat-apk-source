package com.tencent.pb.common.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.pb.common.c.c;
import com.tencent.pb.common.c.d;

public final class h
{
  public static boolean Amm = true;
  private static long Amn = -1L;
  public static h.a Amo = h.a.Amq;
  private static h.a Amp = h.a.Amq;

  private static NetworkInfo dPy()
  {
    Object localObject1 = null;
    while (true)
    {
      NetworkInfo localNetworkInfo;
      try
      {
        Object localObject2 = (ConnectivityManager)d.sZj.getSystemService("connectivity");
        if (localObject2 == null)
        {
          c.w("getSystemService(Context.CONNECTIVITY_SERVICE) null", new Object[0]);
          localObject2 = localObject1;
          return localObject2;
        }
      }
      catch (Exception localException)
      {
        localNetworkInfo = null;
        continue;
      }
      try
      {
        localNetworkInfo = localNetworkInfo.getActiveNetworkInfo();
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          c.w("getActiveNetworkInfo exception:", new Object[] { localThrowable });
          Object localObject3 = null;
        }
      }
    }
  }

  public static boolean isNetworkConnected()
  {
    try
    {
      NetworkInfo localNetworkInfo = dPy();
      if (localNetworkInfo == null);
      for (bool = false; ; bool = localNetworkInfo.isConnected())
        return bool;
    }
    catch (Exception localException)
    {
      while (true)
        boolean bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.h
 * JD-Core Version:    0.6.2
 */