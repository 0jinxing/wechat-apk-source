package com.tencent.mm.plugin.card.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.a;
import com.tencent.mm.plugin.card.base.c;
import java.util.List;

public final class h
  implements a
{
  private g kmg;

  public h(g paramg)
  {
    this.kmg = paramg;
  }

  public final void ZZ()
  {
    AppMethodBeat.i(88553);
    if (this.kmg != null)
      this.kmg.notifyDataSetChanged();
    AppMethodBeat.o(88553);
  }

  public final void onCreate()
  {
    AppMethodBeat.i(88551);
    this.kmg.notifyDataSetChanged();
    AppMethodBeat.o(88551);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(88552);
    if (this.kmg != null)
    {
      g localg = this.kmg;
      localg.kgW.release();
      localg.kgW = null;
      localg.khh.clear();
      localg.mContext = null;
      localg.kme = null;
      this.kmg = null;
    }
    AppMethodBeat.o(88552);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.h
 * JD-Core Version:    0.6.2
 */