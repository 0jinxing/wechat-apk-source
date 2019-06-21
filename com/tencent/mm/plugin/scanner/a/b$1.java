package com.tencent.mm.plugin.scanner.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.kv;
import com.tencent.mm.plugin.scanner.util.e.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements e.a
{
  b$1(b paramb)
  {
  }

  public final void o(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(80824);
    ab.i("MicroMsg.ExternRequestDealQBarStrHandler", "Deal QBar String notify, id:%d", new Object[] { Integer.valueOf(paramInt) });
    kv localkv = new kv();
    localkv.cGM.cGK = paramInt;
    localkv.cGM.activity = this.pZA.mActivity;
    localkv.cGM.ctB = this.pZA.pZu;
    localkv.cGM.cGN = paramBundle;
    a.xxA.m(localkv);
    AppMethodBeat.o(80824);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.b.1
 * JD-Core Version:    0.6.2
 */