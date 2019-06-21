package com.tencent.mm.plugin.address.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ki;
import com.tencent.mm.g.a.ki.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

final class WalletSelectAddrUI$9$1
  implements Runnable
{
  WalletSelectAddrUI$9$1(WalletSelectAddrUI.9 param9)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(16986);
    if (this.gLo.gLn.cFP.cvi)
    {
      aw.ZK();
      String str1 = bo.nullAsNil((String)c.Ry().get(46, null));
      aw.ZK();
      String str2 = bo.nullAsNil((String)c.Ry().get(72, null));
      WalletSelectAddrUI.a(this.gLo.gLk, str1, str2);
    }
    AppMethodBeat.o(16986);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.WalletSelectAddrUI.9.1
 * JD-Core Version:    0.6.2
 */