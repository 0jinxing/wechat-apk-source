package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.brm;
import com.tencent.mm.protocal.protobuf.brn;
import com.tencent.mm.protocal.protobuf.bro;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class x extends m
  implements k
{
  private b ehh;
  private f ehi;

  public x(LinkedList<brm> paramLinkedList)
  {
    AppMethodBeat.i(11458);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new brn();
    ((b.a)localObject).fsK = new bro();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/reportcommand";
    ((b.a)localObject).fsI = 2592;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (brn)this.ehh.fsG.fsP;
    ((brn)localObject).vZY = paramLinkedList;
    ab.i("MicroMsg.NetSceneReportBrandSession", "reportcommand MsgReport size %d", new Object[] { Integer.valueOf(((brn)localObject).vZY.size()) });
    AppMethodBeat.o(11458);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11460);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11460);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11459);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11459);
  }

  public final int getType()
  {
    return 2592;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.x
 * JD-Core Version:    0.6.2
 */