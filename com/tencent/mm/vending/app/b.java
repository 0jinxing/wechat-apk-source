package com.tencent.mm.vending.app;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
  private static b zXh;
  Map<c, a> b;
  final Handler d;
  final SparseIntArray zXi;

  static
  {
    AppMethodBeat.i(126098);
    zXh = null;
    zXh = new b();
    AppMethodBeat.o(126098);
  }

  public b()
  {
    AppMethodBeat.i(126096);
    this.b = new ConcurrentHashMap();
    this.zXi = new SparseIntArray();
    this.d = new Handler(com.tencent.mm.vending.i.b.dMs().a.getLooper())
    {
      public final void handleMessage(Message arg1)
      {
        AppMethodBeat.i(126099);
        a locala = (a)???.obj;
        switch (???.what)
        {
        default:
        case 1:
        case 2:
        case 3:
        case 4:
        }
        while (true)
        {
          AppMethodBeat.o(126099);
          while (true)
          {
            return;
            locala.onCreate();
            synchronized (locala.d)
            {
              locala.g = true;
              locala.d.notify();
              AppMethodBeat.o(126099);
            }
            AppMethodBeat.o(126099);
            continue;
            AppMethodBeat.o(126099);
          }
          localObject.onDestroy();
        }
      }
    };
    AppMethodBeat.o(126096);
  }

  public static b dMb()
  {
    return zXh;
  }

  public final void a(c paramc, a parama)
  {
    AppMethodBeat.i(126097);
    if (!this.b.containsKey(paramc))
    {
      this.b.put(paramc, parama);
      com.tencent.mm.vending.f.a.i("Vending.InteractorManager", "presenter %s hash %s interactor %s looper %s", new Object[] { paramc, Integer.valueOf(paramc.hashCode()), parama, Looper.myLooper() });
      int i = this.zXi.get(paramc.hashCode(), 0);
      if ((i > 0) && (i < 4))
      {
        if (i > 0)
          this.d.sendMessage(this.d.obtainMessage(1, parama));
        if (i >= 2)
          this.d.sendMessage(this.d.obtainMessage(2, parama));
        if (i >= 3)
          this.d.sendMessage(this.d.obtainMessage(3, parama));
        if (i >= 4)
          this.d.sendMessage(this.d.obtainMessage(4, parama));
      }
      AppMethodBeat.o(126097);
    }
    while (true)
    {
      return;
      com.tencent.mm.vending.f.a.e("Vending.InteractorManager", "duplicate activity and interactor.", new Object[0]);
      AppMethodBeat.o(126097);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.app.b
 * JD-Core Version:    0.6.2
 */