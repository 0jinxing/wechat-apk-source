package com.tencent.mm.plugin.account.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.f.a.b;
import com.tencent.mm.ui.f.a.c;
import com.tencent.mm.ui.f.a.c.a;

final class FacebookAuthUI$a
  implements c.a
{
  private FacebookAuthUI$a(FacebookAuthUI paramFacebookAuthUI)
  {
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(124785);
    ab.d("MicroMsg.FacebookAuthUI", "onError:" + paramb.getMessage());
    com.tencent.mm.ui.base.h.b(this.gAZ, paramb.getMessage(), this.gAZ.getString(2131298517), true);
    FacebookAuthUI.aqN();
    com.tencent.mm.plugin.report.service.h.pYm.a(582L, 3L, 1L, false);
    AppMethodBeat.o(124785);
  }

  public final void a(com.tencent.mm.ui.f.a.e parame)
  {
    AppMethodBeat.i(124784);
    ab.d("MicroMsg.FacebookAuthUI", "onFacebookError:" + parame.zxP);
    com.tencent.mm.ui.base.h.b(this.gAZ, parame.getMessage(), this.gAZ.getString(2131298517), true);
    FacebookAuthUI.aqN();
    com.tencent.mm.plugin.report.service.h.pYm.a(582L, 2L, 1L, false);
    AppMethodBeat.o(124784);
  }

  public final void onCancel()
  {
    AppMethodBeat.i(124786);
    ab.d("MicroMsg.FacebookAuthUI", "onCancel");
    FacebookAuthUI.aqN();
    com.tencent.mm.plugin.report.service.h.pYm.a(582L, 4L, 1L, false);
    AppMethodBeat.o(124786);
  }

  public final void p(Bundle paramBundle)
  {
    AppMethodBeat.i(124783);
    FacebookAuthUI.a(this.gAZ, FacebookAuthUI.g(this.gAZ).gqE);
    g.RP().Ry().set(65830, FacebookAuthUI.h(this.gAZ));
    if (FacebookAuthUI.g(this.gAZ).zxC != 0L)
      g.RP().Ry().set(65832, Long.valueOf(FacebookAuthUI.g(this.gAZ).zxC));
    FacebookAuthUI.d(this.gAZ);
    AppMethodBeat.o(124783);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookAuthUI.a
 * JD-Core Version:    0.6.2
 */