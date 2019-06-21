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
import com.tencent.mm.plugin.game.d.az;
import com.tencent.mm.plugin.game.d.ba;
import com.tencent.mm.sdk.platformtools.ab;

public final class am extends m
  implements k
{
  private f ehi;
  public final b lty;

  public am(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(111433);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new az();
    ((b.a)localObject).fsK = new ba();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/newgetgamedetail";
    ((b.a)localObject).fsI = 1217;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.lty = ((b.a)localObject).acD();
    localObject = (az)this.lty.fsG.fsP;
    ((az)localObject).nbs = paramString1;
    ((az)localObject).mZr = paramString2;
    ((az)localObject).nbG = paramBoolean;
    ((az)localObject).nbI = true;
    AppMethodBeat.o(111433);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(111434);
    this.ehi = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(111434);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111435);
    ab.i("MicroMsg.NetSceneGetGameDetailNew", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(111435);
  }

  public final int getType()
  {
    return 1217;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.am
 * JD-Core Version:    0.6.2
 */