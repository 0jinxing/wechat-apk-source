package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.plugin.voip.a.a;

final class m$2
  implements b
{
  m$2(m paramm)
  {
  }

  public final int N(byte[] paramArrayOfByte, int paramInt)
  {
    int i = -1;
    AppMethodBeat.i(4437);
    if (this.sQb.kzf != 2)
    {
      AppMethodBeat.o(4437);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      if (1 == m.n(this.sQb))
      {
        m.o(this.sQb);
        m.d(this.sQb, System.currentTimeMillis());
        a.Logi("MicroMsg.Voip.VoipDeviceHandler", "amyfwang,first play");
      }
      while (true)
      {
        paramInt = this.sQb.sNl.sPp.playCallback(paramArrayOfByte, paramInt);
        if (paramInt >= 0)
          break label181;
        a.Loge("MicroMsg.Voip.VoipDeviceHandler", g.Mq() + "protocal.playcallback ret:" + paramInt);
        AppMethodBeat.o(4437);
        paramInt = i;
        break;
        long l1 = System.currentTimeMillis();
        long l2 = l1 - m.p(this.sQb);
        if (l2 > 1000L)
          a.Logi("MicroMsg.Voip.VoipDeviceHandler", "amyfwang,error,deltaTime:".concat(String.valueOf(l2)));
        m.d(this.sQb, l1);
      }
      label181: m.sPY += 1;
      paramInt = 0;
      AppMethodBeat.o(4437);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.m.2
 * JD-Core Version:    0.6.2
 */