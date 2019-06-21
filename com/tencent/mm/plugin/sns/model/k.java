package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.modelstat.p;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.caf;
import com.tencent.mm.protocal.protobuf.cag;
import com.tencent.mm.protocal.protobuf.cai;
import com.tencent.mm.protocal.protobuf.can;
import com.tencent.mm.protocal.protobuf.cao;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbt;
import com.tencent.mm.protocal.protobuf.cdh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class k extends m
  implements com.tencent.mm.network.k
{
  private b ehh;
  public com.tencent.mm.ai.f ehi;
  private String qIR;
  private cao qIS;
  private int type;

  public k(cao paramcao, String paramString1, String paramString2)
  {
    AppMethodBeat.i(36239);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new caf();
    ((b.a)localObject).fsK = new cag();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnsadcomment";
    ((b.a)localObject).fsI = 682;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (caf)this.ehh.fsG.fsP;
    ((caf)localObject).wZr = paramcao;
    this.type = paramcao.wZN.jCt;
    this.qIS = paramcao;
    ((caf)localObject).ptv = paramString1;
    this.qIR = paramString1;
    long l = paramcao.vQE;
    paramString1 = af.cnI().ku(l);
    if (paramString1 != null)
    {
      paramString1 = paramString1.cqu();
      if (paramString1 != null)
      {
        paramString1 = p.tK(paramString1.rjC);
        if (paramString1 != null)
        {
          ((caf)localObject).wZs = aa.vy(p.a(paramString1));
          ((caf)localObject).vFH = paramString1.cvd;
        }
        ((caf)localObject).wZq = aa.vy(bo.bc(paramString2, ""));
        ab.i("MicroMsg.NetSceneSnsAdComment", paramcao.wZN.wPm + " " + paramcao.wZN.wel + " type " + paramcao.wZN.jCt + " aduxinfo " + paramString2 + ", SnsStat=" + ((caf)localObject).wZs + ", source=" + ((caf)localObject).vFH);
        AppMethodBeat.o(36239);
        return;
      }
      ab.v("SnsAdExtUtil", "parseStatSnsAdInfo snsInfo null, snsId %d", new Object[] { Long.valueOf(l) });
    }
    while (true)
    {
      paramString1 = null;
      break;
      ab.v("SnsAdExtUtil", "parseStatSnsAdInfo snsInfo null, snsId %d", new Object[] { Long.valueOf(l) });
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(36240);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(36240);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36241);
    ab.d("MicroMsg.NetSceneSnsAdComment", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
      if (paramInt2 == 4)
        af.cnE().e(this.qIS.vQE, this.type, this.qIR);
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36241);
      return;
      af.cnE().e(this.qIS.vQE, this.type, this.qIR);
      paramArrayOfByte = this.qIS.wZN;
      if ((paramArrayOfByte.jCt == 1) || (paramArrayOfByte.jCt == 2) || (paramArrayOfByte.jCt == 3) || (paramArrayOfByte.jCt == 5) || (paramArrayOfByte.jCt == 7) || (paramArrayOfByte.jCt == 8) || (paramArrayOfByte.jCt == 16))
      {
        paramq = new cat();
        paramq.pcX = paramArrayOfByte.pcX;
        paramq.jCt = paramArrayOfByte.jCt;
        paramq.vFH = paramArrayOfByte.vFH;
        paramq.vHl = paramArrayOfByte.wPm;
        paramq.wCW = paramArrayOfByte.wZD;
        paramq.ncM = paramArrayOfByte.ncM;
        paramq.wZL = paramArrayOfByte.wZL;
      }
      try
      {
        paramq = (caf)this.ehh.fsG.fsP;
        paramArrayOfByte = (cag)this.ehh.fsH.fsP;
        if ((paramq.vFH == 1) || (paramq.vFH == 2))
        {
          paramArrayOfByte = paramArrayOfByte.wSf;
          paramq = paramArrayOfByte.wZu;
          a.a(paramArrayOfByte);
        }
        while (true)
        {
          paramArrayOfByte = new java/lang/StringBuilder;
          paramArrayOfByte.<init>("snsComment:");
          ab.d("MicroMsg.NetSceneSnsAdComment", paramq.toString() + " " + paramq.xaq.size() + " " + paramq.xat.size());
          af.cnE().cnf();
          break;
          paramArrayOfByte = paramArrayOfByte.vEX;
          paramq = paramArrayOfByte.wZu;
          a.a(paramArrayOfByte);
        }
      }
      catch (Exception paramq)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.NetSceneSnsAdComment", paramq, "", new Object[0]);
      }
    }
  }

  public final int getType()
  {
    return 682;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.k
 * JD-Core Version:    0.6.2
 */