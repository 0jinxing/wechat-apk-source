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
import com.tencent.mm.plugin.game.d.de;
import com.tencent.mm.plugin.game.d.df;
import com.tencent.mm.sdk.platformtools.ab;

public final class av extends m
  implements k
{
  private f ehi;
  public final b lty;

  public av(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(111460);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new de();
    ((b.a)localObject).fsK = new df();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/newsubscribenewgame";
    ((b.a)localObject).fsI = 1219;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.lty = ((b.a)localObject).acD();
    localObject = (de)this.lty.fsG.fsP;
    ((de)localObject).mZr = paramString1;
    ((de)localObject).nbs = paramString2;
    ((de)localObject).mZo = paramString3;
    ((de)localObject).mZD = paramBoolean;
    AppMethodBeat.o(111460);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(111461);
    this.ehi = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(111461);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111462);
    ab.i("MicroMsg.NetSceneGameSubscription", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(111462);
  }

  public final int getType()
  {
    return 1219;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.av
 * JD-Core Version:    0.6.2
 */