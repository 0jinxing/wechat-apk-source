package com.tencent.mm.plugin.voip_cs.b;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.voip.video.i;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.buv;
import com.tencent.mm.protocal.protobuf.coj;
import com.tencent.mm.protocal.protobuf.cok;
import com.tencent.mm.protocal.protobuf.coo;
import com.tencent.mm.protocal.protobuf.coq;
import com.tencent.mm.protocal.protobuf.cou;
import com.tencent.mm.protocal.protobuf.cox;
import com.tencent.mm.protocal.protobuf.cpa;
import com.tencent.mm.protocal.protobuf.cpc;
import com.tencent.mm.protocal.protobuf.cpu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class e
  implements com.tencent.mm.ai.f
{
  public int nwE;
  public int sPz;
  public b tdF;
  public int tdG;
  public int tdH;
  public int tdI;
  public byte[] tdJ;
  public int tdK;
  public int tdL;
  public int tdM;
  public String tdN;
  public int tdO;
  public int tdP;
  public ap tdQ;
  public ap tdR;
  public int tdc;

  public e()
  {
    AppMethodBeat.i(135306);
    this.tdG = 0;
    this.tdc = 0;
    this.tdH = 0;
    this.tdI = 0;
    this.tdJ = null;
    this.nwE = 0;
    this.tdK = 0;
    this.tdL = 0;
    this.tdM = 0;
    this.tdN = "";
    this.sPz = 0;
    this.tdO = 0;
    this.tdP = 999;
    this.tdQ = new ap(Looper.getMainLooper(), new e.1(this), true);
    this.tdR = new ap(Looper.getMainLooper(), new e.2(this), true);
    AppMethodBeat.o(135306);
  }

  private static void b(int paramInt1, int paramInt2, m paramm)
  {
    AppMethodBeat.i(135309);
    ab.i("MicroMsg.voipcs.VoipCSService", "Redirect response:" + paramInt1 + " errCode:" + paramInt2);
    if (paramInt2 != 0)
    {
      ab.i("MicroMsg.voipcs.VoipCSService", " redirect response with error code:".concat(String.valueOf(paramInt2)));
      AppMethodBeat.o(135309);
    }
    while (true)
    {
      return;
      paramm = (cox)((com.tencent.mm.plugin.voip_cs.b.c.d)paramm).ehh.fsH.fsP;
      ab.i("MicroMsg.voipcs.VoipCSService", "roomid " + paramm.xeF + " key " + paramm.wen + "relay addr cnt " + paramm.vIO.size());
      paramm = paramm.vIO;
      cok localcok = new cok();
      Iterator localIterator = paramm.iterator();
      while (localIterator.hasNext())
      {
        coo localcoo = (coo)localIterator.next();
        coj localcoj = new coj();
        c.cMe();
        localcoj.xfs = com.tencent.mm.plugin.voip_cs.b.b.a.acg(localcoo.wCK);
        localcoj.wOO = localcoo.wOO;
        localcok.xma.add(localcoj);
      }
      localcok.xlZ = paramm.size();
      c.cMe().tew.a(localcok, localcok, null, 0, 0);
      AppMethodBeat.o(135309);
    }
  }

  public final void a(cpc paramcpc)
  {
    AppMethodBeat.i(135310);
    if ((paramcpc.xmD <= this.tdG) || (c.cMf().tdM == 3))
      AppMethodBeat.o(135310);
    while (true)
    {
      return;
      ab.i("MicroMsg.voipcs.VoipCSService", "get callee sync resp,notifySeq:" + paramcpc.xmD + ",calleeMemberId:" + paramcpc.xmE + ",calleeStatus:" + paramcpc.xmF + ",calleeSubStatus:" + paramcpc.xmG + ",recv roomId:" + paramcpc.xeF + ",recv roomKey:" + paramcpc.wen);
      if ((c.cMe().tew.sTZ != 0L) && (c.cMe().tew.sTZ != paramcpc.xeF))
      {
        ab.i("MicroMsg.voipcs.VoipCSService", "csRoomId:" + c.cMe().tew.sTZ + ",recv roomId:" + paramcpc.xeF + ",current and recv not equal!!");
        AppMethodBeat.o(135310);
      }
      else
      {
        this.tdG = paramcpc.xmD;
        this.tdc = paramcpc.xmE;
        this.tdH = paramcpc.xmF;
        this.tdI = paramcpc.xmG;
        c.cMg().tdc = this.tdc;
        if (this.tdH != 2)
          break label773;
        ab.i("MicroMsg.voipcs.VoipCSService", "callee accept!");
        this.tdQ.stopTimer();
        cMl();
        c.cMe().tew.nwv = paramcpc.wen;
        ab.i("MicroMsg.voipcs.VoipCSService", "csroomId:" + paramcpc.xeF + ",roomkey:" + paramcpc.wen);
        if (paramcpc.xmH != null);
        for (paramcpc = paramcpc.xmH.toByteArray(); ; paramcpc = null)
        {
          this.tdJ = paramcpc;
          if (c.cMe().tew.field_capInfo != null)
            break label375;
          AppMethodBeat.o(135310);
          break;
        }
        label375: if (this.tdJ != null)
          break;
        AppMethodBeat.o(135310);
      }
    }
    c.cMg().cMi();
    c.cMe().tew.sUb = this.tdJ;
    ab.i("MicroMsg.voipcs.VoipCSService", "calleeCapDump is " + Arrays.toString(c.cMe().tew.sUb));
    ab.i("MicroMsg.voipcs.VoipCSService", "calleeCap length:" + this.tdJ.length);
    if ((c.cMe().tew.sUb != null) && (c.cMe().tew.exchangeCabInfo(c.cMe().tew.sUb, c.cMe().tew.sUb.length) < 0))
      ab.i("MicroMsg.voipcs.VoipCSService", "exchangeCabInfo fail!");
    if (c.cMe().tew.sUe == null);
    for (int i = 0; ; i = c.cMe().tew.sUe.length)
    {
      i = c.cMe().tew.setConfigInfo(c.cMe().tew.sTY, c.cMe().tew.sTZ, c.cMe().tew.nwC, c.cMe().tew.nwv, c.cMe().tew.field_peerId, 1, c.cMe().tew.sUf, c.cMe().tew.sUg, c.cMe().tew.sUd, i, c.cMe().tew.sUe, this.tdP, 1, c.cMe().tew.netType, c.cMe().tew.sUY, c.cMe().tew.sUZ, 255, 0, 0, null, 0);
      if (i != 0)
        ab.e("MicroMsg.voipcs.VoipCSService", "setConfig fail, ret:%d", new Object[] { Integer.valueOf(i) });
      i = c.cMe().tew.connectToPeer();
      if (i != 0)
        ab.e("MicroMsg.voipcs.VoipCSService", "connectToPeer fail, ret:%d", new Object[] { Integer.valueOf(i) });
      if (this.tdR.doT())
        this.tdR.ae(50000L, 50000L);
      c.cMg().tdi = 1;
      AppMethodBeat.o(135310);
      break;
    }
    label773: if ((this.tdH != 0) && (this.tdH != 1) && (this.tdH == 3))
    {
      ab.i("MicroMsg.voipcs.VoipCSService", "callee hangup!");
      c.cMg().dataType = 5;
      c.cMg().cMh();
      c.cMg().tdm = 2;
      if (this.tdI != 1)
        break label865;
      c.cMg().tde = 12;
    }
    while (true)
    {
      if (this.tdF != null)
        this.tdF.GV(1);
      AppMethodBeat.o(135310);
      break;
      label865: if (this.tdI == 3)
        c.cMg().tde = 99;
    }
  }

  public final void ao(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(135308);
    ab.i("MicroMsg.voipcs.VoipCSService", "start netscene invite for username:" + paramString1 + ",appid:" + paramString2 + ",voipCSContext:" + paramString3);
    this.tdN = paramString1;
    this.tdM = 1;
    Object localObject1 = c.cMg();
    ab.d("MicroMsg.VoipCSReportHelper", "markSendInvite");
    if (((d)localObject1).tdz == 0)
      ((d)localObject1).tdz = ((int)(System.currentTimeMillis() / 1000L));
    Object localObject2 = null;
    localObject1 = localObject2;
    if (paramString3 != null)
    {
      localObject1 = localObject2;
      if (!paramString3.equals(""))
        localObject1 = paramString3.getBytes();
    }
    g.Rg().a(823, this);
    c.cMe().tew.nwx = ((int)(System.currentTimeMillis() / 1000L));
    paramString1 = new com.tencent.mm.plugin.voip_cs.b.c.c(c.cMe().tew.nwx, paramString1, c.cMe().tew.netType, (byte[])localObject1, c.cMe().tew.field_capInfo, paramString2);
    ab.i("MicroMsg.voipcs.VoipCSService", "capDump is " + Arrays.toString(c.cMe().tew.field_capInfo));
    g.Rg().a(paramString1, 0);
    AppMethodBeat.o(135308);
  }

  public final void cMl()
  {
    AppMethodBeat.i(135307);
    g.Rg().a(818, this);
    com.tencent.mm.plugin.voip_cs.b.c.f localf = new com.tencent.mm.plugin.voip_cs.b.c.f(c.cMe().tew.sTZ, c.cMe().tew.nwv, this.tdG);
    g.Rg().a(localf, 0);
    AppMethodBeat.o(135307);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(135311);
    ab.i("MicroMsg.voipcs.VoipCSService", "onSceneEnd :netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    Object localObject2;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (paramm.getType() == 823)
      {
        paramm = (cou)((com.tencent.mm.plugin.voip_cs.b.c.c)paramm).ehh.fsH.fsP;
        long l1 = paramm.xeF;
        long l2 = paramm.wen;
        Object localObject1 = paramm.vIO;
        localObject2 = paramm.xmC;
        this.nwE = paramm.xdw;
        this.tdP = paramm.xmB;
        ab.i("MicroMsg.voipcs.VoipCSService", "tcpStartCnt : " + this.tdP);
        c.cMe().tew.sUg = paramm.nwL;
        this.tdK = paramm.nwF;
        c.cMe().tew.sUY = paramm.nwQ;
        c.cMe().tew.sUZ = paramm.wPf.toByteArray();
        c.cMe().tew.sUf = paramm.nwM;
        paramString = new cok();
        Object localObject3 = ((List)localObject1).iterator();
        Object localObject4;
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (coo)((Iterator)localObject3).next();
          localObject5 = new coj();
          c.cMe();
          ((coj)localObject5).xfs = com.tencent.mm.plugin.voip_cs.b.b.a.acg(((coo)localObject4).wCK);
          ((coj)localObject5).wOO = ((coo)localObject4).wOO;
          paramString.xma.add(localObject5);
        }
        paramString.xlZ = ((List)localObject1).size();
        Object localObject5 = new cok();
        localObject1 = ((List)localObject2).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject3 = (coo)((Iterator)localObject1).next();
          localObject4 = new coj();
          c.cMe();
          ((coj)localObject4).xfs = com.tencent.mm.plugin.voip_cs.b.b.a.acg(((coo)localObject3).wCK);
          ((coj)localObject4).wOO = ((coo)localObject3).wOO;
          ((cok)localObject5).xma.add(localObject4);
        }
        ((cok)localObject5).xlZ = ((List)localObject2).size();
        c.cMe().tew.sTZ = l1;
        c.cMe().tew.nwv = l2;
        ab.i("MicroMsg.voipcs.VoipCSService", "recv invite resp csRoomId : " + l1 + ",roomKey:" + l2);
        c.cMe().tew.sVi = paramm.xmz;
        c.cMe().tew.sVj = paramm.xmA;
        paramm = new cpu();
        paramm.xnK = 0;
        paramm.xnL = 0;
        paramm.xnM = 0;
        paramm.userName = "";
        paramm.gDC = "";
        if (c.cMe().tew.a(paramString, paramString, paramString, paramm, null) != 0)
          ab.i("MicroMsg.voipcs.VoipCSService", "setIp fail!");
        paramm = c.cMg();
        paramString = this.tdN;
        ab.d("MicroMsg.VoipCSReportHelper", "setVoipCSBaseInfo");
        paramm.tda = l1;
        paramm.nwv = l2;
        paramm.tdb = paramString;
        if (this.tdQ.doT())
        {
          if (this.nwE > 0)
          {
            paramString = this.tdQ;
            l2 = this.nwE * 1000;
            paramString.ae(l2, l2);
          }
        }
        else
        {
          paramString = c.cMg();
          ab.d("MicroMsg.VoipCSReportHelper", "markRecvInvite");
          if (paramString.tdz != 0)
            paramString.tdA = ((int)(System.currentTimeMillis() / 1000L));
          AppMethodBeat.o(135311);
        }
      }
    while (true)
    {
      return;
      this.tdQ.ae(4000L, 4000L);
      break;
      if (paramm.getType() == 818)
      {
        paramString = (cpc)((com.tencent.mm.plugin.voip_cs.b.c.f)paramm).ehh.fsH.fsP;
        ab.i("MicroMsg.voipcs.VoipCSService", "sync status = " + paramString.xmF + ",notifySeq = " + paramString.xmD);
        a(paramString);
        AppMethodBeat.o(135311);
      }
      else if (paramm.getType() == 880)
      {
        paramString = (coq)((com.tencent.mm.plugin.voip_cs.b.c.a)paramm).ehh.fsH.fsP;
        if ((c.cMe().tew.sTZ == paramString.xeF) && (c.cMe().tew.nwv == paramString.wen))
          ab.i("MicroMsg.voipcs.VoipCSService", "hangup success!");
        g.Rg().b(880, this);
        c.cMg().GW(com.tencent.mm.plugin.voip_cs.b.a.a.cMn().sTj.cLN());
        AppMethodBeat.o(135311);
      }
      else
      {
        if (paramm.getType() == 106)
        {
          localObject2 = (com.tencent.mm.plugin.messenger.a.f)paramm;
          paramString = "";
          paramm = "";
          if (((com.tencent.mm.plugin.messenger.a.f)localObject2).bOj() != null)
          {
            paramString = ((com.tencent.mm.plugin.messenger.a.f)localObject2).bOj().vXm;
            paramm = ((com.tencent.mm.plugin.messenger.a.f)localObject2).bOj().wyX.wVI;
          }
          while (true)
          {
            this.tdF.gF(paramString, paramm);
            AppMethodBeat.o(135311);
            break;
            ab.i("MicroMsg.voipcs.VoipCSService", "search Or Recommend items is null or empty !");
          }
        }
        if (paramm.getType() == 285)
        {
          b(paramInt1, paramInt2, paramm);
          AppMethodBeat.o(135311);
        }
        else if (paramm.getType() == 312)
        {
          paramString = (cpa)((com.tencent.mm.plugin.voip_cs.b.c.e)paramm).ehh.fsH.fsP;
          if ((paramString.xeF == c.cMe().tew.sTZ) && (paramString.wen == c.cMe().tew.nwv))
            ab.i("MicroMsg.voipcs.VoipCSService", "report data success!");
          AppMethodBeat.o(135311);
          continue;
          ab.i("MicroMsg.voipcs.VoipCSService", "onSceneEnd  resp error!:netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
          if ((paramInt1 != 0) && (paramInt1 != 4))
          {
            this.tdO = -1;
            this.tdF.onError(10);
            AppMethodBeat.o(135311);
          }
          else if (paramm.getType() == 823)
          {
            if (paramInt2 == 406)
            {
              ab.i("MicroMsg.voipcs.VoipCSService", "CS_INVITE_RESP_REPEAT_INVTIE 503..");
              AppMethodBeat.o(135311);
            }
            else
            {
              c.cMg().dataType = 1;
              this.tdO = 823;
              this.tdF.onError(paramInt2);
              AppMethodBeat.o(135311);
            }
          }
          else if ((paramm.getType() != 880) && (paramm.getType() != 818) && (paramm.getType() == 106))
          {
            this.tdF.gF("", "");
          }
        }
        else
        {
          AppMethodBeat.o(135311);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.e
 * JD-Core Version:    0.6.2
 */