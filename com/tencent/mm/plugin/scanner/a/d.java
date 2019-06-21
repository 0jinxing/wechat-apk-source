package com.tencent.mm.plugin.scanner.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.kp;
import com.tencent.mm.protocal.protobuf.kq;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends m
  implements k
{
  private String cwg;
  public b ehh;
  private f ehi;
  private String kES;
  private int scene;

  public d(String paramString1, int paramInt, String paramString2)
  {
    this.cwg = paramString1;
    this.scene = paramInt;
    this.kES = paramString2;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(80834);
    this.ehi = paramf;
    paramf = new b.a();
    paramf.fsJ = new kp();
    paramf.fsK = new kq();
    paramf.uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscangetproductinfo";
    paramf.fsI = 1063;
    paramf.fsL = 0;
    paramf.fsM = 0;
    this.ehh = paramf.acD();
    paramf = (kp)this.ehh.fsG.fsP;
    paramf.ProductID = this.cwg;
    paramf.Scene = this.scene;
    paramf.vNG = this.kES;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(80834);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(80836);
    ab.d("MicroMsg.scanner.NetSceneGetProductInfo", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(80836);
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(80835);
    paramq = (kp)((b)paramq).fsG.fsP;
    if ((paramq.Scene < 0) || (paramq.ProductID == null) || (paramq.ProductID.length() <= 0))
    {
      ab.e("MicroMsg.scanner.NetSceneGetProductInfo", "ERR: Security Check Failed, Scene = %s", new Object[] { Integer.valueOf(paramq.Scene) });
      paramq = m.b.ftv;
      AppMethodBeat.o(80835);
    }
    while (true)
    {
      return paramq;
      paramq = m.b.ftu;
      AppMethodBeat.o(80835);
    }
  }

  public final int getType()
  {
    return 1063;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.d
 * JD-Core Version:    0.6.2
 */