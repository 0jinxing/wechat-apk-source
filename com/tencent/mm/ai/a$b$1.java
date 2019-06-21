package com.tencent.mm.ai;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class a$b$1
  implements k
{
  a$b$1(a.b paramb)
  {
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58150);
    com.tencent.mm.vending.g.f.a(this.fsF.fsC, new Object[] { a.a.a(paramInt2, paramInt3, paramString, (btd)this.fsF.fsB.fsH.fsP, this.fsF, this.fsF.fsD) });
    this.fsF.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this.fsF.fsA);
    ab.i("MicroMsg.Cgi", "onGYNetEnd:%d func:%d time:%d [%d,%d,%s]", new Object[] { Integer.valueOf(this.fsF.fsA.hashCode()), Integer.valueOf(this.fsF.getType()), Long.valueOf(bo.anU() - this.fsF.mStartTime), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    AppMethodBeat.o(58150);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.a.b.1
 * JD-Core Version:    0.6.2
 */