package com.tencent.mm.plugin.account.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class LoginHistoryUI$31
  implements n.c
{
  LoginHistoryUI$31(LoginHistoryUI paramLoginHistoryUI)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(124939);
    if (paraml.size() == 0)
    {
      paraml.hi(7002, 2131301011);
      paraml.hi(7003, 2131300627);
      paraml.hi(7004, 2131305633);
      if (!aa.doo())
        paraml.hi(7009, 2131305631);
    }
    AppMethodBeat.o(124939);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginHistoryUI.31
 * JD-Core Version:    0.6.2
 */