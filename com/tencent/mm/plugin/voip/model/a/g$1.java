package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.e.c;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.voip.model.k;
import com.tencent.mm.plugin.voip.model.r;
import com.tencent.mm.plugin.voip.model.u;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cpp;
import com.tencent.mm.protocal.protobuf.cpq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class g$1
  implements f
{
  g$1(g paramg)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(4716);
    com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.NetSceneVoipInvite", "Invite response:" + paramInt1 + " errCode:" + paramInt2 + " status:" + this.sTN.sPK.mStatus);
    if (this.sTN.sPK.mStatus != 2)
    {
      com.tencent.mm.plugin.voip.a.a.Loge("MicroMsg.NetSceneVoipInvite", " invite response with error status:" + this.sTN.sPK.mStatus + " should:2");
      AppMethodBeat.o(4716);
    }
    cpq localcpq;
    int i;
    while (true)
    {
      return;
      localcpq = (cpq)this.sTN.cKx();
      this.sTN.sPK.sPp.sUE = localcpq.xmf;
      this.sTN.sPK.sPp.sUF = localcpq.xmg;
      this.sTN.sPK.sPp.sUG = localcpq.xmh;
      this.sTN.sPK.sPp.sUH = localcpq.xmi;
      this.sTN.sPK.sPp.sUJ = localcpq.xmk;
      this.sTN.sPK.sPp.sUI = localcpq.xmp;
      this.sTN.sPK.sPp.sVk = localcpq.xna;
      this.sTN.sPK.sPp.sUi = localcpq.xlW;
      this.sTN.sPK.sPp.sUL = localcpq.xmr;
      this.sTN.sPK.Gn(localcpq.xlU);
      this.sTN.sPK.sPp.sUk = localcpq.xlX;
      if ((localcpq.xlY != null) && (localcpq.xlY.getILen() >= 12))
      {
        ByteBuffer localByteBuffer = ByteBuffer.wrap(localcpq.xlY.getBuffer().toByteArray(), 8, 4);
        ByteOrder localByteOrder1 = ByteOrder.nativeOrder();
        ByteOrder localByteOrder2 = localByteBuffer.order();
        i = localByteBuffer.getInt();
        com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.NetSceneVoipInvite", "steve:nSvrBaseBRTuneRatio1:" + i + ", nativeOrder:" + localByteOrder1 + ", bbOrder:" + localByteOrder2);
        this.sTN.sPK.sPp.sUK = i;
      }
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.NetSceneVoipInvite", "setSvrConfig onInviteResp: audioTsdfBeyond3G = " + this.sTN.sPK.sPp.sUE + ",audioTsdEdge = " + this.sTN.sPK.sPp.sUF + ",passthroughQosAlgorithm = " + this.sTN.sPK.sPp.sUG + ",fastPlayRepair = " + this.sTN.sPK.sPp.sUH + ", audioDtx = " + this.sTN.sPK.sPp.sUJ + ",switchtcpPktCnt = " + this.sTN.sPK.sPp.sUh + ",SvrCfgListV = " + this.sTN.sPK.sPp.sUI + ", setMaxBRForRelay=" + this.sTN.sPK.sPp.sUL + ",EnableDataAccept = " + this.sTN.sPK.sPp.sVk + ",WifiScanInterval = " + this.sTN.sPK.sPp.sUk + ",BaseBRTuneRatio=" + this.sTN.sPK.sPp.sUK);
      this.sTN.sPK.sPp.sUM = localcpq.xmo;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.NetSceneVoipInvite", "inviteResp AudioAecMode5 = " + this.sTN.sPK.sPp.sUM);
      this.sTN.sPK.sPp.sUN = localcpq.xms;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.NetSceneVoipInvite", "inviteResp AudioEnableXnoiseSup = " + this.sTN.sPK.sPp.sUN);
      i = com.tencent.mm.plugin.voip.a.a.getNetType(ah.getContext());
      if (paramInt1 == 0)
        break;
      if (paramInt1 == 4)
      {
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.NetSceneVoipInvite", "RoomId in InviteResp: " + localcpq.wem + "," + localcpq.wen);
        switch (paramInt2)
        {
        default:
          this.sTN.sPK.sPp.sVH.sQe = 12;
          this.sTN.sPK.sPp.sVH.sQq = 99;
          h.pYm.a(11518, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().cJZ()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cKa()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cIK()), Integer.valueOf(5), Integer.valueOf(i) });
        case 238:
        case 235:
        case 237:
        case 211:
        case 233:
        case 236:
        case 234:
        case 241:
        }
        while (true)
        {
          this.sTN.sPK.sPp.sVH.sQf = paramInt2;
          this.sTN.sPK.v(1, paramInt2, paramString);
          AppMethodBeat.o(4716);
          break;
          this.sTN.sPK.sOP = true;
          this.sTN.sPK.sOR = false;
          this.sTN.sPK.sOQ = false;
          this.sTN.sPK.sPp.sUD = 0;
          this.sTN.sPK.sPp.sUC = 0;
          this.sTN.sPK.setStatus(3);
          this.sTN.sPK.sPp.nwu = localcpq.wem;
          this.sTN.sPK.sPp.nwv = localcpq.wen;
          this.sTN.sPK.sPp.nwC = localcpq.wPb;
          paramString = (cpp)((g)paramm).cKy();
          this.sTN.sPK.sPq.Gu(paramString.xcr);
          AppMethodBeat.o(4716);
          break;
          this.sTN.sPK.sPp.sVH.sQe = 13;
          this.sTN.sPK.sPp.sVH.sQq = 2;
          h.pYm.a(11518, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().cJZ()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cKa()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cIK()), Integer.valueOf(2), Integer.valueOf(i) });
          continue;
          this.sTN.sPK.sPp.sVH.sQe = 13;
          this.sTN.sPK.sPp.sVH.sQq = 9;
          h.pYm.a(11518, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().cJZ()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cKa()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cIK()), Integer.valueOf(2), Integer.valueOf(i) });
          continue;
          this.sTN.sPK.sPp.sVH.sQe = 12;
          this.sTN.sPK.sPp.sVH.sQq = 12;
          h.pYm.a(11518, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().cJZ()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cKa()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cIK()), Integer.valueOf(8), Integer.valueOf(i) });
          continue;
          this.sTN.sPK.sPp.sVH.sQe = 12;
          this.sTN.sPK.sPp.sVH.sQq = 1;
          h.pYm.a(11518, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().cJZ()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cKa()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cIK()), Integer.valueOf(3), Integer.valueOf(i) });
          continue;
          this.sTN.sPK.sPp.sVH.sQe = 12;
          this.sTN.sPK.sPp.sVH.sQq = 10;
          h.pYm.a(11518, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().cJZ()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cKa()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cIK()), Integer.valueOf(7), Integer.valueOf(i) });
          continue;
          this.sTN.sPK.sPp.sVH.sQe = 13;
          this.sTN.sPK.sPp.sVH.sQq = 11;
          h.pYm.a(11518, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().cJZ()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cKa()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cIK()), Integer.valueOf(4), Integer.valueOf(i) });
          continue;
          ab.i("MicroMsg.NetSceneVoipInvite", "invite fail cuz server unavailable! reInvtieInterval is : " + localcpq.xnb + " seconds!");
          com.tencent.mm.plugin.voip.b.cIj().sSW = System.currentTimeMillis();
          if (localcpq.xnb != 0)
            com.tencent.mm.plugin.voip.b.cIj().sSX = (localcpq.xnb * 1000);
          else
            com.tencent.mm.plugin.voip.b.cIj().sSX = 30000L;
        }
      }
      this.sTN.sPK.sPp.sVH.sQe = 12;
      this.sTN.sPK.sPp.sVH.sQf = paramInt2;
      this.sTN.sPK.sPp.sVH.sQq = 99;
      h.pYm.a(11518, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().cJZ()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cKa()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cIK()), Integer.valueOf(9), Integer.valueOf(i) });
      this.sTN.sPK.v(1, -9004, "");
      AppMethodBeat.o(4716);
    }
    this.sTN.sPK.setStatus(4);
    this.sTN.sPK.sPp.nwu = localcpq.wem;
    this.sTN.sPK.sPp.nwv = localcpq.wen;
    this.sTN.sPK.sPp.nwC = localcpq.wPb;
    h.pYm.a(11518, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().cJZ()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cKa()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cIK()), Integer.valueOf(1), Integer.valueOf(i) });
    if (localcpq.xmZ > 0)
    {
      paramString = this.sTN.sPK;
      long l = localcpq.xmZ * 1000;
      paramString.sPD.ae(l, l);
    }
    com.tencent.mm.plugin.voip.b.cIj().cKd();
    boolean bool1 = v2protocal.cKN();
    paramString = com.tencent.mm.bu.a.xtM;
    boolean bool2 = com.tencent.mm.bu.a.dmB();
    boolean bool3;
    label2274: int j;
    if (com.tencent.mm.plugin.voip.b.cIl() == 0)
    {
      bool3 = true;
      paramInt2 = q.etc.erz;
      i = this.sTN.sPK.sPp.sUi >> 4 & 0x7;
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
                break label2611;
              paramInt1 = paramInt2;
            }
          }
        }
      }
    }
    while (true)
    {
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.NetSceneVoipInvite", "NetSceneInviteResp set voipbeauty local=" + bool1 + ", server=" + i + ", blacklist=" + paramInt2 + ", isLibReady=" + bool2 + ",isLibInitOK=" + bool3 + ", UICallback" + this.sTN.sPK.sPq + ", finalFlag=" + paramInt1);
      if (this.sTN.sPK.sPq != null)
        this.sTN.sPK.sPq.setVoipBeauty(paramInt1);
      this.sTN.sPK.sPp.sVl = paramInt1;
      this.sTN.sPK.sPp.sVm = i;
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.NetSceneVoipInvite", "invite ok, roomid =" + this.sTN.sPK.sPp.nwu + ",memberid = " + this.sTN.sPK.sPp.nwC + "VoipSyncInterval = " + localcpq.xmZ);
      this.sTN.sPK.sPq.cJy();
      com.tencent.mm.plugin.voip.a.a.c(com.tencent.mm.plugin.voip.b.cIj().cJZ(), com.tencent.mm.plugin.voip.b.cIj().cKa(), 0, 1);
      AppMethodBeat.o(4716);
      break;
      bool3 = false;
      break label2274;
      label2611: paramInt1 = j;
      if (i >= 0)
        paramInt1 = i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.g.1
 * JD-Core Version:    0.6.2
 */