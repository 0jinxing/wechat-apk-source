package com.tencent.mm.plugin.brandservice.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.azo;
import com.tencent.mm.protocal.protobuf.azr;
import com.tencent.mm.protocal.protobuf.azs;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class k extends m
  implements com.tencent.mm.network.k
{
  public b ehh;
  private f ehi;

  public k(String paramString, LinkedList<azo> paramLinkedList)
  {
    AppMethodBeat.i(13855);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new azr();
    ((b.a)localObject).fsK = new azs();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/setrecvtmpmsgoption";
    ((b.a)localObject).fsI = 1030;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (azr)this.ehh.fsG.fsP;
    ((azr)localObject).wxX = paramString;
    ((azr)localObject).wDy = paramLinkedList;
    AppMethodBeat.o(13855);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(13857);
    this.ehi = paramf;
    ab.i("MicroMsg.brandservice.NetSceneSetRecvTmpMsgOption", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(13857);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(13856);
    ab.d("MicroMsg.brandservice.NetSceneSetRecvTmpMsgOption", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(13856);
  }

  public final int getType()
  {
    return 1030;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.b.k
 * JD-Core Version:    0.6.2
 */