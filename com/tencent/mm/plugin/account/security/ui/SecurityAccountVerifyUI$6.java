package com.tencent.mm.plugin.account.security.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelfriend.a;
import com.tencent.mm.plugin.account.friend.a.x;
import com.tencent.mm.plugin.account.security.a.f;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

final class SecurityAccountVerifyUI$6
  implements MenuItem.OnMenuItemClickListener
{
  SecurityAccountVerifyUI$6(SecurityAccountVerifyUI paramSecurityAccountVerifyUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(69922);
    paramMenuItem = SecurityAccountVerifyUI.g(this.gAa).getText().toString().trim();
    if (bo.isNullOrNil(paramMenuItem))
    {
      h.g(this.gAa, 2131297590, 2131297061);
      AppMethodBeat.o(69922);
      return true;
    }
    this.gAa.aqX();
    SecurityAccountVerifyUI.a(this.gAa, f.cz(this.gAa));
    SecurityAccountVerifyUI.b(this.gAa, f.aqE());
    if (!SecurityAccountVerifyUI.h(this.gAa));
    for (paramMenuItem = new a(SecurityAccountVerifyUI.d(this.gAa), paramMenuItem, "", SecurityAccountVerifyUI.e(this.gAa), SecurityAccountVerifyUI.i(this.gAa), SecurityAccountVerifyUI.j(this.gAa)); ; paramMenuItem = new x(SecurityAccountVerifyUI.d(this.gAa), 11, paramMenuItem, "", SecurityAccountVerifyUI.i(this.gAa), SecurityAccountVerifyUI.j(this.gAa)))
    {
      g.Rg().a(paramMenuItem, 0);
      SecurityAccountVerifyUI localSecurityAccountVerifyUI1 = this.gAa;
      SecurityAccountVerifyUI localSecurityAccountVerifyUI2 = this.gAa;
      this.gAa.getString(2131297061);
      SecurityAccountVerifyUI.a(localSecurityAccountVerifyUI1, h.b(localSecurityAccountVerifyUI2, this.gAa.getString(2131297578), true, new SecurityAccountVerifyUI.6.1(this, paramMenuItem)));
      AppMethodBeat.o(69922);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI.6
 * JD-Core Version:    0.6.2
 */