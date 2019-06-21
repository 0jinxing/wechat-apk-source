package com.tencent.mm.plugin.account.security.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelfriend.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class SecurityAccountVerifyUI$3
  implements View.OnClickListener
{
  SecurityAccountVerifyUI$3(SecurityAccountVerifyUI paramSecurityAccountVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(69918);
    ab.v("MicroMsg.SecurityAccountVerifyUI", "on resend verify code button click");
    SecurityAccountVerifyUI.b(this.gAa).setVisibility(8);
    SecurityAccountVerifyUI.a(this.gAa).setTag(Integer.valueOf(60));
    SecurityAccountVerifyUI.c(this.gAa).stopTimer();
    SecurityAccountVerifyUI.c(this.gAa).ae(1000L, 1000L);
    a locala = new a(SecurityAccountVerifyUI.d(this.gAa), 10, "", "", SecurityAccountVerifyUI.e(this.gAa));
    g.Rg().a(locala, 0);
    paramView = this.gAa;
    AppCompatActivity localAppCompatActivity = this.gAa.mController.ylL;
    this.gAa.getString(2131297061);
    SecurityAccountVerifyUI.a(paramView, h.b(localAppCompatActivity, this.gAa.getString(2131302700), true, new SecurityAccountVerifyUI.3.1(this, locala)));
    AppMethodBeat.o(69918);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI.3
 * JD-Core Version:    0.6.2
 */