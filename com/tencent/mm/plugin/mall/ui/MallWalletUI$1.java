package com.tencent.mm.plugin.mall.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mall.a.i.a;
import com.tencent.mm.protocal.protobuf.bol;
import com.tencent.mm.protocal.protobuf.btr;
import com.tencent.mm.protocal.protobuf.cge;
import com.tencent.mm.sdk.platformtools.ab;

final class MallWalletUI$1
  implements i.a
{
  MallWalletUI$1(MallWalletUI paramMallWalletUI)
  {
  }

  public final void a(cge paramcge)
  {
    AppMethodBeat.i(43264);
    ab.i("MicroMsg.MallWalletUI", "cache callback: %s", new Object[] { paramcge });
    if (MallWalletUI.a(this.onS) != null)
    {
      MallWalletUI.a(this.onS).dismiss();
      MallWalletUI.b(this.onS);
    }
    MallWalletUI.a(this.onS, paramcge);
    MallWalletUI.c(this.onS);
    AppMethodBeat.o(43264);
  }

  public final void b(bol parambol)
  {
    AppMethodBeat.i(43265);
    ab.i("MicroMsg.MallWalletUI", "net callback: %s", new Object[] { parambol });
    if (MallWalletUI.a(this.onS) != null)
    {
      MallWalletUI.a(this.onS).dismiss();
      MallWalletUI.b(this.onS);
    }
    if (parambol != null)
    {
      if (parambol.wRp != null)
      {
        MallWalletUI.a(this.onS, parambol.wRp);
        MallWalletUI.c(this.onS);
      }
      if ((parambol.vCP != null) && (parambol.vCP.type == 13))
        this.onS.runOnUiThread(new MallWalletUI.1.1(this, parambol));
    }
    AppMethodBeat.o(43265);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallWalletUI.1
 * JD-Core Version:    0.6.2
 */