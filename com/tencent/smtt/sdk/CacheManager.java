package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.r;
import java.io.File;
import java.io.InputStream;
import java.util.Map;

public final class CacheManager
{
  @Deprecated
  public static boolean cacheDisabled()
  {
    AppMethodBeat.i(63859);
    Object localObject = bv.a();
    boolean bool;
    if ((localObject != null) && (((bv)localObject).b()))
    {
      bool = ((Boolean)((bv)localObject).c().c()).booleanValue();
      AppMethodBeat.o(63859);
    }
    while (true)
    {
      return bool;
      localObject = r.a("android.webkit.CacheManager", "cacheDisabled");
      if (localObject == null)
      {
        bool = false;
        AppMethodBeat.o(63859);
      }
      else
      {
        bool = ((Boolean)localObject).booleanValue();
        AppMethodBeat.o(63859);
      }
    }
  }

  public static InputStream getCacheFile(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(63861);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      paramString = localbv.c().a(paramString, paramBoolean);
      AppMethodBeat.o(63861);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(63861);
    }
  }

  public static Object getCacheFile(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(63860);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      paramString = localbv.c().g();
      AppMethodBeat.o(63860);
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = r.a(Class.forName("android.webkit.CacheManager"), "getCacheFile", new Class[] { String.class, Map.class }, new Object[] { paramString, paramMap });
        AppMethodBeat.o(63860);
      }
      catch (Exception paramString)
      {
        paramString = null;
        AppMethodBeat.o(63860);
      }
    }
  }

  @Deprecated
  public static File getCacheFileBaseDir()
  {
    AppMethodBeat.i(63858);
    Object localObject = bv.a();
    if ((localObject != null) && (((bv)localObject).b()))
    {
      localObject = (File)((bv)localObject).c().g();
      AppMethodBeat.o(63858);
    }
    while (true)
    {
      return localObject;
      localObject = (File)r.a("android.webkit.CacheManager", "getCacheFileBaseDir");
      AppMethodBeat.o(63858);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.CacheManager
 * JD-Core Version:    0.6.2
 */