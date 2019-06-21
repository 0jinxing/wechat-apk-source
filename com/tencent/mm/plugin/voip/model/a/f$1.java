package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.plugin.voip.model.k;
import com.tencent.mm.plugin.voip.model.v2protocal;

final class f$1
  implements com.tencent.mm.ai.f
{
  f$1(f paramf)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(4713);
    if ((paramInt1 != 0) && (paramInt2 == 231))
    {
      a.Loge(this.sTM.TAG, "Voip heartbeat Failed, type:" + paramm.getType() + " errType:" + paramInt1 + " errCode:" + paramInt2);
      this.sTM.sPK.sPp.sVH.sQe = 111;
      this.sTM.sPK.sPp.sVH.sQf = paramInt2;
      this.sTM.sPK.sPp.sVH.sQw = 2;
      this.sTM.sPK.v(1, -9004, "");
      AppMethodBeat.o(4713);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(4713);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.f.1
 * JD-Core Version:    0.6.2
 */