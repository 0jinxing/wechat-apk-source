package com.tencent.mm.plugin.wear.model.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.bf;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cut;
import com.tencent.mm.protocal.protobuf.cuu;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends m
  implements k
{
  private f ehi;
  private com.tencent.mm.ai.b fAT;

  public b(String paramString)
  {
    AppMethodBeat.i(26375);
    Object localObject = new b.a();
    ((b.a)localObject).fsI = 976;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendyo";
    ((b.a)localObject).fsJ = new cut();
    ((b.a)localObject).fsK = new cuu();
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.fAT = ((b.a)localObject).acD();
    localObject = (cut)this.fAT.fsG.fsP;
    ((cut)localObject).ndF = paramString;
    ((cut)localObject).wFW = ((cut)localObject).pcX;
    ((cut)localObject).pcX = ((int)bf.oC(paramString));
    ((cut)localObject).jCt = 63;
    ((cut)localObject).xqR = 1;
    ((cut)localObject).jBv = 1;
    AppMethodBeat.o(26375);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(26377);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(26377);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26376);
    ab.i("MicroMsg.Wear.NetSceneSendYo", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(26376);
  }

  public final int getType()
  {
    return 976;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.d.b
 * JD-Core Version:    0.6.2
 */