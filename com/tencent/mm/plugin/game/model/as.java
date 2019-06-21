package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.asl;
import com.tencent.mm.protocal.protobuf.asm;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class as extends m
  implements k
{
  private String appId;
  private f ehi;
  final b lty;

  public as(String paramString)
  {
    AppMethodBeat.i(111451);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new asl();
    ((b.a)localObject).fsK = new asm();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gethvgamemenu";
    ((b.a)localObject).fsI = 1369;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.appId = paramString;
    this.lty = ((b.a)localObject).acD();
    localObject = (asl)this.lty.fsG.fsP;
    ((asl)localObject).nbs = aa.dor();
    ((asl)localObject).guW = bo.gQ(ah.getContext());
    ((asl)localObject).fKh = paramString;
    ab.i("MicroMsg.NetSceneHVGameGetMenu", "lang=%s, country=%s, appid=%s", new Object[] { ((asl)localObject).nbs, ((asl)localObject).guW, ((asl)localObject).fKh });
    AppMethodBeat.o(111451);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(111453);
    this.ehi = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(111453);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111452);
    ab.i("MicroMsg.NetSceneHVGameGetMenu", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", errMsg = " + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(111452);
    }
    while (true)
    {
      return;
      if ((asm)((b)paramq).fsH.fsP == null)
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(111452);
      }
      else
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(111452);
      }
    }
  }

  public final int getType()
  {
    return 1369;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.as
 * JD-Core Version:    0.6.2
 */