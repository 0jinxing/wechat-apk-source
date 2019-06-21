package com.tencent.mm.plugin.wear.model.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.asv;
import com.tencent.mm.protocal.protobuf.asw;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements k
{
  public String ceI;
  public String cws;
  private f ehi;
  private com.tencent.mm.ai.b fAT;

  public a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(26372);
    this.ceI = paramString1;
    this.cws = paramString2;
    Object localObject = new b.a();
    ((b.a)localObject).fsI = 1091;
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/device/register";
    ((b.a)localObject).fsJ = new asv();
    ((b.a)localObject).fsK = new asw();
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.fAT = ((b.a)localObject).acD();
    localObject = (asv)this.fAT.fsG.fsP;
    ((asv)localObject).vKc = new com.tencent.mm.bt.b(paramString1.getBytes());
    ((asv)localObject).vKe = new com.tencent.mm.bt.b(paramString2.getBytes());
    ((asv)localObject).wwF = new com.tencent.mm.bt.b("5".getBytes());
    AppMethodBeat.o(26372);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(26373);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(26373);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26374);
    ab.i("MicroMsg.Wear.NetSceneBizDeviceAuth", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(26374);
  }

  public final int getType()
  {
    return 1091;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.d.a
 * JD-Core Version:    0.6.2
 */