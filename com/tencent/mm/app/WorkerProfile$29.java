package com.tencent.mm.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.report.b.e;
import com.tencent.mm.sdk.platformtools.ab;

final class WorkerProfile$29
  implements Runnable
{
  WorkerProfile$29(WorkerProfile paramWorkerProfile, int paramInt, byte[] paramArrayOfByte)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138602);
    if (aw.ZD())
      AppMethodBeat.o(138602);
    while (true)
    {
      return;
      ab.i("MicroMsg.WorkerProfile", "summeranrt onReportKVDataReady channel:" + this.cgg);
      e locale = new e(this.cgh, this.cgg);
      aw.Rg().a(locale, 0);
      AppMethodBeat.o(138602);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.WorkerProfile.29
 * JD-Core Version:    0.6.2
 */