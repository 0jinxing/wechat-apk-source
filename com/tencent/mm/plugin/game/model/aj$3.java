package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class aj$3
  implements c
{
  aj$3(String paramString, List paramList, aj.a parama)
  {
  }

  public final void a(boolean paramBoolean, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(111418);
    ab.i("MicroMsg.NetSceneGameIndex4TabNav", "nav icon download %b! thumburl:%s", new Object[] { Boolean.valueOf(paramBoolean), this.kUU });
    aj.b(this.mYC, this.mYD);
    AppMethodBeat.o(111418);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.aj.3
 * JD-Core Version:    0.6.2
 */