package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.DexLoader;
import java.lang.reflect.Field;

public class CookieSyncManager
{
  private static android.webkit.CookieSyncManager a;
  private static CookieSyncManager b;
  private static boolean c = false;

  private CookieSyncManager(Context paramContext)
  {
    AppMethodBeat.i(63889);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_createInstance", new Class[] { Context.class }, new Object[] { paramContext });
      c = true;
    }
    AppMethodBeat.o(63889);
  }

  public static CookieSyncManager createInstance(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(63887);
      a = android.webkit.CookieSyncManager.createInstance(paramContext);
      if ((b == null) || (!c))
      {
        CookieSyncManager localCookieSyncManager = new com/tencent/smtt/sdk/CookieSyncManager;
        localCookieSyncManager.<init>(paramContext.getApplicationContext());
        b = localCookieSyncManager;
      }
      paramContext = b;
      AppMethodBeat.o(63887);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  public static CookieSyncManager getInstance()
  {
    try
    {
      AppMethodBeat.i(63888);
      if (b == null)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("CookieSyncManager::createInstance() needs to be called before CookieSyncManager::getInstance()");
        AppMethodBeat.o(63888);
        throw localIllegalStateException;
      }
    }
    finally
    {
    }
    CookieSyncManager localCookieSyncManager = b;
    AppMethodBeat.o(63888);
    return localCookieSyncManager;
  }

  public void startSync()
  {
    AppMethodBeat.i(63892);
    Object localObject = bv.a();
    if ((localObject != null) && (((bv)localObject).b()))
    {
      ((bv)localObject).c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_startSync", new Class[0], new Object[0]);
      AppMethodBeat.o(63892);
    }
    while (true)
    {
      return;
      a.startSync();
      try
      {
        localObject = Class.forName("android.webkit.WebSyncManager").getDeclaredField("mSyncThread");
        ((Field)localObject).setAccessible(true);
        Thread localThread = (Thread)((Field)localObject).get(a);
        localObject = new com/tencent/smtt/sdk/p;
        ((p)localObject).<init>();
        localThread.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject);
        AppMethodBeat.o(63892);
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(63892);
      }
    }
  }

  public void stopSync()
  {
    AppMethodBeat.i(63891);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_stopSync", new Class[0], new Object[0]);
      AppMethodBeat.o(63891);
    }
    while (true)
    {
      return;
      a.stopSync();
      AppMethodBeat.o(63891);
    }
  }

  public void sync()
  {
    AppMethodBeat.i(63890);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_Sync", new Class[0], new Object[0]);
      AppMethodBeat.o(63890);
    }
    while (true)
    {
      return;
      a.sync();
      AppMethodBeat.o(63890);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.CookieSyncManager
 * JD-Core Version:    0.6.2
 */