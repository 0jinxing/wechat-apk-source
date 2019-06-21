package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.a.a;

final class k$7
  implements Runnable
{
  k$7(k paramk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4397);
    if ((this.sPI.mStatus != 4) && (this.sPI.mStatus != 5) && (this.sPI.mStatus != 6))
    {
      a.Logi("MicroMsg.Voip.VoipContext", "startConnectDirect status fail, status:" + this.sPI.mStatus);
      AppMethodBeat.o(4397);
    }
    while (true)
    {
      return;
      if (this.sPI.sOM)
      {
        a.Logi("MicroMsg.Voip.VoipContext", "can not startConnectDirect again");
        AppMethodBeat.o(4397);
      }
      else
      {
        this.sPI.sOM = true;
        a.Logi("MicroMsg.Voip.VoipContext", "v2protocal StartConnectChannel direct");
        int i = this.sPI.sPp.connectToPeerDirect();
        if (i < 0)
        {
          a.Loge("MicroMsg.Voip.VoipContext", "v2protocal connectToPeerDirect failed, ret:".concat(String.valueOf(i)));
          this.sPI.sPp.sVH.sQe = 14;
          this.sPI.v(1, -9002, "");
          AppMethodBeat.o(4397);
        }
        else
        {
          this.sPI.cIU();
          AppMethodBeat.o(4397);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.k.7
 * JD-Core Version:    0.6.2
 */