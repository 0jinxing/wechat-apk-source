package com.tencent.matrix.trace.c;

import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Message;
import android.os.SystemClock;
import com.tencent.matrix.d.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.trace.core.AppMethodBeat.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public final class a
{
  private static long bZk = 0L;
  private static long bZl = 0L;
  private static long bZm = 0L;
  public static AppMethodBeat.a bZn = new AppMethodBeat.a();
  public static AppMethodBeat.a bZo = new AppMethodBeat.a();
  public static int bZp = -100;

  public static long zA()
  {
    return bZk;
  }

  public static long zB()
  {
    return bZm;
  }

  public static void zy()
  {
    try
    {
      bZk = SystemClock.uptimeMillis();
      bZo = AppMethodBeat.getInstance().maskIndex("ApplicationCreateBeginMethodIndex");
      Object localObject1 = Class.forName("android.app.ActivityThread");
      Object localObject2 = ((Class)localObject1).getDeclaredField("sCurrentActivityThread");
      ((Field)localObject2).setAccessible(true);
      localObject2 = ((Field)localObject2).get(localObject1);
      localObject1 = ((Class)localObject1).getDeclaredField("mH");
      ((Field)localObject1).setAccessible(true);
      localObject2 = ((Field)localObject1).get(localObject2);
      localObject1 = localObject2.getClass().getSuperclass().getDeclaredField("mCallback");
      ((Field)localObject1).setAccessible(true);
      Handler.Callback localCallback = (Handler.Callback)((Field)localObject1).get(localObject2);
      a locala = new com/tencent/matrix/trace/c/a$a;
      locala.<init>(localCallback);
      ((Field)localObject1).set(localObject2, locala);
      c.i("Matrix.ActivityThreadHacker", "hook system handler completed. start:%s SDK_INT:%s", new Object[] { Long.valueOf(bZk), Integer.valueOf(Build.VERSION.SDK_INT) });
      return;
    }
    catch (Exception localException)
    {
      while (true)
        c.e("Matrix.ActivityThreadHacker", "hook system handler err! %s", new Object[] { localException.getCause().toString() });
    }
  }

  public static long zz()
  {
    return bZl - bZk;
  }

  static final class a
    implements Handler.Callback
  {
    private static boolean bZq = false;
    private static int bZr = 10;
    private final Handler.Callback bZs;
    private Method method = null;

    a(Handler.Callback paramCallback)
    {
      this.bZs = paramCallback;
    }

    private boolean g(Message paramMessage)
    {
      if (Build.VERSION.SDK_INT > 27)
        if ((paramMessage.what != 159) || (paramMessage.obj == null));
      while (true)
      {
        boolean bool;
        try
        {
          if (this.method == null)
          {
            this.method = Class.forName("android.app.servertransaction.ClientTransaction").getDeclaredMethod("getCallbacks", new Class[0]);
            this.method.setAccessible(true);
          }
          List localList = (List)this.method.invoke(paramMessage.obj, new Object[0]);
          if (!localList.isEmpty())
          {
            bool = localList.get(0).getClass().getName().endsWith(".LaunchActivityItem");
            return bool;
          }
        }
        catch (Exception localException)
        {
          c.e("Matrix.ActivityThreadHacker", "[isLaunchActivity] %s", new Object[] { localException });
        }
        if (paramMessage.what == 100)
        {
          bool = true;
        }
        else
        {
          bool = false;
          continue;
          if (paramMessage.what == 100)
            bool = true;
          else
            bool = false;
        }
      }
    }

    public final boolean handleMessage(Message paramMessage)
    {
      boolean bool1 = false;
      if (!AppMethodBeat.isRealTrace())
        if (this.bZs != null);
      while (true)
      {
        return bool1;
        bool1 = this.bZs.handleMessage(paramMessage);
        continue;
        boolean bool2 = g(paramMessage);
        if (bZr > 0)
        {
          c.i("Matrix.ActivityThreadHacker", "[handleMessage] msg.what:%s begin:%s isLaunchActivity:%s", new Object[] { Integer.valueOf(paramMessage.what), Long.valueOf(SystemClock.uptimeMillis()), Boolean.valueOf(bool2) });
          bZr -= 1;
        }
        if (bool2)
        {
          a.aB(SystemClock.uptimeMillis());
          a.bZn = AppMethodBeat.getInstance().maskIndex("LastLaunchActivityMethodIndex");
        }
        if ((!bZq) && ((bool2) || (paramMessage.what == 114) || (paramMessage.what == 113)))
        {
          a.aC(SystemClock.uptimeMillis());
          a.bZp = paramMessage.what;
          bZq = true;
        }
        if (this.bZs != null)
          bool1 = this.bZs.handleMessage(paramMessage);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.trace.c.a
 * JD-Core Version:    0.6.2
 */