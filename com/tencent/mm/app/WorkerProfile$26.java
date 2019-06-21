package com.tencent.mm.app;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.f.e.a;
import com.tencent.mm.ui.MMAppMgr;

final class WorkerProfile$26
  implements e.a
{
  WorkerProfile$26(WorkerProfile paramWorkerProfile)
  {
  }

  public final boolean Ch()
  {
    AppMethodBeat.i(138594);
    boolean bool = MMAppMgr.Ch();
    AppMethodBeat.o(138594);
    return bool;
  }

  public final void bd(Context paramContext)
  {
    AppMethodBeat.i(138593);
    MMAppMgr.bd(paramContext);
    AppMethodBeat.o(138593);
  }

  public final void be(Context paramContext)
  {
    AppMethodBeat.i(138596);
    MMAppMgr.be(paramContext);
    AppMethodBeat.o(138596);
  }

  public final void k(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(138595);
    MMAppMgr.k(paramContext, paramBoolean);
    AppMethodBeat.o(138595);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.WorkerProfile.26
 * JD-Core Version:    0.6.2
 */