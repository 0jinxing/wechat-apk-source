package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class b$2
  implements Runnable
{
  b$2(g paramg, boolean paramBoolean, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102521);
    ab.i("MicroMsg.Fav.FavApiLogic", "delete favItem id %d, localId %d, needBatchDel %B, do on worker thread", new Object[] { Integer.valueOf(this.meF.field_id), Long.valueOf(this.meF.field_localId), Boolean.valueOf(this.meG) });
    b.a(this.meF, this.meG);
    al.d(this.meH);
    AppMethodBeat.o(102521);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.b.2
 * JD-Core Version:    0.6.2
 */