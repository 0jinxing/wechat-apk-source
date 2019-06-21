package com.tencent.mm.vending.base;

import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.f.a;

public final class c
{
  private Looper b;
  private Handler c;
  private Handler d;
  byte[] e;
  c.a zXA;
  private Looper zXz;

  public c(Looper paramLooper1, Looper paramLooper2)
  {
    AppMethodBeat.i(126148);
    this.e = new byte[0];
    this.zXz = paramLooper1;
    this.b = paramLooper2;
    this.c = new c.1(this, this.zXz);
    this.d = new c.2(this, this.b);
    AppMethodBeat.o(126148);
  }

  public final void s(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(126149);
    if (Looper.myLooper() == this.zXz)
      if (this.zXA == null)
      {
        a.w("Vending.VendingSync", "This call is pointless.", new Object[0]);
        AppMethodBeat.o(126149);
      }
    while (true)
    {
      return;
      this.zXA.dMc();
      synchronized (this.e)
      {
        this.d.sendMessageAtFrontOfQueue(this.d.obtainMessage(paramInt, paramObject));
      }
      try
      {
        this.e.wait();
        label79: this.zXA.dMd();
        AppMethodBeat.o(126149);
        continue;
        paramObject = finally;
        AppMethodBeat.o(126149);
        throw paramObject;
        if (Looper.myLooper() == this.b)
        {
          this.c.sendMessageAtFrontOfQueue(this.c.obtainMessage(paramInt, paramObject));
          AppMethodBeat.o(126149);
          continue;
        }
        AppMethodBeat.o(126149);
      }
      catch (InterruptedException paramObject)
      {
        break label79;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.base.c
 * JD-Core Version:    0.6.2
 */