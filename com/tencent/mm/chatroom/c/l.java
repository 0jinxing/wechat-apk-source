package com.tencent.mm.chatroom.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.arw;
import com.tencent.mm.protocal.protobuf.arx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

public final class l extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public l(String paramString)
  {
    AppMethodBeat.i(103937);
    this.ehi = null;
    b.a locala = new b.a();
    locala.fsJ = new arw();
    locala.fsK = new arx();
    locala.uri = "/cgi-bin/micromsg-bin/grantbigchatroom";
    locala.fsI = 339;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((arw)this.ehh.fsG.fsP).ndF = paramString;
    ab.d("MicroMsg.NetSceneGrantBigChatRoom", "grant to userName :".concat(String.valueOf(paramString)));
    AppMethodBeat.o(103937);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(103938);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(103938);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(103939);
    ab.d("MicroMsg.NetSceneGrantBigChatRoom", "onGYNetEnd " + paramInt2 + " " + paramInt3 + "  " + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(103939);
    }
    while (true)
    {
      return;
      paramInt1 = ((Integer)g.RP().Ry().get(135176, Integer.valueOf(0))).intValue();
      if (paramInt1 - 1 >= 0)
        g.RP().Ry().set(135176, Integer.valueOf(paramInt1 - 1));
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(103939);
    }
  }

  public final int getType()
  {
    return 339;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.l
 * JD-Core Version:    0.6.2
 */