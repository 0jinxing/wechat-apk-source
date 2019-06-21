package com.tencent.mm.plugin.product.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.btx;
import com.tencent.mm.protocal.protobuf.nf;
import com.tencent.mm.protocal.protobuf.ng;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class f extends m
  implements k
{
  private b ehh;
  private com.tencent.mm.ai.f ehi;

  public f(LinkedList<btx> paramLinkedList, String paramString)
  {
    AppMethodBeat.i(43982);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new nf();
    ((b.a)localObject).fsK = new ng();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/cancelpreorder";
    ((b.a)localObject).fsI = 555;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (nf)this.ehh.fsG.fsP;
    ((nf)localObject).vRM = paramLinkedList;
    if (paramLinkedList != null)
      i = paramLinkedList.size();
    ((nf)localObject).pdi = i;
    ((nf)localObject).vRN = paramString;
    ab.d("MicroMsg.NetSceneMallCancelPreOrder", "lockId ".concat(String.valueOf(paramString)));
    AppMethodBeat.o(43982);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(43984);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(43984);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(43983);
    paramArrayOfByte = (ng)((b)paramq).fsH.fsP;
    paramInt1 = paramInt3;
    paramq = paramString;
    if (paramInt3 == 0)
    {
      paramInt1 = paramInt3;
      paramq = paramString;
      if (paramArrayOfByte.vKp != 0)
      {
        paramInt1 = paramArrayOfByte.vKp;
        paramq = paramArrayOfByte.vKq;
      }
    }
    ab.d("MicroMsg.NetSceneMallCancelPreOrder", "errCode " + paramInt1 + ", errMsg " + paramq);
    this.ehi.onSceneEnd(paramInt2, paramInt1, paramq, this);
    AppMethodBeat.o(43983);
  }

  public final int getType()
  {
    return 555;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.b.f
 * JD-Core Version:    0.6.2
 */