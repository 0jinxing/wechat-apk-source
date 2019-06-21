package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.protobuf.cqe;

final class k$1
  implements f
{
  k$1(k paramk)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(4729);
    a.Logd("MicroMsg.NetSceneVoipSpeedTest", "onSceneEnd type:" + paramm.getType() + " errType:" + paramInt1 + " errCode:" + paramInt2);
    try
    {
      paramString = (cqe)this.sTR.cKx();
      if ((paramString.xoh == 0) || (paramString.xoi == 0))
      {
        paramm = new java/lang/StringBuilder;
        paramm.<init>("onVoipSpeedTestResp: no need to do speed test, svrCount = ");
        a.Loge("MicroMsg.NetSceneVoipSpeedTest", paramString.xoi);
        AppMethodBeat.o(4729);
      }
      while (true)
      {
        return;
        if (this.sTR.sPK.sOU != 1)
        {
          paramString = new java/lang/StringBuilder;
          paramString.<init>("onVoipSpeedTestResp: no need to do speed test, for mSpeedTestStatus = ");
          a.Loge("MicroMsg.NetSceneVoipSpeedTest", this.sTR.sPK.sOU);
          AppMethodBeat.o(4729);
        }
        else
        {
          this.sTR.sPK.sOU = 2;
          this.sTR.sPK.sOW = paramString.xod;
          paramm = this.sTR.sPK.sPp;
          if (paramm.sVp == 0L)
            break;
          a.Logi("MicroMsg.Voip", "v2protocal StartVoipSpeedTest fail: a speedtest is doing");
          AppMethodBeat.o(4729);
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        this.sTR.sPK.sOU = 0;
        AppMethodBeat.o(4729);
        continue;
        paramm.sVp = paramString.xod;
        paramm.field_SpeedTestSvrParaArray = a.a(paramString);
        paramm.StartSpeedTest(paramString.xod, paramString.xoi);
        AppMethodBeat.o(4729);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.k.1
 * JD-Core Version:    0.6.2
 */