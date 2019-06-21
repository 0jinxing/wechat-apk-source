package com.tencent.mm.plugin.account.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.c;
import com.tencent.mm.network.e;

final class FacebookLoginUI$9
  implements bk.a
{
  FacebookLoginUI$9(FacebookLoginUI paramFacebookLoginUI)
  {
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(124842);
    if (parame == null)
      AppMethodBeat.o(124842);
    while (true)
    {
      return;
      parame = parame.adg();
      g.RN();
      int i = a.QF();
      parame.a(new byte[0], new byte[0], new byte[0], i);
      AppMethodBeat.o(124842);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookLoginUI.9
 * JD-Core Version:    0.6.2
 */