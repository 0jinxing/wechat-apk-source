package com.tencent.mm.plugin.luckymoney.f2f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aab;
import com.tencent.mm.protocal.protobuf.aac;
import com.tencent.mm.protocal.protobuf.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.i;

public final class d extends m
  implements com.tencent.mm.network.k, i
{
  public String czZ;
  private f ehi;
  private b gme;
  public String nSX;
  private aab nUm;
  private aac nUn;
  public String nUo;

  public d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(42154);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aab();
    ((b.a)localObject).fsK = new aac();
    ((b.a)localObject).fsI = 1970;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/ftfhb/ffrequestwxhb";
    this.gme = ((b.a)localObject).acD();
    this.nUm = ((aab)this.gme.fsG.fsP);
    this.nUm.kCd = paramInt1;
    this.nUm.pjg = paramInt2;
    this.nUm.cRT = paramInt3;
    this.nUm.wfj = paramInt4;
    localObject = com.tencent.mm.plugin.wallet_core.model.k.cPy();
    if (localObject != null)
    {
      this.nUm.latitude = ((aw)localObject).latitude;
      this.nUm.longitude = ((aw)localObject).longitude;
    }
    AppMethodBeat.o(42154);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(42156);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(42156);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(42155);
    ab.i("NetSceneF2FLuckyMoneyPrepare", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.nUn = ((aac)((b)paramq).fsH.fsP);
    this.czZ = this.nUn.nYX;
    this.nSX = this.nUn.nSX;
    this.nUo = this.nUn.nZe;
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(42155);
  }

  public final int getType()
  {
    return 1970;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.a.d
 * JD-Core Version:    0.6.2
 */