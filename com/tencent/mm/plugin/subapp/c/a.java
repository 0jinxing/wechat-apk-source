package com.tencent.mm.plugin.subapp.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bfs;
import com.tencent.mm.protocal.protobuf.bft;
import com.tencent.mm.protocal.protobuf.coc;
import java.util.LinkedList;

public final class a extends m
  implements k
{
  private b ehh;
  private f ehi;

  public a(LinkedList<coc> paramLinkedList, int paramInt)
  {
    AppMethodBeat.i(25247);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bfs();
    ((b.a)localObject).fsK = new bft();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/opvoicereminder";
    ((b.a)localObject).fsI = 331;
    ((b.a)localObject).fsL = 150;
    ((b.a)localObject).fsM = 1000000150;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bfs)this.ehh.fsG.fsP;
    ((bfs)localObject).OpCode = 1;
    ((bfs)localObject).wJz = paramLinkedList;
    ((bfs)localObject).wJy = paramInt;
    AppMethodBeat.o(25247);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(25248);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(25248);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(25249);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(25249);
  }

  public final int getType()
  {
    return 331;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.a
 * JD-Core Version:    0.6.2
 */