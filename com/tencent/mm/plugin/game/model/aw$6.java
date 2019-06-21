package com.tencent.mm.plugin.game.model;

import com.tencent.luggage.d.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.luggage.d.d;

final class aw$6
  implements Runnable
{
  aw$6(k paramk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111468);
    ((d)this.mTO.xr()).onResume();
    ((d)this.mTO.xr()).setBlockNetworkImage(false);
    AppMethodBeat.o(111468);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.aw.6
 * JD-Core Version:    0.6.2
 */