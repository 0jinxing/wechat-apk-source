package com.tencent.mm.plugin.account.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.f.a.b;
import com.tencent.mm.ui.f.a.c.a;
import com.tencent.mm.ui.f.a.e;

final class WelcomeActivity$3
  implements c.a
{
  WelcomeActivity$3(WelcomeActivity paramWelcomeActivity)
  {
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(125639);
    ab.i("MicroMsg.WelcomeActivity", "facebook-android login error! %s", new Object[] { paramb.getMessage() });
    h.b(this.gIu, this.gIu.getString(2131299530), "", true);
    AppMethodBeat.o(125639);
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(125638);
    ab.i("MicroMsg.WelcomeActivity", "facebook-android login error! %s", new Object[] { parame.getMessage() });
    h.b(this.gIu, this.gIu.getString(2131299530), "", true);
    AppMethodBeat.o(125638);
  }

  public final void onCancel()
  {
    AppMethodBeat.i(125640);
    ab.i("MicroMsg.WelcomeActivity", "facebook login cancel");
    AppMethodBeat.o(125640);
  }

  public final void p(Bundle paramBundle)
  {
    AppMethodBeat.i(125637);
    ab.i("MicroMsg.WelcomeActivity", "facebook login success");
    WelcomeActivity.f(this.gIu);
    AppMethodBeat.o(125637);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.WelcomeActivity.3
 * JD-Core Version:    0.6.2
 */