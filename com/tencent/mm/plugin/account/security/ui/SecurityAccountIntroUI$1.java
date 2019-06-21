package com.tencent.mm.plugin.account.security.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelfriend.a;
import com.tencent.mm.plugin.account.friend.a.x;
import com.tencent.mm.ui.base.h;

final class SecurityAccountIntroUI$1
  implements View.OnClickListener
{
  SecurityAccountIntroUI$1(SecurityAccountIntroUI paramSecurityAccountIntroUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(69904);
    if (!SecurityAccountIntroUI.a(this.gzS));
    for (paramView = new a(SecurityAccountIntroUI.b(this.gzS), 10, "", "", SecurityAccountIntroUI.c(this.gzS)); ; paramView = new x(SecurityAccountIntroUI.b(this.gzS), 10, "", 0, ""))
    {
      g.Rg().a(paramView, 0);
      SecurityAccountIntroUI localSecurityAccountIntroUI1 = this.gzS;
      SecurityAccountIntroUI localSecurityAccountIntroUI2 = this.gzS;
      this.gzS.getString(2131297061);
      SecurityAccountIntroUI.a(localSecurityAccountIntroUI1, h.b(localSecurityAccountIntroUI2, this.gzS.getString(2131302700), true, new SecurityAccountIntroUI.1.1(this, paramView)));
      AppMethodBeat.o(69904);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI.1
 * JD-Core Version:    0.6.2
 */