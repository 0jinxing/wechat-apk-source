package com.tencent.mm.plugin.mmsight.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.d.a.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class n
{
  boolean fbr;
  d.a.a fbs;
  final Object lock;

  n()
  {
    AppMethodBeat.i(76544);
    this.lock = new byte[0];
    this.fbr = false;
    AppMethodBeat.o(76544);
  }

  public final d.a.a R(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(76545);
    if (paramContext == null)
      AppMethodBeat.o(76545);
    for (paramContext = null; ; paramContext = null)
    {
      long l1;
      while (true)
      {
        return paramContext;
        l1 = bo.anU();
        long l2 = Thread.currentThread().getId();
        synchronized (this.lock)
        {
          this.fbr = false;
          this.fbs = null;
          n.1 local1 = new com/tencent/mm/plugin/mmsight/model/n$1;
          local1.<init>(this, l2, l1, paramContext, paramInt);
          d.post(local1, "SightCamera_openCamera");
          try
          {
            this.lock.wait(30000L);
            if ((this.fbs != null) && (this.fbs.erH != null))
            {
              ab.i("MicroMsg.SightCamera.OpenCameraThread", "Open Camera Succ thread:%d Time:%d camera:%s", new Object[] { Long.valueOf(l2), Long.valueOf(bo.anU() - l1), this.fbs.erH });
              paramContext = this.fbs;
              AppMethodBeat.o(76545);
            }
          }
          catch (InterruptedException paramContext)
          {
            while (true)
              ab.e("MicroMsg.SightCamera.OpenCameraThread", "Lock wait failed e:%s", new Object[] { paramContext.getMessage() });
          }
        }
      }
      this.fbr = true;
      ab.e("MicroMsg.SightCamera.OpenCameraThread", "Open Camera Timeout:%d", new Object[] { Long.valueOf(bo.anU() - l1) });
      AppMethodBeat.o(76545);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.n
 * JD-Core Version:    0.6.2
 */