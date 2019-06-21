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
import com.tencent.mm.plugin.game.d.bn;
import com.tencent.mm.plugin.game.d.bo;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;

public final class ar extends m
  implements k
{
  private f ehi;
  public final b lty;

  public ar(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(111448);
    ab.i("MicroMsg.NetSceneGetMoreGameList", "offset: %d, limit: %d, type: %d, cat: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(15), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bn();
    ((b.a)localObject).fsK = new bo();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/newgetmoregamelist";
    ((b.a)localObject).fsI = 1220;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.lty = ((b.a)localObject).acD();
    localObject = (bn)this.lty.fsG.fsP;
    ((bn)localObject).ncn = paramInt1;
    ((bn)localObject).nco = 15;
    ((bn)localObject).nbs = aa.dor();
    ((bn)localObject).ncv = paramInt2;
    ((bn)localObject).ncw = paramInt3;
    AppMethodBeat.o(111448);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(111449);
    this.ehi = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(111449);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111450);
    ab.i("MicroMsg.NetSceneGetMoreGameList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(111450);
  }

  public final int getType()
  {
    return 1220;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.ar
 * JD-Core Version:    0.6.2
 */