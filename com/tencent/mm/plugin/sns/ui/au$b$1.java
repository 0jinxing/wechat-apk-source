package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.base.Vending;

final class au$b$1
  implements Runnable
{
  au$b$1(au.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39413);
    if (this.ryh.ryg.crQ() != null)
      this.ryh.ryg.crQ().request(Integer.valueOf(this.ryh.mPosition));
    this.ryh.ryg.notifyDataSetChanged();
    AppMethodBeat.o(39413);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.au.b.1
 * JD-Core Version:    0.6.2
 */