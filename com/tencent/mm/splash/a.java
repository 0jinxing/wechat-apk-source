package com.tencent.mm.splash;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.system.OsConstants;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

public final class a
{
  private static String xGs;
  private static String xGt;
  private static File xGu;
  private static long xGv;

  @SuppressLint({"HandlerLeak"})
  private static Handler xGw;

  static
  {
    AppMethodBeat.i(114812);
    xGw = new Handler(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(114794);
        paramAnonymousMessage = (a.a)paramAnonymousMessage.obj;
        if (a.access$000())
          if (a.mC(a.xGv))
          {
            if (!a.hc(h.xGE))
            {
              h.drh().m(675L, 25L, 1L);
              paramAnonymousMessage.dqV();
              AppMethodBeat.o(114794);
              return;
            }
            if (!a.eB(h.xGE))
              h.drh().m(675L, 18L, 1L);
            h.drh().m(675L, 17L, 1L);
            paramAnonymousMessage.dqW();
          }
        while (true)
        {
          a.dqU();
          AppMethodBeat.o(114794);
          break;
          a.c(paramAnonymousMessage);
          AppMethodBeat.o(114794);
          break;
          if (!a.dfx())
          {
            h.drh().m(675L, 15L, 1L);
            paramAnonymousMessage.dqV();
          }
          else if (!a.hc(h.xGE))
          {
            h.drh().m(675L, 26L, 1L);
            h.drh().m(675L, 15L, 1L);
            paramAnonymousMessage.dqV();
          }
          else
          {
            h.drh().m(675L, 16L, 1L);
            paramAnonymousMessage.cmC();
          }
        }
      }
    };
    AppMethodBeat.o(114812);
  }

  public static void a(a parama)
  {
    AppMethodBeat.i(114803);
    b(parama);
    AppMethodBeat.o(114803);
  }

  private static void anZ(String paramString)
  {
    try
    {
      AppMethodBeat.i(114800);
      String str = dqR();
      Object localObject = new java/io/File;
      ((File)localObject).<init>(str);
      if (!((File)localObject).exists())
        ((File)localObject).mkdirs();
      File localFile = new java/io/File;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localFile.<init>(str + "/" + paramString);
      if (localFile.exists())
        localFile.delete();
      localFile.createNewFile();
      xGu = localFile;
      AppMethodBeat.o(114800);
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  private static void b(a parama)
  {
    AppMethodBeat.i(114804);
    if (xGv == 0L)
      xGv = System.currentTimeMillis();
    Message localMessage = Message.obtain();
    localMessage.what = 0;
    localMessage.obj = parama;
    xGw.sendMessageDelayed(localMessage, 100L);
    AppMethodBeat.o(114804);
  }

  public static String dqR()
  {
    AppMethodBeat.i(114796);
    if (xGs == null)
    {
      localObject = new IllegalStateException("data directory should not be null, give one.");
      AppMethodBeat.o(114796);
      throw ((Throwable)localObject);
    }
    Object localObject = new File(xGs);
    if ((!((File)localObject).exists()) && (!((File)localObject).mkdirs()))
      h.g("WxSplash.DexOpt", "data directory create failed.", new Object[0]);
    localObject = xGs;
    AppMethodBeat.o(114796);
    return localObject;
  }

  private static boolean dqS()
  {
    AppMethodBeat.i(114805);
    if (xGu == null)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("tmp file field should not be null");
      AppMethodBeat.o(114805);
      throw localIllegalStateException;
    }
    boolean bool = xGu.exists();
    AppMethodBeat.o(114805);
    return bool;
  }

  private static boolean dqT()
  {
    AppMethodBeat.i(114806);
    String str = dqR();
    boolean bool = new File(str + "/DexOpt_Failed").exists();
    AppMethodBeat.o(114806);
    return bool;
  }

  public static void h(Application paramApplication)
  {
    AppMethodBeat.i(114795);
    xGs = new File(paramApplication.getFilesDir(), "dexopt_service").getAbsolutePath();
    AppMethodBeat.o(114795);
  }

  public static boolean hc(Context paramContext)
  {
    AppMethodBeat.i(114797);
    boolean bool = h.xGH.ba(paramContext);
    h.g("WxSplash.DexOpt", "if need dexopt %s", new Object[] { Boolean.valueOf(bool) });
    AppMethodBeat.o(114797);
    return bool;
  }

  public static void hd(Context paramContext)
  {
    AppMethodBeat.i(114798);
    if (g.wY)
      AppMethodBeat.o(114798);
    while (true)
    {
      return;
      h.drh().m(675L, 22L, 1L);
      try
      {
        bool = h.xGH.aZ(paramContext);
        h.g("WxSplash.DexOpt", "install multidex result %s", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
        {
          h.g("WxSplash.DexOpt", "install multidex failed, kill self.", new Object[0]);
          h.bZk();
        }
        AppMethodBeat.o(114798);
      }
      catch (Throwable paramContext)
      {
        while (true)
        {
          h.a(paramContext, "multidex install failed");
          boolean bool = false;
        }
      }
    }
  }

  public static void he(Context paramContext)
  {
    AppMethodBeat.i(114799);
    h.g("WxSplash.DexOpt", "start dex opt service", new Object[0]);
    String str = bo.aw(paramContext, Process.myPid());
    str.replace(':', '_');
    xGt = "DexOpt_Request_".concat(String.valueOf(str));
    h.drh().m(675L, 14L, 1L);
    Object localObject;
    File localFile;
    int i;
    while (true)
    {
      try
      {
        anZ(xGt);
        paramContext.startService(new Intent(paramContext, DexOptService.class));
        AppMethodBeat.o(114799);
        return;
      }
      catch (Exception localException)
      {
        if (Build.VERSION.SDK_INT > 19)
          break label205;
      }
      if (localException.getClass().getCanonicalName().equals("libcore.io.ErrnoException"))
        try
        {
          localObject = localException.getClass().getField("errno");
          ((Field)localObject).setAccessible(true);
          if (((Integer)((Field)localObject).get(localException)).intValue() == OsConstants.ENOSPC)
          {
            localObject = dqR();
            localFile = new java/io/File;
            localFile.<init>((String)localObject);
            if (localFile.exists())
              break label221;
            i = 1;
            if (i == 0)
              break label268;
            h.xGH.bb(paramContext);
          }
        }
        catch (Exception paramContext)
        {
          h.g("WxSplash.DexOpt", "%s, %s", new Object[] { paramContext.getMessage() });
        }
    }
    while (true)
    {
      label205: paramContext = new RuntimeException(localException);
      AppMethodBeat.o(114799);
      throw paramContext;
      label221: i = localFile.listFiles().length;
      h.g("WxSplash.DexOpt", "check dexopt directory size %s.", new Object[] { Integer.valueOf(i) });
      if (i < 10000)
      {
        i = 1;
        break;
      }
      i = 0;
      break;
      label268: h.g("WxSplash.DexOpt", "check dexopt directory size not ok, clean it and throw exception.", new Object[0]);
      localObject = dqR();
      paramContext = new java/io/File;
      paramContext.<init>((String)localObject);
      if (paramContext.exists())
        e.u(paramContext);
    }
  }

  private static boolean hf(Context paramContext)
  {
    AppMethodBeat.i(114801);
    paramContext = (ActivityManager)paramContext.getSystemService("activity");
    boolean bool;
    if (paramContext != null)
    {
      paramContext = paramContext.getRunningServices(2147483647);
      if (paramContext == null)
      {
        h.g("WxSplash.DexOpt", "dexopt service may dead, get running services return null.", new Object[0]);
        AppMethodBeat.o(114801);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      paramContext = paramContext.iterator();
      while (true)
        if (paramContext.hasNext())
          if ("com.tencent.mm.splash.DexOptService".equals(((ActivityManager.RunningServiceInfo)paramContext.next()).service.getClassName()))
          {
            bool = true;
            AppMethodBeat.o(114801);
            break;
          }
      h.g("WxSplash.DexOpt", "dexopt service may dead", new Object[0]);
      AppMethodBeat.o(114801);
      bool = false;
    }
  }

  public static boolean hg(Context paramContext)
  {
    AppMethodBeat.i(114802);
    long l1 = 0L;
    long l2 = System.currentTimeMillis();
    h.g("WxSplash.DexOpt", "block checking dex opt result.", new Object[0]);
    boolean bool;
    while (true)
      if (dqS())
      {
        long l3 = l1 + 1L;
        Thread.sleep(100L);
        l1 = l3;
        if (l3 >= 5L)
        {
          l1 = 0L;
          if (System.currentTimeMillis() - l2 > 180000L)
          {
            h.g("WxSplash.DexOpt", "block checking dex opt timeout.", new Object[0]);
            if (!hc(paramContext))
            {
              h.drh().m(675L, 25L, 1L);
              h.drh().m(675L, 15L, 1L);
              AppMethodBeat.o(114802);
              bool = true;
            }
          }
        }
      }
    while (true)
    {
      return bool;
      if (!hf(paramContext))
        h.drh().m(675L, 18L, 1L);
      h.drh().m(675L, 17L, 1L);
      AppMethodBeat.o(114802);
      bool = false;
      continue;
      if (!dqT())
      {
        h.drh().m(675L, 15L, 1L);
        AppMethodBeat.o(114802);
        bool = true;
      }
      else if (!hc(paramContext))
      {
        h.drh().m(675L, 26L, 1L);
        h.drh().m(675L, 15L, 1L);
        AppMethodBeat.o(114802);
        bool = true;
      }
      else
      {
        h.drh().m(675L, 16L, 1L);
        AppMethodBeat.o(114802);
        bool = false;
      }
    }
  }

  public static abstract interface a
  {
    public abstract void cmC();

    public abstract void dqV();

    public abstract void dqW();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.splash.a
 * JD-Core Version:    0.6.2
 */