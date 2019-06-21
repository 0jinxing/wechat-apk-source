package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cpf;
import com.tencent.mm.protocal.protobuf.cpg;
import com.tencent.mm.protocal.protobuf.cpr;
import com.tencent.mm.protocal.protobuf.cpx;
import com.tencent.mm.protocal.protobuf.cqi;
import com.tencent.mm.protocal.protobuf.cqk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.io.IOException;
import java.util.LinkedList;

public final class t
{
  k sNl;
  private int sTA;
  cpr sTy;
  private cpg sTz;

  public t(k paramk)
  {
    AppMethodBeat.i(4682);
    this.sNl = null;
    this.sTy = new cpr();
    this.sTz = null;
    this.sTA = 0;
    this.sNl = paramk;
    AppMethodBeat.o(4682);
  }

  private void a(cpg paramcpg)
  {
    AppMethodBeat.i(4684);
    if (paramcpg == null)
    {
      a.Loge("MicroMsg.Voip.VoipSyncHandle", "failed to pushVoipCmdList , VoipCmdList = null");
      this.sTA += 1;
      AppMethodBeat.o(4684);
    }
    while (true)
    {
      return;
      if (this.sTz == null)
        this.sTz = new cpg();
      for (int i = 0; i < paramcpg.jBv; i++)
      {
        cpf localcpf = (cpf)paramcpg.jBw.get(i);
        this.sTz.jBw.add(localcpf);
      }
      this.sTz.jBv = this.sTz.jBw.size();
      AppMethodBeat.o(4684);
    }
  }

  private void b(cpg paramcpg)
  {
    AppMethodBeat.i(4685);
    if ((this.sTz == null) || (this.sTz.jBv <= 0))
      AppMethodBeat.o(4685);
    while (true)
    {
      return;
      for (int i = 0; i < this.sTz.jBv; i++)
      {
        cpf localcpf = (cpf)this.sTz.jBw.get(i);
        paramcpg.jBw.add(localcpf);
      }
      paramcpg.jBv = paramcpg.jBw.size();
      cKs();
      AppMethodBeat.o(4685);
    }
  }

  public final void GB(int paramInt)
  {
    AppMethodBeat.i(4683);
    Object localObject1 = a.GF(paramInt);
    Object localObject2 = new SKBuiltinBuffer_t();
    ((SKBuiltinBuffer_t)localObject2).setBuffer((byte[])localObject1);
    localObject1 = new SKBuiltinBuffer_t();
    try
    {
      ((SKBuiltinBuffer_t)localObject1).setBuffer(((SKBuiltinBuffer_t)localObject2).toByteArray());
      localObject2 = new cpf();
      ((cpf)localObject2).wat = 3;
      ((cpf)localObject2).wau = ((SKBuiltinBuffer_t)localObject1);
      ((cpf)localObject2).ndG = com.tencent.mm.model.r.Yz();
      localObject1 = new cpg();
      ((cpg)localObject1).jBv = 1;
      ((cpg)localObject1).jBw.add(localObject2);
      a((cpg)localObject1, false, 4);
      AppMethodBeat.o(4683);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", localIOException, "", new Object[0]);
        AppMethodBeat.o(4683);
      }
    }
  }

  public final int a(cpg paramcpg, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(4687);
    if (this.sNl.sPp.nwu == 0)
    {
      a.Loge("MicroMsg.Voip.VoipSyncHandle", com.tencent.mm.compatible.util.g.Mq() + "failed to do voip sync , roomid = 0");
      AppMethodBeat.o(4687);
    }
    while (true)
    {
      return 0;
      if (!this.sNl.sPv)
        break;
      a.Loge("MicroMsg.Voip.VoipSyncHandle", com.tencent.mm.compatible.util.g.Mq() + "voip syncing, push to cache...");
      a(paramcpg);
      AppMethodBeat.o(4687);
    }
    this.sNl.sPv = true;
    if (paramcpg == null)
    {
      paramcpg = new cpg();
      paramcpg.jBv = 0;
      paramcpg.jBw = new LinkedList();
    }
    while (true)
    {
      b(paramcpg);
      this.sTA = 0;
      if (this.sNl.sPt == null)
        this.sNl.sPt = "".getBytes();
      a.Logi("MicroMsg.Voip.VoipSyncHandle", "____doVoipSync, fromjni:" + paramBoolean + ",cmdList:" + paramcpg.jBv + ",syncKey.length:" + this.sNl.sPt.length + ",selector:" + paramInt);
      new com.tencent.mm.plugin.voip.model.a.m(this.sNl.sPp.nwu, paramcpg, this.sNl.sPt, this.sNl.sPp.nwv, paramInt).cKw();
      AppMethodBeat.o(4687);
      break;
    }
  }

  public final void a(cpx paramcpx)
  {
    AppMethodBeat.i(4689);
    com.tencent.mm.kernel.g.RS().aa(new t.1(this, paramcpx));
    AppMethodBeat.o(4689);
  }

  public final void a(cqi paramcqi, int paramInt)
  {
    AppMethodBeat.i(4688);
    a.Logi("MicroMsg.Voip.VoipSyncHandle", "onStatusChanged:  status:" + paramcqi.jBT);
    if (paramcqi.jBT == 1)
    {
      this.sNl.sOO = true;
      if (1 == paramInt)
        this.sNl.sPp.sVH.cJb();
      if (3 == paramInt)
        this.sNl.sPp.sVH.cJc();
      a.Logi("MicroMsg.Voip.VoipSyncHandle", "zhengxue[DataAccept]onVoipSyncStatus:ACCEPTdata Flag: ".concat(String.valueOf(paramInt)));
      this.sNl.sPq.bGL();
      com.tencent.mm.plugin.voip.b.cIj().sSP.cKr();
      this.sNl.sOP = true;
      if (this.sNl.sOR == true)
      {
        this.sNl.sOR = false;
        if (this.sNl.sON == true)
        {
          a.Logi("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus:ACCEPT, pre-connect already success");
          this.sNl.cIO();
        }
      }
      else
      {
        h.pYm.e(11519, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().cJZ()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cKa()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cIK()), Integer.valueOf(2) });
        this.sNl.cIT();
        this.sNl.cIV();
        AppMethodBeat.o(4688);
      }
    }
    while (true)
    {
      return;
      if (this.sNl.sOQ == true)
      {
        a.Logi("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACCEPT, pre-connect already fail");
        this.sNl.v(1, -9000, "");
        break;
      }
      a.Logi("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACCEPT, pre-connect still connecting...");
      break;
      if (paramcqi.jBT == 6)
      {
        a.Logi("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACKED");
        a.Logi("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: try use pre-connect");
        this.sNl.sOR = true;
        this.sNl.sPp.sUC = 1;
        this.sNl.cIT();
        AppMethodBeat.o(4688);
      }
      else if (paramcqi.jBT == 8)
      {
        a.Logi("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACK BUSY");
        this.sNl.sPp.sVH.sQf = 211;
        this.sNl.sPp.sVH.sQe = 11;
        this.sNl.sPp.sVH.sQq = 12;
        h.pYm.e(11519, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().cJZ()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cKa()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cIK()), Integer.valueOf(3) });
        this.sNl.v(1, 211, "");
        this.sNl.cIV();
        AppMethodBeat.o(4688);
      }
      else if (paramcqi.jBT == 2)
      {
        a.Logi("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus...MM_VOIP_SYNC_STATUS_REJECT");
        this.sNl.sPp.sVH.sQe = 103;
        this.sNl.sPp.sVH.sQq = 4;
        this.sNl.sPp.sVH.sQx = ((int)(System.currentTimeMillis() - this.sNl.sPp.sVH.beginTime));
        h.pYm.e(11519, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().cJZ()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cKa()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cIK()), Integer.valueOf(1) });
        this.sNl.cIV();
        this.sNl.v(4, 0, "");
        AppMethodBeat.o(4688);
      }
      else if (paramcqi.jBT == 3)
      {
        this.sNl.sPp.sVH.sQq = 5;
        AppMethodBeat.o(4688);
      }
      else if (paramcqi.jBT == 4)
      {
        a.Logi("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus...MM_VOIP_SYNC_STATUS_SHUTDOWN");
        if (this.sNl.mStatus < 6)
          this.sNl.sPp.sVH.sQr = 1;
        this.sNl.sPp.sVH.sQe = 110;
        this.sNl.v(6, 0, "");
        this.sNl.cIV();
        AppMethodBeat.o(4688);
      }
      else
      {
        a.Logi("MicroMsg.Voip.VoipSyncHandle", "onStatusChanged: unknow status:" + paramcqi.jBT);
        AppMethodBeat.o(4688);
      }
    }
  }

  public final void b(cpx paramcpx)
  {
    AppMethodBeat.i(4690);
    this.sNl.bq(paramcpx.vJd.getBuffer().toByteArray());
    AppMethodBeat.o(4690);
  }

  public final void c(SKBuiltinBuffer_t paramSKBuiltinBuffer_t)
  {
    AppMethodBeat.i(4691);
    int i = a.bv(paramSKBuiltinBuffer_t.getBuffer().toByteArray());
    a.Logi("MicroMsg.Voip.VoipSyncHandle", "voipSync remote status changed, status = ".concat(String.valueOf(i)));
    this.sNl.Gg(i & 0xFF);
    AppMethodBeat.o(4691);
  }

  public final void cKs()
  {
    AppMethodBeat.i(4686);
    if (this.sTz == null)
      AppMethodBeat.o(4686);
    while (true)
    {
      return;
      this.sTz.jBw.clear();
      this.sTz.jBv = 0;
      this.sTz = null;
      this.sTA = 0;
      AppMethodBeat.o(4686);
    }
  }

  public final void q(com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(4692);
    ab.i("MicroMsg.Voip.VoipSyncHandle", "____VoipSyncResp");
    this.sNl.sPv = false;
    Object localObject1 = (cqk)((com.tencent.mm.plugin.voip.model.a.m)paramm).cKx();
    this.sNl.sPp.parseSyncKeyBuff(this.sNl.sPt, this.sNl.sPt.length);
    int i = this.sNl.sPp.field_statusSyncKey;
    int j = this.sNl.sPp.field_relayDataSyncKey;
    int k = this.sNl.sPp.field_connectingStatusKey;
    this.sNl.sPp.parseSyncKeyBuff(((cqk)localObject1).vTO.getBuffer().toByteArray(), ((cqk)localObject1).vTO.getILen());
    int m = this.sNl.sPp.field_statusSyncKey;
    int n = this.sNl.sPp.field_relayDataSyncKey;
    int i1 = this.sNl.sPp.field_connectingStatusKey;
    ab.i("MicroMsg.Voip.VoipSyncHandle", "VoipSyncResp: oldStatusSyncKey:" + i + " oldRelayDataSyncKey:" + j + " oldConnectingStatusSyncKey:" + k);
    ab.i("MicroMsg.Voip.VoipSyncHandle", "VoipSyncResp: newStatusSyncKey:" + m + " newRelayDataSyncKey:" + n + " newConnectingStatusSyncKey:" + i1);
    this.sNl.sPt = ((cqk)localObject1).vTO.getBuffer().toByteArray();
    ab.i("MicroMsg.Voip.VoipSyncHandle", "voipSync response: continueflag=" + ((cqk)localObject1).vQe);
    localObject1 = ((cqk)localObject1).xor.jBw;
    if ((localObject1 != null) && (((LinkedList)localObject1).size() != 0))
    {
      ab.i("MicroMsg.Voip.VoipSyncHandle", " syncOnSceneEnd cmdlist size" + ((LinkedList)localObject1).size());
      int i2 = ((com.tencent.mm.plugin.voip.model.a.m)paramm).cKv();
      ab.i("MicroMsg.Voip.VoipSyncHandle", " syncOnSceneEnd cmdlist size:" + ((LinkedList)localObject1).size() + ",selector = " + i2);
      i2 = 0;
      if (i2 < ((LinkedList)localObject1).size())
      {
        paramm = (cpf)((LinkedList)localObject1).get(i2);
        int i3 = paramm.wat;
        ab.i("MicroMsg.Voip.VoipSyncHandle", "__parse sync resp, item cmdid:".concat(String.valueOf(i3)));
        if (i3 == 1)
          if (m > i)
          {
            if (this.sNl.sPp.nwu != 0)
              break label461;
            a.Loge("MicroMsg.Voip.VoipSyncHandle", "voipSyncStatus ignored , roomid = 0");
          }
        while (true)
        {
          i2++;
          break;
          label461: Object localObject2;
          try
          {
            localObject2 = new com/tencent/mm/protocal/protobuf/cqi;
            ((cqi)localObject2).<init>();
            localObject2 = (cqi)((cqi)localObject2).parseFrom(paramm.wau.getBuffer().toByteArray());
            a.Logi("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus in...from user=" + paramm.ndG + ",itemStatus =  " + ((cqi)localObject2).jBT);
            a((cqi)localObject2, 3);
          }
          catch (IOException paramm)
          {
            ab.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", paramm, "", new Object[0]);
          }
          continue;
          if (i3 == 2)
          {
            if (n > j)
              if (this.sNl.sPp.nwu == 0)
              {
                a.Loge("MicroMsg.Voip.VoipSyncHandle", "RelayData ignored , roomid = 0");
              }
              else
              {
                try
                {
                  localObject2 = new com/tencent/mm/protocal/protobuf/cpx;
                  ((cpx)localObject2).<init>();
                  localObject2 = (cpx)((cpx)localObject2).parseFrom(paramm.wau.getBuffer().toByteArray());
                  a.Logi("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncRelayData ...relayType = " + ((cpx)localObject2).jCt + ",from user = " + paramm.ndG);
                  if (((cpx)localObject2).jCt != 5)
                    break label696;
                  a((cpx)localObject2);
                }
                catch (IOException paramm)
                {
                  ab.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", paramm, "", new Object[0]);
                }
                continue;
                label696: if (((cpx)localObject2).jCt == 3)
                {
                  this.sNl.bp(((cpx)localObject2).vJd.getBuffer().toByteArray());
                  if ((((cpx)localObject2).vJd != null) && (((cpx)localObject2).vJd.getBuffer() != null))
                    this.sTy.xlN = ((cpx)localObject2);
                }
                else if (((cpx)localObject2).jCt == 2)
                {
                  this.sNl.bo(((cpx)localObject2).vJd.getBuffer().toByteArray());
                  if ((((cpx)localObject2).vJd != null) && (((cpx)localObject2).vJd.getBuffer() != null))
                    this.sTy.xlM = ((cpx)localObject2);
                }
                else if (((cpx)localObject2).jCt == 1)
                {
                  b((cpx)localObject2);
                }
              }
          }
          else if ((i3 == 3) && (i1 > k))
            if (this.sNl.sPp.nwu == 0)
            {
              ab.e("MicroMsg.Voip.VoipSyncHandle", "voipSync(ClientStatus) ignored , roomid = 0");
            }
            else
            {
              try
              {
                localObject2 = new com/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
                ((SKBuiltinBuffer_t)localObject2).<init>();
                localObject2 = ((SKBuiltinBuffer_t)localObject2).parseFrom(paramm.wau.getBuffer().toByteArray());
                if (!paramm.ndG.equals(com.tencent.mm.model.r.Yz()))
                  break label934;
                a.Loge("MicroMsg.Voip.VoipSyncHandle", "svr response: local connecting status changed.");
              }
              catch (IOException paramm)
              {
                ab.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", paramm, "", new Object[0]);
              }
              continue;
              label934: c((SKBuiltinBuffer_t)localObject2);
            }
        }
      }
    }
    ab.i("MicroMsg.Voip.VoipSyncHandle", "__parse sync resp end");
    if (((this.sTz != null) && (this.sTz.jBv > 0)) || (this.sTA > 0))
      a(null, false, 7);
    AppMethodBeat.o(4692);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.t
 * JD-Core Version:    0.6.2
 */