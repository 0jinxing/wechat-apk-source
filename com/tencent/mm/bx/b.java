package com.tencent.mm.bx;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bsb;
import com.tencent.mm.protocal.protobuf.bsc;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class b extends m
  implements k
{
  private f ehi;
  private final com.tencent.mm.ai.b fsB;

  public b(bsb parambsb)
  {
    AppMethodBeat.i(116353);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bsb();
    ((b.a)localObject).fsK = new bsc();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/reportmediainfo";
    ((b.a)localObject).fsI = 809;
    this.fsB = ((b.a)localObject).acD();
    localObject = (bsb)this.fsB.fsG.fsP;
    ((bsb)localObject).wUf = parambsb.wUf;
    ((bsb)localObject).wUe = parambsb.wUe;
    ((bsb)localObject).wdK = parambsb.wdK;
    ((bsb)localObject).EmotionList.addAll(parambsb.EmotionList);
    ((bsb)localObject).jCt = parambsb.jCt;
    AppMethodBeat.o(116353);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(116354);
    this.ehi = paramf;
    int i = a(parame, this.fsB, this);
    AppMethodBeat.o(116354);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(116355);
    ab.i("MicroMsg.NetSceneReportMediaInfo", "netId :%d errType: %d, errCode: %d, errMsg:%s, hashcode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(hashCode()) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(116355);
  }

  public final int getType()
  {
    return 809;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bx.b
 * JD-Core Version:    0.6.2
 */