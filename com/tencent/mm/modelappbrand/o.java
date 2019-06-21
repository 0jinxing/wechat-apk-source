package com.tencent.mm.modelappbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cfx;
import com.tencent.mm.protocal.protobuf.ir;
import com.tencent.mm.protocal.protobuf.is;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class o extends m
  implements k
{
  private f eIc;
  private final b fpJ;

  public o(LinkedList<cfx> paramLinkedList)
  {
    AppMethodBeat.i(93730);
    b.a locala = new b.a();
    locala.fsJ = new ir();
    locala.fsK = new is();
    locala.uri = "/cgi-bin/mmbiz-bin/wxausrevent/batchswitchservicenotifyoption";
    locala.fsI = 1176;
    locala.fsL = 0;
    locala.fsM = 0;
    this.fpJ = locala.acD();
    ((ir)this.fpJ.fsG.fsP).vKN = paramLinkedList;
    AppMethodBeat.o(93730);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(93732);
    ab.i("MicroMsg.NetSceneBatchSwitchServiceNotifyOption", "doScene");
    this.eIc = paramf;
    int i = a(parame, this.fpJ, this);
    AppMethodBeat.o(93732);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(93731);
    ab.i("MicroMsg.NetSceneBatchSwitchServiceNotifyOption", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.eIc != null)
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(93731);
  }

  public final int getType()
  {
    return 1176;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.o
 * JD-Core Version:    0.6.2
 */