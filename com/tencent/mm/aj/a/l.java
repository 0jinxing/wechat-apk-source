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
import com.tencent.mm.protocal.protobuf.ki;
import com.tencent.mm.protocal.protobuf.kj;
import com.tencent.mm.sdk.platformtools.ab;

public final class l extends m
  implements k
{
  private Object data;
  public b ehh;
  private f ehi;

  public l(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(11606);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ki();
    ((b.a)localObject).fsK = new kj();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/bizchatsearchcontact";
    ((b.a)localObject).fsI = 1364;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ki)this.ehh.fsG.fsP;
    ((ki)localObject).vNb = paramString1;
    ((ki)localObject).ctj = paramString2;
    ((ki)localObject).offset = paramInt;
    this.data = null;
    AppMethodBeat.o(11606);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11608);
    this.ehi = paramf;
    ab.i("MicroMsg.NetSceneBizChatSearchContact", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11608);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11607);
    ab.d("MicroMsg.NetSceneBizChatSearchContact", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11607);
  }

  public final int getType()
  {
    return 1364;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.l
 * JD-Core Version:    0.6.2
 */