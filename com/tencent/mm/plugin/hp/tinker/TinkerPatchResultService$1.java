package com.tencent.mm.plugin.hp.tinker;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tinker.lib.util.a;
import com.tencent.tinker.lib.util.b;

final class TinkerPatchResultService$1
  implements Runnable
{
  TinkerPatchResultService$1(TinkerPatchResultService paramTinkerPatchResultService)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(90661);
    a.w("Tinker.TinkerPatchResultService", "actually kill tinker patch service!", new Object[0]);
    b.iY(this.nuf.getApplicationContext());
    AppMethodBeat.o(90661);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService.1
 * JD-Core Version:    0.6.2
 */