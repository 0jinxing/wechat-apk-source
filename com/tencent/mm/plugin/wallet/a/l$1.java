package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.uk;
import com.tencent.mm.g.a.uk.b;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;

final class l$1
  implements f
{
  l$1(l paraml, uk paramuk, String paramString)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(45841);
    g.RQ();
    g.RO().eJo.b(1767, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.tnn.cQD.buffer = this.tno;
      this.tnn.cQD.cQH.run();
      AppMethodBeat.o(45841);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.HandleWCPayWalletBufferListener", "check jsapi error: %s, %s", new Object[] { Integer.valueOf(paramInt2), paramString });
      this.tnn.cQD.retCode = -1;
      this.tnn.cQD.cQH.run();
      AppMethodBeat.o(45841);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.l.1
 * JD-Core Version:    0.6.2
 */