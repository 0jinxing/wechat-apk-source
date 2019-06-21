package com.tencent.mm.plugin.card.sharecard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.a;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.base.c;
import java.util.List;

public final class h
  implements a
{
  private g khi;

  public h(g paramg)
  {
    this.khi = paramg;
  }

  public final void ZZ()
  {
    AppMethodBeat.i(88164);
    if (this.khi != null)
      this.khi.notifyDataSetChanged();
    AppMethodBeat.o(88164);
  }

  public final void onCreate()
  {
    AppMethodBeat.i(88162);
    this.khi.notifyDataSetChanged();
    AppMethodBeat.o(88162);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(88163);
    if (this.khi != null)
    {
      g localg = this.khi;
      localg.kgW.release();
      localg.kgW = null;
      localg.khh.clear();
      localg.mContext = null;
      this.khi = null;
    }
    AppMethodBeat.o(88163);
  }

  public final b sM(int paramInt)
  {
    AppMethodBeat.i(88165);
    b localb;
    if (this.khi != null)
    {
      localb = this.khi.sM(paramInt);
      AppMethodBeat.o(88165);
    }
    while (true)
    {
      return localb;
      localb = null;
      AppMethodBeat.o(88165);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.h
 * JD-Core Version:    0.6.2
 */