package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.uk;
import com.tencent.mm.g.a.uk.a;
import com.tencent.mm.g.a.uk.b;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.c.a.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class l extends c<uk>
{
  public l()
  {
    AppMethodBeat.i(45843);
    this.xxI = uk.class.getName().hashCode();
    AppMethodBeat.o(45843);
  }

  private static void a(uk paramuk, f paramf)
  {
    AppMethodBeat.i(45844);
    ab.i("MicroMsg.HandleWCPayWalletBufferListener", "do check pay jsapi");
    g.RQ();
    g.RO().eJo.a(1767, paramf);
    paramuk = paramuk.cQC;
    ab.i("MicroMsg.HandleWCPayWalletBufferListener", "appId: %s, \nnonce: %s, \ntimestamp: %s, \npackage: %s, \nsign: %s, \nsignType: %s, \nurl: %s", new Object[] { paramuk.appId, paramuk.nonceStr, paramuk.cvO, paramuk.cQE, paramuk.cQF, paramuk.signType, paramuk.url });
    paramuk = new a(paramuk.appId, paramuk.nonceStr, paramuk.cvO, paramuk.cQE, paramuk.cQF, paramuk.signType, paramuk.url);
    g.RQ();
    g.RO().eJo.a(paramuk, 0);
    AppMethodBeat.o(45844);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.l
 * JD-Core Version:    0.6.2
 */