package com.tencent.mm.sdk.platformtools;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.c.c;
import junit.framework.Assert;

public class al
{
  private static ak xzh = null;
  private ak mcy;
  public HandlerThread oAl;
  private String threadName;

  public al()
  {
    AppMethodBeat.i(52124);
    this.oAl = null;
    this.mcy = null;
    this.threadName = null;
    ab.i("MicroMsg.MMHandlerThread", "init stack:%s", new Object[] { bo.dpG() });
    Az(null);
    AppMethodBeat.o(52124);
  }

  public al(String paramString)
  {
    AppMethodBeat.i(52125);
    this.oAl = null;
    this.mcy = null;
    this.threadName = null;
    Az(paramString);
    AppMethodBeat.o(52125);
  }

  private void Az(String paramString)
  {
    AppMethodBeat.i(52118);
    this.mcy = null;
    String str = paramString;
    if (bo.isNullOrNil(paramString))
      str = "MMHandlerThread";
    this.threadName = str;
    this.oAl = c.anN(this.threadName);
    this.oAl.start();
    AppMethodBeat.o(52118);
  }

  public static void Ma(int paramInt)
  {
    AppMethodBeat.i(52119);
    try
    {
      Process.setThreadPriority(paramInt);
      ab.i("MicroMsg.MMHandlerThread", "setCurrentPriority to %d ok", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(52119);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.i("MicroMsg.MMHandlerThread", "setCurrentPriority to %d fail, %s", new Object[] { Integer.valueOf(paramInt), localException.getMessage() });
        ab.printErrStackTrace("MicroMsg.MMHandlerThread", localException, "", new Object[0]);
        AppMethodBeat.o(52119);
      }
    }
  }

  public static void af(Runnable paramRunnable)
  {
    AppMethodBeat.i(52139);
    if (paramRunnable == null)
      AppMethodBeat.o(52139);
    while (true)
    {
      return;
      doP().removeCallbacks(paramRunnable);
      AppMethodBeat.o(52139);
    }
  }

  public static void d(Runnable paramRunnable)
  {
    AppMethodBeat.i(52137);
    if (paramRunnable == null)
      AppMethodBeat.o(52137);
    while (true)
    {
      return;
      doP().post(paramRunnable);
      AppMethodBeat.o(52137);
    }
  }

  private static ak doP()
  {
    AppMethodBeat.i(52136);
    if (xzh == null)
      xzh = new ak(Looper.getMainLooper());
    ak localak = xzh;
    AppMethodBeat.o(52136);
    return localak;
  }

  public static boolean isMainThread()
  {
    AppMethodBeat.i(52134);
    boolean bool;
    if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId())
    {
      bool = true;
      AppMethodBeat.o(52134);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52134);
    }
  }

  public static void n(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(52138);
    if (paramRunnable == null)
      AppMethodBeat.o(52138);
    while (true)
    {
      return;
      doP().postDelayed(paramRunnable, paramLong);
      AppMethodBeat.o(52138);
    }
  }

  public final void Bn()
  {
    AppMethodBeat.i(52122);
    if ((this.oAl == null) || (!this.oAl.isAlive()))
    {
      ab.e("MicroMsg.MMHandlerThread", "setHighPriority failed thread is dead");
      AppMethodBeat.o(52122);
    }
    while (true)
    {
      return;
      int i = this.oAl.getThreadId();
      try
      {
        if (-8 == Process.getThreadPriority(i))
        {
          ab.w("MicroMsg.MMHandlerThread", "setHighPriority No Need.");
          AppMethodBeat.o(52122);
        }
        else
        {
          Process.setThreadPriority(i, -8);
          ab.i("MicroMsg.MMHandlerThread", "thread:%d setHighPriority to %d", new Object[] { Integer.valueOf(i), Integer.valueOf(Process.getThreadPriority(i)) });
          AppMethodBeat.o(52122);
        }
      }
      catch (Exception localException)
      {
        ab.w("MicroMsg.MMHandlerThread", "thread:%d setHighPriority failed", new Object[] { Integer.valueOf(i) });
        ab.printErrStackTrace("MicroMsg.MMHandlerThread", localException, "", new Object[0]);
        AppMethodBeat.o(52122);
      }
    }
  }

  public final int a(final a parama)
  {
    AppMethodBeat.i(52133);
    int i;
    if (new ak(this.oAl.getLooper()).postAtFrontOfQueueV2(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(52116);
        parama.acf();
        al.ag(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(52115);
            al.2.this.xzl.acg();
            AppMethodBeat.o(52115);
          }
        });
        AppMethodBeat.o(52116);
      }

      public final String toString()
      {
        AppMethodBeat.i(52117);
        String str = super.toString() + "|" + parama.toString();
        AppMethodBeat.o(52117);
        return str;
      }
    }))
    {
      i = 0;
      AppMethodBeat.o(52133);
    }
    while (true)
    {
      return i;
      i = -2;
      AppMethodBeat.o(52133);
    }
  }

  public final int a(final b paramb)
  {
    AppMethodBeat.i(52128);
    ab.i("MicroMsg.MMHandlerThread", "syncReset tid[%d] stack:%s", new Object[] { Long.valueOf(Thread.currentThread().getId()), bo.dpG() });
    Assert.assertTrue("syncReset should in mainThread", isMainThread());
    long l1 = this.oAl.getId();
    final byte[] arrayOfByte = new byte[0];
    paramb = new a()
    {
      public final boolean acf()
      {
        AppMethodBeat.i(52114);
        ab.i("MicroMsg.MMHandlerThread", "syncReset doInBackground tid[%d]", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
        if (paramb != null)
          paramb.wM();
        ab.i("MicroMsg.MMHandlerThread", "syncReset doInBackground callback done tid[%d]", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
        al.a(al.this).quit();
        ab.i("MicroMsg.MMHandlerThread", "syncReset init start old tid[%d]", new Object[] { Long.valueOf(al.a(al.this).getId()) });
        al.a(al.this, this.brR);
        ab.i("MicroMsg.MMHandlerThread", "syncReset init done new tid[%d]", new Object[] { Long.valueOf(al.a(al.this).getId()) });
        synchronized (arrayOfByte)
        {
          ab.i("MicroMsg.MMHandlerThread", "syncReset notify tid[%d]", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
          arrayOfByte.notify();
          AppMethodBeat.o(52114);
          return true;
        }
      }

      public final boolean acg()
      {
        AppMethodBeat.i(52113);
        ab.i("MicroMsg.MMHandlerThread", "syncReset onPostExecute");
        AppMethodBeat.o(52113);
        return true;
      }
    };
    try
    {
      int i = a(paramb);
      long l2 = this.oAl.getId();
      ab.i("MicroMsg.MMHandlerThread", "syncReset postAtFrontOfWorker ret[%d], oldTid[%d], curTid[%d]", new Object[] { Integer.valueOf(i), Long.valueOf(l1), Long.valueOf(l2) });
      if ((i == 0) && (l1 == l2));
      try
      {
        arrayOfByte.wait();
        return i;
      }
      catch (Exception paramb)
      {
        while (true)
          ab.d("MicroMsg.MMHandlerThread", "syncReset lock wait end with exception[%s]", new Object[] { paramb.getMessage() });
      }
    }
    finally
    {
      AppMethodBeat.o(52128);
    }
    throw paramb;
  }

  public int aa(Runnable paramRunnable)
  {
    AppMethodBeat.i(52130);
    int i;
    if (paramRunnable == null)
    {
      i = -1;
      AppMethodBeat.o(52130);
    }
    while (true)
    {
      return i;
      doN().post(paramRunnable);
      i = 0;
      AppMethodBeat.o(52130);
    }
  }

  public final int ae(Runnable paramRunnable)
  {
    AppMethodBeat.i(52131);
    doN().postAtFrontOfQueueV2(paramRunnable);
    AppMethodBeat.o(52131);
    return 0;
  }

  public final void doK()
  {
    AppMethodBeat.i(52120);
    if ((this.oAl == null) || (!this.oAl.isAlive()))
    {
      ab.e("MicroMsg.MMHandlerThread", "setLowestPriority failed thread is dead");
      AppMethodBeat.o(52120);
    }
    while (true)
    {
      return;
      int i = this.oAl.getThreadId();
      try
      {
        if (19 == Process.getThreadPriority(i))
        {
          ab.w("MicroMsg.MMHandlerThread", "setLowestPriority No Need.");
          AppMethodBeat.o(52120);
        }
        else
        {
          Process.setThreadPriority(i, 19);
          ab.i("MicroMsg.MMHandlerThread", "thread:%d setLowestPriority to %d", new Object[] { Integer.valueOf(i), Integer.valueOf(Process.getThreadPriority(i)) });
          AppMethodBeat.o(52120);
        }
      }
      catch (Exception localException)
      {
        ab.w("MicroMsg.MMHandlerThread", "thread:%d setLowestPriority failed", new Object[] { Integer.valueOf(i) });
        ab.printErrStackTrace("MicroMsg.MMHandlerThread", localException, "", new Object[0]);
        AppMethodBeat.o(52120);
      }
    }
  }

  public final int doL()
  {
    AppMethodBeat.i(52121);
    int i;
    if (this.oAl == null)
    {
      i = -1;
      AppMethodBeat.o(52121);
    }
    while (true)
    {
      return i;
      i = this.oAl.getThreadId();
      AppMethodBeat.o(52121);
    }
  }

  public final void doM()
  {
    AppMethodBeat.i(52123);
    if ((this.oAl == null) || (!this.oAl.isAlive()))
    {
      ab.e("MicroMsg.MMHandlerThread", "setLowPriority failed thread is dead");
      AppMethodBeat.o(52123);
    }
    while (true)
    {
      return;
      int i = this.oAl.getThreadId();
      try
      {
        if (Process.getThreadPriority(i) == 0)
        {
          ab.w("MicroMsg.MMHandlerThread", "setLowPriority No Need.");
          AppMethodBeat.o(52123);
        }
        else
        {
          Process.setThreadPriority(i, 0);
          ab.i("MicroMsg.MMHandlerThread", "thread:%d setLowPriority to %d", new Object[] { Integer.valueOf(i), Integer.valueOf(Process.getThreadPriority(i)) });
          AppMethodBeat.o(52123);
        }
      }
      catch (Exception localException)
      {
        ab.w("MicroMsg.MMHandlerThread", "thread:%d setLowPriority failed", new Object[] { Integer.valueOf(i) });
        ab.printErrStackTrace("MicroMsg.MMHandlerThread", localException, "", new Object[0]);
        AppMethodBeat.o(52123);
      }
    }
  }

  public final ak doN()
  {
    AppMethodBeat.i(52127);
    if (this.mcy == null)
      this.mcy = new ak(this.oAl.getLooper());
    ak localak = this.mcy;
    AppMethodBeat.o(52127);
    return localak;
  }

  public final boolean doO()
  {
    AppMethodBeat.i(52135);
    boolean bool;
    if (Thread.currentThread().getId() == this.oAl.getId())
    {
      bool = true;
      AppMethodBeat.o(52135);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52135);
    }
  }

  public final Looper getLooper()
  {
    AppMethodBeat.i(138332);
    Looper localLooper = this.oAl.getLooper();
    AppMethodBeat.o(138332);
    return localLooper;
  }

  public final int m(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(52132);
    int i;
    if (paramRunnable == null)
    {
      i = -1;
      AppMethodBeat.o(52132);
    }
    while (true)
    {
      return i;
      doN().postDelayed(paramRunnable, paramLong);
      i = 0;
      AppMethodBeat.o(52132);
    }
  }

  public final boolean quit()
  {
    AppMethodBeat.i(138333);
    boolean bool = this.oAl.quit();
    AppMethodBeat.o(138333);
    return bool;
  }

  public static abstract interface a
  {
    public abstract boolean acf();

    public abstract boolean acg();
  }

  public static abstract interface b
  {
    public abstract void wM();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.al
 * JD-Core Version:    0.6.2
 */