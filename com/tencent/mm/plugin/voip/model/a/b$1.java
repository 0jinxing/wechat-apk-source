package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.e.c;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.voip.model.VoipScoreState;
import com.tencent.mm.plugin.voip.model.k;
import com.tencent.mm.plugin.voip.model.u;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.com;
import com.tencent.mm.protocal.protobuf.cpr;
import com.tencent.mm.protocal.protobuf.cpx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class b$1
  implements f
{
  b$1(b paramb)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(4698);
    com.tencent.mm.plugin.voip.a.a.Logi(this.sTH.TAG, "Anwser response:" + paramInt1 + " errCode:" + paramInt2 + " status:" + this.sTH.sPK.mStatus);
    if (this.sTH.sPK.mStatus == 1)
    {
      com.tencent.mm.plugin.voip.a.a.Logi(this.sTH.TAG, "reject ok!");
      AppMethodBeat.o(4698);
    }
    while (true)
    {
      return;
      if (this.sTH.sPK.mStatus != 4)
      {
        com.tencent.mm.plugin.voip.a.a.Loge(this.sTH.TAG, "Anwser response not within WAITCONNECT, ignored.");
        AppMethodBeat.o(4698);
      }
      else if (paramInt1 != 0)
      {
        if (paramInt1 == 4)
        {
          this.sTH.sPK.sPp.sVH.sQe = 12;
          this.sTH.sPK.sPp.sVH.sQf = paramInt2;
          this.sTH.sPK.v(1, paramInt2, "");
          AppMethodBeat.o(4698);
        }
        else
        {
          this.sTH.sPK.sPp.sVH.sQe = 12;
          this.sTH.sPK.sPp.sVH.sQf = paramInt2;
          this.sTH.sPK.v(1, -9004, "");
          AppMethodBeat.o(4698);
        }
      }
      else
      {
        paramString = (com)this.sTH.cKx();
        this.sTH.sPK.sPp.nwu = paramString.wem;
        this.sTH.sPK.sPp.nwv = paramString.wen;
        this.sTH.sPK.sPp.nwC = paramString.xlS;
        this.sTH.sPK.sPp.sUE = paramString.xmf;
        this.sTH.sPK.sPp.sUF = paramString.xmg;
        this.sTH.sPK.sPp.sUG = paramString.xmh;
        this.sTH.sPK.sPp.sUH = paramString.xmi;
        this.sTH.sPK.sPp.sUJ = paramString.xmk;
        this.sTH.sPK.sPp.sUI = paramString.xmp;
        this.sTH.sPK.sPp.sUi = paramString.xlW;
        this.sTH.sPK.sPp.sUL = paramString.xmr;
        this.sTH.sPK.Gn(paramString.xlU);
        this.sTH.sPK.sPp.sUk = paramString.xlX;
        Object localObject;
        if (paramString.xlY.getILen() >= 12)
        {
          localObject = ByteBuffer.wrap(paramString.xlY.getBuffer().toByteArray(), 8, 4);
          ByteOrder localByteOrder = ByteOrder.nativeOrder();
          paramm = ((ByteBuffer)localObject).order();
          paramInt1 = ((ByteBuffer)localObject).getInt();
          com.tencent.mm.plugin.voip.a.a.Logd(this.sTH.TAG, "steve:nSvrBaseBRTuneRatio1:" + paramInt1 + ", nativeOrder:" + localByteOrder + ", bbOrder:" + paramm);
          this.sTH.sPK.sPp.sUK = paramInt1;
        }
        com.tencent.mm.plugin.voip.a.a.Logi(this.sTH.TAG, "onAnwserResp: audioTsdfBeyond3G = " + this.sTH.sPK.sPp.sUE + ",audioTsdEdge = " + this.sTH.sPK.sPp.sUF + ",passthroughQosAlgorithm = " + this.sTH.sPK.sPp.sUG + ",fastPlayRepair = " + this.sTH.sPK.sPp.sUH + ", audioDtx = " + this.sTH.sPK.sPp.sUJ + ", switchtcppktCnt=" + this.sTH.sPK.sPp.sUh + ", SvrCfgListV=" + this.sTH.sPK.sPp.sUI + ", setMaxBRForRelay=" + this.sTH.sPK.sPp.sUL + ", RedirectreqThreshold=" + paramString.xlT.xnx + ", BothSideSwitchFlag=" + paramString.xlT.xny + ", WifiScanInterval=" + paramString.xlX + ", BaseBRTuneRatio=" + this.sTH.sPK.sPp.sUK);
        this.sTH.sPK.sPp.sUM = paramString.xmo;
        this.sTH.sPK.sPp.sUN = paramString.xms;
        com.tencent.mm.plugin.voip.a.a.Logi(this.sTH.TAG, "answerResp AudioAecMode5 = " + this.sTH.sPK.sPp.sUM);
        boolean bool1 = v2protocal.cKN();
        paramm = com.tencent.mm.bu.a.xtM;
        boolean bool2 = com.tencent.mm.bu.a.dmB();
        boolean bool3;
        label943: int i;
        int j;
        if (com.tencent.mm.plugin.voip.b.cIl() == 0)
        {
          bool3 = true;
          paramInt2 = q.etc.erz;
          i = this.sTH.sPK.sPp.sUi >> 4 & 0x7;
          j = 0;
          paramInt1 = j;
          if (bool1)
          {
            paramInt1 = j;
            if (paramInt2 != 0)
            {
              paramInt1 = j;
              if (bool2)
              {
                paramInt1 = j;
                if (bool3)
                {
                  if (paramInt2 <= 0)
                    break label1480;
                  paramInt1 = paramInt2;
                }
              }
            }
          }
          label1010: com.tencent.mm.plugin.voip.a.a.Logi(this.sTH.TAG, "NetSceneAnswerResp set voipbeauty local=" + bool1 + ", server=" + i + ", blacklist=" + paramInt2 + ", isLibReady=" + bool2 + ",isLibInitOK=" + bool3 + ", UICallback" + this.sTH.sPK.sPq + ", finalFlag=" + paramInt1);
          if (this.sTH.sPK.sPq != null)
            this.sTH.sPK.sPq.setVoipBeauty(paramInt1);
          this.sTH.sPK.sPp.sVl = paramInt1;
          this.sTH.sPK.sPp.sVm = i;
          this.sTH.sPK.sOP = true;
          com.tencent.mm.plugin.voip.a.a.Logi(this.sTH.TAG, "answer ok, roomid =" + this.sTH.sPK.sPp.nwu + ",memberid = " + this.sTH.sPK.sPp.nwC);
          localObject = paramString.xlT;
          if (((cpr)localObject).nwQ <= 0)
            break label1494;
          ((cpr)localObject).nwQ -= 1;
          com.tencent.mm.plugin.voip.a.a.Logi(this.sTH.TAG, "zhengxue[ENCRYPT] got encryptStrategy[" + ((cpr)localObject).nwQ + "] from answerresp relaydata");
          com.tencent.mm.plugin.voip.a.a.Logi(this.sTH.TAG, "answer with relayData peerid.length =" + ((cpr)localObject).xlM.vJd.getILen());
          com.tencent.mm.plugin.voip.a.a.Logi(this.sTH.TAG, "answer with relayData capinfo.length =" + ((cpr)localObject).xlN.vJd.getILen());
          this.sTH.sPK.Gm(((cpr)localObject).xnc);
          this.sTH.sPK.sPB.a(((cpr)localObject).xnC, ((cpr)localObject).xnB, this.sTH.sPK.sPp.nwu, this.sTH.sPK.sPp.nwv);
        }
        try
        {
          paramString = g.RS();
          paramm = new com/tencent/mm/plugin/voip/model/a/b$1$1;
          paramm.<init>(this, (cpr)localObject);
          paramString.aa(paramm);
          AppMethodBeat.o(4698);
          continue;
          bool3 = false;
          break label943;
          label1480: paramInt1 = j;
          if (i < 0)
            break label1010;
          paramInt1 = i;
          break label1010;
          label1494: ((cpr)localObject).nwQ = 1;
          com.tencent.mm.plugin.voip.a.a.Logi(this.sTH.TAG, "zhengxue[LOGIC]:got no EncryptStrategy in answerresp mrdata");
        }
        catch (Exception paramString)
        {
          ab.e(this.sTH.TAG, "get proxy ip fail..");
          AppMethodBeat.o(4698);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.b.1
 * JD-Core Version:    0.6.2
 */