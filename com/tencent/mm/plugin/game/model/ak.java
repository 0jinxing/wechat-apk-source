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
import com.tencent.mm.protocal.protobuf.acz;
import com.tencent.mm.protocal.protobuf.ada;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class ak extends m
  implements k
{
  private f ehi;
  public final b lty;

  public ak(String paramString, LinkedList<String> paramLinkedList1, LinkedList<String> paramLinkedList2, int paramInt)
  {
    AppMethodBeat.i(111427);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new acz();
    ((b.a)localObject).fsK = new ada();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gamecentersearch";
    ((b.a)localObject).fsI = 1328;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.lty = ((b.a)localObject).acD();
    localObject = (acz)this.lty.fsG.fsP;
    ((acz)localObject).nbs = paramString;
    ((acz)localObject).wkL = paramLinkedList1;
    ((acz)localObject).wkE = paramLinkedList2;
    ((acz)localObject).wkM = paramInt;
    AppMethodBeat.o(111427);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(111428);
    this.ehi = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(111428);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111429);
    ab.i("MicroMsg.NetSceneGameCenterSearch", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(111429);
  }

  public final int getType()
  {
    return 1328;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.ak
 * JD-Core Version:    0.6.2
 */