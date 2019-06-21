package com.tencent.mm.plugin.translate.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.apa;
import com.tencent.mm.protocal.protobuf.apb;
import com.tencent.mm.protocal.protobuf.cir;
import com.tencent.mm.protocal.protobuf.cis;
import java.util.LinkedList;

public final class b extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  public LinkedList<cis> sKv;

  public b(LinkedList<cir> paramLinkedList)
  {
    AppMethodBeat.i(26058);
    this.ehi = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new apa();
    ((b.a)localObject).fsK = new apb();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/gettranstext";
    ((b.a)localObject).fsI = 631;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (apa)this.ehh.fsG.fsP;
    ((apa)localObject).wtc = paramLinkedList;
    ((apa)localObject).jBu = paramLinkedList.size();
    AppMethodBeat.o(26058);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(26059);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(26059);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26060);
    this.sKv = ((apb)this.ehh.fsH.fsP).wtc;
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(26060);
  }

  public final int getType()
  {
    return 631;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.translate.a.b
 * JD-Core Version:    0.6.2
 */