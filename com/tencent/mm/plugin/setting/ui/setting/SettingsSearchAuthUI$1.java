package com.tencent.mm.plugin.setting.ui.setting;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class SettingsSearchAuthUI$1
  implements a.a
{
  SettingsSearchAuthUI$1(SettingsSearchAuthUI paramSettingsSearchAuthUI)
  {
  }

  public final void onClickBackBtn(View paramView)
  {
    AppMethodBeat.i(127438);
    ab.i("MicroMsg.SettingsSearchAuthUI", "click search back");
    this.qoM.finish();
    AppMethodBeat.o(127438);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.1
 * JD-Core Version:    0.6.2
 */