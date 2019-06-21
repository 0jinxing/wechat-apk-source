package com.tencent.mm.plugin.topstory;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.px;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.cve;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class b$2
  implements f
{
  b$2(b paramb)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(65454);
    if (paramm.equals(this.sAu.sAq))
    {
      g.Rg().b(this.sAu.sAq.getType(), this);
      this.sAu.sAq = null;
      paramString = (com.tencent.mm.plugin.topstory.a.c.b)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
        break label80;
      ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "netscene topstory error");
      AppMethodBeat.o(65454);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(65454);
      continue;
      label80: g.RP().Ry().set(ac.a.xVr, paramString.cFt().vOy);
      g.RP().Ry().dsb();
      paramString = new px();
      a.xxA.m(paramString);
      AppMethodBeat.o(65454);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.b.2
 * JD-Core Version:    0.6.2
 */