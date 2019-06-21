package com.tencent.mm.plugin.sns.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.axb;
import com.tencent.mm.protocal.protobuf.axc;
import com.tencent.mm.protocal.protobuf.bq;
import com.tencent.mm.protocal.protobuf.br;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.LinkedList;
import java.util.List;

public final class e extends m
  implements k
{
  private b ehh;
  public f ehi;
  public List<axc> iKa;

  public e(List<axc> paramList)
  {
    AppMethodBeat.i(35708);
    Object localObject = new b.a();
    this.iKa = paramList;
    ((b.a)localObject).fsJ = new bq();
    ((b.a)localObject).fsK = new br();
    ((b.a)localObject).uri = "/cgi-bin/mmux-bin/adlog";
    ((b.a)localObject).fsI = 1802;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bq)this.ehh.fsG.fsP;
    axb localaxb = new axb();
    localaxb.vOz = d.vxj;
    localaxb.vOA = d.vxi;
    localaxb.vOB = d.vxl;
    localaxb.vOC = d.vxm;
    localaxb.vOD = aa.dor();
    localaxb.wBk = ((int)(System.currentTimeMillis() / 1000L));
    ((bq)localObject).vDV = localaxb;
    while (i < paramList.size())
    {
      ((bq)localObject).vDW.add(paramList.get(i));
      i++;
    }
    ab.i("MicroMsg.NetSceneAdLog", "report count: " + ((bq)localObject).vDW.size());
    AppMethodBeat.o(35708);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(35709);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(35709);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(35710);
    ab.d("MicroMsg.NetSceneAdLog", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramInt1 = ((br)((b)paramq).fsH.fsP).vDX;
      g.RQ();
      g.RP().Ry().set(ac.a.xLd, Integer.valueOf(paramInt1));
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(35710);
  }

  public final int getType()
  {
    return 1802;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.e
 * JD-Core Version:    0.6.2
 */