package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.f.a.b;
import com.tencent.mm.ui.f.a.c;
import com.tencent.mm.ui.f.a.c.a;

final class BindFacebookUI$a
  implements c.a
{
  private BindFacebookUI$a(BindFacebookUI paramBindFacebookUI)
  {
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(124730);
    ab.d("MicroMsg.BindFacebookUI", "onError:" + paramb.getMessage());
    h.b(this.gAv, paramb.getMessage(), this.gAv.getString(2131298517), true);
    BindFacebookUI.jdMethod_do(false);
    AppMethodBeat.o(124730);
  }

  public final void a(com.tencent.mm.ui.f.a.e parame)
  {
    AppMethodBeat.i(124729);
    ab.d("MicroMsg.BindFacebookUI", "onFacebookError:" + parame.zxP);
    h.b(this.gAv, parame.getMessage(), this.gAv.getString(2131298517), true);
    BindFacebookUI.jdMethod_do(false);
    AppMethodBeat.o(124729);
  }

  public final void onCancel()
  {
    AppMethodBeat.i(124731);
    ab.d("MicroMsg.BindFacebookUI", "onCancel");
    BindFacebookUI.jdMethod_do(false);
    AppMethodBeat.o(124731);
  }

  public final void p(Bundle paramBundle)
  {
    AppMethodBeat.i(124728);
    ab.d("MicroMsg.BindFacebookUI", "token:" + BindFacebookUI.c(this.gAv).gqE);
    g.RP().Ry().set(65830, BindFacebookUI.c(this.gAv).gqE);
    if (BindFacebookUI.c(this.gAv).zxC != 0L)
      g.RP().Ry().set(65832, Long.valueOf(BindFacebookUI.c(this.gAv).zxC));
    String str = this.gAv.getString(2131297061);
    paramBundle = this.gAv.getString(2131299528);
    BindFacebookUI.a(this.gAv, ProgressDialog.show(this.gAv, str, paramBundle, true));
    BindFacebookUI.e(this.gAv).setOnCancelListener(BindFacebookUI.d(this.gAv));
    BindFacebookUI.a(this.gAv, new v(1, BindFacebookUI.c(this.gAv).gqE));
    g.Rg().a(BindFacebookUI.a(this.gAv), 0);
    BindFacebookUI.jdMethod_do(true);
    AppMethodBeat.o(124728);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.BindFacebookUI.a
 * JD-Core Version:    0.6.2
 */