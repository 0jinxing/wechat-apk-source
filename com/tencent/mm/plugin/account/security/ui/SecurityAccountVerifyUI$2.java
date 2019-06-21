package com.tencent.mm.plugin.account.security.ui;

import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;

final class SecurityAccountVerifyUI$2
  implements ap.a
{
  SecurityAccountVerifyUI$2(SecurityAccountVerifyUI paramSecurityAccountVerifyUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(69916);
    int i = ((Integer)SecurityAccountVerifyUI.a(this.gAa).getTag()).intValue();
    if (i <= 1)
    {
      SecurityAccountVerifyUI.b(this.gAa).setVisibility(0);
      SecurityAccountVerifyUI.a(this.gAa).setVisibility(8);
      AppMethodBeat.o(69916);
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      i--;
      SecurityAccountVerifyUI.a(this.gAa).setTag(Integer.valueOf(i));
      SecurityAccountVerifyUI.a(this.gAa).setText(this.gAa.getString(2131302697, new Object[] { Integer.valueOf(i) }));
      if (SecurityAccountVerifyUI.a(this.gAa).getVisibility() != 0)
        SecurityAccountVerifyUI.a(this.gAa).setVisibility(0);
      AppMethodBeat.o(69916);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI.2
 * JD-Core Version:    0.6.2
 */