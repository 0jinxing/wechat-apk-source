package com.tencent.mm.vending.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

final class Vending$c$1 extends Handler
{
  Vending$c$1(Vending.c paramc, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message arg1)
  {
    AppMethodBeat.i(126164);
    if (this.zXr.zXq.get())
    {
      this.zXr.zXp.cancel();
      AppMethodBeat.o(126164);
    }
    while (true)
    {
      return;
      Object localObject1 = ???.obj;
      this.zXr.zXp.cQ(localObject1);
      synchronized (this.zXr.b)
      {
        this.zXr.a.put(localObject1, Vending.c.b.zXu);
        AppMethodBeat.o(126164);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.base.Vending.c.1
 * JD-Core Version:    0.6.2
 */