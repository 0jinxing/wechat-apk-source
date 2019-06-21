package com.tencent.mm.plugin.game.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.ky;
import com.tencent.mm.g.a.ky.a;

final class aw$5
  implements Runnable
{
  aw$5(aw paramaw, Context paramContext, ky paramky)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111467);
    d.b(this.gAj, "game", ".luggage.LuggageGameWebViewUI", this.mYN.cGQ.intent);
    AppMethodBeat.o(111467);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.aw.5
 * JD-Core Version:    0.6.2
 */