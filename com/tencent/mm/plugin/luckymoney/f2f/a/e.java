package com.tencent.mm.plugin.luckymoney.f2f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aaa;
import com.tencent.mm.protocal.protobuf.aw;
import com.tencent.mm.protocal.protobuf.zz;
import com.tencent.mm.sdk.platformtools.ab;

public final class e extends m
  implements com.tencent.mm.network.k
{
  private f ehi;
  private b gme;
  public String lvz;
  public String nSX;
  private zz nUp;
  private aaa nUq;
  public String nUr;
  public String nUs;
  public int nUt;

  public e()
  {
    AppMethodBeat.i(42157);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new zz();
    ((b.a)localObject).fsK = new aaa();
    ((b.a)localObject).fsI = 1990;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/ftfhb/ffquerydowxhb";
    this.gme = ((b.a)localObject).acD();
    this.nUp = ((zz)this.gme.fsG.fsP);
    this.nUp.timestamp = (System.currentTimeMillis() / 1000L);
    localObject = com.tencent.mm.plugin.wallet_core.model.k.cPy();
    if (localObject != null)
    {
      this.nUp.latitude = ((aw)localObject).latitude;
      this.nUp.longitude = ((aw)localObject).longitude;
    }
    AppMethodBeat.o(42157);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(42159);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(42159);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(42158);
    ab.i("NetSceneF2FLuckyMoneyQuery", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.nUq = ((aaa)((b)paramq).fsH.fsP);
    this.nSX = this.nUq.nSX;
    this.lvz = this.nUq.lvz;
    this.nUt = this.nUq.wfi;
    this.nUr = this.nUq.nUr;
    this.nUs = this.nUq.nUs;
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, this.nUq.kCl, this.nUq.kCm, this);
    AppMethodBeat.o(42158);
  }

  public final int getType()
  {
    return 1990;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.a.e
 * JD-Core Version:    0.6.2
 */