package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class aj$1
  implements f
{
  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(111416);
    g.Rg().b(2641, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.i("MicroMsg.NetSceneGameIndex4TabNav", "update gameIndexTabNav data success");
      al.d(new aj.1.1(this, ((aj)paramm).bET()));
      AppMethodBeat.o(111416);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.NetSceneGameIndex4TabNav", "update gameIndexTabNav data fail");
      AppMethodBeat.o(111416);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.aj.1
 * JD-Core Version:    0.6.2
 */