package com.tencent.mm.plugin.account.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.f.a.d.b;

final class WelcomeActivity$2
  implements d.b
{
  WelcomeActivity$2(WelcomeActivity paramWelcomeActivity)
  {
  }

  public final void onCancel()
  {
    AppMethodBeat.i(125635);
    ab.i("MicroMsg.WelcomeActivity", "facebook-android login cancel!");
    AppMethodBeat.o(125635);
  }

  public final void onError(String paramString)
  {
    AppMethodBeat.i(125636);
    ab.i("MicroMsg.WelcomeActivity", "facebook-android login error! %s", new Object[] { paramString });
    h.b(this.gIu, this.gIu.getString(2131299530), "", true);
    AppMethodBeat.o(125636);
  }

  public final void onSuccess()
  {
    AppMethodBeat.i(125634);
    ab.i("MicroMsg.WelcomeActivity", "facebook-android login success!");
    WelcomeActivity.f(this.gIu);
    AppMethodBeat.o(125634);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.WelcomeActivity.2
 * JD-Core Version:    0.6.2
 */