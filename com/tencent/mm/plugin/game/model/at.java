package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.d.au;
import com.tencent.mm.plugin.game.d.av;
import com.tencent.mm.sdk.platformtools.ab;

public final class at extends m
  implements k
{
  private f ehi;
  private final b lty;

  public at(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3)
  {
    AppMethodBeat.i(111454);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new au();
    ((b.a)localObject).fsK = new av();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gamereport";
    ((b.a)localObject).fsI = 1223;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.lty = ((b.a)localObject).acD();
    localObject = (au)this.lty.fsG.fsP;
    ((au)localObject).mZr = paramString1;
    ((au)localObject).nbk = paramInt1;
    ((au)localObject).nbl = paramInt2;
    ((au)localObject).nbm = paramString2;
    ((au)localObject).nbn = paramString3;
    ((au)localObject).nbj = ((int)(System.currentTimeMillis() / 1000L));
    AppMethodBeat.o(111454);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(111455);
    this.ehi = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(111455);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111456);
    ab.i("MicroMsg.NetSceneGetGameIndex", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(111456);
  }

  public final int getType()
  {
    return 1223;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.at
 * JD-Core Version:    0.6.2
 */