package com.tencent.mm.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelmulti.h;
import com.tencent.mm.network.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class WorkerProfile$12 extends n.a
{
  WorkerProfile$12(WorkerProfile paramWorkerProfile)
  {
  }

  public final void gl(int paramInt)
  {
    AppMethodBeat.i(15488);
    if ((paramInt != 4) && (paramInt != 6))
      AppMethodBeat.o(15488);
    while (true)
    {
      return;
      if ((aw.RK()) && (g.RN().eJb) && (!aw.QT()))
      {
        ab.i("MicroMsg.WorkerProfile", "dkmsg Network connected , try send msg.");
        aw.Rg().a(new h(), 0);
        AppMethodBeat.o(15488);
      }
      else
      {
        AppMethodBeat.o(15488);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.WorkerProfile.12
 * JD-Core Version:    0.6.2
 */