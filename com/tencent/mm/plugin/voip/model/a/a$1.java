package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.bt.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.voip.model.k;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.coi;
import com.tencent.mm.protocal.protobuf.cpr;
import com.tencent.mm.protocal.protobuf.cpx;
import com.tencent.mm.sdk.platformtools.al;

final class a$1
  implements f
{
  a$1(a parama)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, final String paramString, m paramm)
  {
    AppMethodBeat.i(4694);
    com.tencent.mm.plugin.voip.a.a.Logi(this.sTE.TAG, "ack response:" + paramInt1 + " errCode:" + paramInt2 + " status:" + this.sTE.sPK.mStatus);
    if (this.sTE.sPK.mStatus == 1)
    {
      com.tencent.mm.plugin.voip.a.a.Logi(this.sTE.TAG, "reject ok!");
      AppMethodBeat.o(4694);
    }
    while (true)
    {
      return;
      if (this.sTE.sPK.mStatus != 3)
      {
        com.tencent.mm.plugin.voip.a.a.Loge(this.sTE.TAG, "ack response not within WAITCONNECT, ignored.");
        AppMethodBeat.o(4694);
      }
      else if (paramInt1 != 0)
      {
        if (paramInt1 == 4)
        {
          this.sTE.sPK.sPp.sVH.sQe = 12;
          this.sTE.sPK.sPp.sVH.sQf = paramInt2;
          this.sTE.sPK.v(1, paramInt2, "");
          AppMethodBeat.o(4694);
        }
        else
        {
          this.sTE.sPK.sPp.sVH.sQe = 12;
          this.sTE.sPK.sPp.sVH.sQf = paramInt2;
          this.sTE.sPK.v(1, -9004, "");
          AppMethodBeat.o(4694);
        }
      }
      else
      {
        paramm = (coi)this.sTE.cKx();
        if (paramm.xlL == 1)
          break;
        com.tencent.mm.plugin.voip.a.a.Logi(this.sTE.TAG, "onVoipAckResp: do not use preconnect");
        AppMethodBeat.o(4694);
      }
    }
    this.sTE.sPK.sOR = true;
    this.sTE.sPK.sPp.sUC = 1;
    this.sTE.sPK.sPp.nwu = paramm.wem;
    this.sTE.sPK.sPp.nwv = paramm.wen;
    this.sTE.sPK.sPp.nwC = paramm.xlS;
    this.sTE.sPK.sPp.sUi = paramm.xlW;
    this.sTE.sPK.sPp.sUk = paramm.xlX;
    this.sTE.sPK.Gn(paramm.xlU);
    com.tencent.mm.plugin.voip.a.a.Logi(this.sTE.TAG, "ack ok, roomid =" + this.sTE.sPK.sPp.nwu + ",memberid = " + this.sTE.sPK.sPp.nwC);
    paramString = paramm.xlT;
    if (paramString.nwQ > 0)
    {
      paramString.nwQ -= 1;
      com.tencent.mm.plugin.voip.a.a.Logi(this.sTE.TAG, "zhengxue[ENCRYPT] got encryptStrategy[" + paramString.nwQ + "] from ackresp relaydata");
    }
    while (true)
    {
      com.tencent.mm.plugin.voip.a.a.Logi(this.sTE.TAG, "ack with switchtcpcnt  =" + this.sTE.sPK.sPp.sUh + " RedirectReqThreshold =" + paramString.xnx + " BothSideSwitchFlag =" + paramString.xny + " WifiScanInterval =" + paramm.xlX);
      this.sTE.sPK.sPp.sVb = paramString.xny;
      if ((paramString.xnA != null) && (paramString.xnA.getBuffer() != null))
        this.sTE.sPK.sPp.sUj = paramString.xnA.getBuffer().toByteArray();
      this.sTE.sPK.Gm(paramString.xnc);
      this.sTE.sPK.bo(paramString.xlM.vJd.getBuffer().toByteArray());
      if ((paramString.xnj != null) && (paramString.xnj.getBuffer() != null) && (paramString.xnv != null) && (paramString.xnv.getBuffer() != null))
        this.sTE.sPK.a(paramString.xnj.getBuffer().toByteArray(), paramString.xni, paramString.nwQ, paramString.xnv.getBuffer().toByteArray());
      this.sTE.sPK.i(paramString.xnm, paramString.xnn, paramString.xno, paramString.xnp, paramString.xnq);
      this.sTE.sPK.bp(paramString.xlN.vJd.getBuffer().toByteArray());
      g.RS().aa(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(4693);
          a.1.this.sTE.sPK.a(paramString.xnd, paramString.xne, paramString.xnl, paramString.xnE);
          a.1.this.sTE.sPK.Gl(paramString.xnu);
          a.1.this.sTE.sPK.Gk(paramString.xnx);
          if ((paramString.xns != null) && (paramString.xnt != null))
            a.1.this.sTE.sPK.b(paramString.xnr, paramString.xns.getBuffer().toByteArray(), paramString.xnt.getBuffer().toByteArray());
          com.tencent.mm.plugin.voip.a.a.Logi(a.1.this.sTE.TAG, "ack success, try connect channel");
          a.1.this.sTE.sPK.cIT();
          AppMethodBeat.o(4693);
        }
      });
      AppMethodBeat.o(4694);
      break;
      paramString.nwQ = 1;
      com.tencent.mm.plugin.voip.a.a.Logi(this.sTE.TAG, "zhengxue[LOGIC]:got no EncryptStrategy in ackresp mrdata");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.a.1
 * JD-Core Version:    0.6.2
 */