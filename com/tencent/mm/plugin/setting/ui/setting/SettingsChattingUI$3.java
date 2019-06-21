package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.pa;
import com.tencent.mm.model.bf.a;
import com.tencent.mm.sdk.b.a;

final class SettingsChattingUI$3
  implements bf.a
{
  SettingsChattingUI$3(SettingsChattingUI paramSettingsChattingUI)
  {
  }

  public final boolean JU()
  {
    AppMethodBeat.i(127214);
    boolean bool = SettingsChattingUI.c(this.qnb);
    AppMethodBeat.o(127214);
    return bool;
  }

  public final void JV()
  {
    AppMethodBeat.i(127215);
    if (SettingsChattingUI.a(this.qnb) != null)
    {
      SettingsChattingUI.a(this.qnb).dismiss();
      SettingsChattingUI.a(this.qnb, null);
    }
    a.xxA.m(new pa());
    AppMethodBeat.o(127215);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI.3
 * JD-Core Version:    0.6.2
 */