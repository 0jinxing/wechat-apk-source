package com.tencent.mm.plugin.label.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bcs;
import com.tencent.mm.protocal.protobuf.bct;
import com.tencent.mm.protocal.protobuf.cmh;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class d extends m
  implements k
{
  private final b ehh;
  private f ehi;
  private LinkedList<cmh> nHy;

  public d(LinkedList<cmh> paramLinkedList)
  {
    AppMethodBeat.i(22530);
    this.nHy = new LinkedList();
    b.a locala = new b.a();
    locala.fsJ = new bcs();
    locala.fsK = new bct();
    locala.uri = "/cgi-bin/micromsg-bin/modifycontactlabellist";
    locala.fsI = 638;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.nHy = paramLinkedList;
    AppMethodBeat.o(22530);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(22532);
    ab.d("MicroMsg.Label.NetSceneModifyContactLabelList", "cpan[doScene].");
    this.ehi = paramf;
    paramf = (bcs)this.ehh.fsG.fsP;
    paramf.wHh = this.nHy;
    paramf.wnW = this.nHy.size();
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(22532);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(22531);
    ab.d("MicroMsg.Label.NetSceneModifyContactLabelList", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(22531);
  }

  public final int getType()
  {
    return 638;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.b.d
 * JD-Core Version:    0.6.2
 */