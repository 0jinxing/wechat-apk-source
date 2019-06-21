package com.tencent.mm.vending.h;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.mm.vending.i.a;
import com.tencent.mm.vending.i.b;

public abstract class d
{
  public static final h zYp = new h(Looper.getMainLooper(), "Vending.UI");
  public static final h zYq = new h(b.dMs().a.getLooper(), "Vending.LOGIC");
  public static final h zYr = new h(a.dMr().a.getLooper(), "Vending.HEAVY_WORK");

  static
  {
    g.a();
  }

  public static d dMq()
  {
    try
    {
      d locald = g.dMq();
      return locald;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public abstract void cancel();

  public abstract String getType();

  public abstract void l(Runnable paramRunnable, long paramLong);

  public abstract void o(Runnable paramRunnable);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.h.d
 * JD-Core Version:    0.6.2
 */