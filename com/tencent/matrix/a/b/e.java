package com.tencent.matrix.a.b;

import android.os.IBinder;
import android.os.WorkSource;
import com.tencent.matrix.a.c.b;
import com.tencent.matrix.a.c.b.b;
import com.tencent.matrix.d.c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class e
{
  private static boolean bVc;
  private static b.b bVd = new b.b()
  {
    public final void b(Method paramAnonymousMethod, Object[] paramAnonymousArrayOfObject)
    {
      c.v("Matrix.PowerManagerServiceHooker", "onServiceMethodInvoke: method name %s", new Object[] { paramAnonymousMethod.getName() });
      e.a(paramAnonymousMethod, paramAnonymousArrayOfObject);
    }
  };
  private static b bVe = new b("power", "android.os.IPowerManager", bVd);
  private static List<b> bVf = new ArrayList();

  public static void a(b paramb)
  {
    try
    {
      boolean bool = bVf.contains(paramb);
      if (bool);
      while (true)
      {
        return;
        bVf.add(paramb);
        if ((!bVc) && (!bVf.isEmpty()))
        {
          c.i("Matrix.PowerManagerServiceHooker", "checkHook hookRet:%b", new Object[] { Boolean.valueOf(bVe.doHook()) });
          bVc = true;
        }
      }
    }
    finally
    {
    }
    throw paramb;
  }

  public static void b(b paramb)
  {
    try
    {
      bVf.remove(paramb);
      if ((bVc) && (bVf.isEmpty()))
      {
        c.i("Matrix.PowerManagerServiceHooker", "checkUnHook unHookRet:%b", new Object[] { Boolean.valueOf(bVe.doUnHook()) });
        bVc = false;
      }
      return;
    }
    finally
    {
      paramb = finally;
    }
    throw paramb;
  }

  static final class a
  {
    WorkSource bVB;
    String bVC;
    int flags;
    String packageName;
    String tag;
    IBinder token;
  }

  public static abstract interface b
  {
    public abstract void a(IBinder paramIBinder, int paramInt);

    public abstract void a(IBinder paramIBinder, int paramInt, String paramString1, String paramString2, WorkSource paramWorkSource, String paramString3);
  }

  static final class c
  {
    int flags;
    IBinder token;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.a.b.e
 * JD-Core Version:    0.6.2
 */