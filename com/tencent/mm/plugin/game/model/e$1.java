package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.b;
import com.tencent.mm.pluginsdk.model.app.aj;

final class e$1
  implements aj
{
  e$1(String paramString)
  {
  }

  public final void dR(boolean paramBoolean)
  {
    AppMethodBeat.i(111196);
    if (paramBoolean)
    {
      ((b)g.K(b.class)).bCW();
      t.b(this.val$appId, 0, 0, null, null);
    }
    AppMethodBeat.o(111196);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.e.1
 * JD-Core Version:    0.6.2
 */