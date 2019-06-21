package com.tencent.mm.plugin.emoji.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ail;
import com.tencent.mm.protocal.protobuf.aim;
import com.tencent.mm.sdk.platformtools.ab;

public final class m extends com.tencent.mm.ai.m
  implements k
{
  private final b ehh;
  private f ehi;
  public byte[] kWS;
  private String kWT;

  public m(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53131);
    this.kWS = null;
    b.a locala = new b.a();
    locala.fsJ = new ail();
    locala.fsK = new aim();
    locala.uri = "/cgi-bin/micromsg-bin/mmgetemotiondonorlist";
    locala.fsI = 299;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.kWS = paramArrayOfByte;
    this.kWT = paramString;
    AppMethodBeat.o(53131);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(53133);
    this.ehi = paramf;
    paramf = (ail)this.ehh.fsG.fsP;
    if (this.kWS != null);
    for (paramf.ReqBuf = aa.ad(this.kWS); ; paramf.ReqBuf = new SKBuiltinBuffer_t())
    {
      paramf.ProductID = this.kWT;
      int i = a(parame, this.ehh, this);
      AppMethodBeat.o(53133);
      return i;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53132);
    ab.d("MicroMsg.emoji.NetSceneGetEmotionDonorList", "ErrType:" + paramInt2 + "   errCode:" + paramInt3);
    paramq = (aim)((b)paramq).fsH.fsP;
    if (paramq.vFq != null)
      this.kWS = aa.a(paramq.vFq);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(53132);
  }

  public final aim bkA()
  {
    return (aim)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 299;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.m
 * JD-Core Version:    0.6.2
 */