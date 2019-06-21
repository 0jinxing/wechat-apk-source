package com.tencent.mm.plugin.scanner.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.lc;
import com.tencent.mm.protocal.protobuf.ld;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;

public final class i extends m
  implements k
{
  private b ehh;
  private f ehi;

  public i(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(80850);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new lc();
    ((b.a)localObject).fsK = new ld();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscanproductreport";
    ((b.a)localObject).fsI = 1064;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (lc)this.ehh.fsG.fsP;
    ((lc)localObject).vOz = d.vxj;
    ((lc)localObject).vOA = d.vxi;
    ((lc)localObject).vOB = d.vxl;
    ((lc)localObject).vOC = d.vxm;
    ((lc)localObject).vOD = aa.dor();
    ((lc)localObject).pXL = 11294;
    ((lc)localObject).vOE = null;
    ((lc)localObject).pZp = paramString1;
    ((lc)localObject).pZo = paramString2;
    ((lc)localObject).type = paramInt1;
    ((lc)localObject).value = paramString3;
    ((lc)localObject).count = paramInt2;
    ((lc)localObject).oZe = paramInt3;
    ab.v("MircoMsg.NetSceneScanProductReport", "statid:".concat(String.valueOf(paramString2)));
    AppMethodBeat.o(80850);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(80852);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(80852);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(80851);
    ab.d("MircoMsg.NetSceneScanProductReport", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(80851);
  }

  public final int getType()
  {
    return 1064;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.i
 * JD-Core Version:    0.6.2
 */