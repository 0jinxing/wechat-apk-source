package com.tencent.mm.bi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.je;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi.d;

final class e$1
  implements ao.b.a
{
  e$1(e parame, bi.d paramd)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(16631);
    aw.ZK();
    ab.d("MicroMsg.VerifyMessageExtension", String.valueOf(c.XM().aoO(this.fUC.xZx)));
    paramString = new je();
    paramString.cEq.cEr = this.fUC.xZx;
    paramString.cEq.type = 1;
    a.xxA.m(paramString);
    AppMethodBeat.o(16631);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bi.e.1
 * JD-Core Version:    0.6.2
 */