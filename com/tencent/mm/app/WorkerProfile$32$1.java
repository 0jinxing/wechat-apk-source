package com.tencent.mm.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.n;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;

final class WorkerProfile$32$1
  implements Runnable
{
  WorkerProfile$32$1(WorkerProfile.32 param32, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(15538);
    if (!g.RN().QY())
    {
      ab.w("MicroMsg.WorkerProfile", "ImageSelectedOperationEvent: account not init.");
      AppMethodBeat.o(15538);
    }
    while (true)
    {
      return;
      n.ahb().a(0, this.cgj, this.cgk, this.cgl, this.cgm);
      AppMethodBeat.o(15538);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.WorkerProfile.32.1
 * JD-Core Version:    0.6.2
 */