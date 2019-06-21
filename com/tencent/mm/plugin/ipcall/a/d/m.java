package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bxb;
import com.tencent.mm.protocal.protobuf.bxc;
import com.tencent.mm.protocal.protobuf.cru;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class m extends com.tencent.mm.ai.m
  implements k
{
  private b ehh;
  private f ehi;
  private bxb nyE;
  public bxc nyF;

  public m(int paramInt1, int paramInt2, LinkedList<cru> paramLinkedList)
  {
    AppMethodBeat.i(21872);
    this.ehh = null;
    this.nyE = null;
    this.nyF = null;
    b.a locala = new b.a();
    locala.fsJ = new bxb();
    locala.fsK = new bxc();
    locala.fsI = 871;
    locala.uri = "/cgi-bin/micromsg-bin/sendwcofeedback";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.nyE = ((bxb)this.ehh.fsG.fsP);
    this.nyE.wGh = paramInt2;
    this.nyE.wXk = paramLinkedList;
    this.nyE.wXj = paramLinkedList.size();
    this.nyE.wXl = paramInt1;
    ab.i("MicroMsg.NetSceneIPCallSendFeedback", "NetSceneIPCallSendFeedback roomid=%d, level=%d, feedbackCount=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramLinkedList.size()) });
    AppMethodBeat.o(21872);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(21873);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(21873);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(21874);
    ab.i("MicroMsg.NetSceneIPCallSendFeedback", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.nyF = ((bxc)((b)paramq).fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(21874);
  }

  public final int getType()
  {
    return 871;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.d.m
 * JD-Core Version:    0.6.2
 */