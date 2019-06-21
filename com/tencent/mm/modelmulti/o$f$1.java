package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

final class o$f$1
  implements o.b
{
  o$f$1(o.f paramf)
  {
  }

  public final boolean lO(int paramInt)
  {
    AppMethodBeat.i(58409);
    ab.i("MicroMsg.SyncService", "%s onFinishCmd resp:%s pushSycnFlag:%s recvTime:%s", new Object[] { this.fJC, this.fJC.fJp, Integer.valueOf(this.fJC.fHK), Long.valueOf(this.fJC.fJB) });
    if ((this.fJC.fHK & 0x1) > 0)
    {
      g.RQ();
      byte[] arrayOfByte = bo.anf(bo.nullAsNil((String)g.RP().Ry().get(8195, null)));
      g.Rg().a(new f(this.fJC.fJB, arrayOfByte), 0);
    }
    o.a(this.fJC.fJl, this.fJC);
    AppMethodBeat.o(58409);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.o.f.1
 * JD-Core Version:    0.6.2
 */