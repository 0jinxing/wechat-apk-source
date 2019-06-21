package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aou;
import com.tencent.mm.protocal.protobuf.aov;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends m
  implements k
{
  public com.tencent.mm.ai.b ehh;
  private f ehi;
  private String qtG;
  private int scene;

  public b(String paramString, int paramInt)
  {
    this.qtG = paramString;
    this.scene = paramInt;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(24604);
    this.ehi = paramf;
    paramf = new b.a();
    paramf.fsJ = new aou();
    paramf.fsK = new aov();
    paramf.uri = "/cgi-bin/micromsg-bin/gettvinfo";
    paramf.fsI = 552;
    paramf.fsL = 0;
    paramf.fsM = 0;
    this.ehh = paramf.acD();
    paramf = (aou)this.ehh.fsG.fsP;
    paramf.wsX = this.qtG;
    paramf.Scene = this.scene;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(24604);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(24606);
    ab.d("MicroMsg.scanner.NetSceneGetTVInfo", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(24606);
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(24605);
    paramq = (aou)((com.tencent.mm.ai.b)paramq).fsG.fsP;
    if ((paramq.Scene < 0) || (paramq.wsX == null) || (paramq.wsX.length() <= 0))
    {
      ab.e("MicroMsg.scanner.NetSceneGetTVInfo", "ERR: Security Check Failed, Scene = %s", new Object[] { Integer.valueOf(paramq.Scene) });
      paramq = m.b.ftv;
      AppMethodBeat.o(24605);
    }
    while (true)
    {
      return paramq;
      paramq = m.b.ftu;
      AppMethodBeat.o(24605);
    }
  }

  public final int getType()
  {
    return 552;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.b
 * JD-Core Version:    0.6.2
 */