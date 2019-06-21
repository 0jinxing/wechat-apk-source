package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;

final class ad$1$1
  implements f
{
  ad$1$1(ad.1 param1)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(108454);
    ab.d("MicroMsg.NetSceneGetSuggestAlias", "summerauth dkcert getcert type:%d ret [%d,%d]", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.gwd.gwc.ehi.onSceneEnd(paramInt1, paramInt2, "", this.gwd.gwc);
      AppMethodBeat.o(108454);
    }
    while (true)
    {
      return;
      this.gwd.gwc.a(this.gwd.gwc.ftf, this.gwd.gwc.ehi);
      AppMethodBeat.o(108454);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.ad.1.1
 * JD-Core Version:    0.6.2
 */