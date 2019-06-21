package com.tencent.mm.plugin.account.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.f.a.b;
import com.tencent.mm.ui.f.a.c;
import com.tencent.mm.ui.f.a.c.a;
import com.tencent.mm.ui.f.a.e;

final class FacebookLoginUI$a
  implements c.a
{
  private FacebookLoginUI$a(FacebookLoginUI paramFacebookLoginUI)
  {
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(124847);
    ab.d("MicroMsg.FacebookLoginUI", "onError:" + paramb.getMessage());
    com.tencent.mm.ui.base.h.b(this.gBp, paramb.getMessage(), this.gBp.getString(2131299530), true);
    FacebookLoginUI.aqR();
    paramb = new StringBuilder();
    g.RN();
    paramb = paramb.append(com.tencent.mm.kernel.a.Rb()).append(",").append(this.gBp.getClass().getName()).append(",L14,");
    g.RN();
    com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("L14") + ",2");
    com.tencent.mm.plugin.report.service.h.pYm.a(582L, 8L, 1L, false);
    AppMethodBeat.o(124847);
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(124846);
    ab.d("MicroMsg.FacebookLoginUI", "onFacebookError:" + parame.getMessage());
    com.tencent.mm.ui.base.h.b(this.gBp, parame.getMessage(), this.gBp.getString(2131299530), true);
    FacebookLoginUI.aqR();
    parame = new StringBuilder();
    g.RN();
    parame = parame.append(com.tencent.mm.kernel.a.Rb()).append(",").append(this.gBp.getClass().getName()).append(",L14,");
    g.RN();
    com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("L14") + ",2");
    com.tencent.mm.plugin.report.service.h.pYm.a(582L, 7L, 1L, false);
    AppMethodBeat.o(124846);
  }

  public final void onCancel()
  {
    AppMethodBeat.i(124848);
    ab.d("MicroMsg.FacebookLoginUI", "onCancel");
    FacebookLoginUI.aqR();
    StringBuilder localStringBuilder = new StringBuilder();
    g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(this.gBp.getClass().getName()).append(",L14,");
    g.RN();
    com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("L14") + ",2");
    com.tencent.mm.plugin.report.service.h.pYm.a(582L, 9L, 1L, false);
    AppMethodBeat.o(124848);
  }

  public final void p(Bundle paramBundle)
  {
    AppMethodBeat.i(124845);
    FacebookLoginUI.a(this.gBp, FacebookLoginUI.d(this.gBp).gqE);
    FacebookLoginUI.b(this.gBp);
    AppMethodBeat.o(124845);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookLoginUI.a
 * JD-Core Version:    0.6.2
 */