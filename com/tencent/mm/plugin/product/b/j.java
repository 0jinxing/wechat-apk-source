package com.tencent.mm.plugin.product.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.au;
import com.tencent.mm.protocal.protobuf.bli;
import com.tencent.mm.protocal.protobuf.blj;
import com.tencent.mm.protocal.protobuf.btx;
import com.tencent.mm.protocal.protobuf.ze;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class j extends m
  implements k
{
  private b ehh;
  private f ehi;
  public String pgQ;
  public LinkedList<ze> phb;
  public LinkedList<au> phc;

  public j(LinkedList<btx> paramLinkedList, int paramInt)
  {
    AppMethodBeat.i(43994);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bli();
    ((b.a)localObject).fsK = new blj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/presubmitorder";
    ((b.a)localObject).fsI = 554;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bli)this.ehh.fsG.fsP;
    ((bli)localObject).vRM = paramLinkedList;
    if (paramLinkedList != null)
      i = paramLinkedList.size();
    ((bli)localObject).pdi = i;
    ((bli)localObject).wOo = paramInt;
    AppMethodBeat.o(43994);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(43996);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(43996);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(43995);
    paramArrayOfByte = (blj)((b)paramq).fsH.fsP;
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramArrayOfByte.vKp == 0))
    {
      ab.d("MicroMsg.NetSceneMallPreSubmitOrder", "resp.ExpressCount " + paramArrayOfByte.wpD);
      ab.d("MicroMsg.NetSceneMallPreSubmitOrder", "resp.LockId " + paramArrayOfByte.vRN);
      this.phb = paramArrayOfByte.wOp;
      this.pgQ = paramArrayOfByte.vRN;
      this.phc = paramArrayOfByte.wOq;
    }
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
    ab.d("MicroMsg.NetSceneMallPreSubmitOrder", "errCode " + paramInt1 + ", errMsg " + paramq);
    this.ehi.onSceneEnd(paramInt2, paramInt1, paramq, this);
    AppMethodBeat.o(43995);
  }

  public final int getType()
  {
    return 554;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.b.j
 * JD-Core Version:    0.6.2
 */