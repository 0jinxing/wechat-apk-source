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
import com.tencent.mm.protocal.protobuf.acw;
import com.tencent.mm.protocal.protobuf.acx;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class al extends m
  implements k
{
  public String ctj;
  private f ehi;
  public final b lty;

  public al(String paramString1, String paramString2, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(111430);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new acw();
    ((b.a)localObject).fsK = new acx();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gamecentersearchrecommend";
    ((b.a)localObject).fsI = 1329;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    if (paramString2 == null);
    for (this.ctj = ""; ; this.ctj = paramString2.trim())
    {
      this.lty = ((b.a)localObject).acD();
      localObject = (acw)this.lty.fsG.fsP;
      ((acw)localObject).nbs = paramString1;
      ((acw)localObject).wkD = paramString2;
      ((acw)localObject).wkE = paramLinkedList;
      AppMethodBeat.o(111430);
      return;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(111431);
    this.ehi = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(111431);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111432);
    ab.i("MicroMsg.NetSceneGameSearchRecmd", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(111432);
  }

  public final int getType()
  {
    return 1329;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.al
 * JD-Core Version:    0.6.2
 */