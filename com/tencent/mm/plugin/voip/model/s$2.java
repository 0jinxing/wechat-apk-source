package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.plugin.voip.model.a.d;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class s$2
  implements ap.a
{
  s$2(s params)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(4644);
    Object localObject = this.sTw.sNl;
    ((k)localObject).sPx += 1;
    if (this.sTw.sNl.sPp.nwu == 0)
    {
      a.Loge("MicroMsg.Voip.VoipServiceEx", g.Mq() + "double link switch roomId == 0 ");
      s.a(this.sTw).stopTimer();
    }
    while (true)
    {
      AppMethodBeat.o(4644);
      int j;
      while (true)
      {
        return true;
        this.sTw.sNl.sPp.app2EngineDataEx(this.sTw.sNl.sPp.sVc, this.sTw.sNl.sPp.sVd, this.sTw.sNl.sPp.sVe, 0, 0);
        if ((!this.sTw.sNl.sPw) && (1 == this.sTw.sNl.sPp.field_mGetValidSample))
        {
          this.sTw.sNl.sPw = true;
          this.sTw.sNl.sPy = this.sTw.sNl.sPx;
        }
        if (1 == this.sTw.sNl.sPc)
          this.sTw.sNl.sPc = 15;
        if ((true != this.sTw.sNl.sPw) || (this.sTw.sNl.sPx - this.sTw.sNl.sPy != this.sTw.sNl.sPc) || ((this.sTw.sNl.sPp.sUT & 0x1) != 0))
          break;
        this.sTw.sNl.sPy = this.sTw.sNl.sPx;
        i = this.sTw.sNl.sPp.isDCSameLan();
        j = this.sTw.sNl.sPp.getCurrentConnType();
        if ((1 != i) || (1 != j))
          break label391;
        a.Logi("MicroMsg.Voip.VoipServiceEx", "zhengxue[DOUBLELINK]  In the Same LAN, isDCSameLan = ".concat(String.valueOf(i)));
        localObject = this.sTw.sNl;
        ((k)localObject).sPx += 1;
        AppMethodBeat.o(4644);
      }
      label391: int k = this.sTw.sNl.sPp.getcurstrategy();
      int m = this.sTw.sNl.sPp.isRelayConnReady();
      int n = this.sTw.sNl.sPp.isDCReady();
      int i1 = this.sTw.sNl.sPc - 3;
      int i = i1;
      if (i1 > 15)
        i = 15;
      this.sTw.sNl.sPp.app2EngineLinkQualityEx(i, s.b(this.sTw));
      new d(this.sTw.sNl.sPp.nwu, this.sTw.sNl.sPp.nwv, this.sTw.sNl.sPp.nwC, j, m, n, k, s.b(this.sTw), this.sTw.sNl.sPp.field_realLinkQualityInfoBuffLen).cKw();
      localObject = this.sTw.sNl.sPp;
      ((v2protocal)localObject).sUV += 1;
      a.Logi("MicroMsg.Voip.VoipServiceEx", "zhengxue[DOUBLELINK]  doubleLinkSwitchReportStatus " + this.sTw.sNl.sPc + " isFirstValidSampleSet " + this.sTw.sNl.sPw + " mGetValidSample " + this.sTw.sNl.sPp.field_mGetValidSample + "mDoubleLinkSwitchReqCnt " + this.sTw.sNl.sPp.sUV + "mTimerCounter " + this.sTw.sNl.sPx + "mLastSwitchTimer " + this.sTw.sNl.sPy);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.s.2
 * JD-Core Version:    0.6.2
 */