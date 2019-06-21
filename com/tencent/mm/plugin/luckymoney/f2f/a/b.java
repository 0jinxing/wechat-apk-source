package com.tencent.mm.plugin.luckymoney.f2f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aw;
import com.tencent.mm.protocal.protobuf.zv;
import com.tencent.mm.protocal.protobuf.zw;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends m
  implements com.tencent.mm.network.k
{
  private f ehi;
  private com.tencent.mm.ai.b gme;
  public int kCl;
  public String kCm;
  private zv nTZ;
  private zw nUa;

  public b(String paramString)
  {
    AppMethodBeat.i(42148);
    Object localObject = new b.a();
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    ((b.a)localObject).fsJ = new zv();
    ((b.a)localObject).fsK = new zw();
    ((b.a)localObject).fsI = 1971;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/ftfhb/ffwxhbinvalidateshareurl";
    this.gme = ((b.a)localObject).acD();
    this.nTZ = ((zv)this.gme.fsG.fsP);
    localObject = com.tencent.mm.plugin.wallet_core.model.k.cPy();
    if (localObject != null)
    {
      this.nTZ.latitude = ((aw)localObject).latitude;
      this.nTZ.longitude = ((aw)localObject).longitude;
    }
    this.nTZ.wfc = paramString;
    AppMethodBeat.o(42148);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(42149);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(42149);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(42150);
    ab.i(" NetSceneF2FLuckyMoneyInvalid", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.nUa = ((zw)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    this.kCl = this.nUa.kCl;
    this.kCm = this.nUa.kCm;
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, this.nUa.kCl, this.nUa.kCm, this);
    AppMethodBeat.o(42150);
  }

  public final int getType()
  {
    return 1971;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.a.b
 * JD-Core Version:    0.6.2
 */