package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.asm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class f$1
  implements f
{
  f$1(String paramString)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(111236);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.i("MicroMsg.GameCommOpertionProcessor", "pull menu data success. appid:%s", new Object[] { this.hxh });
      g.Rg().b(1369, this);
      al.d(new f.1.1(this, (asm)((as)paramm).lty.fsH.fsP));
      AppMethodBeat.o(111236);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.GameCommOpertionProcessor", "pull menu data fail. appid:%s", new Object[] { this.hxh });
      AppMethodBeat.o(111236);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.f.1
 * JD-Core Version:    0.6.2
 */