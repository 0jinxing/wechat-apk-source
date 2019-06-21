package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.topstory.a.c.e;
import com.tencent.mm.protocal.protobuf.bqg;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;

final class n$2
  implements f
{
  n$2(n paramn, e parame)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(1759);
    if (((paramm instanceof e)) && (paramm.equals(this.sFj)))
    {
      g.Rg().b(this.sFj.getType(), this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.TopStory.TopStoryVideoDataMgr", "fetch videourl failed!, errType %s, errCode %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        AppMethodBeat.o(1759);
      }
    }
    while (true)
    {
      return;
      d.post(new n.2.1(this, (bqg)((e)paramm).ehh.fsH.fsP), "requestVideoUrlResultParse");
      AppMethodBeat.o(1759);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.n.2
 * JD-Core Version:    0.6.2
 */