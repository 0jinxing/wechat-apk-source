package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.protocal.protobuf.bmf;
import com.tencent.mm.protocal.protobuf.bmg;
import com.tencent.mm.sdk.platformtools.ab;

public final class l extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  private bmf nyC;
  private bmg nyD;

  public l(int paramInt, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(21869);
    this.ehh = null;
    this.nyC = null;
    this.nyD = null;
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new bmf();
    ((b.a)localObject1).fsK = new bmg();
    ((b.a)localObject1).fsI = 227;
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/pstnreport";
    ((b.a)localObject1).fsL = 0;
    ((b.a)localObject1).fsM = 0;
    this.ehh = ((b.a)localObject1).acD();
    this.nyC = ((bmf)this.ehh.fsG.fsP);
    this.nyC.wem = paramInt;
    this.nyC.wOS = paramLong;
    localObject1 = this.nyC;
    if (paramBoolean);
    for (paramInt = 1; ; paramInt = 0)
    {
      ((bmf)localObject1).wPl = paramInt;
      ab.d("MicroMsg.NetSceneIPCallReport", "NetSceneIPCallReport, roomId: %d, callseq: %d, gotAnswer: %d", new Object[] { Integer.valueOf(this.nyC.wem), Long.valueOf(this.nyC.wOS), Integer.valueOf(this.nyC.wPl) });
      localObject1 = this.nyC;
      Object localObject2 = i.bHs();
      localObject2 = ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nwu + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nwv + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxO + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).gyD + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxP + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxE + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxF + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxG + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxH + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxI + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxJ + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxK + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxL + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxM + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxN + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxQ + "," + c.bIP() + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxZ + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).countryCode + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nya + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nyb + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nyc + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxX + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nye;
      ab.i("MicroMsg.IPCallReportHelper", "getPstnClientReportString, result: %s", new Object[] { localObject2 });
      ((bmf)localObject1).wPi = aa.vy((String)localObject2);
      localObject1 = this.nyC;
      localObject2 = i.bHs();
      localObject2 = ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nwu + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nwv + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxO + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxW;
      ab.i("MicroMsg.IPCallReportHelper", "getPstnChannelReportString, result: %s", new Object[] { localObject2 });
      ((bmf)localObject1).wPj = aa.vy((String)localObject2);
      localObject1 = this.nyC;
      localObject2 = i.bHs();
      localObject2 = ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nwu + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nwv + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxO + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).nxV;
      ab.i("MicroMsg.IPCallReportHelper", "getPstnEngineReport, result: %s", new Object[] { localObject2 });
      ((bmf)localObject1).wPk = aa.vy((String)localObject2);
      AppMethodBeat.o(21869);
      return;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(21870);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(21870);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(21871);
    ab.i("MicroMsg.NetSceneIPCallReport", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.nyD = ((bmg)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(21871);
  }

  public final int getType()
  {
    return 227;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.d.l
 * JD-Core Version:    0.6.2
 */