package com.tencent.mm.plugin.game.model;

import com.tencent.luggage.d.k;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class aw$7$1
  implements Runnable
{
  aw$7$1(aw.7 param7)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111469);
    k localk = com.tencent.mm.plugin.game.luggage.d.NO(this.mYQ.mYO);
    if (localk != null)
    {
      ((com.tencent.mm.plugin.game.luggage.d.d)localk.xr()).setBlockNetworkImage(true);
      ((com.tencent.mm.plugin.game.luggage.d.d)localk.xr()).onPause();
    }
    this.mYQ.mTN.eBY = System.currentTimeMillis();
    aw.b(this.mYQ.mYP, this.mYQ.cgJ);
    AppMethodBeat.o(111469);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.aw.7.1
 * JD-Core Version:    0.6.2
 */