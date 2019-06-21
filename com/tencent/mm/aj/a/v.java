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
import com.tencent.mm.protocal.protobuf.bot;
import com.tencent.mm.protocal.protobuf.bou;
import com.tencent.mm.sdk.platformtools.ab;

public final class v extends m
  implements k
{
  public b ehh;
  private f ehi;

  public v(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(11636);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bot();
    ((b.a)localObject).fsK = new bou();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/qymsgstatenotify";
    ((b.a)localObject).fsI = 1361;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bot)this.ehh.fsG.fsP;
    ((bot)localObject).vNb = paramString1;
    ((bot)localObject).vMV = paramString2;
    ((bot)localObject).time_stamp = paramInt;
    AppMethodBeat.o(11636);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11638);
    this.ehi = paramf;
    ab.i("MicroMsg.NetSceneQyMsgStateNotify", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11638);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11637);
    ab.d("MicroMsg.NetSceneQyMsgStateNotify", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11637);
  }

  public final int getType()
  {
    return 1361;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.v
 * JD-Core Version:    0.6.2
 */