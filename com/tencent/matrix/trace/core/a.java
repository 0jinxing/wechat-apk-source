package com.tencent.matrix.trace.core;

import android.os.Build.VERSION;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.util.Printer;
import com.tencent.matrix.d.c;
import java.lang.reflect.Field;
import java.util.HashSet;

public final class a
  implements MessageQueue.IdleHandler
{
  private static Printer bYO;
  private static final a bYP = new a();
  private static final HashSet<a> listeners = new HashSet();

  private a()
  {
    zw();
    if (Build.VERSION.SDK_INT >= 23)
      Looper.getMainLooper().getQueue().addIdleHandler(this);
    while (true)
    {
      return;
      ((MessageQueue)reflectObject(Looper.getMainLooper(), "mQueue")).addIdleHandler(this);
    }
  }

  public static void a(a parama)
  {
    synchronized (listeners)
    {
      listeners.add(parama);
      return;
    }
  }

  private static <T> T reflectObject(Object paramObject, String paramString)
  {
    try
    {
      paramString = paramObject.getClass().getDeclaredField(paramString);
      paramString.setAccessible(true);
      paramObject = paramString.get(paramObject);
      return paramObject;
    }
    catch (Exception paramObject)
    {
      while (true)
      {
        c.e("Matrix.LooperMonitor", paramObject.toString(), new Object[0]);
        paramObject = null;
      }
    }
  }

  private static void zw()
  {
    Object localObject = (Printer)reflectObject(Looper.getMainLooper(), "mLogging");
    if ((localObject == bYO) && (bYO != null));
    while (true)
    {
      return;
      if (bYO != null)
        c.w("Matrix.LooperMonitor", "[resetPrinter] maybe looper printer was replace other!", new Object[0]);
      Looper localLooper = Looper.getMainLooper();
      localObject = new Printer()
      {
        boolean bYN = false;
        boolean bYQ = false;

        public final void println(String paramAnonymousString)
        {
          boolean bool1 = true;
          if (this.bYR != null)
            this.bYR.println(paramAnonymousString);
          if (!this.bYQ)
          {
            if ((paramAnonymousString.charAt(0) != '>') && (paramAnonymousString.charAt(0) != '<'))
              break label104;
            bool2 = true;
            this.bYN = bool2;
            this.bYQ = true;
            if (!this.bYN)
              c.e("Matrix.LooperMonitor", "[println] Printer is inValid! x:%s", new Object[] { paramAnonymousString });
          }
          if (this.bYN)
            if (paramAnonymousString.charAt(0) != '>')
              break label109;
          label104: label109: for (boolean bool2 = bool1; ; bool2 = false)
          {
            a.bc(bool2);
            return;
            bool2 = false;
            break;
          }
        }
      };
      bYO = (Printer)localObject;
      localLooper.setMessageLogging((Printer)localObject);
    }
  }

  public final boolean queueIdle()
  {
    zw();
    return true;
  }

  public static abstract class a
  {
    boolean bYS = false;

    void dispatchEnd()
    {
      this.bYS = false;
    }

    void dispatchStart()
    {
      this.bYS = true;
    }

    boolean isValid()
    {
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.trace.core.a
 * JD-Core Version:    0.6.2
 */