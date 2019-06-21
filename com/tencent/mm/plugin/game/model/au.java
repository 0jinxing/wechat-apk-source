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
import com.tencent.mm.protocal.protobuf.bva;
import com.tencent.mm.protocal.protobuf.bvb;
import com.tencent.mm.sdk.platformtools.ab;

public final class au extends m
  implements k
{
  private f ehi;
  final b lty;

  public au(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(111457);
    ab.i("MicroMsg.NetSceneSearchGameList", "offset: %d, limit: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bva();
    ((b.a)localObject).fsK = new bvb();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/searchgamelist";
    ((b.a)localObject).fsI = 1215;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.lty = ((b.a)localObject).acD();
    localObject = (bva)this.lty.fsG.fsP;
    ((bva)localObject).ncn = paramInt1;
    ((bva)localObject).nco = paramInt2;
    AppMethodBeat.o(111457);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(111458);
    this.ehi = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(111458);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111459);
    ab.i("MicroMsg.NetSceneSearchGameList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(111459);
  }

  public final int getType()
  {
    return 1215;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.au
 * JD-Core Version:    0.6.2
 */