package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.a;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.bmr;
import com.tencent.mm.protocal.protobuf.bms;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Date;

public final class r extends m
  implements k
{
  private Object data;
  public com.tencent.mm.ai.b ehh;
  private f ehi;

  public r(b paramb, int paramInt1, int paramInt2, Object paramObject)
  {
    AppMethodBeat.i(11438);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bmr();
    ((b.a)localObject).fsK = new bms();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/reportpluginstat";
    ((b.a)localObject).fsI = 2805;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bmr)this.ehh.fsG.fsP;
    ((bmr)localObject).wPC = 1;
    ((bmr)localObject).wPD = paramb.field_wwCorpId;
    ((bmr)localObject).vNx = paramb.field_wwUserVid;
    com.tencent.mm.kernel.g.RN();
    ((bmr)localObject).wPE = a.QF();
    ((bmr)localObject).scene = paramInt2;
    ((bmr)localObject).cuy = paramInt1;
    ((bmr)localObject).wPF = 0L;
    ((bmr)localObject).wPG = new Date().getTime();
    ((bmr)localObject).platform = 1;
    ((bmr)localObject).wMv = com.tencent.mm.sdk.platformtools.g.ar(null, d.vxo);
    this.data = paramObject;
    AppMethodBeat.o(11438);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11440);
    this.ehi = paramf;
    ab.i("MicroMsg.NetSceneEnterprisePushStat", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11440);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11439);
    ab.d("MicroMsg.NetSceneEnterprisePushStat", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11439);
  }

  public final int getType()
  {
    return 2805;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.r
 * JD-Core Version:    0.6.2
 */