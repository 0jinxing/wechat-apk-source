package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.topstory.a.c.j;
import com.tencent.mm.plugin.websearch.api.a.a;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.cve;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;

final class n$3
  implements f
{
  n$3(n paramn)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(1760);
    ab.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "onSceneEnd, errType: %s, errCode: %s, scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramm });
    if (paramm.equals(this.sFe.sFa))
    {
      g.Rg().b(1943, this.sFe.fur);
      this.sFe.sFa = null;
      paramm = (j)paramm;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.TopStory.TopStoryVideoDataMgr", "fetch page failed!, response json: %s", new Object[] { paramm.cFt().vOy });
        a.kT(2);
        this.sFe.sDo.abH(paramString);
        this.sFe.sEY = false;
        AppMethodBeat.o(1760);
        return;
      }
      paramString = new n.a(this.sFe, (byte)0);
      n.a.a(paramString, paramm.cFt().vOy);
      if (paramm.sBa.offset != 0)
        break label206;
    }
    while (true)
    {
      n.a.a(paramString, bool);
      d.post(paramString, "TopStory.DecodeRecommendResultTask");
      AppMethodBeat.o(1760);
      break;
      label206: bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.n.3
 * JD-Core Version:    0.6.2
 */