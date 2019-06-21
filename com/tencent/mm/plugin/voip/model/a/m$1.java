package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.plugin.voip.model.k;
import com.tencent.mm.plugin.voip.model.t;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.protobuf.cqk;

final class m$1
  implements f
{
  m$1(m paramm)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(4735);
    a.Logi("MicroMsg.NetSceneVoipSync", "onSceneEnd type:" + paramm.getType() + " errType:" + paramInt1 + " errCode:" + paramInt2);
    try
    {
      if (((cqk)this.sTT.cKx()).wem != this.sTT.sPK.sPp.nwu)
      {
        a.Loge("MicroMsg.NetSceneVoipSync", "syncOnSceneEnd: recv roomId != current roomid");
        AppMethodBeat.o(4735);
        return;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        if (paramInt1 != 0)
        {
          a.Loge("MicroMsg.NetSceneVoipSync", "VoipSync Failed, type:" + paramm.getType() + " errType:" + paramInt1 + " errCode:" + paramInt2);
          this.sTT.sPK.sPp.sVH.sQe = 11;
          this.sTT.sPK.sPp.sVH.sQg = paramInt2;
          this.sTT.sPK.sPp.sVH.sQf = paramInt2;
          this.sTT.sPK.sPp.sVH.sQw = 3;
          if (paramInt1 == 1);
          for (this.sTT.sPK.sPp.sVH.sQq = 8; ; this.sTT.sPK.sPp.sVH.sQq = 99)
          {
            this.sTT.sPK.v(1, -9004, "");
            AppMethodBeat.o(4735);
            break;
          }
        }
        this.sTT.sPK.sPs.q(paramm);
        AppMethodBeat.o(4735);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.m.1
 * JD-Core Version:    0.6.2
 */