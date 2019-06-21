package com.tencent.mm.plugin.card.model;

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
import com.tencent.mm.protocal.protobuf.aif;
import com.tencent.mm.protocal.protobuf.aig;
import com.tencent.mm.protocal.protobuf.bnd;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class ae extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public bnd kem;

  public ae(LinkedList<String> paramLinkedList, int paramInt)
  {
    AppMethodBeat.i(87907);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aif();
    ((b.a)localObject).fsK = new aig();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getdynamiccardcode";
    ((b.a)localObject).fsI = 1382;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (aif)this.ehh.fsG.fsP;
    ((aif)localObject).wor = paramLinkedList;
    ((aif)localObject).scene = paramInt;
    AppMethodBeat.o(87907);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(87909);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87909);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87908);
    ab.i("MicroMsg.NetSceneGetDynamicCardCode", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
      this.kem = ((aig)this.ehh.fsH.fsP).wos;
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(87908);
  }

  public final int getType()
  {
    return 1382;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.ae
 * JD-Core Version:    0.6.2
 */