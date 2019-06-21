package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bj;
import com.tencent.mm.protocal.protobuf.bk;
import com.tencent.mm.protocal.protobuf.bp;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class i extends m
  implements k
{
  private f eIc;
  private final com.tencent.mm.ai.b ehh;

  public i(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(35583);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bj();
    ((b.a)localObject).fsK = new bk();
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/ad/addatareport";
    ((b.a)localObject).fsI = 1295;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bj)this.ehh.fsG.fsP;
    bp localbp = new bp();
    localbp.vDS = paramInt1;
    localbp.vDT = new com.tencent.mm.bt.b(paramString.getBytes());
    localbp.vDU = paramInt2;
    ((bj)localObject).vDC.add(localbp);
    ab.i("MicroMsg.NetSceneAdDataReport", "init logId:%d, logStr:%s", new Object[] { Integer.valueOf(paramInt1), paramString });
    AppMethodBeat.o(35583);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(35585);
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(35585);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(35584);
    paramq = (bk)this.ehh.fsH.fsP;
    ab.i("MicroMsg.NetSceneAdDataReport", "onGYNetEnd, errType = %d, errCode = %d, ret=%d, msg=%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramq.ret), paramq.bzH });
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(35584);
  }

  public final int getType()
  {
    return 1295;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.i
 * JD-Core Version:    0.6.2
 */