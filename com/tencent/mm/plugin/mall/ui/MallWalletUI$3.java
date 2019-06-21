package com.tencent.mm.plugin.mall.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.utils.e.a;
import com.tencent.mm.protocal.protobuf.btr;
import com.tencent.mm.protocal.protobuf.chf;

final class MallWalletUI$3
  implements e.a
{
  MallWalletUI$3(MallWalletUI paramMallWalletUI)
  {
  }

  public final void a(btr parambtr)
  {
    AppMethodBeat.i(43267);
    String str = "";
    int i;
    if (parambtr.type == 1)
    {
      parambtr = parambtr.url;
      i = 1;
    }
    while (true)
    {
      h.pYm.e(16502, new Object[] { Integer.valueOf(2), parambtr, Integer.valueOf(i) });
      AppMethodBeat.o(43267);
      return;
      if ((parambtr.type == 2) && (parambtr.wVC != null))
      {
        parambtr = parambtr.wVC.username;
        i = 2;
      }
      else if ((parambtr.type == 4) || (parambtr.type == 5))
      {
        parambtr = parambtr.url;
        i = 3;
      }
      else
      {
        i = 0;
        parambtr = str;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallWalletUI.3
 * JD-Core Version:    0.6.2
 */