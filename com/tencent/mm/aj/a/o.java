package com.tencent.mm.aj.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.afn;
import com.tencent.mm.protocal.protobuf.afo;
import com.tencent.mm.sdk.platformtools.ab;

public final class o extends m
  implements k
{
  public b ehh;
  private f ehi;
  boolean fyf;

  public o(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11615);
    this.fyf = false;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new afn();
    ((b.a)localObject).fsK = new afo();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/getbizchatinfo";
    ((b.a)localObject).fsI = 1352;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (afn)this.ehh.fsG.fsP;
    ((afn)localObject).vMV = paramString1;
    ((afn)localObject).vNb = paramString2;
    this.fyf = true;
    AppMethodBeat.o(11615);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11617);
    this.ehi = paramf;
    ab.i("MicroMsg.brandservice.NetSceneGetBizChatInfo", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11617);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11616);
    ab.d("MicroMsg.brandservice.NetSceneGetBizChatInfo", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11616);
  }

  public final int getType()
  {
    return 1352;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.o
 * JD-Core Version:    0.6.2
 */