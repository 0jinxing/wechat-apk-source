package com.tencent.mm.plugin.talkroom.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cgn;
import com.tencent.mm.protocal.protobuf.cgo;
import com.tencent.mm.protocal.protobuf.cgp;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class g extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public g(LinkedList<cgn> paramLinkedList, int paramInt)
  {
    AppMethodBeat.i(25885);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cgo();
    ((b.a)localObject).fsK = new cgp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/talkstatreport";
    ((b.a)localObject).fsI = 373;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cgo)this.ehh.fsG.fsP;
    ((cgo)localObject).xfv = paramLinkedList.size();
    ((cgo)localObject).xfw = paramLinkedList;
    ((cgo)localObject).Scene = paramInt;
    AppMethodBeat.o(25885);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(25886);
    ab.d("MicroMsg.NetSceneTalkStatReport", "doScene");
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(25886);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(25887);
    ab.d("MicroMsg.NetSceneTalkStatReport", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(25887);
    }
    while (true)
    {
      return;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(25887);
    }
  }

  public final int getType()
  {
    return 373;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.b.g
 * JD-Core Version:    0.6.2
 */