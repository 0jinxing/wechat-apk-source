package com.tencent.mm.plugin.qqmail.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.ui.base.t;

final class ComposeUI$12
  implements ap.a
{
  ComposeUI$12(ComposeUI paramComposeUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(68184);
    if ((this.pwY.pwB) && (ComposeUI.a(this.pwY, false)) && (ComposeUI.a(this.pwY) == 5))
    {
      ComposeUI.b(this.pwY);
      if (ComposeUI.c(this.pwY) != null)
        ComposeUI.c(this.pwY).dismiss();
      ComposeUI.a(this.pwY, t.a(this.pwY, this.pwY.getString(2131301977), 2000L));
    }
    AppMethodBeat.o(68184);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.12
 * JD-Core Version:    0.6.2
 */