package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.i.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.al;

final class SettingsAboutSystemUI$3
  implements DialogInterface.OnClickListener
{
  SettingsAboutSystemUI$3(SettingsAboutSystemUI paramSettingsAboutSystemUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(127111);
    if (!b.Ml());
    for (boolean bool = true; ; bool = false)
    {
      b.bK(bool);
      g.RQ().releaseAll();
      al.d(new SettingsAboutSystemUI.3.1(this));
      AppMethodBeat.o(127111);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.3
 * JD-Core Version:    0.6.2
 */